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
        HashMap<Integer, ListNode> map = new HashMap<>();

        while(curr != null) {
            map.put(size, curr);
            curr = curr.next;
            size++;
        }

        if(size == 0) return null;
        
        int indexToDelete = size - n;
        System.out.println(size + " ------------ " + n + " ------------- " + indexToDelete);
        if(indexToDelete == 0) {
            head = head.next;
            return head;
        };
        
        ListNode prev = map.get(indexToDelete - 1);
        curr = map.get(indexToDelete);
        // System.out.println(prev.val + " ------------- " + curr.val);
        prev.next = curr.next;
        curr.next = null;

        return head;
    }
}
