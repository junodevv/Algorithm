import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= input; i++) {
            q.add(i);
        }
        while (q.size() != 1) {
            q.poll();
            q.add(q.poll());
        }

        System.out.print(q.peek());
    }
}