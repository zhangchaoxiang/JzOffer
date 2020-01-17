package com.jz;

/**
 * @Description: 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * @Author zhangchaoxiang
 * @Date 2020/1/17
 **/
public class 平衡二叉树 {
    int low=0;
    int high=0;
    //最短节点与最长节点差
    public boolean IsBalanced_Solution(TreeNode root) {
        find(root);
        return (high-low)<2;
    }

    private int find(TreeNode root) {
        if(root==null)return 0;
        int left=find(root.left);
        int right=find(root.right);
        low=1+(left>right?right:left);
        high=1+(left>right?left:right);
        return high;
    }

    //第二种解法
    public boolean IsBalanced_Solution2(TreeNode root) {
        return depth(root) != -1;
    }

    public int depth(TreeNode root){
        if(root == null)return 0;
        int left = depth(root.left);
        if(left == -1)return -1; //如果发现子树不平衡之后就没有必要进行下面的高度的求解了
        int right = depth(root.right);
        if(right == -1)return -1;//如果发现子树不平衡之后就没有必要进行下面的高度的求解了
        if(left - right <(-1) || left - right > 1)
            return -1;
        else
            return 1+(left > right?left:right);
    }

}
