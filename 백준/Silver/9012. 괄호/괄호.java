import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    
    private static Stack<Character> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String input;
        for (int i = 0; i < T; i++) {
            input = br.readLine();
            stack = new Stack<>();
            System.out.println(VPSCheck(input));
        }
    }

    private static String VPSCheck(String input) {
        int inputLength = input.length();

        for (int i = 0; i < inputLength; i++) {
            char nowChar = input.charAt(i);
            if (nowChar == '(') {
                stack.add(nowChar);
            }
            if (nowChar == ')') {
                if (stack.empty()) {
                    return "NO";
                }
                char top = stack.pop();
                if (top == ')') {
                    return "NO";
                }
            }
        }
        if (!stack.empty()) {
            return "NO";
        }

        return "YES";
    }
}