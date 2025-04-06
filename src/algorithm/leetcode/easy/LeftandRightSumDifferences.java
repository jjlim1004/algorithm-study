package algorithm.leetcode.easy;

class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int[] left = new int[nums.length];
        int rightSum = 0;
        int[] right = new int[nums.length];
        int[] answer = new int[nums.length];


        for(int i = 0; i <nums.length; i++){
            if(i == 0 ){
                leftSum=0;
            }else{
                leftSum += nums[i-1];
            }
            left[i] = leftSum;
        }

        for(int i = nums.length-1; i >= 0 ; i--){
            if(i == nums.length-1 ){
                rightSum=0;
            }else{
                rightSum += nums[i+1];
            }
            right[i] = rightSum;
        }

        for(int i = 0; i <nums.length; i++){
            answer[i] = Math.abs(left[i] - right[i]);
        }

        return answer;
    }
}
