class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;    // 홀
        int even = 0;   // 짝
        
        for(int i= 0; i < num_list.length; i+=2){
            odd += num_list[i];
        }
        
        for(int i=1; i < num_list.length; i+=2){
            even += num_list[i];
        }
        
        if(odd > even){
            return odd;
        }
        if(odd < even){
            return even;
        }             
        if(odd==even){
            answer = odd;
        }
        return answer;
    }
}