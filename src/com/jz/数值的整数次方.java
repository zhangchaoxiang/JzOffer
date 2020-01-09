package com.jz;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。  保证base和exponent不同时为0
 *
 * @author zhangchaoxiang
 * @Date Created in 2020/1/9
 */
public class 数值的整数次方 {
    public double Power(double base, int exponent) {
        if(base==0){
            return 0;
        }
        if(exponent==0){
            return 1;
        }
        double a=1;
        double b=base;
        if(exponent<0){
            exponent=0-exponent;
            b=1/base;
        }
        while(exponent-->0){
            a*=b;
        }
        return a;
    }

    public double Power1(double base, int exponent) {
        if (base == 0.0){
            return 0.0;
        }
        // 前置结果设为1.0，即当exponent=0 的时候，就是这个结果
        double result = 1.0d;
        // 获取指数的绝对值
        int e = exponent > 0 ? exponent : -exponent;
        // 根据指数大小，循环累乘
        while (e-->0){
            result *= base;
        }
        // 根据指数正负，返回结果
        return exponent > 0 ? result : 1 / result;
    }
}
