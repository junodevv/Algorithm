import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> types = new HashSet<>();
        int possibleCount = nums.length/2;
        
        for(int i : nums){
            types.add(i);    
        }
        
        answer = types.size() <= possibleCount ? types.size() : possibleCount;
        return answer;
    }
}