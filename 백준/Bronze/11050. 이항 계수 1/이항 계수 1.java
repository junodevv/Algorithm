import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, K; // 5 2
        int[][] D;
        
        N = sc.nextInt();
        K = sc.nextInt();
        D = new int[N+1][N+1];
        // 초기화
        for(int i=0; i<=N; i++){
            D[i][i]=1; // i개 중 i개 선택할 확률 = 1
            D[i][0]=1; // i개 중 0개 선택할 확률 = 1
            D[i][1]=i; // i개 주 1개 선택할 확률 = i
        }
        // 점화식을 이용해 나머지 채우기
        for(int i=3; i<=N; i++){
            for(int j=2; j<=N; j++){
                D[i][j] = D[i-1][j-1]+D[i-1][j];
            }
        }
        System.out.print(D[N][K]);
    }
}