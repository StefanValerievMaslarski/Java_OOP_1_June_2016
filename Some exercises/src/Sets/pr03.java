package Sets;


import java.util.Scanner;
import java.util.TreeSet;

public class pr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String[] splitted = str.trim().split("\\s+");
            for (int j = 0; j < splitted.length; j++) {
                set.add(splitted[j]);
            }
        }

        for (String el : set) {
            System.out.printf("%s " , el);
        }
    }
}
