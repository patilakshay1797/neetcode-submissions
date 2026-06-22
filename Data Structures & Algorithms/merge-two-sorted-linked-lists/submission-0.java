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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head;
        if(list1.val > list2.val) {
            head = list2;
            list2 = list2.next;
        } else {
            head = list1;
            list1 = list1.next;
        }

        ListNode mergedNode = head;

        while(list1 != null || list2 != null) {
            // System.out.println("inside while -- " + list1.val + " -- " + list2.val);
            // System.out.println("inside while -- next" + list1 + " -- " + list2);
            // System.out.println("merged Node -- " + mergedNode.val);
            if(list1 == null && list2 == null) System.out.println("yes ye andr aa rha he -------------");
            if(list1 == null) {
                mergedNode.next = list2;
                if(list2 != null)
                    list2 = list2.next;
                else list2 = null;
                mergedNode = mergedNode.next;
            }
            if(list2 == null) {
                mergedNode.next = list1;
                if(list1 != null)
                    list1 = list1.next;
                else list1 = null;
                mergedNode = mergedNode.next;
            }
            if(list1 != null && list2 != null) {
                if(list1.val > list2.val) {
                    mergedNode.next = list2;
                    list2 = list2.next;
                    mergedNode = mergedNode.next;
                } else {
                    mergedNode.next = list1;
                    list1 = list1.next;
                    mergedNode = mergedNode.next;
                }
            }
            // System.out.println("end of while -- " + list1.val + " -- " + list2.val);
            // System.out.println("merged Node -- " + mergedNode.val);
        }
        return head;
    }
}