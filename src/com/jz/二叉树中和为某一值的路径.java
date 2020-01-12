package com.jz;


import java.util.ArrayList;

/**
 * @program JzOffer
 * @description: 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 * @author: zhangchao
 * @create: 2020/01/12 15:14
 */
public class 二叉树中和为某一值的路径 {
    /**
     * 此方法实现排序不准确
     * @param root
     * @param target
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null)return null;
        ArrayList<ArrayList<Integer>> rt=new ArrayList<>();
        ArrayList<Integer> va=new ArrayList<>();
        addlist(root,va,0,target,rt);
        rt.sort((o1, o2) -> o2.size()-o1.size());
        return rt;
    }

    private void addlist(TreeNode root, ArrayList<Integer> va, int num, int target, ArrayList<ArrayList<Integer>> rt) {
        va.add(root.val);
        num+=root.val;
        if(root.left!=null){
            addlist(root.left, new ArrayList<>(va),num,target,rt);
        }
        if(root.right!=null){
            addlist(root.right, new ArrayList<>(va),num,target,rt);
        }
        if(root.left==null&&root.right==null&&num==target){
            rt.add(va);
        }
    }
}
