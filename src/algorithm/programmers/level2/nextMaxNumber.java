package algorithm.programmers.level2;

public class nextMaxNumber {
    public int solution(int n) {
        int answer = n+1;
        int nOneCount = oneCount(Integer.toBinaryString(n));
        String resultBinary;
        int resultOneCount = 0;

        while(true){
            resultBinary = Integer.toBinaryString(answer);
            resultOneCount = oneCount(resultBinary);
            if(nOneCount == resultOneCount){
                return answer;
            }
            answer++;
        }

    }

    public int oneCount(String s){
        int oneCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1' ){
                oneCount++;
            }
        }
        return oneCount;
    }
}
