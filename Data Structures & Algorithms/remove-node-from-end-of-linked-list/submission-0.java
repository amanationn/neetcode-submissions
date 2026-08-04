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
        int m = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            m++;
        }
        m = m - n + 1;
        if(m == 1) {
            return head.next;
        }
        int i = 1;
        temp = head;
        while(i+1 < m) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}
