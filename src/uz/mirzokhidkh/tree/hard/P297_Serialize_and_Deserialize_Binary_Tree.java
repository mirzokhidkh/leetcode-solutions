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
        String s1 = serialize(root);
        System.out.println(s1);
        TreeNode treeNode1 = deserialize(s1);
        System.out.println(serialize(treeNode1));


        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
//        System.out.println(serialize(root1));
        String s2 = serialize(root1);
        System.out.println(s2);
        TreeNode treeNode2 = deserialize(s2);
        System.out.println(serialize(treeNode2));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(4);
        String s3 = serialize(root2);
        System.out.println(s3);
        TreeNode treeNode3 = deserialize(s3);
        System.out.println(serialize(treeNode3));

//        System.out.println(serialize(root2));

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

    public static String serialize(TreeNode root) {
        if (root == null) return "[]";

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<String>> listOfStrLists = new ArrayList<>();
        listOfStrLists.add(Collections.singletonList(String.valueOf(root.val)));

        while (!queue.isEmpty()) {
            int size = queue.size();

            List<String> levelList = new ArrayList<>();

            while (size-- > 0) {
                TreeNode node = queue.poll();

                addTo(queue, levelList, node.left);

                addTo(queue, levelList, node.right);
            }

            if (!queue.isEmpty()) {
                listOfStrLists.add(levelList);
            }

        }

        List<String> strList = new ArrayList<>();
        listOfStrLists.forEach(strList::addAll);

        String str = String.join(",", strList);

        return "[" + (str.endsWith("null") ? str.substring(0, str.length() - 5) : str) + "]";

    }

    private static void addTo(Queue<TreeNode> queue, List<String> levelList, TreeNode left) {
        if (left != null) {
            queue.offer(left);
            levelList.add(String.valueOf(left.val));
        } else {
            levelList.add("null");
        }
    }

    public static TreeNode deserialize(String data) {
        if (data == "[]") return null;

        data = data.substring(1, data.length() - 1);
        String[] arr = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(arr));

        TreeNode root = new TreeNode(Integer.parseInt(queue.poll()));

        Queue<TreeNode> queueNode = new LinkedList<>();
        queueNode.offer(root);

        while (!queue.isEmpty()) {
            int size = queueNode.size();

            while (size-- > 0) {
                TreeNode node = queueNode.poll();

                addAsChild(queue, queueNode, node, true);
                addAsChild(queue, queueNode, node, false);
            }
        }

        return root;
    }

    private static void addAsChild(Queue<String> queue, Queue<TreeNode> queueNode, TreeNode node, boolean isLeft) {
        if (!queue.isEmpty()) {
            String val = queue.poll();
            if (!Objects.equals(val, "null")) {
                if (isLeft){
                    node.left = new TreeNode(Integer.parseInt(val));
                    queueNode.offer(node.left);
                }else {
                    node.right = new TreeNode(Integer.parseInt(val));
                    queueNode.offer(node.right);
                }

            }
        }
    }


}
