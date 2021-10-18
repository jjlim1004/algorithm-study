package algorithm.programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class NewFunction{
    int doneDate;

    public NewFunction(int progress, int speed) {
        doneDate = (int) Math.ceil((100-progress) / speed);
    }

}
//93 30 55 / 1 30 5 == 7 3 9
public class 기능개발 {

    Queue<NewFunction> functionQ = new LinkedList<>();
    int[] answer = {};

    public void answerNumber(int queueSize){
        ArrayList<Integer> functionList = new ArrayList<>();
        for(int i = 0, j = 0 ,count =0; i< queueSize;i++ ){
            if( functionQ.poll().doneDate >= functionQ.peek().doneDate){
                functionList.add(j,count++);
            }else {
                count = 0;
                functionList.add(j++,count++);
            }
        }
        answer = new int[functionList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = functionList.get(i);
        }
    }

    public int[] solution(int[] progresses, int[] speeds) {

        for(int i =0 ; i< progresses.length; i++){
            functionQ.add(new NewFunction(progresses[i], speeds[i]));
        }
        answerNumber(functionQ.size());
        return answer;
    }

}
