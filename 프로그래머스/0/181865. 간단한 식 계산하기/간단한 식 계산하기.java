class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] splited = binomial.split(" ");
        switch(splited[1]){
            case "+": answer = Integer.parseInt(splited[0]) + Integer.parseInt(splited[2]);
                break;
            case "-": answer = Integer.parseInt(splited[0]) - Integer.parseInt(splited[2]);
                break;
            case "*": answer = Integer.parseInt(splited[0]) * Integer.parseInt(splited[2]);
                break;
            default:
                break;
        }
        return answer;
    }
}