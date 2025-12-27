import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        int length = nums.length / 2;
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i : nums) {
            set.add(i);
        }
        
        if(set.size() >= length) {
            answer = length;
        } else {
            answer = set.size();
        }
        
        return answer;
    }
}