package com.jz;


/**
 * @Description: 统计一个数字在排序数组中出现的次数。
 * @Author zhangchaoxiang
 * @Date 2020/1/16
 **/
public class 数字在排序数组中出现的次数 {
    //非排序可以试下双指针，排序就二分查找
    public int GetNumberOfK(int [] array , int k) {
        int cnt=0;
        int i= binarySearch(array,k);
        if(i<0){return cnt;}
        int j=i-1;
        while((i<array.length&&array[i]==k)||(j>=0&&array[j]==k)){
            if(i<array.length&&array[i++]==k){cnt++;}
            if(j>=0&&array[j--]==k){cnt++;}
        }

        return cnt;
    }

    private int binarySearch(int[] array, int k) {
        int low=0;
        int high=array.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(array[mid]<k){
                low=mid+1;
            }else if(array[mid]>k){
                high=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
