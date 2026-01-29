class Solution {
    // 최대 몇 개 던전을 돌 수 있는지 저장
    static int answer = 0;
    static boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        // 던전 개수만큼 방문 배열 초기화
        visited = new boolean[dungeons.length];
        // 현재 피로도 k, 던전 배열, 지금까지 방문한 던전 수 0으로 DFS 시작
        dfs(k, dungeons, 0);
        return answer;
    }

    // DFS + 백트래킹 함수
    static void dfs(int k, int[][] dungeons, int count) {
        // 현재까지 방문한 던전 수 count와 기존 answer 중 최대값 갱신
        answer = Math.max(answer, count);

        // 모든 던전 확인
        for (int i = 0; i < dungeons.length; i++) {
            // 아직 방문하지 않았고, 현재 피로도로 갈 수 있는 던전이면
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true; // 방문 처리
                // 선택한 던전 소모 피로도 빼고 재귀 호출, count +1
                dfs(k - dungeons[i][1], dungeons, count + 1);
                visited[i] = false; // 백트래킹
            }
        }
    }
}