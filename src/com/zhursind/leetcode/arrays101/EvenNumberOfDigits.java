package com.zhursind.leetcode.arrays101;

public class EvenNumberOfDigits {

  /*
    Given an array nums of integers, return how many of them contain an even number of digits.

    Input: nums = [12,345,2,6,7896]
    Output: 2
    Explanation:
    12 contains 2 digits (even number of digits).
    345 contains 3 digits (odd number of digits).
    2 contains 1 digit (odd number of digits).
    6 contains 1 digit (odd number of digits).
    7896 contains 4 digits (even number of digits).
    Therefore only 12 and 7896 contain an even number of digits.
  * */

  public int findNumbers (int[] nums) {
    int count = 0;
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      while (nums[i] != 0) {
        nums[i] /= 10;
        count++;
      }
      if (count % 2 == 0) {
        j++;
      }
      count = 0;
    }
    return j;
  }
}
