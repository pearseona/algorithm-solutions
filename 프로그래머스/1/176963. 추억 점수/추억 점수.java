import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> scores = new HashMap<>();

        // 이름별 그리움 점수 저장
        for (int i = 0; i < name.length; i++) {
            scores.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];

        // 사진별 점수 합산
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];
                answer[i] += scores.getOrDefault(person, 0);
            }
        }

        return answer;
    }
}