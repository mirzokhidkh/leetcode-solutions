package uz.mirzokhidkh.tree.hard;

import uz.mirzokhidkh.tree.TreeNode;

import java.util.*;

public class P297_Serialize_and_Deserialize_Binary_Tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);

        System.out.println(serialize(root1));


//        String s = "[1,2,3,null,null,4,5]";
        String s = "[1,2]";
//        System.out.println(s == "[]");
//        s = s.substring(1, s.length() - 1);
//        String[] yourArray = s.split(",");
//        Queue<String> queue = new LinkedList<>(Arrays.asList(yourArray));
//        System.out.println(queue);
        TreeNode treeNode = deserialize(s);
//        System.out.println(deserialize(s));
//
//        System.out.println(serialize(treeNode));
    }

    public static TreeNode deserialize(String data) {
        if (data == "[]") return null;
        data = data.substring(1, data.length() - 1);
        String[] arr = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(arr));

        TreeNode root = new TreeNode(Integer.parseInt(queue.poll()));

        Queue<TreeNode> queueNode = new LinkedList<>();
        queueNode.offer(root);
        // if (node.left != null) {
        // queue.offer(node.left);
//         }

//         if (node.right != null) {
//             queue.offer(node.right);
//         }

        while (!queue.isEmpty()) {
            int size = queueNode.size();

            while (size-- > 0) {
                TreeNode node = queueNode.poll();

                if (!queue.isEmpty()) {
                    String val = queue.poll();
                    if (!Objects.equals(val, "null")) {
                        node.left = new TreeNode(Integer.parseInt(val));
                        queueNode.offer(node.left);
                    }
                }

                if (!queue.isEmpty()) {
                    String val = queue.poll();

                    if (!Objects.equals(val, "null")) {
                        node.right = new TreeNode(Integer.parseInt(val));
                        queueNode.offer(node.right);
                    }
                }


            }
        }


        return root;
    }

    public static String serialize(TreeNode root) {
        if (root == null) return "[]";
        String str = "";

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<String> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            int size = queue.size();

            List<String> z = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = queue.poll();

                list.add(String.valueOf(node.val));

                if (node.left != null) {
                    queue.offer(node.left);
                } else {
                    z.add("null");
                }

                if (node.right != null) {
                    queue.offer(node.right);
                } else {
                    z.add("null");
                }
            }
            if (!queue.isEmpty())
                list.addAll(z);
        }

        str = String.join(",", list);

        return "[" + str + "]";
    }
}
