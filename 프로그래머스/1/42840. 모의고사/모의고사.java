import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        List<int[]> supojas = new ArrayList<>();
        List<int[]> supojaRules = new ArrayList<>();
        int[] corrects = {0, 0, 0};
        // 규칙추가
        supojaRules.add(new int[]{1, 2, 3, 4, 5});
        supojaRules.add(new int[]{2, 1, 2, 3, 2, 4, 2, 5});
        supojaRules.add(new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});
        // 수포자들 답 생성
        for(int i=0; i<supojaRules.size(); i++){
            int[] supoja = supojaSubmit(supojaRules.get(i), answers.length);
            supojas.add(supoja);
        }
        // answers와 수포자들의 답 비교
        for(int i=0; i<supojas.size(); i++){
            corrects[i] = compareAnswersToSupoja(supojas.get(i), answers);
        }
        int max = Arrays.stream(corrects).max().getAsInt();

        for(int i=0; i< corrects.length; i++){
            if(corrects[i] == max){
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private static int compareAnswersToSupoja(int[] supoja, int[] answers) {
        int sameNumber = 0;
        for(int i=0; i<answers.length; i++){
            if(supoja[i] == answers[i]){
                sameNumber++;
            }
        }
        return sameNumber;
    }

    private static int[] supojaSubmit(int[] supojaRule, int answersLength){
        int[] supoja = new int[answersLength];
        for(int i=0; i<supoja.length; i++){
            supoja[i] = supojaRule[i-((i / supojaRule.length)*supojaRule.length)];
        }
        return supoja;
    }
}