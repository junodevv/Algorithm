class Solution {
    public String solution(int[] numLog) {
        StringBuffer answer = new StringBuffer();
                
        for(int i = 0; i < numLog.length-1; i++){
            int sub = numLog[i+1] - numLog[i];
            
            switch(sub){
                case 1: answer.append("w"); break;
                case -1: answer.append("s"); break;
                case 10: answer.append("d"); break;
                case -10: answer.append("a"); break;
                default: break;
            }
        }
        
        return answer.toString();
    }
}