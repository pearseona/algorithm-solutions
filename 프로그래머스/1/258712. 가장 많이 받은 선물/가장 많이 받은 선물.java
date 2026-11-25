import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;

        Map<String, Integer> index = new HashMap<>();

        for (int i = 0; i < n; i++) {
            index.put(friends[i], i);
        }

        int[][] count = new int[n][n];
        int[] giftIndex = new int[n];
        int[] nextMonth = new int[n];

        // 선물 기록과 선물 지수 계산
        for (String gift : gifts) {
            String[] parts = gift.split(" ");

            int giver = index.get(parts[0]);
            int receiver = index.get(parts[1]);

            count[giver][receiver]++;
            giftIndex[giver]++;
            giftIndex[receiver]--;
        }

        // 친구 두 명씩 비교
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (count[i][j] > count[j][i]) {
                    nextMonth[i]++;
                } else if (count[i][j] < count[j][i]) {
                    nextMonth[j]++;
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonth[i]++;
                    } else if (giftIndex[i] < giftIndex[j]) {
                        nextMonth[j]++;
                    }
                }
            }
        }

        int answer = 0;

        for (int received : nextMonth) {
            answer = Math.max(answer, received);
        }

        return answer;
    }
}