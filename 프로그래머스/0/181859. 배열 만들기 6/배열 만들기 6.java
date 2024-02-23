import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(stk.empty() || stk.peek()!=arr[i]){
                stk.add(arr[i]);
                continue;
            }
            stk.pop();
        }
        answer = stk.empty() ? 
            new int[]{-1} : stk.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}