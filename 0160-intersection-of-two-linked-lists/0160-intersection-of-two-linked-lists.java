/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //---------brute force---------
        // ListNode tempA = headA;
        // while(tempA != null){
        //     ListNode tempB = headB;
        //     while(tempB != null){
        //         if(tempA == tempB){
        //             return tempA;
        //         }
        //         tempB= tempB.next;
        //     }
        //     tempA = tempA.next;
        // }
        // return null;  

        //--------optimal----------
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){
            a = (a==null)? headB : a.next;
            b = (b==null)? headA : b.next;
        }
        return a;
    }
}