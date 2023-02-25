package Lab_11;

import java.util.*;
import java.util.Queue;

public class GraphOperation {
	static int graphSize;
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
		public int getNumVertices() { return V; }
		public List<Integer> getNeighbors(int v) { return new ArrayList<Integer>(adjListsMap.get(v)); }
		public void addVertex() {
			int v = getNumVertices();
			ArrayList<Integer> neighbors = new ArrayList<Integer>();
			adjListsMap.put(v, neighbors);
			V++;
			graphSize = neighbors.size();
		}
		public void addEdge(int v, int w) { (adjListsMap.get(v)).add(w); }
	}
	
	public static boolean isBipartite(Graph graph) {
		boolean [] marked;
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i=0; i<graphSize; i++) {
			if graph.
		}
		
		
		return true;
	}
	

	public static void main(String args[]) {
		Graph graph1 = new Graph(4);
		graph1.addEdge(0, 1);
		graph1.addEdge(0, 3);
		graph1.addEdge(1, 0);
		graph1.addEdge(1, 2);
		graph1.addEdge(2, 1);
		graph1.addEdge(2, 3);
		graph1.addEdge(3, 0);
		graph1.addEdge(3, 2);
		Graph graph2 = new Graph(4);
		graph2.addEdge(0, 1);
		graph2.addEdge(0, 2);
		graph2.addEdge(0, 3);
		graph2.addEdge(1, 0);
		graph2.addEdge(1, 2);
		graph2.addEdge(2, 0);
		graph2.addEdge(2, 1);
		graph2.addEdge(2, 3);
		graph2.addEdge(3, 0);
		graph2.addEdge(3, 2);
		System.out.println(isBipartite(graph1));
		System.out.println(isBipartite(graph2));
	}
}
