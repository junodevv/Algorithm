import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            inputs.add(sc.nextInt());
        }
        int max = Collections.max(inputs);
        int indexOfMax = 0;
        for (Integer i : inputs) {
            if (i == max) {
                indexOfMax = inputs.indexOf(i) + 1;
            }
        }
        System.out.println(max);
        System.out.println(indexOfMax);

    }
}