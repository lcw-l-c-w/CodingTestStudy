import java.util.*;
class Solution {
    static List<String> answer = new ArrayList<>();
    static String[] dfs(String start, int[] visited, String[][] tickets){
        if(answer.size() == tickets.length + 1) return answer.toArray(new String[0]);
         for(int i=0; i<tickets.length; i++){
            if(visited[i]==0 &&tickets[i][0].equals(start)){
                visited[i]=1;
                answer.add(tickets[i][1]);
                String[] result= dfs(tickets[i][1],visited,tickets);
                if(result!=null) return result;
                visited[i]=0;
                answer.remove(answer.size()-1);
            }
         }
        
        return null;
    }
    
    public String[] solution(String[][] tickets) {
    
        int[] visited= new int[tickets.length];
         Arrays.sort(tickets, (a, b) -> {
            if(a[0].equals(b[0]))
                return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
        });
      
        answer.add("ICN");
        return dfs("ICN",visited,tickets);
    }
}