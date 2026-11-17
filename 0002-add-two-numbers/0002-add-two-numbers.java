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
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // int carry=0;
        // ListNode dummy = new ListNode(0);
        // ListNode temp = dummy;
        // while(l1 != null || l2 != null || carry != 0){
        //    int val1 =0;
        //    int val2=0;
        //    if(l1 != null){
        //     val1 = l1.val;
        //    }
        //    if(l2 != null){
        //     val2 = l2.val;
        //    }
        //    int sum = val1+val2+carry;
        //    int digit = sum%10;
        //    carry = sum/10;
        //    temp.next = new ListNode(digit);
        //    temp = temp.next;
        //    if(l1 != null){
        //     l1 = l1.next;
        //    }
        //    if(l2 != null){
        //     l2 = l2.next;
        //    }
        // }




        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ZERO;
        BigInteger place = BigInteger.ONE;
        while (l1 != null) {
            num1 = num1.add(
                BigInteger.valueOf(l1.val).multiply(place)
            );
            place = place.multiply(BigInteger.TEN);
            l1 = l1.next;
        }
        place = BigInteger.ONE;
        while (l2 != null) {
            num2 = num2.add(
                BigInteger.valueOf(l2.val).multiply(place)
            );
            place = place.multiply(BigInteger.TEN);
            l2 = l2.next;
        }
        BigInteger sum = num1.add(num2);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        if (sum.equals(BigInteger.ZERO)) {
            return dummy;
        }
        while (sum.compareTo(BigInteger.ZERO) > 0) {
            BigInteger digit = sum.mod(BigInteger.TEN);
            temp.next = new ListNode(digit.intValue());
            temp = temp.next;
            sum = sum.divide(BigInteger.TEN);
        }
        return dummy.next;
    }
}