package algorithm.programmers.level1;

import java.util.*;

//신고 결과 받기
public class AbusingReport {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, Integer> memberMap = new HashMap<>();

        //초기화를 위한 코드
        for(String id : id_list){
            memberMap.put(id,0);
            reportMap.put(id,new HashSet<String>());
        }

        //신고된 사람들
        for(String reportLog :report){
            //신고 한건의 기록
            String[] memberHistory =  reportLog.split(" ");
            //신고한 사람
            String reporter = memberHistory[0];
            //신고받은 사람
            String abuser = memberHistory[1];
            //중복이 되지 않도록 신고 받은 사람을 추가
            if(reportMap.get(reporter).add(abuser)){ //add 를 해서 중복이 아니면 true 반환한다.
                //신고받은 회원의 신고 수 +1
                memberMap.put(reporter,memberMap.get(reporter)+1);
            }
        }

        //신고한 사람
        for(String reportLog : report){
            String[] memberHistory =  reportLog.split(" ");
            String reporter = memberHistory[0];
            String abuser = memberHistory[1];
            //정지당하지 않은 사람은 제거, 즉 정지당한 사람만 남겨둔다.
            if(memberMap.get(abuser) < k){
                reportMap.get(reporter).remove(abuser);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            //answer[i] 와 reportMap.get(id_list[i]) 의 순서는 같다
            //즉, reportMap.get(id_list[i]) 의 크기만 알면 된다.
            answer[i] = reportMap.get(id_list[i]).size();
        }
        return answer;
    }

}
