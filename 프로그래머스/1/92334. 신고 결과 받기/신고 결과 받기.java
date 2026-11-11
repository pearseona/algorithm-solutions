import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> uniqueReports = new HashSet<>(Arrays.asList(report));
        
        Map<String, Integer> reportedCount = new HashMap<>();
        Map<String, Integer> mailCount = new HashMap<>();
        
        // 1. 신고당한 횟수 세기
        for (String record: uniqueReports) {
            String[] parts = record.split(" ");
            String reported = parts[1];

            reportedCount.put(reported, reportedCount.getOrDefault(reported, 0) + 1);
        }
        
        // 2. 정지된 사람을 신고한 유저에게 메일 한 통 추가
        for (String record : uniqueReports) {
            String[] parts = record.split(" ");
            String reporter = parts[0];
            String reported = parts[1];

            if (reportedCount.get(reported) >= k) {
                mailCount.put(reporter,
                        mailCount.getOrDefault(reporter, 0) + 1);
            }
        }
        
        // 3. id_list 순서대로 결과 담기
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCount.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}