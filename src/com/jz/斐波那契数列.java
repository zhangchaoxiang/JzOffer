package com.jz;

/**
 * 斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。 n<=39
 *  F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 * @author zhangchaoxiang
 * @Date Created in 2020/1/9
 */
public class 斐波那契数列 {
    //递归
    public int Fibonacci(int n) {
        if(n>39||n<0){throw new IndexOutOfBoundsException();}
        if(n==0){return 0;}
        if(n==1){return 1;}
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    //直接循环
    public int Fibonacci1(int n) {
        int a = 0;
        int b = 1;
        while(n-->0){
            b = a + b;
            a = b - a;
        }
        return a;
    }


}
