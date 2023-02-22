import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day2_Java {
    public static void main(String[] args) throws IOException {

        // (1). 랜덤으로 입력 받을 Scanner 생성, 입력 받은 값을 int N = 배열의 길이가 됨
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // (2). 1차원 배열 arr 생성
        double[] arr = new double[N];

        // (3). 배열의 길이(N)만큼 반복, 배열에 각 점수를 저장하기
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextDouble();
        }

        // (4). scanner close, 합을 담을 변수와 최고 점수를 담을 변수를 생성해서 초기화 함
        scanner.close();
        double sum = 0;
        double max = 0;

        // (5). 배열 길이만큼 반복, 최고점은 max에 총점은 sum에 저장
        for(int i=0; i < N; i++) {
            if (arr[i] > max) max = arr[i];
            sum = sum + arr[i];
        }
        // (6). 문제에서 '총합 * 100 / 최고 점수 / 과목의 수'를 구하라고 했기 때문에 아래와 같이 출력함
        System.out.print(sum *100 / max / N);



        // BufferedReader

        // (1)
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        // (2) BufferedReader -> 공백까지 한 번에 받기 때문에 문자열 분리를 위해 StringTokenizer를 사용해준다.
        double[] arr = new double[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        // (3)
        for (int i= 0; i< N; i++) {
            arr[i] = Double.parseDouble(stringTokenizer.nextToken());
        }

        // (4)
        bufferedReader.close();
        double sum = 0;
        double max = 0;

        // (5)
        for(int i= 0; i < N; i++) {
            if (arr[i] > max) max = arr[i];
            sum = sum + arr[i];
        }

        // (6)
        System.out.print(sum* 100 / max / N);
    }
}
