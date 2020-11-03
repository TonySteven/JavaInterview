package com.genesis.tutorial.java;

import java.util.ArrayList;

public class mergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }



    public static void main(String[] args) {
        ListNode node= new ListNode(0);
        int[] arr1 = new int[]{1,2,5};
        int[] arr2 = new int[]{3,4,6};
        ListNode node1 = new ListNode(0);
        node1 = node1.arrayToListNode(arr1);
        ListNode node2 = new ListNode(0);
        node2 = node2.arrayToListNode(arr2);
//        node.printListNode(node1);
//        node.printListNode(node2);

        ListNode result = mergeTwoLists(node1,node2);
        node.printListNode(result);
    }
}
