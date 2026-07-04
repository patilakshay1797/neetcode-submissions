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
        
        int targetIndex = size - n;
        if(targetIndex == 0) return head.next;
        System.out.println("target index ---- " + targetIndex);
        int index = 0;
        
        curr = head;
        while(index <= targetIndex) {
            
            if(index == (targetIndex - 1)) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
            index++;
        }

        return head;
    }
}
