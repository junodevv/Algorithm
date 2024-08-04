import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<String> inputValues = new HashSet<>();
        for (int i = 0; i < N; i++) {
            inputValues.add(br.readLine());
        }
        inputValues.stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (o1.length() != o2.length()) {
                            return o1.length() - o2.length();
                        }
                        return o1.compareTo(o2);
                    }
                })
                .forEach(s -> {
                    try {
                        bw.write(s+"\n");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        bw.flush();
        bw.close();
    }
}
