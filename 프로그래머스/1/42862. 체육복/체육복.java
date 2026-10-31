import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n + 2];
        Arrays.fill(clothes, 1);

        for (int student : lost) {
            clothes[student]--;
        }

        for (int student : reserve) {
            clothes[student]++;
        }

        for (int i = 1; i <= n; i++) {
            if (clothes[i] == 0) {
                if (clothes[i - 1] == 2) {
                    clothes[i - 1]--;
                    clothes[i]++;
                } else if (clothes[i + 1] == 2) {
                    clothes[i + 1]--;
                    clothes[i]++;
                }
            }
        }

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (clothes[i] >= 1) {
                answer++;
            }
        }

        return answer;
    }
}