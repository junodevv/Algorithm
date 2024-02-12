import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> answer = new ArrayList<>();
        String[] splitStrings = myString.split("x");
        
        for(String s : splitStrings){
            answer.add(s.length());
        }
        if(myString.charAt(myString.length()-1)=='x'){
            answer.add(0);
        }
        
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}