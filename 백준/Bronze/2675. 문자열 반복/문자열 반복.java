import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        for(int i=0;i<T;i++) {
            String[] str = br.readLine().split(" "); // 공백을 기준으로 잘라 배열에 저장

            int R = Integer.parseInt(str[0]); // 반복 횟수

            String S = str[1]; // 반복할 문자열

            for (int j = 0; j < S.length(); j++) { // 문자열 S의 각 글자 하나하나를 순회
                for (int k = 0; k < R;k++) { // 각 글자를 R번만큼 반복
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}