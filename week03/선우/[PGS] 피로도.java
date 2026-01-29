class Solution {

    boolean[] visited;
    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    // fatigue: 현재 피로도
    // count: 지금까지 탐험한 던전 수
    void dfs(int fatigue, int[][] dungeons, int count) {

        // 지금까지 온 경로도 하나의 결과
        answer = Math.max(answer, count);

        for (int i = 0; i < dungeons.length; i++) {

            // 아직 방문 안 했고, 들어갈 수 있다면
            if (!visited[i] && fatigue >= dungeons[i][0]) {

                visited[i] = true; // 선택
                dfs(fatigue - dungeons[i][1], dungeons, count + 1);
                visited[i] = false; // 복구 (백트래킹)
            }
        }
    }
}
