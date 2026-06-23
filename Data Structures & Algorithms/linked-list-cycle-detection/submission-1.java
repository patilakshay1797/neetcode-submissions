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
        ArrayList<ListNode> arrList = new ArrayList<>();
        while(head != null) {
            if(arrList.contains(head)) {
                return true;
            }
            arrList.add(head);
            head = head.next;
        }
        return false;
    }
}
