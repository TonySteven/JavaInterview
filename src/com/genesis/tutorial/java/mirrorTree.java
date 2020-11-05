package com.genesis.tutorial.java;

public class mirrorTree {

    public static TreeNode mirrorTreeMethod(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTreeMethod(root.right);
        root.right = mirrorTreeMethod(tmp);
        return root;

    }


    public static void main(String[] args) {
        int[] arr1 = {4, 2, 7, 1, 3, 6, 9};
        BinaryTree bt1 = new BinaryTree(arr1, 0);


        TreeNode result = mirrorTreeMethod(bt1.root);
        System.out.println(result);
    }
}
