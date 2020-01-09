package com.jz;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * @author zhangchaoxiang
 * @Date Created in 2020/1/9
 */
public class 调整数组顺序使奇数位于偶数前面 {
    public static void reOrderArray(int [] array) {
        Queue<Integer> queue=new ConcurrentLinkedQueue();
        int i=0;
        int j=0;
        for(;j<array.length&&i<array.length;j++){
            while (j<array.length){
                if(array[j]%2==0){
                    queue.add(array[j]);
                }
                if(array[j]%2==1){
                    array[i]=array[j];
                    i++;
                    break;
                }
                j++;
            }
        }
        while(!queue.isEmpty()){
            array[i++]=queue.poll();
        }
    }
}
