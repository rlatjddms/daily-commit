class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 1; i < numLog.length; i++) {
            int key = numLog[i] - numLog[i - 1];
            
            if (key == 1) {
                answer.append("w");
            } else if (key == -1) {
                answer.append("s");
            } else if (key == 10) {
                answer.append("d");
            } else if (key == -10) {
                answer.append("a");
            }
        }
        
        return answer.toString();
    }
}