import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        // 중복 날리고
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine().trim());
        }

        
        List<String> list = new ArrayList<>(set);

        list.sort((a, b) -> {
            // 길이 비교
            if (a.length() != b.length()) {
                return a.length() - b.length(); // 짧은 것이 앞으로
            }
            // 사전순 비교
            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for (String word : list) {
            sb.append(word).append("\n");
        }
        System.out.print(sb);
    }
}