import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int temp;
        int count = 1;
        for (int i = 0; i < N; i++) {
            temp = Integer.parseInt(br.readLine());
            if (temp >= count) {
                while (temp >= count) { // count가 1더 높아질때까지 반복
                    stack.push(count++);
                    sb.append("+\n");
                }
            }
            if (stack.pop() != temp) {  // pop한 값이 temp에서 받은 값과 다르면 NO
                System.out.print("NO");
                return;
            }
            sb.append("-\n"); // pop한 값이 temp에서 받은 값과 같으면 - 추가후 계속 진행
        }
        System.out.print(sb);
    }
}