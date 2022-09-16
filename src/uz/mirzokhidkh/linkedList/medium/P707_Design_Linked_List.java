package uz.mirzokhidkh.linkedList.medium;

class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
    }

    public String toString() {
        return val + " => " + next;
    }
}

class MyLinkedList {

    Node head;
    int size = 0;


    public MyLinkedList() {

    }

    public int get(int index) {

        Node cur = head;
        int i = 0;
        while (cur != null) {
            if (i == index) {
                return cur.val;
            }
            cur = cur.next;
            i++;
        }

        return -1;

    }

    public void addAtHead(int val) {

        Node cur = new Node(val);
        cur.next = head;
        head = cur;
        size++;

    }

    public void addAtTail(int val) {

        if (size == 0) {

            addAtHead(val);

            return;
        }


        Node cur = head;

        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = new Node(val);
        size++;

    }

    public void addAtIndex(int index, int val) {

        if (index == 0) {
            addAtHead(val);

            return;
        }


        Node cur = head;
        int i = 0;
        if (index <= size) {

            while (cur.next != null && i < size) {

                if (i + 1 == index) {

                    Node newNode = new Node(val);
                    Node next = cur.next;
                    cur.next = newNode;
                    newNode.next = next;
                    size++;

                    return;
                }

                cur = cur.next;
                i++;
            }


            cur.next = new Node(val);
            size++;
        }

    }

    public void deleteAtIndex(int index) {

        if (index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;

            return;
        }

        Node cur = head;
        int i = 0;


        while (cur.next != null) {
            if (i + 1 == index) {
                if (cur.next.next != null) {
                    cur.next = cur.next.next;
                } else {
                    cur.next = null;
                }

                size--;

                return;
            }
            cur = cur.next;
            i++;
        }
    }
}

public class P707_Design_Linked_List {


}
