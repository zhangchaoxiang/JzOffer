package com.jz;

import java.util.Arrays;

/**
 * @Description: 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，
 * 因此输出2。如果不存在则输出0。
 * @Author zhangchaoxiang
 * @Date 2020/1/13
 **/
public class 数组中出现次数超过一半的数字 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null)return 0;
        int[] num={0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<array.length;i++){
            if(++num[array[i]]>(array.length/2)){
                return array[i];
            }
        }
        return 0;
    }

    /**
     * 节省空间
     * @param array
     * @return
     */
    public int MoreThanHalfNum_SolutionOther(int [] array) {
        int len=array.length;
        if(len<1){
            return 0;
        }
        int count=0;
        Arrays.sort(array);
        int num=array[len/2];
        for(int i=0;i<len;i++){
            if(num==array[i])
                count++;
        }
        if(count<=(len/2)){
            num=0;
        }
        return num;
    }

}
