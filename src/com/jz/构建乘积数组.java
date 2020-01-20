package com.jz;


/**
 * @Description: 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * @Author zhangchaoxiang
 * @Date 2020/1/19
 **/
public class 构建乘积数组 {
    //或者不申请新数组，，直接循环两次，B乘一次，倒序乘一次。
    public int[] multiply(int[] A) {
        int[] B=new int[A.length];
        if(A.length==0){return B;}
        int[] C=new int[A.length];//正序逐乘
        int[] D=new int[A.length];//逆序逐乘
        for(int i=0;i<A.length;i++){
            if(i==0){
                C[i]=A[i];
                D[A.length-1-i]=A[A.length-1-i];
            }else{
                C[i]=A[i]*C[i-1];
                D[A.length-1-i]=D[A.length-i]*A[A.length-1-i];
            }
        }
        for(int i=0;i<A.length;i++){
            if(i==0){
                B[i]=D[i+1];
            }else if(i==A.length-1){
                B[i]=C[i-1];
            }else {
                B[i]=C[i-1]*D[i+1];
            }
        }

        return B;
    }
}
