import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        String[] splited = myStr.split("([abc]+)");
        answer = Arrays.stream(splited).parallel()
                .filter(i -> !i.equals(""))
                .toArray(String[]::new);
        if(answer.length<1){
            answer = new String[] {"EMPTY"};
        }
        return answer;
    }
}