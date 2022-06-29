package uz.mirzokhidkh.stack.easy;

import java.util.ArrayList;
import java.util.List;

public class P232_Implement_Queue_using_Stacks {






}

class Node{
    private int val;
    private Node next;

    public Node(int val,Node next){
        this.val = val;
        this.next = next;
    }
}

class MyQueue {

    private List<Integer> queue;
    int top=0;



    public MyQueue() {
        queue = new ArrayList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int a = queue.get(0);
        queue.remove(0);
        return a;
    }

    public int peek() {
        return  queue.get(0);
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */