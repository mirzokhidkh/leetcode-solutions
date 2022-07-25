package uz.mirzokhidkh.hashtable.easy;

public class P706_Design_HashMap  {


}

class NodeForMap {
    public int key;
    public int val;
    public NodeForMap next;

    public NodeForMap(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class MyHashMap {
    private static final int size = 10000;
    NodeForMap[] map;

    public MyHashMap() {
        map = new NodeForMap[size];
    }

    public void put(int key, int value) {
        NodeForMap pointer = map[key % size];

        if (pointer == null) {
            map[key % size] = new NodeForMap(key, value);
        } else {
            NodeForMap curr = pointer;

            while (curr.next != null) {
                if (curr.key == key) {
                    curr.val = value;
                    return;
                }
                curr = curr.next;
            }

            if (curr.key == key) {
                curr.val = value;
            } else {
                curr.next = new NodeForMap(key, value);
            }

        }


    }

    public int get(int key) {
        NodeForMap pointer = map[key % size];

        NodeForMap curr = pointer;

        while (curr != null) {
            if (curr.key == key) {
                return curr.val;
            }
            curr = curr.next;
        }

        return -1;
    }

    public void remove(int key) {
        NodeForMap pointer = map[key % size];

        NodeForMap curr = pointer;
        NodeForMap prev = null;

        while (curr != null) {

            if (curr.key == key) {

                if (prev == null) {
                    map[key % size] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }

            prev = curr;
            curr = curr.next;
        }

    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
