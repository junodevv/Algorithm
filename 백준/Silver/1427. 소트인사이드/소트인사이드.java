import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int NLength = N.length();

        String[] split = N.split("");
        int[] nArray = new int[NLength];
        for (int i = 0; i < NLength; i++) {
            nArray[i] = Integer.parseInt(split[i]);
        }
        int max;
        // 여기서 초기화 하지 않으면 조건문 속에서 초기화 되는데, 조건문이 실행되지 않으면 초기화 되지 않기때문에 먼저 초기화 해놓지 않으면 컴파일 오류가 난다.
        int maxIdx = 0;
        int temp;
        for (int i = 0; i < NLength; i++) {
            max = nArray[i]; // 탐색하는 수 중 가장 첫번째 수

            for (int j = i; j < NLength; j++) {
                if (nArray[j] > max) {
                    max = nArray[j];
                    maxIdx = j;
                }
            }

            if (nArray[i] != max) {
                temp = nArray[i];
                nArray[i] = max;
                nArray[maxIdx] = temp;
            }
        }

        for (int i : nArray) {
            System.out.print(i);
        }
    }
}