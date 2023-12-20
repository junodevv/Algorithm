import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words;
        words = input.split(" ");
        System.out.print(result(words));
    }
    public static int result(String[] words){
        int result = words.length;
        if(words.length==0){
            return result;
        }
        if(words[0].equals("")){
            return result -1;
        }
        return result;
    }
}