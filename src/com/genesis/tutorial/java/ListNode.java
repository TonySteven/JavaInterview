package com.genesis.tutorial.java;


import java.util.ArrayList;
import java.util.LinkedList;

public class ListNode  {
    int val;            //数据 ：节点数据
    ListNode next;      //对象 ：引用下一个节点对象。在Java中没有指针的概念，Java中的引用和C语言的指针类似

    ListNode(int val) {  //构造方法 ：构造方法和类名相同
        this.val = val;   //把接收的参数赋值给当前类的val变量
    }

    public ListNode() {

    }

    public static  ListNode arrayToListNode(int[] arr){
        ListNode head = new ListNode(arr[0]); // 把数组的第一个位置定义为头结点
        ListNode other = head; // 一个指针，此时指向头结点
        for(int i=1;i<arr.length;i++){ //头结点已经定义，从1开始
            ListNode temp = new ListNode(arr[i]);
            other.next = temp;
            other = other.next;

        }//在此处打印结点容易导致head的变化
        return head;
    }
    public static void printListNode(ListNode node){
        while(node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }
    public static void nodeTolist(ListNode node){
        ArrayList<Integer> list = new ArrayList<>();
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        System.out.println();
        System.out.println(list);

    }
}



