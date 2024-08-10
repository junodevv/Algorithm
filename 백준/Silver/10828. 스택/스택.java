import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.startsWith("push")) {
                stack.push(Integer.parseInt(input.split(" ")[1]));
                continue;
            }
            if (input.startsWith("pop")) {
                Integer result = stack.empty() ? -1 : stack.pop();
                bw.write(result + "\n");
                continue;
            }
            if (input.startsWith("size")) {
                bw.write(stack.size() + "\n");
                continue;
            }
            if (input.startsWith("empty")) {
                Integer result = stack.empty() ? 1 : 0;
                bw.write(result + "\n");
                continue;
            }
            if (input.startsWith("top")) {
                Integer result = stack.empty() ? -1 : stack.peek();
                bw.write(result + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}