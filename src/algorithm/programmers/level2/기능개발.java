package algorithm.programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 기능개발 {

    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> s = new ArrayList<>();

        for (int i = progresses.length-1; i >= 0 ; i--) {
            stack.add((int) Math.ceil((100-progresses[i]) / (double)speeds[i]));
        }

        while(!stack.isEmpty()){
            int cnt = 1;

            int top =stack.pop();

            while(!stack.isEmpty() && stack.peek() < top){
                cnt++;
                stack.pop();
            }
            s.add(cnt);
        }

        int[] answer = new int[s.size()];
        return answer;
    }
}
