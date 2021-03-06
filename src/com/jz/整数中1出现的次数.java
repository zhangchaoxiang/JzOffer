package com.jz;

/**
 * @Description: 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现5次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 * @Author zhangchaoxiang
 * @Date 2020/1/14
 **/
public class 整数中1出现的次数 {

    /**
     * 逐位分析
     * 当百位对应的数为0或者大于等于2时，有（a+8）/10次包含0到99个连续数。之所以补8，是因为当百位为0，则a/10==(a+8)/10，当百位>=2，补8会产生进位位，效果等同于(a/10+1)。
     * 当百位对应的数是1时，需要增加未满100的数b+1个。
     * @param n
     * @return
     */
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m, b = n % m;
            cnt += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }
        return cnt;
    }

}
