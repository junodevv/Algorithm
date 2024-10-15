import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int max = 0;
        for(int i=0; i<N; i++){
            int now = sc.nextInt();
            sum+=now;
            if(now > max){
                max = now;
            }
        }
        // 100.0 곱해서 자동 형변환(double)
        System.out.print(sum*100.0/max/N);
        
    }
}