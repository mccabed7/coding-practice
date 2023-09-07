/*
    Link: https://leetcode.com/problems/add-two-numbers
    Problem: Add two numbers stored in a linked list in reverse order
    Solution: complete
    Tested: yes
    Time Complexity: O(n + m), where m and n are the lengths of the strings
    Space Complexity: O(n + m),     "

    Notes:
        + An interesting case where recursive is the bad option, and it overcomplicates things.
 */

public class AddTwoNumbers2 {
    public class ListNode {
         int val;
         ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode p1 = l1;
            ListNode p2 = l2;
            ListNode pHead = null;
            ListNode pCopy = null;
            int carry = 0;
            int prevCarry = 0;

            while (p1 != null || p2 != null){
                int i1 = (p1 != null)? p1.val : 0;
                int i2 = (p2 != null)? p2.val : 0;

                int sum = i1 + i2 + prevCarry;
                if(sum >= 10){
                    carry = 1;
                    sum = sum % 10;
                }
                else{
                    carry = 0;
                }

                if(pHead == null){
                    pHead = new ListNode(sum);
                    pCopy = pHead;
                }
                else{
                    pCopy.next = new ListNode(sum);
                    pCopy = pCopy.next;
                }
                prevCarry = carry;

                p1 = (p1 != null && p1.next != null)? p1.next : null;
                p2 = (p2 != null && p2.next != null)? p2.next : null;
            }
            if(carry != 0){
                pCopy.next = new ListNode(carry);
            }


            return pHead;
        }
    }
}
