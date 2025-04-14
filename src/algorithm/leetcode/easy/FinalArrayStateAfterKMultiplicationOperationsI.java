package algorithm.leetcode.easy;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int minVal = nums[0];
        int minIndex = 0;
        for(int i = 0; i < k; i++){
            minVal = nums[0];
            minIndex = 0;
            for(int j = 0 ; j<nums.length; j++){
                if(minVal > nums[j]){
                    minVal = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex] = nums[minIndex] * multiplier;
        }
        return nums;
    }
}
