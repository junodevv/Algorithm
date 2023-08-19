import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if(1 <= str1.length() && str2.length() <= 10){
            System.out.print(str1+str2);
        }
    }
}