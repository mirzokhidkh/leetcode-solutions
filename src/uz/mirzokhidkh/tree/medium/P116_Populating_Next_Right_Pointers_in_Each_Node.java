package uz.mirzokhidkh.tree.medium;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class P116_Populating_Next_Right_Pointers_in_Each_Node {


    // BFS approach
    public Node connect(Node root) {
        if (root == null) return root;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            Node curr = null;
            while (size-- > 0) {

                curr = queue.poll();

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }

                if (size > 0 && queue.size() > 0) {
                    curr.next = queue.peek();
                }

            }
        }
        return root;
    }


    //DFS approach
    public Node connect2(Node root) {
        if (root == null) return root;

        if (root.left != null) {
            root.left.next = root.right;
        }

        if (root.right != null && root.next != null) {
            root.right.next = root.next.left;
        }

        connect2(root.left);
        connect2(root.right);

        return root;
    }


}
