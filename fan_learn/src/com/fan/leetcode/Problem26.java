package com.fan.leetcode;


//Remove Duplicates from Sorted Array
public class Problem26 {

    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num != nums[index]) {
                index++;
                nums[index] = nums[i];
            }
        }
        //System.out.println(Arrays.toString(nums));
        return index + 1;
    }

    public static void main(String[] args) {
        Problem26 problem = new Problem26();
        int testA[] = {1, 1, 2};
        int testB[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(String.valueOf(problem.removeDuplicates(testA)));
        // System.out.println(Arrays.toString(testA));
        System.out.println(String.valueOf(problem.removeDuplicates(testB)));
        //System.out.println(Arrays.toString(testB));
    }
}
