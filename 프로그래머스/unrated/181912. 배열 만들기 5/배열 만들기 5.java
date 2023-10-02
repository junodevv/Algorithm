import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        int resultCandidate = 0;
        
        for(int i = 0; i < intStrs.length; i++){
            resultCandidate = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(resultCandidate > k){
                answer.add(resultCandidate);
            }
        }
        return answer;
    }
}