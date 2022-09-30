package uz.mirzokhidkh.linkedList.medium;

public class P430_Flatten_a_Multilevel_Doubly_Linked_List {
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }


    public Node flatten(Node head) {
        if (head == null) return null;
        Node curr = head;

        while (curr != null) {

            if (curr.child != null) {
                Node oldNext = curr.next;
                Node child = flatten(curr.child);
                curr.child = null;

                curr.next = child;
                child.prev = curr;

                if (oldNext != null) {
                    Node temp = child;

                    while (temp.next != null) {
                        temp = temp.next;
                    }

                    temp.next = oldNext;
                    oldNext.prev = temp;
                }
            }
            curr = curr.next;
        }

        return head;
    }
}
