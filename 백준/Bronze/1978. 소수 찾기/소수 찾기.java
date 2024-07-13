import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int resultCount = 0;
        int primeCount;
        List<Integer> inputValues = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            inputValues.add(sc.nextInt());
        }

        for (Integer inputValue : inputValues) {
            if (inputValue == 1) {
                continue;
            }
            primeCount = 0;
            for (int i = 1; i < inputValue + 1; i++) {
                if (inputValue % i == 0) {
                    primeCount++;
                }
            }
            if (primeCount == 2) {
                resultCount++;
            }
        }
        System.out.println(resultCount);
    }
}