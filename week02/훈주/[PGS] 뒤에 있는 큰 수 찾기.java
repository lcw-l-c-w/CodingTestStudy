import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public int[] solution(int[] numbers) {

        int n = numbers.length;

        int[] answer = new int[n]; // 기본값 0, 뒷 큰수 없는 경우 -1로 변경 예정

        // 아직 뒷 큰수를 찾지 못한 인덱스를 저장하는 스택
        Deque<Integer> stack = new ArrayDeque<>();

        // 왼쪽 → 오른쪽 순회
        for (int i = 0; i < n; i++) {

            // 현재 값이 스택 top 인덱스의 값보다 크면 해당 인덱스의 뒷 큰수는 현재 값
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int idx = stack.pop();
                answer[idx] = numbers[i];
            }
            stack.push(i); // 현재 인덱스는 아직 뒷 큰수를 모름 -> 스택에 저장
        }

        // 끝까지 뒷 큰수를 못 찾은 인덱스들은 -1 처리
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }
        return answer;
    }
}