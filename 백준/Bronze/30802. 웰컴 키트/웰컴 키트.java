import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 참가자의 수
        int[] sizeArr = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0;i<6;i++) {
            sizeArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(st.nextToken()); // 티셔츠의 묶음 수
        int P = Integer.parseInt(st.nextToken()); // 펜의 묶음 수

        int count = 0;

        for(int i = 0; i < 6;i++){
            count += sizeArr[i] / T;
            count = sizeArr[i] % T > 0 ? count + 1 : count;
        }

        System.out.println(count);
        System.out.println(N/P + " " + N % P);

        br.close();
    }
}