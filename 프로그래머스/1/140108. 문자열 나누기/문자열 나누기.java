class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 0;
        int different = 0;
        char first = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // 새 조각의 첫 글자를 기준으로 설정
            if (same == 0) {
                first = current;
            }

            if (current == first) {
                same++;
            } else {
                different++;
            }

            // 두 횟수가 같아지면 한 조각 완성
            if (same == different) {
                answer++;
                same = 0;
                different = 0;
            }
        }

        // 횟수가 같아지지 않은 채 남은 부분 처리
        if (same > 0) {
            answer++;
        }

        return answer;
    }
}