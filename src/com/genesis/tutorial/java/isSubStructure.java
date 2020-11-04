package com.genesis.tutorial.java;


import sun.lwawt.macosx.CSystemTray;

public class isSubStructure {

    public static boolean isSubStructureMethod(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recur(A, B) || isSubStructureMethod(A.left, B) || isSubStructureMethod(A.right, B));
    }

    static boolean recur(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return recur(A.left, B.left) && recur(A.right, B.right);
    }


    public static void main(String[] args) {
        int[] arr1 = {3,4,5,1,2};
        BinaryTree bt1 = new BinaryTree(arr1, 0);

        int[] arr2 = {4,1};
        BinaryTree bt2 = new BinaryTree(arr2, 0);

        boolean result = isSubStructureMethod(bt1.root, bt2.root);

        System.out.println(result);
    }
}
