package com.jz;

import java.util.HashMap;

/**
 * @Description: 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @Author zhangchaoxiang
 * @Date 2020/1/19
 **/
public class 链表中环的入口节点 {
    //指针 hash
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null){return null;}
        HashMap<ListNode,ListNode> hash=new HashMap<>();
        ListNode ln1=pHead;
        while(pHead.next!=null){
            if(hash.get(ln1)!=null){return ln1;}
            hash.put(ln1,pHead.next);
            ln1=ln1.next;
        }
        return null;
    }

    //快慢指针。快指针一次走两步，慢指针一次走一步，设链表起点到入口结点的长度是x1，快慢指针第一次相遇时距离入口结点的长度是x2，此时慢指针走了x1+x2，快指针走了2x1+2x2，也就是说x1+x2的长度正好是环的一圈大小的倍数。
    //此时让一个指针从起点出发，一个指针从相遇结点出发，都是一次走一步，当两个指针第一次相遇时恰好是在入口结点。
    public ListNode EntryNodeOfLoop2(ListNode pHead)
    {
        if(pHead==null||pHead.next==null){return null;}
        ListNode ln1=pHead;
        ListNode ln2=pHead;
        while(ln1.next!=null&&ln2.next!=null){
            if(ln2.next.next==null){return null;}
            ln1=ln1.next;
            ln2=ln2.next.next;
            if(ln1==ln2){//第一次相遇
                ln1=pHead;
                while(ln1!=ln2){
                    ln1=ln1.next;
                    ln2=ln2.next;
                }
                return ln1;
            }
        }
        return null;
    }
}
