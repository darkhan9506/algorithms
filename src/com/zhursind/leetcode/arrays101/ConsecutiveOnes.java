package com.zhursind.leetcode.arrays101;

/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Input: nums = [1,0,1,1,0,1]
Output: 2

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

public class ConsecutiveOnes {

  public int findMaxConsecutiveOnes(int[] nums) {

    int count = 0 ;
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count ++;
      } else {
        if (count > max) {
          max = count;
        }
        count = 0;
      }
    }
    max = count > max ? count : max;
    return max;
  }

}
