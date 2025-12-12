import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	public static void main(String []args) throws Exception{
		
		
		
		
		Stack<Integer> stack = new Stack<>();
//		push X: 정수 X를 스택에 넣는 연산이다.
//		pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.  스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//		size: 스택에 들어있는 정수의 개수를 출력한다.
//		empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//		top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i<T;i++) {
			
			int num = Integer.parseInt(br.readLine());
			
			if(num ==0) {
				stack.pop();
			}
			else {
				stack.push(num);
			}
		}
		int sum = 0;
		while(!stack.isEmpty()) {
			sum += stack.pop();
		}
		bw.write(String.valueOf(sum));
		
		
		bw.flush();
		bw.close();
		
		
		
	}
}