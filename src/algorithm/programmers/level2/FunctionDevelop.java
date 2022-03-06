package algorithm.programmers.level2;

import java.util.*;

public class FunctionDevelop {

    // 구해야 되는것은 작업완료가 된 작업의 수의 배열

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> needDatelist = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> progressQ = new LinkedList<>();
        int proceedingDate =0;

        for (int progress: progresses) {
            progressQ.offer(progress);
        }

        for (int i = 0; i < speeds.length; i++) {
            int num = 100-progresses[i];
            num = (int)Math.ceil(num/speeds[i]);
            needDatelist.add(num);
        }

        // 진행날짜가 같으면 poll 로 빼야된다.
        for (int i = 0, j = 0; ;) {
            if(proceedingDate == needDatelist.get(i)){
                progressQ.poll();
                j++;
                i++;
            }

        }
        return answer;
    }
}
