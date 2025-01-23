package algorithm.leetcode.easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index =0;
        int existsNumber = nums[index];

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != existsNumber ){
                index++;
                nums[index] = nums[i];
                existsNumber = nums[i];
            }
        }

        return index+1;
    }
}
