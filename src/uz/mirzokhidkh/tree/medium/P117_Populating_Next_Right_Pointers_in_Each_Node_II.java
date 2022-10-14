package uz.mirzokhidkh.tree.medium;

import java.util.LinkedList;
import java.util.Queue;

public class P117_Populating_Next_Right_Pointers_in_Each_Node_II {
    /**
     * BFS approach
     */
    public Node connect1(Node root) {
        if (root == null) return null;

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

    /**
     * DFS approach
     */


    public Node connect2(Node root) {
        if (root == null) return null;

        if (root.left != null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else {
                root.left.next = findNext(root);
            }
        }

        connect2(root.left);
        connect2(root.right);

        return root;
    }


    public Node findNext(Node root) {
        while (root.next != null) {
            root = root.next;
            if (root.left != null) {
                return root.left;
            }
            if (root.right != null) {
                return root.right;
            }
        }
        return null;
    }


}
