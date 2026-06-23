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

/*
* To detect a cycle in a linked list using a storage collection, 
* you should always choose a HashSet over an ArrayList.Why You 
* Should Choose HashSetTime Efficiency: Checking if a node is 
* already present in a HashSet takes O(1) constant time on average. 
* If you use an ArrayList, checking for existence requires a linear 
* scan, which takes O(n) time for every single node. This slows 
* your entire cycle-detection algorithm down to an inefficient O(n²) 
* total time.Unique References: A HashSet naturally stores unique elements 
* and enforces identity or value lookups efficiently, which aligns perfectly 
* with identifying if a specific node reference has been seen before.
*/

class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> arrList = new HashSet<>();
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
