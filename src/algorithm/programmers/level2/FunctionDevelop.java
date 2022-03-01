package algorithm.programmers.level2;

import java.util.*;

public class FunctionDevelop {

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Queue<Integer> progressQ = new LinkedList<>();

        for (int progress: progresses) {
            progressQ.offer(progress);
        }

        for (int i = 0; i < speeds.length; i++) {
            int num = progresses[i];
            num = (int)Math.ceil(num/speeds[i]);
            list.add(num);
        }

        for (int i = 0; i < progresses.length-1; i++) {
            if(list.get(i) < list.get(i+1)){

            }
        }


        return answer;
    }
}
