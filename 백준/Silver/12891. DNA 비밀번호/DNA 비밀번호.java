import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); // 총 DNA 길이
        int P = sc.nextInt(); // 비밀번호 DNA 길이
        sc.nextLine();
        String tempDNA = sc.nextLine();
        int[] ACGTPassword = new int[4]; // 비밀번호 배열
        int[] nowPassword = new int[4]; // 현재 상태 배열
        int count = 0; // 결과 카운트

        for (int i = 0; i < 4; i++) {
            ACGTPassword[i] = sc.nextInt();
        }

        // 첫번째 현재 상태 배열 생성 및 비교
        for (int i = 0; i < P; i++) {
            addNowPassword(nowPassword, tempDNA.charAt(i));
        }
        count += comparePassword(ACGTPassword, nowPassword);

        // 이후 현재상태 배열 생성 및 비교
        char removeChar, addChar;
        for (int i = 0; i < S - P; i++) {
            removeChar = tempDNA.charAt(i);
            addChar = tempDNA.charAt(i + P);
            addNowPassword(nowPassword, addChar);
            minusNowPassword(nowPassword, removeChar);
            count += comparePassword(ACGTPassword, nowPassword);
        }

        System.out.print(count);
    }

    private static int comparePassword(int[] ACGTPassword, int[] nowPassword) {
        for (int i = 0; i < 4; i++) {
            if (ACGTPassword[i] > nowPassword[i]) {
                return 0;
            }
        }
        return 1;
    }

    private static void addNowPassword(int[] nowPassword, char nowChar) {
        switch (nowChar) {
            case 'A':
                nowPassword[0]++;
                break;
            case 'C':
                nowPassword[1]++;
                break;
            case 'G':
                nowPassword[2]++;
                break;
            case 'T':
                nowPassword[3]++;
                break;
        }
    }

    private static void minusNowPassword(int[] nowPassword, char nowChar) {
        switch (nowChar) {
            case 'A':
                nowPassword[0]--;
                break;
            case 'C':
                nowPassword[1]--;
                break;
            case 'G':
                nowPassword[2]--;
                break;
            case 'T':
                nowPassword[3]--;
                break;
        }
    }
}