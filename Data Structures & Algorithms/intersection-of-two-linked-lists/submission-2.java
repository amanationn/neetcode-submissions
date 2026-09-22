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
        ListNode tempA = headA, tempB = headB;
        int nA = 0, nB = 0;

        while(tempA != null) {
            nA++;
            tempA = tempA.next;
        }
        while(tempB != null) {
            nB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;
        int diff = Math.abs(nA - nB);

        if(nA > nB) {
            while(diff-- > 0) {
                tempA = tempA.next;
            } 
        }
        else if(nB > nA) {
            while(diff-- > 0) {
                tempB = tempB.next;
            } 
        }

        while(tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}