// 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색
// 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return
// xy = brown+yellow
// yellow = (x-2)(y-2)
import java.util.HashMap;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int xy = brown+yellow; // 전체 넓이(x*y)
        HashMap<Integer, Integer> CandidatesXY = new HashMap<>();
        // 약수 찾기, 가로길이*세로길이 = 넓이, 따라서 넓이(xy)의 약수 중 답이있음
        for(int i=3; i<xy; i++){
            if(xy%i == 0){
                CandidatesXY.put(i, xy/i);
            }
        }
        
        for(int i : CandidatesXY.keySet()){
            int x = i;
            int y = CandidatesXY.get(i);
            if(x>=y && (x-2)*(y-2)==yellow){
                answer[0] = x;
                answer[1] = y;
            }
        }
        return answer;
    }
}