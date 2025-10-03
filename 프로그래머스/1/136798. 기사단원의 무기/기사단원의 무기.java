class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        // 약수 구하기
        int[] div = new int[number + 1];
        
        for (int d = 1; d <= number; d++) {
            for (int m = d; m <= number; m += d) {
                div[m]++;
            }
        }
        
        for (int i = 1; i <= number; i++) {
            answer += (div[i] > limit) ? power : div[i];
        }
        
        return answer;
    }
}