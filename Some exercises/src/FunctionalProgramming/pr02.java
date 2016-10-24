package FunctionalProgramming;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class pr02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] names = input.split("\\s+");
        Consumer<String> print = name -> {
            name = "Sir " + name;
            System.out.printf("%s%n", name);
        };

        Arrays.stream(names).forEach(print);
    }


}
