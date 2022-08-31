package uz.mirzokhidkh.hashtable.medium;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Node {
    int val;
    Node next;

    public Node() {

    }

    public Node(int val) {
        this.val = val;
    }

}

class RandomizedSet {

    private static final int size = 10000;
    int l = 0;
    Node[] set;
    Set<Integer> locs;

    public RandomizedSet() {
        set = new Node[size];
        locs = new HashSet<>();
    }

    public boolean insert(int val) {
        int hashcode = getHashcode(val);

        Node pointer = set[hashcode];
        if (pointer == null) {
            set[hashcode] = new Node(val);
        } else {
            Node cur = pointer;

            while (cur.next != null) {
                if (cur.val == val) {
                    return false;
                }
                cur = cur.next;
            }

            if (cur.val == val) {
                return false;
            }
            cur.next = new Node(val);

        }
        locs.add(hashcode);
        ++l;

        return true;

    }

    public boolean remove(int val) {

        int hashcode = getHashcode(val);

        Node pointer = set[hashcode];

        if (pointer != null) {

            Node cur = pointer;
            Node prev = null;
            while (cur != null) {
                if (cur.val == val) {
                    if (prev == null) {
                        set[hashcode] = cur.next;
                    } else {
                        prev.next = cur.next;
                    }
                    --l;
                    return true;
                }
                prev = cur;
                cur = cur.next;
            }

        }

        return false;
    }


    public int getRandom() {
        Integer[] arrayNumbers = toArray(new Integer[l]);
        Random rndm = new Random();
        int rndmNumber = rndm.nextInt(l);

        // System.out.println(l);

        return arrayNumbers[rndmNumber];
    }

    public int getHashcode(int key) {
        return Math.abs(key % size);
    }


    public Integer[] toArray(Integer[] arr) {


        int i = 0;
        for (Integer pos : locs) {
            Node cur = set[pos];

            if (cur != null) {
                // Node cur = pointer;

                while (cur != null) {
                    arr[i++] = cur.val;

                    cur = cur.next;
                }

            }

        }

        return arr;
    }

}

public class P380_Insert_Delete_GetRandom_O1 {
}

