package algorithm.leetcode.easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        int result = 0;

        if(n==1) return 1;
        if(n==2) return 2;


        for(int i = 3; i <= n; i++){
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }
}
