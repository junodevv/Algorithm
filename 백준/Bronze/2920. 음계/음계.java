import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[8];
        StringBuffer result = new StringBuffer();
        String answer = "";
        
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }
        for (int i : inputs) {
            result.append(i);
        }
        switch (result.toString()) {
            case "12345678":
                answer = "ascending";
                break;
            case "87654321":
                answer = "descending";
                break;
            default:
                answer = "mixed";
                break;
        }
        System.out.println(answer);
    }
}