import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> types = new ArrayList<>();
        int possibleCount = nums.length/2;
        
        for(int i : nums){
            if(!types.contains(i)){
                types.add(i);
            }
        }
        
        if(types.size() <= possibleCount){
            answer = types.size();
        }else{
            answer = possibleCount;
        }
        
        return answer;
    }
}