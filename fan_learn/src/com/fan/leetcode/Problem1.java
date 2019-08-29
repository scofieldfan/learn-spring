package com.fan.leetcode;

import java.util.HashMap;
import java.util.Map;

//two sum 两数之和
//https://leetcode-cn.com/problems/two-sum/
public class Problem1 {


    // 学习单词complement，返回数组的方式 new int [] {}
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {

    }
}
