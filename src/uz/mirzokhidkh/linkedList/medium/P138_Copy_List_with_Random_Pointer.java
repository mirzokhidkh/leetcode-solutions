package uz.mirzokhidkh.linkedList.medium;

import java.util.HashMap;
import java.util.Map;

public class P138_Copy_List_with_Random_Pointer {
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

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node, Node> map = new HashMap<>();

        Node curr = head;
        Node copy = new Node(curr.val);

        map.put(curr, copy);

        while (curr.next != null) {
            copy.next = new Node(curr.next.val);
            curr = curr.next;
            copy = copy.next;
            map.put(curr, copy);
        }

        curr = head;

        while (curr != null) {
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
