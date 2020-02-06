package com.jz;

/**
 * @program JzOffer
 * @description: 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 输入描述: 输入一个数n，意义见题面。（2 <= n <= 60）
 * 输出描述: 输出答案。
 * @author: zhangchao
 * @create: 2020/02/05 17:30
 */
public class 剪绳子 {
    /**
     * 数学公式
     * 这种想法比较巧妙，尽量把大于5的数分解成3的乘积，如果剩下的长度为4，则把4分解成2和2，因为3× 1 < 2× 2。
     * @param n
     * @return
     */
    public int cutRope(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        if (n % 3 == 1) {
            int k = n / 3 - 1;
            return (int)Math.pow(3, k) * 2 * 2;
        }
        if (n % 3 == 2) {
            int k = n / 3;
            return (int)Math.pow(3, k) * 2;
        }
        return (int)Math.pow(3, n / 3);
    }
}
