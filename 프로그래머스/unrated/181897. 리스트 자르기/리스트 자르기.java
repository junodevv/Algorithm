import java.util.*;
class Solution {
    public Object[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList <Integer> answer = new ArrayList<>();
        int a = slicer[0], b = slicer[1], c = slicer[2];
        
        switch(n){
            case 1: 
                for(int i = 0; i <= b; i++){
                    answer.add(num_list[i]);
                }
                break;
                
            case 2:
                for(int i = a; i < num_list.length; i++){
                    answer.add(num_list[i]);
                }
                break;
                
            case 3:
                for(int i = a; i <= b; i++){
                    answer.add(num_list[i]);
                }
                break;
            case 4:
                for(int i = a; i <= b; i+=c){
                    answer.add(num_list[i]);
                }
                break;
            default: break;
        }
        
        return answer.toArray();
    }
}