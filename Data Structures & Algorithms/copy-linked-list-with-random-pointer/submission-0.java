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
        
        HashMap<Node, Node> old_to_new = new HashMap<>();
        Node curr = head;
        while(curr != null){
            Node copy = new Node(curr.val);
            old_to_new.put(curr, copy);
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            Node copy = old_to_new.get(curr);
            copy.next = old_to_new.get(curr.next);
            copy.random = old_to_new.get(curr.random);
            curr = curr.next;
        }

        return old_to_new.get(head);
        
    }
}
