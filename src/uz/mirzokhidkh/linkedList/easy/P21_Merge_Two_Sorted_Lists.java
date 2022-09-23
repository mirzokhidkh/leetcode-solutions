package uz.mirzokhidkh.linkedList.easy;

public class P21_Merge_Two_Sorted_Lists {


    //Iterative
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

}
