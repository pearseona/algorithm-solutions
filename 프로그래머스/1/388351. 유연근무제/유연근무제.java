class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            // 출근 인정 시각을 분으로 계산
            int hour = schedules[i] / 100;
            int minute = schedules[i] % 100;
            int limit = hour * 60 + minute + 10;
            
            int day = startday;
            int late = 0;
            
            for (int j = 0; j < 7; j++) {
                // 월요일부터 금요일까지만 확인
                if (day <= 5) {
                    int arrivalHour = timelogs[i][j] / 100;
                    int arrivalMinute = timelogs[i][j] % 100;
                    int arrival = arrivalHour * 60 + arrivalMinute;
                    
                    if (arrival > limit) {
                        late++;
                    }
                }
                
                // 다음 요일로 이동
                day++;
                
                // 일요일 다음은 월요일
                if (day == 8) {
                    day = 1;
                }
            }
            
            // 평일에 지각한 적이 없으면 상품 지급
            if (late == 0) {
                answer++;
            }
        }
        
        return answer;
        
    }
}