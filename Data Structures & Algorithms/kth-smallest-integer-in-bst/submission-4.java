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
    public List<Integer> in(TreeNode node,List<Integer> li){
        if(node==null) return null;

        in(node.left,li);
        li.add(node.val);
        in(node.right,li);

    return li;
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        in(root,list);

        for(int i=0;i<k;i++){
            if(i==k-1) return list.get(i);
        }
    return -1;
    }
}
