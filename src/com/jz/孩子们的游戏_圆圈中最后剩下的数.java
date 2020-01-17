package com.jz;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: 每年六一儿童节, 牛客都会准备一些小礼物去看望孤儿院的小朋友, 今年亦是如此。
 * HF作为牛客的资深元老,自然也准备了一些小游戏。
 * 其中,有个游戏是这样的:首先,让小朋友们围成一个大圈。
 * 然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
 * 从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,
 * 可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
 * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 *
 * 如果没有小朋友，请返回-1
 * @Author zhangchaoxiang
 * @Date 2020/1/17
 **/
public class 孩子们的游戏_圆圈中最后剩下的数 {
    //可以用一个队列 或者环形链表
    public int LastRemaining_Solution(int n, int m) {
        if(n<=0||m<=0){return -1;}
        if(m==1){return n;}
        Queue<Integer> queue = new LinkedList<>();
        int cnt=1;
        for(int i=0;i<n;i++){
            if(cnt++%m!=0){
                queue.add(i);
            }
        }

        while(queue.size()!=1){
            int v=queue.poll();
            if(cnt++%m!=0){
                queue.add(v);
            }
        }

        return queue.peek();
    }


    //见到的一个解法
    public int LastRemaining_Solution1(int n, int m) {
        // 不满足的条件
        if (n <= 0 || m <= 0) return -1;
        return n == 1 ? 0 : (LastRemaining_Solution1(n - 1, m) + m) % n;
    }
}
