//Leetcode question 543

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 public class Solution {
    static int count = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        count = 0;
        helper(root);
        return count;
    }
    static int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        count = Math.max(count, left + right);
        return Math.max(left, right) + 1;
    }
}
// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null){
//             return 0;
//         }
//         int leftcount = leftMaxCountFinder(root.left);
//         int rightcount = rightmaxCountFinder(root.right);
//         return leftcount + rightcount;

//     }

//     static int leftMaxCountFinder(TreeNode root){
//         int leftCount = 0;
//         if(root == null){
//             return leftCount;
//         }
//         return leftCount += leftMaxCountFinder(root.left);
//     }
//     static int rightmaxCountFinder(TreeNode root){
//         int rightCount=0;
//         if(root == null){
//             return rightCount;
//         }
//         return rightCount += rightmaxCountFinder(root.right);
//     }
// }