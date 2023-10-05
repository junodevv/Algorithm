class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String tempstr = "";
        int strlen = my_string.length()/m; // 5
        
        
        for(int i = 0; i < strlen; i++){    // 0,1,2,3,4
            tempstr = my_string.substring(i*m, (i*m)+m);
            answer += tempstr.charAt(c-1);
        }
        
        return answer;
    }
}