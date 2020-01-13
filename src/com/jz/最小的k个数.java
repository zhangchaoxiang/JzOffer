package com.jz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Description: 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @Author zhangchaoxiang
 * @Date 2020/1/13
 **/
public class 最小的k个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int lens = input.length;
        if(input == null || lens == 0 || k > lens || k <= 0){
            return list;
        }
        TreeSet<Integer> kSet = new TreeSet<>();
        for (int i = 0; i < lens; i++) {
            if(kSet.size() < k){
                kSet.add(input[i]);
            }else if(input[i] < kSet.last()){
                kSet.remove(kSet.last());
                kSet.add(input[i]);
            }
        }
        Iterator<Integer> iterator = kSet.iterator();
        while(iterator.hasNext()){
            list.add(iterator.next());
        }
        return list;
    }

}
