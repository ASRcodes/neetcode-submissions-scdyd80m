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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<>();
       List<Integer> list = new ArrayList<>();
       Queue<TreeNode> q = new LinkedList<>();

       q.add(root);

       while(!q.isEmpty()){
        int len = q.size();
        for(int i=0;i<len;i++){
            TreeNode v = q.poll();
            int c = v.val;
            if(i==len-1) list.add(c);

            if(v.left!=null) q.add(v.left);
            if(v.right!=null) q.add(v.right);
        }
       }
       return list;
    }
}
