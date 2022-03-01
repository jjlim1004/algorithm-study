package algorithm.programmers.level2;

import java.util.*;

public class FunctionDevelop {

    // 구해야 되는것은 작업완료가 된 작업의 수, 그것들의 배열
    // 
    //
    //
    //
    //

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> progressQ = new LinkedList<>();
        int proceeding =0;

        for (int progress: progresses) {
            progressQ.offer(progress);
        }

        for (int i = 0; i < speeds.length; i++) {
            int num = progresses[i];
            num = (int)Math.ceil(num/speeds[i]);
            list.add(num);
        }

        progressQ.poll();

        for (int i = 0; i < progresses.length-1; i++) {
            if(proceeding < ){
                proceeding++;
            }
        }


        return answer;
    }
}
