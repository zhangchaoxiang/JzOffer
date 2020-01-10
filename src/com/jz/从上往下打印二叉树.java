package com.jz;

import java.util.ArrayList;

/**
 * @Description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @Author zhangchaoxiang
 * @Date 2020/1/10
 **/
public class 从上往下打印二叉树 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null){return null;}
        ArrayList<Integer> list=new ArrayList<>();
        addlist(root,list);
        return list;
    }

    private void addlist(TreeNode root, ArrayList<Integer> list) {
        if(root==null){return;}
        list.add(root.val);

    }
}
