package com.jz;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Description: 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * @Author zhangchaoxiang
 * @Date 2020/1/17
 **/
public class 数组中仅出现一次的数字 {
        //num1,num2分别为长度为1的数组。传出参数
        //将num1[0],num2[0]设置为返回结果
        public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
            TreeSet<Integer> treeSet=new TreeSet<>();
            for(int a:array){
                if(!treeSet.add(a)){
                    treeSet.remove(a);
                }
            }
            Iterator<Integer> iter=treeSet.iterator();
            num1[0]=iter.next();
            num2[0]=iter.next();
        }

    //或者先排序，，然后比较与下一个不相等的就是想要的结果
    public void FindNumsAppearOnce2(int [] array,int num1[] , int num2[]) {
        Arrays.sort(array);
        int cnt=0;
        for(int i=0;i<array.length;i++){
            if((i<=0||array[i-1]!=array[i])&&(i+1>=array.length||array[i]!=array[i+1])){
                if(cnt++==0){
                    num1[0]=array[i];
                }else{
                    num2[0]=array[i];
                    return;
                }
            }
        }
    }
}
