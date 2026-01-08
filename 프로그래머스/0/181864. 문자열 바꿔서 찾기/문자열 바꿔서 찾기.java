class Solution {
    public int solution(String myString, String pat) {
        String converted = myString
                .replace("A", "C")
                .replace("B", "A")
                .replace("C", "B");

        return converted.contains(pat) ? 1 : 0;
    }
}