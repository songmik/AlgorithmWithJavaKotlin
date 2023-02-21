import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.Scanner;

public class Day1_Java {
    public static void main(String[] args) throws IOException {
        // 1. 숫자의 합 구하기
        // N개의 숫자가 공백 없이 써있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.

        // (1). N값 입력받기 (System.in : 입력한 값을 바이트 단위로 읽는 것)
        Scanner scanner = new Scanner(System.in);
        // 숫자의 갯수 : N = 랜덤 값 scanner를 int 값(숫자값)으로 받는다 (nextInt()) -> 문제에서 N개의 숫자가 공백 없이 써있다고 했기 때문
        int N = scanner.nextInt();

        // (2). String형 변수 s에 저장하기 (next() : 공백 이전까지의 문자열을 입력받는 메서드)
        String s = scanner.next();
        // close(); : 키보드 입력의 경우 꼭 해주지 않아도 상관이 없지만, 리소스를 사용하는 경우에는 close()를 해줌으로써 파일 손상을 막을 수 있음
        scanner.close();

        // (3). int형 변수 sum 선언( 초기화 해 줌)
        int sum = 0;

        // (4). 숫자의 갯수만큼 각 원소의 누적 합을 구하기 위해 반복
        for (int i = 0; i<N; i++) {
            // s를 sum에 더하여 누적
            // charAt() : String으로 저장된 문자열 중 한 글자만 선택해서 char 타입으로 반환해림
            // 아스키코드 값 차이(문자와 숫자의)가 48이기 때문에 문자 '1'을 숫자 1로 변환하려면 '1' - 48 또는 '1' - '0' 과 같이 연산해야 함.
            sum += s.charAt(i) - '0';
        }
        System.out.print(sum);


        // BufferedReader 사용하여 해결

        // (1)
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        // readLine() 에서 throwsException 하는 이유는 InputStream==null 일때의 장애를 대비해서 미리 예외처리 해줘야 함
        // 안하면 readLine() 빨간줄이 없어지지 않음
        int R = Integer.parseInt(buffer.readLine());

        // (2)
        String st = buffer.readLine();
        buffer.close();

        // (3)
        int S = 0;

        // (4)
        for (int i =0; i<R; i++) {
            S += st.charAt(i) - '0';
        }
        System.out.println(S);
    }



}