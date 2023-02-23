import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day3_Java {
    public static void main(String[] args) throws IOException {
        // (1). 개수를 입력받기 위해 생성
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // (2). 숫자 개수, 문제의 개수 변수를 생성하여 저장
        int num = Integer.parseInt(stringTokenizer.nextToken());
        int quNum = Integer.parseInt(stringTokenizer.nextToken());

        // (3). 구간 합 배열 생성
        long[] S = new long[num +1];
        // stringTokenizer 를 초기화 해주어야 함 -> 안해주면 런타임 에러(NoSuchElement) 발생
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // (4). 숫자 개수만큼 반복 ( 구간 합 공식 : S[i] = S[i-1] + A[i]
        for (int  i = 1; i <= num; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        // (5). 문제의 개수만큼 반복
        for (int q = 0; q < quNum; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i =  Integer.parseInt(stringTokenizer.nextToken());
            int j =  Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
