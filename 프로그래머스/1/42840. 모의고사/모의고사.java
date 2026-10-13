import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] pattern1 = {1,2,3,4,5};
        int[] pattern2 = {2,1,2,3,2,4,2,5};
        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        for (int i=0; i < answers.length; i++) {
            
            if (pattern1[i % pattern1.length] == answers[i]) {
                score1++;
            }
            
            if (pattern2[i % pattern2.length] == answers[i]) {
                score2++;
            }
            if (pattern3[i % pattern3.length] == answers[i]) {
                score3++;
            }
        }
        
        int maxScore = Math.max(score1, Math.max(score2, score3));
        
        ArrayList<Integer> winners = new ArrayList<>();
        
        if (score1 == maxScore)
            winners.add(1);
        
        if (score2 == maxScore)
            winners.add(2);
        
        if (score3 == maxScore)
            winners.add(3);
        
        int result[] = new int[winners.size()];
        
        for (int i=0; i < winners.size(); i++) {
            result[i] = winners.get(i);
        }
        
        return result;
    }
}