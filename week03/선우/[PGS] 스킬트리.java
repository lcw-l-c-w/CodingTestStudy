import java.io.*;
import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        
        
        
        int answer = 0;
        String abc;
        int ok = -1;
        int cnt = 0;
        for(int i = 0; i < skill_trees.length ; i++){
            abc = skill_trees[i];
            ok = -1;
            cnt = 0;
            for(int j = 0; j < abc.length(); j++){
              ok = skill.indexOf(Character.toString(abc.charAt(j))); 
                if(ok == -1 ){
                    continue;
                }
                
                if(ok != cnt){
                    cnt = -1;
                    break; // 답이 아님
                } 
                cnt = ok + 1;
            }
             if(cnt >= 0){
                 answer++;
             }  
        }
        
        
        
        return answer;
    }
}