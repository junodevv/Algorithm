import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);
        // 보드 초기화
        String[][] board = new String[N][M];
        for (int i = 0; i < board.length; i++) {
            board[i] = br.readLine().split("");
        }

        // 전체에서 8*8 범위를 정해주는 이중 for문
        int currentMin = Integer.MAX_VALUE;
        for (int i = 0; i <= board.length - 8; i++) {
            for (int j = 0; j <= board[i].length - 8; j++) {
                int Count = getMinCount(board, i, j);
                if (Count < currentMin) {
                    currentMin = Count;
                }
            }
        }

        System.out.print(currentMin);

    }

    private static int getMinCount(String[][] board, int n, int m) {
        int count = 0;
        String[][] blackExamples = {
                {"B", "W", "B", "W", "B", "W", "B", "W"},
                {"W", "B", "W", "B", "W", "B", "W", "B"}
        };
        int col = 0;
        int row = 0;
        for (int i = n; i < n + 8; i++) {
            for (int j = m; j < m + 8; j++) {
                if (!board[i][j].equals(blackExamples[i % 2][j - m])) { // [i%2]: 짝수일떄 0, 홀수일때 1 인 row와 매칭 [j-m]: m부터 시작하니까 m을 뺴주면 0부터 시작됨
                    count++;
                }
            }
        }
        return Integer.min(count, 64 - count);
    }
}