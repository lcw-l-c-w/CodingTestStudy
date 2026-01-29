import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> poke = new HashSet<>();
        for (int num : nums) {
            poke.add(num);
        }
        return Math.min(poke.size(), nums.length / 2);
    }
}