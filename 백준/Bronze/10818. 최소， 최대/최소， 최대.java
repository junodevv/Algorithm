import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Integer> inputValues = new ArrayList<>();
        for(int i=0; i<count; i++){
            inputValues.add(sc.nextInt());
        }
        inputValues.sort(Comparator.naturalOrder());
        System.out.print(inputValues.get(0)+" "+inputValues.get(count-1));
    }
}