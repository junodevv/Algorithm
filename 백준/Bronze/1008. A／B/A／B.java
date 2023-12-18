import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String AB = sc.nextLine();
        double A = AB.charAt(0)-48;
        double B = AB.charAt(2)-48;
        double result = A/B;
        System.out.printf("%.9f",result);
    }
}