import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        if(1 <= str.length() && str.length() <= 10 && 1<=n && n <=5){
            System.out.print(str.repeat(n));
        }
    }
}