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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        while(curr != null) {
            size++;
            curr = curr.next;
        }

        System.out.println("size ----- " + size);
        
        int targetIndex = size - (n - 1);
        System.out.println("target index ---- " + targetIndex);
        int index = 1;
        
        curr = head;
        ListNode prev = null;
        while(index <= targetIndex) {
            System.out.println(curr.val +" ----------------- "+ index);
            if(index == targetIndex) {
                if(prev == null)
                    head = curr.next;
                else {
                    prev.next = curr.next;
                    curr.next = null;;
                }
            }
            else {
                prev = curr;
                curr = curr.next;
            }
            index++;
        }

        return head;
    }
}
