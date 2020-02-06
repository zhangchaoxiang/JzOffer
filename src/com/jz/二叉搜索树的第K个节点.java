package com.jz;

import java.util.ArrayList;

/**
 * @program JzOffer
 * @description: 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如， （5，3，7，2，4，6，8） 中，按结点数值大小顺序第三小结点的值为4。
 * @author: zhangchao
 * @create: 2020/02/04 11:47
 */
public class 二叉搜索树的第K个节点 {

    ArrayList <TreeNode> list = new ArrayList<>(); // (1)

    TreeNode KthNode(TreeNode pRoot, int k)
    {
        addNode(pRoot);

        if(k>=1 && list.size()>=k) {
            return list.get(k-1);
        }

        return null;

    }

    // 中序遍历
    void addNode(TreeNode cur) {   // (2)
        if(cur != null) {
            addNode(cur.left);
            list.add(cur);
            addNode(cur.right);
        }
    }

}
