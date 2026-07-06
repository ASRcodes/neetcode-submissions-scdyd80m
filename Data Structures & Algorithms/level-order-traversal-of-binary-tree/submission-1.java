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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> li = new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode v = q.poll();
                int value = v.val;

                li.add(value);
                if(v.left!=null) q.add(v.left);
                if(v.right!=null) q.add(v.right);
            }
            list.add(li);
        }
        return list;
    }
}
