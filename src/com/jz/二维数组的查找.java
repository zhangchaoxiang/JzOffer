package com.jz;


/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class 二维数组的查找 {
    public boolean Find(int target, int [][] array) {
        int len1=array.length;
        if(len1<=0){
            return false;
        }
        int len2=array[0].length;
        if(len2<=0){
            return false;
        }
        for(int i=0;i<len1;i++){
            if(array[i][0]<=target&&array[i][len2-1]>=target){
                int rt=binarySearch(array[i],0,len2,target);
                if(rt>=0&&rt<len2){return true;}
            }
        }
        return false;
    }
    int binarySearch(int[] a, int fromIndex, int toIndex,
                     int key) {
        int low =fromIndex;
        int high= toIndex-1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}
