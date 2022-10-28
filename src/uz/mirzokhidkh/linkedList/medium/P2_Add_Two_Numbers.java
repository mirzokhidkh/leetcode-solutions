package uz.mirzokhidkh.linkedList.medium;

import uz.mirzokhidkh.Util.ListNode;

public class P2_Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode curr1 = new ListNode(-1, l1), curr2 = new ListNode(-1, l2);

        int carry = 0;

        while (curr1.next != null && curr2.next != null) {
            int v = curr1.next.val + curr2.next.val + carry;
            carry = 0;

            if (v > 9) {
                v = v % 10;
                carry = 1;
            }

            curr1.next.val = v;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        ListNode curr = new ListNode(-1);

        if (curr2.next != null) {
            curr1.next = curr2.next;
        }

        curr.next = curr1.next;

        while (curr.next != null && carry != 0) {

            int v = curr.next.val + carry;
            carry = 0;

            if (v > 9) {
                v = v % 10;
                carry = 1;
            }

            curr.next.val = v;
            curr = curr.next;
        }

        if (curr.val == -1 && carry == 1) {
            curr1.next = new ListNode(1);
        } else if (carry == 1) {
            // System.out.println(curr.val);
            curr.next = new ListNode(1);
        }


        return l1;
    }

}
