package com.jz;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * @program JzOffer
 * @description: 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}，
 * {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}，
 * {2,3,4,[2,6,2],5,1}，
 * {2,3,4,2,[6,2,5],1}，
 * {2,3,4,2,6,[2,5,1]}。
 * @author: zhangchao
 * @create: 2020/02/04 15:14
 */
public class 滑动窗口的最大值 {
    ArrayDeque<Integer> deq = new ArrayDeque<Integer>();
    int [] nums;

    public void clean_deque(int i, int k) {
        // remove indexes of elements not from sliding window
        if (!deq.isEmpty() && deq.getFirst() == i - k)
            deq.removeFirst();

        // remove from deq indexes of all elements
        // which are smaller than current element nums[i]
        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()])
            deq.removeLast();
    }

    /**
     * 双向队列
     * 处理前 k 个元素，初始化双向队列。
     * 遍历整个数组。在每一步 :
     * 清理双向队列 :
     *   - 只保留当前滑动窗口中有的元素的索引。
     *   - 移除比当前元素小的所有元素，它们不可能是最大的。
     * 将当前元素添加到双向队列中。
     * 将 deque[0] 添加到输出中。
     * 返回输出数组。
     *
     * 复杂度分析
     *
     * 时间复杂度：O(N)，每个元素被处理两次- 其索引被添加到双向队列中和被双向队列删除。
     *
     * 空间复杂度：O(N)，输出数组使用了 O(N−k+1) 空间，双向队列使用了 O(k)。
     *
     *
     * @param nums
     * @param size
     * @return
     */
    public ArrayList<Integer> maxInWindows(int [] nums, int size){
        ArrayList<Integer> list=new ArrayList<>();
        int n = nums.length;
        if (n * size == 0) return list;
        if (n<size) return list;
        // init deque and output
        this.nums = nums;
        int max_idx = 0;
        for (int i = 0; i < size; i++) {
            clean_deque(i, size);
            deq.addLast(i);
            // compute max in nums[:k]
            if (nums[i] > nums[max_idx]) max_idx = i;
        }
        list.add(nums[max_idx]);

        // build output
        for (int i  = size; i < n; i++) {
            clean_deque(i, size);
            deq.addLast(i);
            list.add(nums[deq.getFirst()]);
        }
        return list;
    }


    /**
     * 动态规划 https://leetcode-cn.com/problems/sliding-window-maximum/solution/hua-dong-chuang-kou-zui-da-zhi-by-leetcode-3/
     * 时间复杂度：O(N)，我们对长度为 N 的数组处理了 3次。
     *
     * 空间复杂度：O(N)，用于存储长度为 N 的 left 和 right 数组，以及长度为 N - k + 1的输出数组。
     *
     *  @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;

        int [] left = new int[n];
        left[0] = nums[0];
        int [] right = new int[n];
        right[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            // from left to right
            if (i % k == 0) left[i] = nums[i];  // block_start
            else left[i] = Math.max(left[i - 1], nums[i]);

            // from right to left
            int j = n - i - 1;
            if ((j + 1) % k == 0) right[j] = nums[j];  // block_end
            else right[j] = Math.max(right[j + 1], nums[j]);
        }

        int [] output = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++)
            output[i] = Math.max(left[i + k - 1], right[i]);

        return output;
    }


}
