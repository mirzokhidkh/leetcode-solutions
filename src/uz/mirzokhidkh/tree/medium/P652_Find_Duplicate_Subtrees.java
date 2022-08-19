package uz.mirzokhidkh.tree.medium;

import uz.mirzokhidkh.tree.TreeNode;

import java.text.ParseException;
import java.util.*;

public class P652_Find_Duplicate_Subtrees {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        Map<String,Integer> map = new HashMap<>();
        List<TreeNode> list = new ArrayList<>();
        postOrder(root,map,list);

        return list;
    }

    public String postOrder(TreeNode curr, Map<String,Integer> map, List<TreeNode> res){
        if(curr==null){
            return "#";
        }
        String serial = curr.val+","+postOrder(curr.left,map,res)+","+postOrder(curr.right,map,res);
        map.put(serial,map.getOrDefault(serial,0)+1);

        if(map.get(serial)==2){
            res.add(curr);
        }
        return serial;
    }

}
