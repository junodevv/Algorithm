import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> marathonResult = new HashMap<>();
        
        for(String s : participant){
            marathonResult.put(s,marathonResult.getOrDefault(s,0)+1);
        }
        
        for(String s : completion){
            marathonResult.replace(s, marathonResult.get(s)-1);
        }
        
        for(String s : marathonResult.keySet()){
            if(marathonResult.get(s)==1){
                answer = s;
            }
        }
        return answer;
    }
}