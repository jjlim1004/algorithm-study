package algorithm.leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length != 0){
            for(int i = 0; i < n; i++){
                nums1[m+i] = nums2[i];
            }
        }
        Arrays.sort(nums1);
    }
}
