package algorithm.leetcode.easy;

public class PermutationDifferenceBetweenTwoStrings {
    public int findPermutationDifference(String s, String t) {
        int answer=0;
        for(int i = 0 ; i < s.length(); i++){
            answer += Math.abs(i- t.indexOf(String.valueOf(s.charAt(i))));
        }
        return answer;
    }
}
