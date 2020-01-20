package com.jz;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 输出描述:
 * 如果当前字符流没有存在出现一次的字符，返回#字符。
 * @Author zhangchaoxiang
 * @Date 2020/1/19
 **/
public class 字符流中第一个不重复的字符 {
    List<Character> list=new ArrayList<>();
    int[] count=new int[256];
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(count[ch]==0){
            list.add(ch);
        }
        count[ch]++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(char ch:list){
            if(count[ch]==1){
                return ch;
            }
        }
        return '#';
    }
}
