package com.jz;

/**
 * @Description: 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * @Author zhangchaoxiang
 * @Date 2020/1/20
 **/
public class 二叉树的下一个节点 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right==null)return nextRoot(pNode);
        return nextRight(pNode.right);
    }

    private TreeLinkNode nextRoot(TreeLinkNode pNode) {
        if(pNode.next==null)return null;
        if(pNode.next.left==pNode){return pNode.next;}
        return nextRoot(pNode.next);
    }

    private TreeLinkNode nextRight(TreeLinkNode right) {
        if(right.left!=null){return nextRight(right.left);}
        return right;
    }
}
