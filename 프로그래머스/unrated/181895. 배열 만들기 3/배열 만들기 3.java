import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer;
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++){
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++){
                result.add(arr[j]);
            }
        }
        
        answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}