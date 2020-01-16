package com.jz;

/**
 * @Description: 输入两个链表，找出它们的第一个公共结点。
 * @Author zhangchaoxiang
 * @Date 2020/1/16
 **/
public class 两个链表的第一个公共节点 {
    //两个列表尾部相同，双指针，计算出两个链表长度，长的先走，与短的并列，然后并列前行比较。
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){return null;}
        int l1=0;
        int l2=0;
        ListNode new1=pHead1;
        ListNode new2=pHead2;
        while (pHead1!=null){
            l1++;
            pHead1=pHead1.next;
        }
        while (pHead2!=null){
            l2++;
            pHead2=pHead2.next;
        }

        while(new1!=null&&new2!=null){
            if(l1==l2){
                if(new1==new2){
                    return new1;
                }
                new1=new1.next;
                new2=new2.next;
            }else if(l1>l2){
                l1--;
                new1=new1.next;
            }else{
                l2--;
                new2=new2.next;
            }
        }

        return null;
    }
}
