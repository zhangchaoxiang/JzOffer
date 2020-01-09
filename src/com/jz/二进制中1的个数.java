package com.jz;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * @author zhangchaoxiang
 * @Date Created in 2020/1/9
 */
public class 二进制中1的个数 {

    public int NumberOf1(int n) {
        int num = 0, flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                num++;
            }
            flag <<= 1;
        }
        return num;
    }


    //整数n，进行n&(n-1)运算，会把二进制表示中最右边的1变为0。
    public int NumberOf12(int n) {
        int num = 0;
        while (n != 0) {
            num++;
            n &= (n - 1);
        }
        return num;
    }
}
