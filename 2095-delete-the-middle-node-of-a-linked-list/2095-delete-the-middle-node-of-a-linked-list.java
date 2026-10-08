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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        //------approach 1---------
        // ListNode prev = null;
        // ListNode slow = head;
        // ListNode fast = head;
        // while(fast != null && fast.next != null){
        //     prev = slow;
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // prev.next = slow.next;
        // return head;

        //------approach 2--------
        int n=0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        int middle = n/2;
        ListNode prev = head;
        for(int i=1;i<middle;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}