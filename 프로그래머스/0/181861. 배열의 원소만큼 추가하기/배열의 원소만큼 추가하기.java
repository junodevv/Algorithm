import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        for(int a : arr){
            for(int i=0; i<a; i++){
                answerList.add(a);
            }
        }
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}