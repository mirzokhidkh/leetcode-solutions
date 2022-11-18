package uz.mirzokhidkh.linkedList.easy;

public class P21_Merge_Two_Sorted_Lists {


    //Iterative approach
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode mergedList = new ListNode(-1);
        ListNode curr = mergedList;

        while (list1 != null || list2 != null) {

            if ((list1 != null && list2 != null && list1.val < list2.val) || list2 == null) {
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            curr = curr.next;
        }

        return mergedList.next;
    }

    //Recursive approach
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) {
            return null;
        }else if(list1 != null && list2 == null){
            return  list1;
        }else if(list1 == null){
            return list2;
        }

        ListNode mergeList = new ListNode(-1);
        ListNode curr = new ListNode(-1);
        curr.next = mergeList;
        merge(list1,list2,curr);

        return mergeList;
    }

    public void merge(ListNode list1, ListNode list2, ListNode curr){
        if(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                curr.next.val = list1.val;
                curr.next.next =  new ListNode(-1);
                curr = curr.next;
                merge(list1.next,list2,curr);
            }else{
                curr.next.val = list2.val;
                curr.next.next =  new ListNode(-1);
                curr = curr.next;
                merge(list1,list2.next,curr);
            }
        }else if(list1 != null){
            curr.next = list1;
        }else if(list2 != null){
            curr.next = list2;
        }
    }




}
