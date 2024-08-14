import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> inputValues = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            inputValues.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(inputValues); // 정렬
        int sum = 0;
        for (Integer i : inputValues) {
            sum += i;
            map.put(i, map.getOrDefault(i, 1) + 1);
        }
        // 평균
        int average = Math.round((float) sum / inputValues.size());
        // 중앙값
        int centerValue = inputValues.get((inputValues.size() - 1) / 2);
        // 최빈값
        int modeCount = map.values().stream().max(Comparator.naturalOrder()).get();
        List<Entry<Integer, Integer>> modeList = map.entrySet().stream()
                .filter(e -> e.getValue() == modeCount)
                .sorted(
                        new Comparator<Entry<Integer, Integer>>() {
                            @Override
                            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                                return o1.getKey() - o2.getKey();
                            }
                        }
                )
                .collect(Collectors.toList());
        int mode = modeList.get(0).getKey();
        if (modeList.size() > 1) {
            mode = modeList.get(1).getKey();
        }
        // 범위
        int scope = inputValues.get(inputValues.size() - 1) - inputValues.get(0);
        bw.write(average + "\n" + centerValue + "\n" + mode + "\n" + scope);
        bw.flush();
        bw.close();
    }
}
