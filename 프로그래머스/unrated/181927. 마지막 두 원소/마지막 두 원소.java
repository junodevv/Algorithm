import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        int numL = num_list.length;
        
        for(int i : num_list){
            answer.add(i);
        }
    
        if(num_list[numL-1] > num_list[numL-2]){
            int temp = num_list[numL-1] - num_list[numL-2];
            answer.add(temp);
        }else{
            int temp = num_list[numL-1] * 2;
            answer.add(temp);
        }
        
        return answer;
    }
}