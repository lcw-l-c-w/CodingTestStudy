class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String tree : skill_trees) { // 처음에 tree에 skill을 넣었었음

            StringBuilder sb = new StringBuilder();
            // skill문자열에서 하나씩 뽑기
            for (char c : tree.toCharArray()) {
                // 문자가 문자열 skill 안에서 몇번째에 있는지 알려줌
                if (skill.indexOf(c) != -1) {
                    sb.append(c);
                }
            }

            if (skill.startsWith(sb.toString())) {
                answer++;
            }
        }

        return answer;
    }
}