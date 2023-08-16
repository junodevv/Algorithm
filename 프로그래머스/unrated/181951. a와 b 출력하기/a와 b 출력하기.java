import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(-100000<=a && b<=100000){
            System.out.print("a = " + a + "\n" +"b = " + b );
        }
    }
}