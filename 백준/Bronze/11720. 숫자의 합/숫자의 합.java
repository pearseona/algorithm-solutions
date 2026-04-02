import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String a = scanner.next();
        scanner.close();

        int sum = 0;

        for(int i = 0; i < N; i++){
            //문자열 변수 a를 charAt을 이용하여 char 변수로 바꾼 다음 계산
            //charAt()은 해당 문자의 아스키코드 값을 반환하므로 -48 or -'0'을 해주어야 함
            sum += a.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}