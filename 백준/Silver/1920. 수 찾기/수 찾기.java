import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 최댓값: 100,000 x 100,000
        // 제한시간: 1초 -> 100,000,000회 이하 연산
        // N개의 입력값들 중에 M개의 입력값이 존재하는지 탐색
        // 전체 탐색시, 빅오 시간복잡도 약 O(N)*M = (100,000)² = 100,000,000,000 > 1억 -> 시간초과
        // 이진 탐색시, 빅오 시간복잡도 약 O(logN)*M = log100,000*100,000 = 16.6...*100000 = 1,600,000 < 1억
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] nInputValues = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] mInputValues = br.readLine().split(" ");

        // 정렬 및 Integer 형으로 전환
        List<Integer> nList = Arrays.stream(nInputValues)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> mList = Arrays.stream(mInputValues)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < m; i++) {
            int result = 0;
            int low = 0;
            int high = n - 1;
            int key = mList.get(i);

            while (low <= high) { // low가 high 보다 커질때 까지
                int mid = (high + low)/2;

                if (key < nList.get(mid)) {
                    high = mid - 1;
                }
                if (key > nList.get(mid)) {
                    low = mid + 1;
                }
                if (key == nList.get(mid)) {
                    result = 1;
                    break;
                }
            }

            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}