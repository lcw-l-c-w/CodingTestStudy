import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int a : nums ){
            set.add(a);
        }
        int count = set.size();
        int answer = 0;
        
        answer = nums.length / 2 > count ? count : nums.length/2;
        return answer;
    }
}