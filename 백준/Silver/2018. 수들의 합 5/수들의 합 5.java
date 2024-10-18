import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=1;
        int sum=1;
        int frontPoint = 1;
        int backPoint = 1;
        while(frontPoint<N){
            if(sum<N){
                frontPoint++;
                sum+=frontPoint;
            }else if(sum>N){
                sum-=backPoint;
                backPoint++;
            }else if(N==sum){
                count++;
                frontPoint++;
                sum+=frontPoint;
            }
        }
        System.out.print(count);
    }
}