package com.jz;

import java.util.ArrayList;

/**
 * @Description: 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * @Author zhangchaoxiang
 * @Date 2020/1/14
 **/
public class 把数组排成最小的数 {

    public String PrintMinNumber(int [] numbers) {
        int n=numbers.length;
        StringBuilder s=new StringBuilder();
        ArrayList<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            list.add(numbers[i]);//将数组放入arrayList中
        }
        list.sort((str1, str2) -> {
            // TODO Auto-generated method stub
            String s1=str1+""+str2;
            String s2=str2+""+str1;

            return s1.compareTo(s2);
        });


        for(int j:list){
            s.append(j);
        }
        return s.toString();
    }

}
