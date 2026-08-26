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
        Map<Node, Node> mp = new HashMap<>();
        Node temp = head;
        Node new_head = null, prev = null, node = null;
        while(temp != null) {
            node = new Node(temp.val);
            if(new_head == null)
                new_head = node;
            if(prev != null)
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
        return new_head;
    }
}
