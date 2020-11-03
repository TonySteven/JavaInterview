package com.genesis.tutorial.java;

public class reverseList {
    public static ListNode reverseListMethod(ListNode head) {
        /* 特殊判断 */
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        return pre;
    }


    public static void main(String[] args) {
        ListNode node= new ListNode(0);
        int[] arr1 = new int[]{1,2,3,4,5,6};
        ListNode node1 = new ListNode(0);
        node1 = node1.arrayToListNode(arr1);

//        node.printListNode(node1);


        ListNode result = reverseListMethod(node1);
        node.printListNode(result);
    }
}
