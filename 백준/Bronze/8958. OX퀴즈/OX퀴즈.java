import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempts = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < attempts; i++) {
            String answers = sc.nextLine();
            int stack = 0;
            int score = 0;
            for (int j = 0; j < answers.length(); j++) {
                if (answers.charAt(j) == 'O') {
                    score += (++stack);
                } else {
                    stack = 0;
                }
            }
            System.out.println(score);
        }
    }
}