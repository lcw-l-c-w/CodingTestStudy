import java.util.*;
class Solution {
    static int answer = 0;
    public int solution(String s) {
        if(s.length() % 2 !=0){
            return 0;
        }//짝수가 아니면 불가능 ㅋㅋ
        Stack<Character> stack = new Stack<>();
        
        //s길이만큼 회전
        for(int i = 0 ; i<s.length();i++){
            // 오른쪽 부분 + 왼쪽부분이자나
            String reverse = s.substring(i) + s.substring(0,i);
              
            
            //회전한 문자열이 괄호가 맞는지 체크 !
            check(reverse);
        }
        
        
        
       
        

    
        return answer;
    }
    
    //체크하는 함수  스택의 성질을 이용
    public void check (String reverse){
        
        
        
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i<reverse.length() ; i++){
            
        
            
            char c = reverse.charAt(i);
            if(c == ']'){
                
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }
                else return;
                
            }
            else if(c=='}'){
                
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }
                else return;
                
                
            }
            else if(c==')'){
                
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else return;
                
            }
            else{
                stack.add(c);
                
            }
            
            
            
        }
        
       if(stack.isEmpty()){ //비어있다면 짝이 다 맞는거임  answer증가
           answer++;
           
       }
        return;
    }
}
    