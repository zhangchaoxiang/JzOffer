package com.jz;
/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author zhangchaoxiang
 * @Date Created in 2020/1/9
 */
public class 链表中倒数第n个节点 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<1){return null;}
        ListNode knode=head;
        for(int i=1;i<k;i++){
            if(head.next==null){
                return null;
            }
            head=head.next;
        }
        while(head.next!=null){
            head=head.next;
            knode=knode.next;
        }
        return knode;
    }

}
