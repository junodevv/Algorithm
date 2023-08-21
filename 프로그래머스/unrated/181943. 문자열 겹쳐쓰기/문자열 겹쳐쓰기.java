class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char[] charAnswer = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            if(i < s){
                charAnswer[i] = my_string.charAt(i);
            }else if(i >= s && i < (s + overwrite_string.length()) ){
                charAnswer[i] = overwrite_string.charAt(i-s);
            }else{
                charAnswer[i] = my_string.charAt(i);
            }
        }
        
        for(char ca : charAnswer){
            answer += ca;
        }
        return answer;
    }
}