class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] count = new int[26];
        int[] answer = new int[targets.length];

        // 알파벳별 최소 누름 횟수 저장
        for (String key : keymap) {
            for (int j = 0; j < key.length(); j++) {
                int index = key.charAt(j) - 'A';
                int press = j + 1;

                if (count[index] == 0 || press < count[index]) {
                    count[index] = press;
                }
            }
        }

        // 목표 문자열별 누름 횟수 계산
        for (int i = 0; i < targets.length; i++) {
            int total = 0;

            for (int j = 0; j < targets[i].length(); j++) {
                int index = targets[i].charAt(j) - 'A';

                if (count[index] == 0) {
                    total = -1;
                    break;
                }

                total += count[index];
            }

            answer[i] = total;
        }

        return answer;
    }
}