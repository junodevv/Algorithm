class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string);
        StringBuilder temp = new StringBuilder(answer.substring(s,e+1));
        
        String temps = temp.reverse().toString();
        
        answer.replace(s,e+1,temps);
        
        return answer.toString();
    }
}