import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(1 <= n && n <= 1000){
            System.out.print(n +" is "+ ((n%2)==1 ? "odd" : "even"));
        }
    }
}