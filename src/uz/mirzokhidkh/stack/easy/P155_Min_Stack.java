package uz.mirzokhidkh.stack.easy;

import java.util.ArrayList;
import java.util.List;

public class P155_Min_Stack {


    class Node {
        int val;
        int min;

        public Node(int val, Node prev) {
            this.val = val;

            if (prev != null) {
                this.min = Math.min(prev.min, val);
            } else {
                this.min = val;
            }


        }
    }

    class MinStack {
        private List<Node> stack;
        int size = 0;

        public MinStack() {
            stack = new ArrayList<>();
        }

        public void push(int val) {
            Node node;
            if (size > 0) {
                Node prevNode = stack.get(size - 1);
                node = new Node(val, prevNode);

            } else {
                node = new Node(val, null);
            }
            stack.add(node);
            size++;

        }

        public void pop() {
            stack.remove(size - 1);
            size--;
        }

        public int top() {
            return stack.get(size - 1).val;
        }

        public int getMin() {
            return stack.get(size - 1).min;
        }
    }


}
