package Sets;


import java.util.HashSet;
import java.util.Scanner;

public class pr02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            set2.add(sc.nextInt());
        }
        set1.retainAll(set2);
//        System.out.println(set1);
        for (Integer elem : set1) {
            System.out.printf("%d ", elem);
        }

    }
}
