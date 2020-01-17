package com.jz;

import java.util.ArrayList;

/**
 * @Description: 小明很喜欢数学, 有一天他在做数学作业时, 要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 输出描述:
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * @Author zhangchaoxiang
 * @Date 2020/1/17
 **/
public class 和为S的连续正数序列 {
    //直接数学公式代入 另一种双指针滑动~~
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(double h=sum-1;h>1;h--){
            double low=sum/h-(h-1)/2;
            if(low%1==0){
                if(low>0){
                    ArrayList<Integer> arr=new ArrayList<>();
                    for(int i=0;i<h;i++){
                        arr.add((int) low++);
                    }
                    list.add(arr);
                }
            }
        }
        return list;
    }
}
