package lab_9;

class TreeNode {
	public int key;
	public TreeNode left, right;

	public TreeNode(int item) {
		key = item;
		left = right = null;
	}
}

public class BinaryTree {
	
	public static int maxDepth(TreeNode node) {
		int maxHeight = 0;
		return height(node, maxHeight);
	}
	
	public static int height(TreeNode t, int maxHeight) {
		if(t == null) return maxHeight;
		
		else if (t.left == null) {
			return height(t.right, maxHeight +1);
		}
		else if (t.right == null) {
			return height(t.left, maxHeight +1);
		}
		else {
			maxHeight += 1;
			int h1 = height(t.left, maxHeight);
			int h2 = height(t.right, maxHeight);
			return Math.max(h1, h2);
		}
	
	
	}
	

	public static boolean isSymmetric(TreeNode node) {
		return isMirror(node, node);
		
	}
	public static boolean isMirror(TreeNode t1, TreeNode t2) {
		if (t1==null && t2==null) return true;
		if (t1==null && t2!=null || t1!=null && t2==null) return false;
		
		return (t1.key == t2.key) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
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

		System.out.println(isSymmetric(root));
		System.out.println(isSymmetric(root.right));

		System.out.println(maxDepth(root));
		System.out.println(maxDepth(root.right));
	}
}
