package Sets;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class pr01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();

        LinkedHashSet<String> names = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        for (String name : names) {
            sb.append(name + "\n");


        }
        System.out.println(sb);

    }
}
