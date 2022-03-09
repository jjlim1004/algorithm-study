package algorithm.programmers.level2;

import java.util.*;

public class FunctionDevelop {

    // 구해야 되는것은 작업완료가 된 작업의 수의 배열

    public int[] solution(int[] progresses, int[] speeds) {
        //답을 위한 list
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < speeds.length; i++) {
            double num = 100-progresses[i];
            int date = (int)Math.ceil(num/(double)speeds[i]);

            if(!q.isEmpty() && q.peek() < date ){

                answer.add(q.size());
                q.clear();
            }
            q.offer(date);

        }

        answer.add(q.size());

        //답의 array
        int[] answerArray = new int[answer.size()];
        for (int i = 0; i < answerArray.length; i++) {
            answerArray[i] = answer.get(i);
        }

        return answerArray;
    }
}
