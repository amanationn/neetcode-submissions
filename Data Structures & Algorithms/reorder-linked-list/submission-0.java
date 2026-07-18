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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode midNode = revList(slow.next);
        slow.next = null;
        ListNode begNode = head;
        ListNode temp1 = begNode, temp2 = midNode;

        while(begNode != null && midNode != null) {
            temp1 = begNode.next;
            temp2 = midNode.next;
            begNode.next = midNode;
            midNode.next = temp1;
            begNode = temp1;
            midNode = temp2;
        }
    }
    private ListNode revList(ListNode head) {
        ListNode prev = null, cur = head, temp = null;
        while(cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}