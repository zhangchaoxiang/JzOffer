package com.jz;

import java.util.ArrayList;

/**
 * @program JzOffer
 * @description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @author: zhangchao
 * @create: 2020/01/05 19:38
 */
public class 从尾到头打印链表 {
    ArrayList<Integer> list = new ArrayList();

    /**
     * 递归
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}

