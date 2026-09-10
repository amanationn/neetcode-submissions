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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right)
            return head;

        ListNode leftNode = null, leftPrevNode = null, temp = head;
        int pos = 1;

        while(pos != right) {
            if(pos + 1 == left) {
                leftPrevNode = temp;
            }

            if(pos == left) {
                leftNode = temp;
            }
            
            temp = temp.next;
            pos++;
        }

        ListNode rightNextNode = temp.next;
        temp = reverseList(leftNode, rightNextNode);

        if(left == 1)
            return temp;

        leftPrevNode.next = temp;
        return head;
    }

    public ListNode reverseList(ListNode head, ListNode tail) {
        ListNode prev = tail, curr = head, next = null;

        while(curr != tail) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}