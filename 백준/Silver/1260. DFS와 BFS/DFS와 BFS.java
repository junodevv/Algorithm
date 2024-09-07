import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 문제 분석 1. 시간제한: 2초(연산 <= 2억회) 2. 입력값: N=1,000 + M=10,000 = 11,000 3. 문제 요약: 간선이 연결하는 두 정점의 번호가 주어짐, 간선은 양방향, 탐색시작번호=V
 * 4. 알고리즘: DepthFirstSearch, BreathFirstSearch 5. 시간복잡도: 6. 기타: 7. 내 코드 시간복잡도:
 */
public class Main {

    static boolean[] visited;
    static int[][] edge;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        edge = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            edge[x][y] = 1;
            edge[y][x] = 1;
        }

        visited = new boolean[N + 1];
        count = 0;
        dfs(V, count);

        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }

    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>(); // 큐: FIFO

        // 첫번째 노드
        queue.add(node); // 큐에 저장
        visited[node] = true; // 방문처리
        // 이후 노드
        while (!queue.isEmpty()) {
            int now = queue.poll(); // 가장 먼저들어온 노드를 꺼내고 삭제
            System.out.print(now + " "); // 현재 노드 출력
            for (int i = 0; i < edge[now].length; i++) { // 현재노드와 인접한 모든 노드 방문
                if (edge[now][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i); // 방문한 노드 큐에 추가
                }
            }
        }

    }

    private static void dfs(int node, int count) {
        // 방문 체크
        visited[node] = true;
        System.out.print(node);
        // 재귀 탈출
        if (++count == visited.length - 1) {
            return;
        }

        System.out.print(" ");
        // 다음 노드 탐색: 현재 노드와 연결된 간선들을 오름차순으로 찾고 visited 여부 확인해서 새로운 dfs 속으로
        for (int i = 0; i < edge[node].length; i++) {
            if (edge[node][i] == 1 && !visited[i]) {
                dfs(i, count);
            }
        }
    }

}
