import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int now;
        int tempFirst = first;
        int tempSecond = second;
        
        do{
            now = tempFirst%tempSecond;
            tempFirst=tempSecond;
            tempSecond=now;
        }while(now != 0);
        
        int GCD = tempFirst;
        int LCM = (first*second)/GCD;
        
        System.out.println(GCD);
        System.out.println(LCM);
    }
}