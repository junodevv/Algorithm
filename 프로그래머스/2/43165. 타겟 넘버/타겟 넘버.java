class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        int currentNumber = 0;
        int nextIdx = 0;
        
        dfs(currentNumber, nextIdx, numbers, target);
        
        return answer;
    }
    private void dfs(int currentNumber, int nextIdx, int[] numbers, int target){
        
        if(nextIdx == numbers.length && currentNumber == target){
            answer++;
        }
        if(nextIdx < numbers.length){
            dfs(currentNumber+numbers[nextIdx], nextIdx+1, numbers, target);
            dfs(currentNumber-numbers[nextIdx], nextIdx+1, numbers, target);    
        }
    }
}