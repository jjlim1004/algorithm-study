package algorithm.programmers.level2;

import java.util.Locale;

public class JadenCase {
    public String solution(String s) {
        String answer = "";
        String[] splited = s.split(" ");


        for (int i = 0; i < splited.length  ; i++) {
            if(splited[i].charAt(0) >= '0' && splited[i].charAt(0) <= '9'){
                answer = answer + splited[i] + " ";
                continue;
            }

            String[] splitedWord =splited[i].split("");
            for (int j = 0; j < splitedWord.length; j++) {
                if(j==0){
                    splitedWord[j] = splitedWord[j].toUpperCase();
                    answer = answer + splitedWord[j];
                    continue;
                }
                splitedWord[j] = splitedWord[j].toLowerCase();
                answer = answer + splitedWord[j];
            }
            answer = answer  +" ";
        }

        answer = answer.substring(0,answer.length()-1);
        return answer;
    }
}
