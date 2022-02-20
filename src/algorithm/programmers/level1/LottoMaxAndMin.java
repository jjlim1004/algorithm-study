package algorithm.programmers.level1;

public class LottoMaxAndMin {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int winCount  = 0 ;
            int zeroCount = 0 ;

            for (int lotto: lottos) {
                if(lotto == 0 ){
                    zeroCount++;
                    continue;
                }
                for (int win_num: win_nums) {
                    if(lotto == win_num){
                        winCount++;
                        continue;
                    }
                }
            }
            answer[0] = grade(winCount + zeroCount);
            answer[1] = grade(winCount);
            return answer;
        }

        public int grade(int count){
            int grade = 0;
            switch (count){
                case 1:
                    grade = 6;
                    break;
                case 2:
                    grade = 5;
                    break;
                case 3:
                    grade = 4;
                    break;
                case 4:
                    grade = 3;
                    break;
                case 5:
                    grade = 2;
                    break;
                case 6:
                    grade = 1;
                    break;
                default:
                    grade = 6;
                    break;
            }
            return grade;
        }
    }
}
