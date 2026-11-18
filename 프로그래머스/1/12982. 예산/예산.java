import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        int answer = 0;
        
        for (int i = 0; i < d.length; i++) {
            
            // 남은 예산으로 지원할 수 없으면 종료
            if (budget < d[i]) {
                break;
            }
            
            budget -= d[i];
            answer++;
        }
        
        return answer;
    }
}