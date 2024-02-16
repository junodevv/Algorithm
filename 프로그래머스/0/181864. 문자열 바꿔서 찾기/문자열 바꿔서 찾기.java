import java.util.stream.Collectors;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String result = myString.chars()
            .map(i -> i=='A' ? 'B':'A')
            .boxed()
            .map(i -> String.valueOf((char)i.intValue()))
            .collect(Collectors.joining());
        if(result.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}