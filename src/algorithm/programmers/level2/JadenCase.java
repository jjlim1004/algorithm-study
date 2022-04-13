package algorithm.programmers.level2;

import java.util.Locale;

public class JadenCase {
    public String solution(String s) {
        String answer = s.substring(0,1).toUpperCase();
        char temp;

        for (int i = 1; i <s.length() ; i++) {
            temp =  s.charAt(i);
            if(s.charAt(i - 1) == ' '){
                temp = Character.toUpperCase(temp);
            }else{
                temp = Character.toLowerCase(temp);
            }
            answer += temp;
        }
        return answer;
    }
}

