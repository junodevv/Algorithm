import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int multiple = A * B * C;
        String multipleStr = String.valueOf(multiple);
        int[] numberCount = new int[10];
        for (int i = 0; i < multipleStr.length(); i++) {
            int idx = Character.getNumericValue(multipleStr.charAt(i));
            numberCount[idx]++;
        }
        for (int i : numberCount) {
            System.out.println(i);
        }
    }
}