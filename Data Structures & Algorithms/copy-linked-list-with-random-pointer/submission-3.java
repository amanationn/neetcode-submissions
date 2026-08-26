/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(0);
        Node prev = dummy;
        Node temp = head;

        Map<Node, Node> mp = new HashMap<>();
        while(temp != null) {
            Node node = new Node(temp.val);
            prev.next = node;
            prev = node;

            mp.put(temp, node);
            temp = temp.next;
        }

        temp = head;
        while(temp != null) {
            Node copy_node = mp.get(temp);
            Node rand_node = mp.get(temp.random);
            copy_node.random = rand_node;
            temp = temp.next;
        }
        return dummy.next;
    }
}
