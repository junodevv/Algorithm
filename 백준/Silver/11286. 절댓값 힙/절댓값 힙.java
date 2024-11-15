import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            // 절댓값이 같으면 음수 우선, int 자료형 범위 overflow할 가능성 있음
            if (abs1 == abs2) {
                return o1 >= o2 ? 1 : -1;
            }
            // 절댓값 작은 기준 정렬, int 자료형을 overflow할 가능성 없음
            return abs1 - abs2;
        });
        int N = Integer.parseInt(br.readLine());
        int input;
        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (pq.isEmpty()) {
                    sb.append("0\n");
                    continue;
                }
                sb.append(pq.poll()).append("\n");
                continue;
            }
            pq.add(input);
        }
        System.out.print(sb);
    }
}