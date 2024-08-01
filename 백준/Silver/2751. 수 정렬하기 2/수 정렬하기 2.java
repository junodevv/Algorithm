import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Integer> inputValues = new ArrayList<>();
        
        for(int i=0; i<N; i++){
            inputValues.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(inputValues);

        for(Integer i : inputValues){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}