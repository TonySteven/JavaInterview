package com.genesis.tutorial.java;

public class isSymmetric {

    public static boolean isSymmetricMethod(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    static boolean recur(TreeNode L, TreeNode R) {
        if (L == null && R == null) return true;
        if (L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right, R.left);
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 4, 3};
        BinaryTree bt1 = new BinaryTree(arr1, 0);


        boolean result = isSymmetricMethod(bt1.root);
        System.out.println(result);
    }
}
