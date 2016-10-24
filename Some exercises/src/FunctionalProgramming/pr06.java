package FunctionalProgramming;

import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class pr06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>numbers = Arrays.asList(sc.nextLine().split("\\s+"))
                .stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());

        Integer divisor = Integer.valueOf(sc.nextLine());
        List <Integer> rezult  = new ArrayList<>();
        Predicate<Integer> isDividable = x -> x % divisor == 0;
        for (Integer number : numbers) {
            if (!isDividable.test(number)){
                rezult.add(number);
            }
        }

        Collections.reverse(rezult);

        for (Integer el : rezult) {
            System.out.printf("%s " ,el);
        }
    }
}