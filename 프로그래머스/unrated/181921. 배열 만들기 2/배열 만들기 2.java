import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        int binaryCount = 0;
        
        for(int i = 1; i <= Integer.toString(r).length(); i++){
            binaryCount += Math.pow(2, i-1);    
        }
        for(int i = 1; i <= binaryCount; i++){
            int resultElement = Integer.parseInt(Integer.toBinaryString(i))*5;
            if(l <= resultElement && resultElement <= r){
                answer.add(resultElement);
            }
        }
        if(answer.isEmpty()){
            answer.add(-1);
        }
        
        return answer;
    }
}