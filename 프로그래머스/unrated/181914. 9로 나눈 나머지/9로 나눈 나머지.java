class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(char c : number.toCharArray()){
            answer += Character.getNumericValue(c);
        }
        
        answer %= 9;
        
        return answer;
    }
}