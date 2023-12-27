import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        Integer[] citationsInt = new Integer[n];
        for(int i=0;i<n;i++){
            citationsInt[i] = citations[i];
        }
        Arrays.sort(citationsInt, Collections.reverseOrder());

        for(int i=0; i<n; i++){
            // 피인용 < 순위
            if(citationsInt[i] < i+1){
                answer = i;
                break;
            }
            // 피인용 == 순위
            if(citationsInt[i] == i+1){
                answer = i+1;
                break;
            }
            //모든 논문의 피인용들이 순위보다 높을때
            answer = n;
        }
        return answer;
    }
}