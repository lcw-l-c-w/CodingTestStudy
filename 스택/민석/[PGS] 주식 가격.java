import java.util.*;
class Solution {
    static  class Pair{
        int index;
        int cnt;
        
        Pair(int x, int y){
            this.index = x;
            this.cnt = y;
        }
        
        
        
    }
    
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        //이거 이중 반복문으로 돌면
        // n*n-1  100000 * 1000000 1초넘어감.
        
        //d아니 이문제스택인데 ㅇ스택을 어따 쓸까 
        //
        
        //1기준으로 넣고  스택길이계산?
        //2기준으로 넣고 스택길이계산 ?
        //근데 이러면 이중반복문이랑 똑같지않나..
        //100000번 호출해서
        //스택체크하면 또 반복문돌아서 100000번 넣을거아냐
        Stack<Integer> stack = new Stack<>();   //스택은 인덱스를 저장함
        for(int i = 0 ;i<prices.length;i++){
            
            if(!stack.isEmpty()){ //스택이 안비어있다면 
                
                while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){ //인덱스를 바탕으로 값을 비교
                    //떨어질경우 
                    //떨어져서 pop했는데 또 떨어질 수 있으니 while문으로
                    //근데 비어있는걸 확인해야함 비어있는데 peek()하면 오류나니까 
                    
                    answer[stack.peek()] = i - stack.peek(); //인덱스차이
                    stack.pop();
                    
                }
                
                stack.add(i);
            }
            else{
                stack.add(i);
            }
            
            
        }
        
        
        
        while(!stack.isEmpty()){ //스택이 빌때까지 남은애들은 끝까지 안떨어진애들임 !
        // 끝까지 버틴애들은  결국 가장 오래 버틴거니까 초의 끝이라 할 수 있는 배열 길이에서 빼면 되겠지 
           
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }
    
    
}