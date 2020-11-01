package com.genesis.tutorial.java;

public class getKthFromEnd {


    public static ListNode getKthFromEndMethod(ListNode head, int k) {
        ListNode former = head, latter = head;
        for (int i = 0; i < k; i++) {
            if (former == null) return null;
            former = former.next;
        }
        while (former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
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
        ListNode nodeSta = new ListNode(1);    //创建首节点
        ListNode nextNode;                     //声明一个变量用来在移动过程中指向当前节点
        nextNode = nodeSta;                      //指向首节点

        //创建链表
        for (int i = 2; i <= 5; i++) {
            nextNode.next = new ListNode(i);               //把心节点连起来
            nextNode = nextNode.next;           //当前节点往后移动
        } //当for循环完成之后 nextNode指向最后一个节点，

        nextNode = nodeSta;                     //重新赋值让它指向首节点
        print(nextNode);


        ListNode result = getKthFromEndMethod(nextNode, 2);
        print(result);

    }
}
