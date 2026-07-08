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
    public List<Integer> inorder(TreeNode node,List<Integer> li){
        if(node==null) return null;
        inorder(node.left,li);
        li.add(node.val);
        inorder(node.right,li);

        return li;
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> li = inorder(root,list);
        int ans = 0;
        for(int i=0;i<k;i++){
            if(i==k-1) ans = list.get(i);
        }
        return ans;
    }
}
