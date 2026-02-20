import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        Set<String> s= new HashSet<>();

        for (int i = 0; i < r; i++) {
            s.add(br.readLine());
        }
        //object 같은 경우는 string[]으로 타입 불일치로 바꿀수없다. 그래서 new String[0]으로 해줘야함
        String[] answer= s.toArray(new String[0]);

        Arrays.sort(answer, (a,b)->{
            if(a.length()==b.length()) return a.compareTo(b);
            else return a.length()-b.length();
        });
        for(String r1: answer){
            System.out.println(r1);
        }
    }

}