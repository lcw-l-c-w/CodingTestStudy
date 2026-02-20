import java.io.*;
import java.util.*;

public class Main {
    static int n, k;
    static int[] cards;
    static boolean[] visited;
    static Set<String> set = new HashSet<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(br.readLine());
        }
        visited = new boolean[n];
        permutation(0, "");
        System.out.println(set.size());
    }
    
    static void permutation(int depth, String current) {
        if (depth == k) {
            set.add(current);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutation(depth + 1, current + cards[i]);
                visited[i] = false;
            }
        }
    }
}