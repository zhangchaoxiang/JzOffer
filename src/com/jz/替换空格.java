package com.jz;

/**
 * @program JzOffer
 * @description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author: zhangchao
 * @create: 2020/01/05 18:46
 */
public class 替换空格 {
    /**
     * or 从尾到头替换
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        return str.toString().replace("","%20");
    }
}
