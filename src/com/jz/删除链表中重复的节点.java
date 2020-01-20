package com.jz;

/**
 * @Description: 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 * @Author zhangchaoxiang
 * @Date 2020/1/20
 **/
public class 删除链表中重复的节点 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        Integer duplicate=null;//记录当前重复节点
        ListNode ln=new ListNode(-1);
        ln.next=pHead;
        while (ln!=null&&ln.next!=null){
            if(ln.next.next!=null&&ln.next.next.val==ln.next.val){
                if(ln.next==pHead){
                    pHead=pHead.next.next;
                }
                duplicate=ln.next.val;
                ln.next=ln.next.next.next;
                continue;
            }
            if(duplicate!=null&&ln.next.val==duplicate){
                if(ln.next==pHead){
                    pHead=pHead.next;
                }
                ln.next=ln.next.next;
                continue;
            }
            ln=ln.next;

        }
        return pHead;
    }
}
