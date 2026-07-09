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
    int preIndex = 0;
    public TreeNode helper(int[] pre,int[] in,int start,int end){
        if(start>end) return null;

        TreeNode root = new TreeNode(pre[preIndex++]);
        int index = 0;
        for(int i=0;i<=end;i++){
            if(in[i]==root.val) index = i;
        }
        root.left = helper(pre,in,start,index-1);
        root.right = helper(pre,in,index+1,end);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,inorder.length-1);
    }
}
