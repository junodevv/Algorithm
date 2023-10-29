import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
String[] answer = {};
        int lIdx = 0;
        boolean lEmpty = true;
        int rIdx = 0;
        boolean rEmpty = true;
        int start = 0;
        int end = str_list.length;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                lIdx = i;
                lEmpty = false;
                break;
            } else if (str_list[i].equals("r")) {
                rIdx = i;
                rEmpty = false;
                break;
            }
        }

        if (lEmpty && rEmpty) {
            return answer;
        } else {
            if (rEmpty) {
                end = lIdx;
            } else {
                start = rIdx + 1;
            }
        }

        answer = new String[end - start];
        for (int i = start; i < end; i++) {
            answer[i - start] = str_list[i];
        }

        return answer;
    }
}