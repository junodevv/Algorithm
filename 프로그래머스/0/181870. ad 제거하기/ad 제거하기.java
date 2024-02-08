import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer;
        List<String> answerList = new ArrayList<>();
        
        for(String s : strArr){
            if(!s.contains("ad")){
                answerList.add(s);
            }
        }
        answer = new String[answerList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}