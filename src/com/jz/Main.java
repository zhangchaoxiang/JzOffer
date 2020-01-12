package com.jz;

public class Main {
    public static void main(String[] args) {
        TreeNode s=new TreeNode(1);
        s.left=new TreeNode(2);
        s.right=new TreeNode(-1);
        s.right.left=new TreeNode(3);
        new 二叉树中和为某一值的路径().FindPath(s, 3);

        int n=2;
        System.out.println(n-->0);
    }
}
