package com.jz;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @program JzOffer
 * @description: 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * @author: zhangchao
 * @create: 2020/02/03 14:14
 */
public class 把二叉树打印成多行 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        LinkedList<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        q.add(pRoot);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                if(node == null){continue;}
                list.add(node.val);
                q.offer(node.left);
                q.offer(node.right);
            }
            if(list.size()!=0){res.add(list);}
        }
        return res;
    }
}
