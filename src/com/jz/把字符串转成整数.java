package com.jz;

/**
 * @Description:
 * 题目描述
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 *
 * 输入描述:
 * 输入一个字符串,包括数字字母符号,可以为空
 *
 * 输出描述:
 * 如果是合法的数值表达则返回该数字，否则返回0
 * 示例1
 * 输入
 * +2147483647
 *     1a33
 * 输出
 * 2147483647
 *     0
 * @Author zhangchaoxiang
 * @Date 2020/1/19
 **/
public class 把字符串转成整数 {
    //不用long的话，就要判断Integer.MAX_VALUE/10了。。
    public int StrToInt(String str) {
        if(str==null||str.isEmpty()){return 0;}
        char fh=str.charAt(0);
        if(fh=='+'||fh=='-'){//判断符号位
            str=str.substring(1);
        }
        if(str.length()<1){return 0;}
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>'9'||str.charAt(i)<'0'){
                return 0;
            }
        }
        Long rt=fh=='-'?  -Long.valueOf(str) : Long.valueOf(str);
        return rt>Integer.MAX_VALUE||rt<Integer.MIN_VALUE?0:rt.intValue();
    }
}
