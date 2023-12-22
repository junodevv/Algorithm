import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<StringBuffer> stars = new ArrayList<>();
        
        int input = sc.nextInt();
        for(int i=0; i<input; i++){
            StringBuffer star = new StringBuffer();
            for(int j=0; j<input-i-1; j++){
                star.append(" ");
            }
            for(int z=0; z<i+1;z++){
                star.append("*");
            }
            stars.add(star);
        }
        for(StringBuffer star : stars){
            System.out.println(star);
        }
    }
}