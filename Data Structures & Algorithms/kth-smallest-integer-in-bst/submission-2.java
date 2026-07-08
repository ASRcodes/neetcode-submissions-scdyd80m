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
    int count = 0;
    int ans = 0;
    public void in(TreeNode node,int k){
        if(node==null) return;

        in(node.left,k);
        count++;
        if(count==k) ans = node.val;
        in(node.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        in(root,k);

        return ans;
    }
}
