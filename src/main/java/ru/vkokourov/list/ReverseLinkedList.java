package ru.vkokourov.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseLinkedList {

//    Given the head of a singly linked list, reverse the list, and return the reversed list.

//    head = [1,2,3,4,5]  -  [5,4,3,2,1]

    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        Collections.reverse(list);

        cur = head;

        for (int i = 0; i < list.size(); i++) {
            cur.val = list.get(i);
            cur = cur.next;
        }
        return head;

//        if (head == null) {
//            return head;
//        }
//        ListNode temp = head.next;
//        head.next = null;
//        while (temp != null) {
//            ListNode t = temp.next;
//            temp.next = head;
//            head = temp;
//            temp = t;
//        }
//        return head;
    }
}
