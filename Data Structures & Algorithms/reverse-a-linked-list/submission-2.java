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
    public ListNode reverseList(ListNode head) {
        List<Integer> reverseList = new ArrayList<>();

        if(Objects.isNull(head)) return null;
        ListNode currNode = head;
        ListNode prevNode = null;
        ListNode nextNode = null;
        ListNode tempHead = null;
        if(head.next != null){
            nextNode = head.next;
        }

        while(Objects.nonNull(currNode)) {
            System.out.println(currNode.val);
            
                ListNode tempNode = currNode.next;
                currNode.next = prevNode;
                prevNode = currNode;
                if(Objects.isNull(nextNode)) {
                    tempHead = currNode;
                }
                currNode = nextNode;
                if(Objects.nonNull(nextNode) && Objects.nonNull(nextNode.next)) {
                    nextNode = nextNode.next;
                } else nextNode = null;
                
        }
        
        return tempHead;
    }
}
