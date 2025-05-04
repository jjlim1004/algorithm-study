package algorithm.leetcode.easy;

import java.util.Stack;

public class SplitAStringInBalancedString {
    public int balancedStringSplit(String s) {
        Stack<String> stack = new Stack();
        String[] sa = s.split("");
        int answer =0;
        String start =sa[0];

        for(int i = 0 ; i < sa.length; i++){
            if(!stack.empty()){
                if(!sa[i].equals(stack.peek())){
                    stack.pop();
                }else{
                    stack.push(sa[i]);
                }
            }
            else{
                stack.push(sa[i]);
            }

            if(stack.empty()){
                answer++;
            }
        }

        if(!stack.empty()){
            answer++;
        }
        return answer;

    }
}
