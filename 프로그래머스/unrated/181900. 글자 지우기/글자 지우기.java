class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        char[] temp = my_string.toCharArray();
        
        for(int i = 0; i < indices.length; i++){
            temp[indices[i]] = '0';
        }
        
        for(char c : temp){
            if(c != '0'){
                answer += c;
            }
        }
        
        return answer;
    }
}