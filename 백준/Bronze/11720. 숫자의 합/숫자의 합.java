import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String numbers = sc.nextLine();
        int result = 0;

        for(int i=0; i<count; i++){
            int number = Character.getNumericValue(numbers.charAt(i));
            result += number;
        }
        System.out.println(result);
    }
}