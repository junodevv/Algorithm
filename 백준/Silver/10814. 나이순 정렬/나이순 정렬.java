import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Member> members = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            members.add(new Member(sc.nextInt(), sc.next()));
        }
        Collections.sort(members);
        for (Member member : members) {
            System.out.println(member.getAge() + " " + member.getName());
        }

    }

    static class Member implements Comparable<Member> {
        private int age;
        private String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Member o) {
            return this.age - o.age;
        }
    }
}
