import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        ArrayList<Integer> idx = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int front, end;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                idx.add(i);
            }
        }
        
        if(idx.isEmpty()){
            result.add(-1);
        }
        else{
            front = idx.get(0);
            end = idx.get(idx.size()-1);
        
            for(int i = front; i <= end; i++){
                result.add(arr[i]);
            }
        }
        answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);    
        }
        
        return answer;
    }
}