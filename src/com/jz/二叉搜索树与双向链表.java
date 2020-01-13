package com.jz;

/**
 * @program JzOffer
 * @description: 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * @author: zhangchao
 * @create: 2020/01/12 20:46
 */
public class 二叉搜索树与双向链表 {

    TreeNode pre=null;
    //中序逆序遍历
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null)
            return null;
        Convert(pRootOfTree.right);
        if(pre==null)
            pre=pRootOfTree;
        else{
            pRootOfTree.right=pre;
            pre.left=pRootOfTree;
            pre=pRootOfTree;
        }
        Convert(pRootOfTree.left);
        return pre;
    }
}
