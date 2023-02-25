import java.util.*;

public class GraphOperation {

	public static int time = 0;
	

	private static class Graph {
		private int V;
		private Map<Integer, ArrayList<Integer>> adjListsMap;

		public Graph(int v) {
			V = 0;

			adjListsMap = new HashMap<Integer, ArrayList<Integer>>();
			for (int i = 0; i < v; i++) {
				addVertex();
			}
		}

		public int getNumVertices() {
			return V;
		}

		public List<Integer> getNeighbors(int v) {
			return new ArrayList<Integer>(adjListsMap.get(v));
		}

		public void addVertex() {
			int v = getNumVertices();
			ArrayList<Integer> neighbors = new ArrayList<Integer>();
			adjListsMap.put(v, neighbors);
			V++;
		}

		public void addEdge(int v, int w) {
			(adjListsMap.get(v)).add(w);
		}
	    
	}

	
    
	 // A recursive function that finds and prints bridges
    // using DFS traversal
    // u --> The vertex to be visited next
    // visited[] --> keeps track of visited vertices
    // disc[] --> Stores discovery times of visited vertices
    // parent[] --> Stores parent vertices in DFS tree
	static List<Integer> result = new LinkedList<>();
    public static List<Integer> bridgeUtil(int u, boolean visited[], int disc[],
                    int low[], int parent[], Graph g)
    {
 
        // Mark the current node as visited
        visited[u] = true;
 
        // Initialize discovery time and low value
        disc[u] = low[u] = ++time;
 
        //  Go through all vertices adjacent to this
        Iterator<Integer> i = g.getNeighbors(u).iterator();
        while (i.hasNext())
        {
            int v = i.next();  // v is current adjacent of u
 
            // If v is not visited yet, then make it a child of u in DFS tree and recur for it.
            // If v is not visited yet, then recur for it
            if (!visited[v])
            {
                parent[v] = u;
                bridgeUtil(v, visited, disc, low, parent, g);
 
                // Check if the subtree rooted with v has a
                // connection to one of the ancestors of u
                low[u]  = Math.min(low[u], low[v]);
 
                // If the lowest vertex reachable from subtree
                // under v is below u in DFS tree, then u-v is
                // a bridge
                if (low[v] > disc[u])
                	result.add(v);
                	result.add(u);
            }
 
            // Update low value of u for parent function calls.
            else if (v != parent[u])
                low[u] = Math.min(low[u], disc[v]);
        }
        return result;
    }
 

	public static List<List<Integer>> allBridges(Graph g) {
		List<List<Integer>> r = new ArrayList<>();
		// Mark all the vertices as not visited
		for (int V=0; V < g.toString().length(); V++) {
			boolean visited[] = new boolean[V];
	        int disc[] = new int[V];
	        int low[] = new int[V];
	        int parent[] = new int[V];
	        
	        // Initialize parent and visited, and ap(articulation point)
	        // arrays
	        for (int i = 0; i < V; i++)
	        {
	            parent[i] = -1;
	            visited[i] = false;
	        }
	        
	     // Call the recursive helper function to find Bridges
	        // in DFS tree rooted with vertex 'i'
	        for (int i = 0; i < V; i++) {
	            if (visited[i] == false)
	                r.add(bridgeUtil(i, visited, disc, low, parent, g));
	        }
		} 
		return r;
      
	}

	public static void main(String args[]) {
		Graph graph1 = new Graph(5);
		graph1.addEdge(0, 1);
		graph1.addEdge(0, 2);
		graph1.addEdge(0, 3);
		graph1.addEdge(1, 0);
		graph1.addEdge(1, 2);
		graph1.addEdge(2, 0);
		graph1.addEdge(2, 1);
		graph1.addEdge(3, 0);
		graph1.addEdge(3, 4);
		graph1.addEdge(4, 3);

		System.out.println(allBridges(graph1));
	}
}