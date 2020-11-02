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

    //打印输出方法
    static void print(ListNode listNoed) {
        //创建链表节点
        while (listNoed != null) {
            System.out.println("节点:" + listNoed.val);
            listNoed = listNoed.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode nodeSta1 = new ListNode(1);    //创建首节点
        ListNode nextNode;                     //声明一个变量用来在移动过程中指向当前节点
        nextNode = nodeSta1;                      //指向首节点

        //创建链表
        for (int i = 2; i <= 5; i++) {
            nextNode.next = new ListNode(i);               //把心节点连起来
            nextNode = nextNode.next;           //当前节点往后移动
        } //当for循环完成之后 nextNode指向最后一个节点，

        nextNode = nodeSta1;                     //重新赋值让它指向首节点
        print(nextNode);


        ListNode result = reverseListMethod(nextNode);
        print(result);
    }
}
