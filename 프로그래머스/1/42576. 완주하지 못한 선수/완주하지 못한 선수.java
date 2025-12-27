import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (String person : completion) {
            map.put(person, map.getOrDefault(person, 0) + 1);
        }
        
        for (String person : participant) {
            map.put(person, map.getOrDefault(person, 0) - 1);
            if (map.get(person) < 0)
                return person;
        }
        
        return "";
    }
}