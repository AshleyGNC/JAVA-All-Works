package Lab_10;

import java.util.*;


class TreeNode {
	public int key;
	public TreeNode left, right;

	public TreeNode(int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTree {

	public static List<Integer> binaryTreePaths(TreeNode node) {
		List<Integer> result = new ArrayList<Integer>();
		return paths(node, result);
	}
	
	public static List<Integer> paths(TreeNode t, List<Integer> p_num) {
		if(t == null) return p_num;
		
		else if (t.left == null) {
			p_num.add(t.key);
			return paths(t.right, p_num); // p_num.add(t.key)
		}
		else if (t.right == null) {
			p_num.add(t.key);
			return paths(t.left, p_num); //p_num.add(t.key)
			
		}
		else {
			p_num.add(t.key);
			List<Integer> path1 = paths(t.left, p_num);
			List<Integer> path2 = paths(t.right, p_num);
			return path1;
		}
	
	
	}


	public static List<Double> averageOfLevels(TreeNode node) {
		List<Double> result = new ArrayList<Double>();
		if (node == null) return result;
		
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(node);
		double sum = node.key;
		
		while(!q.isEmpty()) {
			TreeNode n = q.peek();
			
				if(n.left != null) {
					q.add(n.left);
				}
				if(n.right != null) {
					q.add(n.right);
				}
				sum += q.element().key;
				q.remove();
				
			if(q.size() != 1) {
				result.add(sum/2);
			}else {
				result.add(sum);
			}
		}

		return result;
	}

	public static void main(String args[]) {
		/*
		 *      4   <-- root
		 *     / \
		 *    3   1
		 *       / \
		 *      2   2
		 *     / \ / \
		 *    3  4 4  3
		 */

		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(3);
		root.right = new TreeNode(1);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(2);
		root.right.left.left = new TreeNode(3);
		root.right.left.right = new TreeNode(4);
		root.right.right.left = new TreeNode(4);
		root.right.right.right = new TreeNode(3);

		System.out.println(binaryTreePaths(root));
		System.out.println(averageOfLevels(root));

	}
}
