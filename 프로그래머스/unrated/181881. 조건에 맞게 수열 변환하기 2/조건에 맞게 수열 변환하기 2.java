import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int x = 0;
        int[] temp = new int[arr.length];

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2==0) {
                    temp[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2==1) {
                    temp[i] = (arr[i] * 2) + 1;
                } else {
                    temp[i] = arr[i];
                }
            }

            boolean result = Arrays.equals(arr, temp);

            if (result==true) {
                answer = x;
                break;
            }

            for (int i = 0; i < temp.length; i++) {
                arr[i] = temp[i];
            }
            x++;
        }


        return answer;
    }
}