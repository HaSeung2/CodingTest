class Solution{
public int[] solution(long n) {
    if (n == 0) {
        return new int[]{0};
    }
    String str = String.valueOf(n);
    int[] answer = new int[str.length()];
    for (int i = str.length() - 1; i >= 0; i--) {
        answer[str.length() - 1 - i] = str.charAt(i) - '0';
    }
    return answer;
}
}