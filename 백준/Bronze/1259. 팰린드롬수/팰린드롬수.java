import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> inputValues = new ArrayList<>();
        List<Boolean> results = new ArrayList<>();

        while (true) {
            String inputValue = sc.nextLine();
            if (inputValue.equals("0")) {
                break;
            }
            inputValues.add(inputValue);
        }

        for (int i = 0; i < inputValues.size(); i++) {
            String judgment = inputValues.get(i);
            results.add(true);
            for (int j = 0; j < judgment.length() / 2; j++) {
                if (judgment.charAt(j) != judgment.charAt(judgment.length() - j - 1)) {
                    results.set(i, false);
                    break;
                }
            }
        }

        for (Boolean result : results) {
            System.out.println(result ? "yes" : "no");
        }
    }
}