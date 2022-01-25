package uz.mkhasanov.dsa;

public class P155_Min_Stack {

}


class Node {
    int val;
    Node prev;
    int min;

    public Node() {
    }

    public Node(int val, int min) {
        this.val = val;
        this.min = min;
    }

}

class MinStack {
    private Node top;


    public MinStack() {
        top = null;
    }

    public void push(int val) {
        if (top == null) {
            top = new Node(val, val);
        } else {
            Node node = new Node(val, Math.min(top.min, val));
            node.prev = top;
            top = node;
        }
    }

    public void pop() {
        top = top.prev;
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        return top.min;
    }

}