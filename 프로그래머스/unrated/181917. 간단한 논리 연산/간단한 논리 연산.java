class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x12 = true, x34 = true;
        
        x12 = x1||x2 ? true : false;
        
        x34 = x3||x4 ? true : false;
        
        answer = x12 && x34 ? true : false;
        
        return answer;
    }
}