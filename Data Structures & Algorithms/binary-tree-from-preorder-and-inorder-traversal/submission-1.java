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
    public TreeNode tree(int[] preorder, int[] inorder,int start,int end){
        if(start>end) return null;
        TreeNode root = new TreeNode(preorder[preIndex++]);

        int index = 0;
        for(int i=0;i<=end;i++){
            if(inorder[i]==root.val) index = i;
        }
        
        root.left= tree(preorder,inorder,start,index-1);
        root.right = tree(preorder,inorder,index+1,end);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return tree(preorder,inorder,0,inorder.length-1);
    }
}
