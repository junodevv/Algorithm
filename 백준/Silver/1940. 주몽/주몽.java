import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int[] ingredients = new int[N];
        for(int i=0; i<N; i++){
            ingredients[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ingredients);
        int front = 0;
        int back = N-1;
        int sum;
        int count = 0;
        while(front < back){
            sum = ingredients[front] + ingredients[back];
            if(sum<M){
                front++;
            }else if(sum>M){
                back--;
            }else{
                front++;
                back--;
                count++;
            }
        }
        System.out.print(count);
    }
}