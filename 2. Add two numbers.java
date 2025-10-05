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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return l1;
        }
        ListNode result = new ListNode(0);
        ListNode head = result;
        int v1, v2, carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            
            v1 = (l1 != null) ? l1.val : 0;
            v2 = (l2 != null) ? l2.val : 0;
            if(v1 + v2 + carry >= 10){
                result.next = new ListNode((v1 + v2 + carry) % 10);
                carry = 1;
            }
            else {
                result.next = new ListNode(v1 + v2 + carry);
                carry = 0;
            }
            result = result.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return head.next;
    }
}