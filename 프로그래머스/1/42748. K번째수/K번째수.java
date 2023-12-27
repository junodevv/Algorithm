import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i;
        int j;
        int k;
        int [] temp;
        for(int idx=0; idx<commands.length; idx++){
            i = commands[idx][0];
            j = commands[idx][1];
            k = commands[idx][2];
            temp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(temp);
            answer[idx] = temp[k-1];   
        }
        
        return answer;
    }
}