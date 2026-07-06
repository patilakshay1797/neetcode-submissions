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
        
        ListNode result = new ListNode();
        ListNode curr = result;
        int carry = 0;
        boolean isFirst = true;

        while(l1 != null || l2 != null || carry != 0) {
            int val1 = 0;
            int val2 = 0;

            if(l1 != null) val1 = l1.val;
            if(l2 != null) val2 = l2.val;

            int sum = val1 + val2 + carry;

            int nodeVal = sum % 10;
            carry = sum / 10;

            if(isFirst) {
                result = new ListNode(nodeVal);
                curr = result;
                isFirst = false;
            }else {
                curr.next = new ListNode(nodeVal);
                curr = curr.next;
            }

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return result;
    }
}
