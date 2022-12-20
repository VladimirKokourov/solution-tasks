package ru.vkokourov.array;

public class FindPivotIndex {

//    Given an array of integers nums, calculate the pivot index of this array.
//
//    The pivot index is the index where the sum of all the numbers strictly to the left
//    of the index is equal to the sum of all the numbers strictly to the index's right.
//
//    If the index is on the left edge of the array, then the left sum is 0 because there
//    are no elements to the left. This also applies to the right edge of the array.
//
//    Return the leftmost pivot index. If no such index exists, return -1.

//    [1,7,3,6,5,6]  -  3
//    [1,2,3]  -  -1
//    [2,1,-1]  -  0

    public int pivotIndex(final int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (sumOfRange(nums, 0, i - 1) == sumOfRange(nums, i + 1, nums.length - 1)) {
                return i;
            }
        }
        return -1;
    }

    public int sumOfRange(final int[] nums,final int begin,final int end) {
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
