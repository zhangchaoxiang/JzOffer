package com.jz;


/**
 * @Description: 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * @Author zhangchaoxiang
 * @Date 2020/1/19
 **/
public class 求前n位数和 {
    //递归，短路法
    public int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }

    //乘方 or return IntStream.rangeClosed(1,n).sum();
    public int Sum_Solution1(int n) {
        int sum = (int) (Math.pow(n,2) + n);
        return sum>>1;
    }
}
