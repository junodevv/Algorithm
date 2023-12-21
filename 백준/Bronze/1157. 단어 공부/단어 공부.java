import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> resultMap = new HashMap<>();
        String input = sc.nextLine();
        String inputUpperCase = input.toUpperCase();

        for (int i = 0; i < inputUpperCase.length(); i++) {
            Character c = inputUpperCase.charAt(i);
            if (!resultMap.containsKey(c)) {
                resultMap.put(c, 1);
            } else {
                int temp = resultMap.get(c);
                temp++;
                resultMap.replace(c, temp);
            }
        }

        int max = Collections.max(resultMap.values());
        int maxCount = 0;
        for (Integer i : resultMap.values()) {
            if (i == max) {
                maxCount++;
            }
        }

        if (maxCount == 1) {
            for (Character c : resultMap.keySet()) {
                if (resultMap.get(c) == max) {
                    System.out.print(c);
                }
            }
        } else {
            System.out.print("?");
        }
    }
}