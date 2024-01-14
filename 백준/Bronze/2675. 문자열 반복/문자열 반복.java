import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        int currentCount = 0;
        while(currentCount < testCount){
            int R = sc.nextInt();
            String S = sc.next();
            StringBuffer P = new StringBuffer();

            for(int i=0; i<S.length(); i++){
                for(int j=0; j<R; j++){
                    P.append(S.charAt(i));
                }
            }
            System.out.print(P + "\n");
            currentCount++;
        }
    }
}