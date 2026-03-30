/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;

        ListNode fast = head;
        ListNode slo = head;

        while(fast != null && fast.next !=null){
            fast = fast.next.next;
            slo = slo.next;

            if(slo==fast) return true;
        }
        return false;
    }
}
