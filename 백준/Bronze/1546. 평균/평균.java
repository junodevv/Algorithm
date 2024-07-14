import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Double> scores = new ArrayList<>();
        double result = 0;
        for (int i = 0; i < N; i++) {
            scores.add(sc.nextDouble());
        }
        Double max = scores.stream().max(Comparator.naturalOrder()).get();
        List<Double> changeScores = scores.stream()
                .map(i -> (i / max) * 100)
                .collect(Collectors.toList());

        for (Double changeScore : changeScores) {
            result += changeScore;
        }

        System.out.println(result / N);
    }
}