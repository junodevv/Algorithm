class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        char[] ca = my_string.toCharArray();
        char[] temp = new char[my_string.length()];
        
        int now = 0, start = 0, end = 0;
            
        for(int i = 0; i < queries.length; i++){
            now = queries[i][0];    // 2
            
            start = queries[i][0];  // 2
            end = queries[i][1];    // 3
            
            for(int j = start; j <= end; j++){
                temp[now] = ca[now];
                if(now < end){
                    now++;
                }
            }
            for(int q = start; q <= end; q++){
                ca[q] = temp[now];
                if(now > start){
                    now--;
                }
            }
        }
        answer = String.valueOf(ca);
        return answer;
    }
}