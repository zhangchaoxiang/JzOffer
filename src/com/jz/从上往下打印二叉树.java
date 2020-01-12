package com.jz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @Author zhangchaoxiang
 * @Date 2020/1/10
 **/
public class 从上往下打印二叉树 {
    /**
     *
     * 在Java中Queue是和List、Map同等级别的接口，LinkedList中也实现了Queue接口，该接口中的主要函数有：
     *
     * 1.容量不够或队列为空时不会抛异常：offer（添加队尾元素）、peek（访问队头元素）、poll（访问队头元素并移除）
     * 2.容量不够或队列为空时抛异常：add、element（访问队列元素）、remove（访问队头元素并移除）
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null)return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            result.add(temp.val);
            if(temp.left != null)queue.offer(temp.left);
            if(temp.right != null)queue.offer(temp.right);
        }
        return result;
    }


}
