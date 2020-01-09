package com.jz;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * @author zhangchaoxiang
 * @Date Created in 2020/1/9
 */
public class 变态跳台阶 {
    public int JumpFloorII(int target) {
        return 1<<(target-1);
        //return (int) Math.pow(2,target-1);
    }
}
