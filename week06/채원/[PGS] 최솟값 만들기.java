import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = Integer.MAX_VALUE;
        Arrays.sort(A);
        Arrays.sort(B);
        int tmp=0;
     for(int i=0; i<A.length; i++){
         int a= A[i];
         int b= B[Math.abs(B.length-(i+1))];
         tmp+=a*b;                  
         
     }
      answer=Math.min(answer,tmp);
        return answer;
    }
}