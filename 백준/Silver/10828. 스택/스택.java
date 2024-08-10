import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.startsWith("push")) {
                stack.push(Integer.parseInt(input.split(" ")[1]));
                continue;
            }
            if (input.startsWith("pop")) {
                System.out.println(stack.empty() ? -1 : stack.pop());
                continue;
            }
            if (input.startsWith("size")) {
                System.out.println(stack.size());
                continue;
            }
            if (input.startsWith("empty")) {
                System.out.println(stack.empty() ? 1 : 0);
                continue;
            }
            if (input.startsWith("top")) {
                System.out.println(stack.empty() ? -1 : stack.peek());
            }
        }
    }
}