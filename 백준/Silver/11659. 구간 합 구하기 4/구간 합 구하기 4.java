import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] S = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        int temp;
        for (int i = 0; i < N; i++) {
            temp = Integer.parseInt(st.nextToken());
            if (i == 0) {
                S[i] = temp;
                continue;
            }
            S[i] = S[i - 1] + temp;
        }

        int i, j, result;
        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            if (i < 2) {
                result = S[j - 1];
            } else {
                result = S[j - 1] - S[i - 2];
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}