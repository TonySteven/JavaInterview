package com.genesis.tutorial.java;

public class Node {
    private int data;        /*节点数据*/
    private Node node_next; /*节点的下一个节点*/

    public Node(int val_data) { /*节点构造函数*/
        this.data = val_data;
        node_next = null;
    }

    public void setNode_next(Node val_node) {/*设置节点的下一个节点*/
        node_next = val_node;
    }

    public Node getNode_next() {/*获取节点的下一个节点*/
        return node_next;
    }

    public void printNode() {  /*输出节点数据*/
        System.out.println(this.data + " ");
    }
}
