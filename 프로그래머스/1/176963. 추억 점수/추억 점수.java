import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> scoreMap = new HashMap<>();
        for(int i = 0;i < name.length;i++) {
            scoreMap.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        
        for(int i = 0;i < photo.length;i++) {
            int sum = 0;
            for(int j = 0;j < photo[i].length;j++) {
                if(scoreMap.containsKey(photo[i][j])) 
                    sum += scoreMap.get(photo[i][j]);
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}