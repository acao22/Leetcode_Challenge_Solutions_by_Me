//Name: 543. Diameter of Binary Tree
//Difficulty: Easy
//Description: Given the root of a binary tree, return the length of the diameter of the tree.
//Runtime Complexity: O(n)
//Space Complexity: (1)
//Data Structure: Recursive DFS


//Definition for a binary tree node.
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        //diameter: longest path in a binary tree
        //diameter = 1 (self node) + max of diameter of left & right subtrees
        int[] diameter = new int[1];
        recursiveDFShelper(root, diameter);
        return diameter[0];

    }

    public int recursiveDFShelper(TreeNode root, int[] diam) {
        if (root == null) {
            return 0;
        }
        int leftDiam = recursiveDFShelper(root.left, diam);
        int rightDiam = recursiveDFShelper(root.right, diam);
        diam[0] = Math.max(diam[0], leftDiam + rightDiam);
        return 1 + Math.max(leftDiam, rightDiam);
    }
}
