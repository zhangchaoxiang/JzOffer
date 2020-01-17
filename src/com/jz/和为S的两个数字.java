package com.jz;
import java.util.ArrayList;

/**
 * @Description: 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 输出描述:
 * 对应每个测试案例，输出两个数，小的先输出。
 * @Author zhangchaoxiang
 * @Date 2020/1/17
 **/
public class 和为S的两个数字 {

    //最外层乘积最小
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list=new ArrayList<>();
        if(array==null||array.length<2){
            return list;
        }
        int head=0;
        int tail=array.length-1;
        while(head<tail){
            while(head<tail&&array[tail]+array[head]>=sum){
                if(array[tail]+array[head]==sum){
                    list.add(array[head]);
                    list.add(array[tail]);

                    return list;
                }
                tail--;
            }
            head++;
        }

        return list;
        }
}
