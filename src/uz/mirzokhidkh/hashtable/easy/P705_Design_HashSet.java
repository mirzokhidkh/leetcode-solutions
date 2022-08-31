package uz.mirzokhidkh.hashtable.easy;


public class P705_Design_HashSet {
    public static void main(String[] args) {

    }
}

class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}

class MyHashSet {

    private static final int size = 10000;
    Node[] set;

    public MyHashSet() {
        set = new Node[size];
    }

    public void add(int key) {

        Node pointer = set[key % size];

        if (pointer == null) {
            set[key % size] = new Node(key);
        } else {
            Node curr = pointer;
            // Node prev = curr;
            while (curr.next != null) {
                if (curr.val == key) {
                    return;
                }
                // prev = curr;
                curr = curr.next;
            }
            // prev.next = new Node(key);
            if (curr.val == key) {
                return;
            }
            curr.next = new Node(key);


        }



    }

    public void remove(int key) {
        Node pointer = set[key % size];

        Node curr = pointer;
        Node prev = null;

        while (curr != null) {
            if (curr.val == key) {

                if (prev == null) {
                    set[key % size] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }

            prev = curr;
            curr = curr.next;
        }

    }

    public boolean contains(int key) {
        Node pointer = set[key % size];

        Node curr = pointer;

        while (curr != null) {
            if (curr.val == key) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */