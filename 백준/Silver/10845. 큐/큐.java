import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (input.equals("pop")) {
                int removeResult = queue.isEmpty() ? -1 : queue.remove();
                bw.write(removeResult + "\n");
                continue;
            }
            if (input.equals("size")) {
                bw.write(queue.size() + "\n");
                continue;
            }
            if (input.equals("empty")) {
                int empty = queue.isEmpty() ? 1 : 0;
                bw.write(empty + "\n");
                continue;
            }
            if (input.equals("front")) {
                int peekResult = queue.isEmpty() ? -1 : queue.peek();
                bw.write(peekResult + "\n");
                continue;
            }
            if (input.equals("back")) {
                int result = queue.isEmpty() ? -1 : ((LinkedList<Integer>) queue).getLast();
                bw.write(result + "\n");
                continue;
            }
            // push
            queue.offer(Integer.parseInt(input.split(" ")[1]));
        }
        bw.flush();
        bw.close();
    }
}