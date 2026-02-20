/*
    최소를 만들어야 하니까 -> 최대 * 최소 해서 한 값이 최솟값이 나올거고
*/
import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A); // 오름차순
        
        Arrays.sort(B);
        
        int n = A.length;
        
        for (int i = 0; i < n; i++){
            answer += A[i]*B[n-1-i];
        }
        
        return answer;
        
    }
}