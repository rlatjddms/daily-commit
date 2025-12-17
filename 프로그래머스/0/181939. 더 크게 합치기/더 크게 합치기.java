class Solution {
    public int solution(int a, int b) {
        String num1 = String.valueOf(a) + b;
        String num2 = String.valueOf(b) + a;

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        return Math.max(n1, n2);
    }
}