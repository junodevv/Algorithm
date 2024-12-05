import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] inputs = new int[N];
        for(int i=0; i<N; i++){
            inputs[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
                if(inputs[j]>inputs[j+1]){
                    int temp = inputs[j];
                    inputs[j] = inputs[j+1];
                    inputs[j+1] = temp;
                }
            }
        }
        
        for(int i=0; i<N; i++){
            result.append(inputs[i]).append("\n");
        }
        System.out.print(result);
    }
}