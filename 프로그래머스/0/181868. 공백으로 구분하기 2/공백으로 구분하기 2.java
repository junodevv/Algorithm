import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();

        String[] myStringArray = my_string.trim().split(" ");
        
        for(String s : myStringArray){
            if(!s.equals("")){
                answer.add(s);
            }
        }
        
        return answer.toArray(String[]::new);
    }
}