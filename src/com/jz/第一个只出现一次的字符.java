package com.jz;

/**
 * @Description: 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 * @Author zhangchaoxiang
 * @Date 2020/1/15
 **/
public class 第一个只出现一次的字符 {
    /**
     * ascii:a-z：97-122，A-Z：65-90
     * 双指针
     * @param str
     * @return
     */
    public int FirstNotRepeatingChar(String str) {
        char[] chars=str.toCharArray();
        int[] num=new int[123];
        for(int i=0,j=i;i<chars.length;i++){
            while (j<chars.length&&num[chars[i]]<2){
                num[chars[j]]+=1;
                j++;
            }
            //个数小于2
            if(num[chars[i]]<2){
                return i;
            }
        }
        return -1;
    }
}
