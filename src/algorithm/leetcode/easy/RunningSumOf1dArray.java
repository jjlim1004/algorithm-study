package algorithm.leetcode.easy;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int index =0;
        int sum = 0;
        int[] answer = new int[nums.length];

        for(int i = 0 ; i < nums.length; i++){
            sum += nums[index];
            answer[index] = sum;
            index++;
        }
        return answer;
    }
}
