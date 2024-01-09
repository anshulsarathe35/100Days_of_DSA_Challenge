//Leetcode question 872

//Here Depth First Search is used

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
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        isValid(l1, root1);
        isValid(l2, root2);
        if(l1.size() != l2.size()) return false;
        if(l1.equals(l2)){
            return true;
        }
        return false;
    }
    static void isValid(List<Integer> list , TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right ==null){
            list.add(root.val);
            return;
        }else{
            isValid(list, root.left);
            isValid(list, root.right);
        }
    }
}