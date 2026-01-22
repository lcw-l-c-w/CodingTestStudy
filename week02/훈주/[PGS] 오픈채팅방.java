import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {

    static class Record { // userId와 행동(Enter/Leave)만 저장
        String userId;
        String action;

        Record(String userId, String action) {
            this.userId = userId;
            this.action = action;
        }
    }

    public String[] solution(String[] record) {

        Map<String, String> userMap = new HashMap<>(); // userId -> 최신 nickname
        List<Record> records = new ArrayList<>(); //실제 출력해야 할 Enter/Leave 기록만 저장

        // 기록 전체 한 번 순회
        for (String r : record) {
            String[] parts = r.split(" ");
            String command = parts[0];
            String userId = parts[1];

            // 입장
            if (command.equals("Enter")) {
                String nickname = parts[2];
                userMap.put(userId, nickname); // 닉네임 최신값으로 저장
                records.add(new Record(userId, "Enter")); // 출력 대상 기록 저장
                
            // 퇴장
            } else if (command.equals("Leave")) {
                records.add(new Record(userId, "Leave")); // 퇴장도 출력 대상이므로 기록 저장

            // 닉네임 변경
            } else { // Change
                String nickname = parts[2];
                userMap.put(userId, nickname); // 닉네임만 갱신 (출력 기록은 없음)
            }
        }

        // 저장된 기록을 바탕으로 결과 생성
        String[] answer = new String[records.size()];
        int idx = 0;

        for (Record rec : records) {
            String nickname = userMap.get(rec.userId); // 항상 "최신 닉네임" 사용

            if (rec.action.equals("Enter")) {
                answer[idx++] = nickname + "님이 들어왔습니다.";
            } else {
                answer[idx++] = nickname + "님이 나갔습니다.";
            }
        }

        return answer;
    }
}