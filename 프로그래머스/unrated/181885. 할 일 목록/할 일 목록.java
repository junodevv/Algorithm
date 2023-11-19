import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        
        HashMap<String, Boolean> todoMap = new HashMap<>();
        for(int i = 0; i < todo_list.length; i++){
            todoMap.put(todo_list[i], finished[i]);
        }
        for(int i=0; i <todoMap.size(); i++){
            if(todoMap.get(todo_list[i])==false){
                answer.add(todo_list[i]);
            }
        }
        
        return answer.toArray(new String[0]);
    }
}