package algorithm.leetcode.easy;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryOne {
    public int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i =0 ; i< students.length; i++){
            ans +=Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
}
