import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int totalMinute = (h*60)+m;

        totalMinute = totalMinute<45 ? totalMinute+(24*60)-45 : totalMinute-45;
        
        System.out.print(totalMinute/60 + " " + totalMinute%60);
    }
}