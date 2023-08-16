import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (1<= str.length() && str.length()<=20){
            for(int i = 0; i < str.length(); i++){
                if(65 <= (int)str.charAt(i) && (int)str.charAt(i) <= 90){
                    System.out.print(Character.toLowerCase(str.charAt(i)));
                } else if(97 <= (int)str.charAt(i) && (int)str.charAt(i) <= 122){
                    System.out.print(Character.toUpperCase(str.charAt(i)));
                } else{
                    System.out.println("알파벳만 입력하세요");
                }
            }
        }
    }
}