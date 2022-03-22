package algorithm.programmers.level1;

public class sumNoNumber {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] answerArr = new int[10];

        for (int i = 0; i < answerArr.length; i++) {
            answerArr[i] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            answerArr[numbers[i]] = 0;
        }

        for (int num: answerArr) {
            answer += num;
        }

        return answer;
    }
}
