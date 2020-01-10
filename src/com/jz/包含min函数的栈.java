package com.jz;

import java.util.Stack;

/**
 * @Description: 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * @Author zhangchaoxiang
 * @Date 2020/1/10
 **/
public class 包含min函数的栈 {
    Stack<Integer> stack=new Stack();
    Stack<Integer> minstack=new Stack();
    public void push(int node) {
        stack.push(node);
        if(minstack.empty()||minstack.peek()>node){
            minstack.push(node);
        }else{
            minstack.push(minstack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minstack.peek();
    }
}
        /*方法二：压缩还原法
        我们发现其实最小值min它本身就是一种冗余信息。为什么呢？因为每个元素在数值上都包含了min值，举个例子，假设入栈序列为：4、5、6、3、2、1，
        那么各轮次对应的min值就是：4、4、4、3、2、1，发现有：
        4=4+0，5=4+1，6=4+2，3=4+(-1)，2=3+(-1)，1=2+(-1)；各个元素在数值上已经包含了在它之前的最小值的值；
        那么，我们是不是只要在数据栈中存储0、1、2、-1、-1、-1，然后再使用一个辅助变量min=1就可以了呢？
        这样，根据单个辅助变量和栈中存储的值就能够推理出top值和min值了，具体规则如下;

        入栈：

        压缩：将要入栈的元素value减去当前最小值min，得到一个差值diff，只存储该差值；
        更新：如果入栈的元素value比当前最小值min小，则要更新最小值：min=value；
        初始：第一次入栈比较特殊，因为此时的min变量并没有值，所以令：min=value；
        出栈：

        更新：如果栈中存储的差值diff是负数，说明出栈的元素是当前最小值min，需要把min值更新为上一个最小值min = min - diff，否则，出栈的元素不是最小值，则不对min变量做任何操作；
        还原：如果栈中存储的差值diff是正数，说明 top = min + diff，否则，说明top元素本身是最小值 top = min；
        其实一开始思考的思路是从异或链表的角度入手的（在双向链表的实现方法中，为了节约空间，有一种把前后两个指针域压缩为一个指针的方法，称之为 “异或链表”，主要利用的原理是 “异或的可逆性”：A⊕A=1，如果A⊕B=C，那么C⊕A=B），所以后来想到的栈存储值是：min⊕(value-min)，虽然也是可行的，但是后续的操作难免复杂了点，后来在评论区里经过用户纽约的自行车的提点，才发现可以直接存储(value-min)，不需要用到异或操作（点击查看源博客）*/
class Solution {
    Stack<Integer> stack=new Stack();
    int min;
    public void push(int value) {
        if(stack.empty()){
            min=value;
        }
        stack.push(value-min);
        if(min>value){
            min=value;
        }
    }
    public void pop() {
        int i=stack.pop();
        if(i<0){
            min-=i;
        }
    }
    public int top() {
        return min+stack.peek();
    }
    public int min() {
        return min;
    }
}