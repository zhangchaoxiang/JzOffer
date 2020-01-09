package com.jz;

import java.util.HashMap;
import java.util.Map;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * @author zhangchaoxiang
 * @Date Created in 2020/1/9
 */
public class 跳台阶 {
    Map<Integer,Integer> hashMap=new HashMap<Integer,Integer>(){{
        put(1,1);
        put(2,2);
    }};
    //动态规划
    public int JumpFloor(int target) {
        if(!hashMap.containsKey(target)){
            hashMap.put(target,JumpFloor(target-2)+JumpFloor(target-1));
        }
        return hashMap.get(target);
    }
}
