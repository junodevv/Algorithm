import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int now = 665;
        String result = null;
        
        while (count < N) {
            result = String.valueOf(++now);
            if (result.contains("666")) {
                count++;
            }
        }
        System.out.println(result);
    }
}