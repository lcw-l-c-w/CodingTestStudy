import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/* 1부터 N까지 중복 없이 M개를 고르고, 오름차순이며, 사전순 출력 */

public class Main {
    static int N, M;          // N: 전체 숫자 범위, M: 선택할 개수
    static int[] arr;         // 현재 조합을 저장할 배열
    static StringBuilder sb = new StringBuilder(); // 출력 누적 (속도 향상)

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 1 ~ N
        M = Integer.parseInt(st.nextToken()); // M개 선택

        arr = new int[M];    // 길이가 M인 조합 저장
        comb(1, 0);          // 1부터 시작, 현재 선택 개수 0

        System.out.print(sb);
    }

    // start: 다음에 선택 가능한 최소 숫자
    // depth: 현재까지 선택한 숫자의 개수
    static void comb(int start, int depth) {
        // M개를 모두 선택한 경우 → 출력
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        // start부터 N까지 하나씩 선택
        for (int i = start; i <= N; i++) {
            arr[depth] = i;          // 현재 위치에 숫자 선택
            comb(i + 1, depth + 1);  // 다음 숫자는 i+1부터 선택 (중복 제거, 오름차순 유지)
        }
    }
}