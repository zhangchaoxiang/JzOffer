package com.jz;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * @author zhangchaoxiang
 * @Date Created in 2020/1/9
 */
public class 旋转数组最小数字 {
    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return minNumber(array,0,array.length-1);
    }

    private static int minNumber(int[] array, int start, int end) {
        if(start>=end){
            return array[end];
        }
        int mid=(start+end)>>>1;
        int midValue=array[mid];
        if(midValue<array[start]){
            return minNumber(array,start,mid);
        }else if(midValue>array[end]){
            return minNumber(array,mid+1,end);
        }else{
            int right=minNumber(array,mid+1,end);
            int left=minNumber(array,start,mid);
            midValue=right>left?left:right;
        }

        return midValue;
    }
}
