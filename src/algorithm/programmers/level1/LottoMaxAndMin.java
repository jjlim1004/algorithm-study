package algorithm.programmers.level1;

public class LottoMaxAndMin {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int winCount  = 0 ;
            int zeroCount = 0 ;
            int maxCount = 0  ;
            int minCount = 0  ;

            for (int win_num: win_nums) {
                if(win_num == 0 ){
                    zeroCount++;
                    continue;
                }
                for (int lotto: lottos) {
                    if(lotto == win_num){
                        winCount++;
                        continue;
                    }
                }
            }
            maxCount = winCount + zeroCount;
            minCount = winCount + zeroCount;
            answer[0] = grade(maxCount);
            answer[1] = grade(minCount);
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
