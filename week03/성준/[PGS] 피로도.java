package studycodingtest.week03;

import java.beans.PropertyEditorManager;

/*
    피로도(Fatigue)

 */
public class week03_2 {
    // 방문 배열
    static boolean[] visited;
    static int answer;
    public static void main(String[] args) {

    }
    public static int  solution(int k, int[][] dungeons) {
        visited=new boolean[dungeons.length];
        DFS(0,k,dungeons);
        return answer;
    }

    private static void DFS(int depth, int fatigue, int[][] dungeons) {
        for (int i=0; i<dungeons.length; i++){
            // 방문 했거나 피고도가 부족한 경우 계속
            if (visited[i] || fatigue-dungeons[i][0]<0){
                continue;
            }
            visited[i]=true; // 방문 체크체크
            int cost = dungeons[i][1];
            DFS(depth+1,fatigue-cost,dungeons);
            visited[i]=false; // 해제해제
        }
        answer = Math.max(answer, depth);
    }
}
