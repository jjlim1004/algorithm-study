package algorithm.programmers.level1;

public class NumerStringAndWord {

    class Solution {
        public int solution(String s) {
            String notNumber = "";
            String answer= "";

            String[] wordArray = s.split("");

            for (int i = 0; i <wordArray.length ; i++) {
                if(!Character.isDigit(wordArray[i].charAt(0))){
                    notNumber += wordArray[i];

                    if(Character.isDigit(returnNumber(notNumber).charAt(0))){
                        answer += returnNumber(notNumber);
                        notNumber ="";
                    }
                    continue;
                }
                answer += wordArray[i];
            }

            return Integer.parseInt(answer);
        }

        public String returnNumber(String number) {
            String zero = "zero";
            String one = "one";
            String two = "two";
            String three = "three";
            String four = "four";
            String five = "five";
            String six = "six";
            String seven = "seven";
            String eight = "eight";
            String nine = "nine";

            switch (number) {
                case "zero":
                    return "0";
                case "one":
                    return "1";
                case "two":
                    return "2";
                case "three":
                    return "3";
                case "four":
                    return "4";
                case "five":
                    return "5";
                case "six":
                    return "6";
                case "seven":
                    return "7";
                case "eight":
                    return "8";
                case "nine":
                    return "9";
                default:
                    return number;
            }
        }
    }
}
