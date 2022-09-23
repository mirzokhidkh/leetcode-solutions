package uz.mirzokhidkh.linkedList.easy;

public class P160_Intersection_of_Two_Linked_Lists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode curA = headA, curB = headB;

        int m = 0, n = 0;

        while (curA != null || curB != null) {
            if (curA != null) {
                curA = curA.next;
                m++;
            }
            if (curB != null) {
                curB = curB.next;
                n++;
            }
        }

        curA = headA;
        curB = headB;

        if (m > n) {
            return intersect(curA, curB, m - n);
        }

        return intersect(curB, curA, n - m);

    }


    public ListNode intersect(ListNode headA, ListNode headB, int k) {

        while (headA != null || headB != null) {
            if (k == 0) {

                if (headA == headB) {
                    return headA;
                }

                headB = headB.next;
            } else {
                k--;
            }

            headA = headA.next;

        }

        return null;
    }

}
