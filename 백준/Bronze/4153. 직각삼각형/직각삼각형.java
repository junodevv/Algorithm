import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSum;
        List<List<Integer>> inputValues = new ArrayList<>();
        do {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();
            inputSum = first + second + third;
            if (inputSum != 0) {
                inputValues.add(Arrays.asList(first, second, third));
            }
        } while (inputSum != 0);
        for (List<Integer> inputValue : inputValues) {
            inputValue.sort(Comparator.naturalOrder());
            boolean result =
                    Math.pow(inputValue.get(0), 2) + Math.pow(inputValue.get(1), 2) == Math.pow(inputValue.get(2), 2);
            System.out.println(result ? "right" : "wrong");
        }
    }
}