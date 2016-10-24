package FunctionalProgramming;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class pr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splittedInput = input.split("\\s+");

        int[] numbers = Arrays.stream(splittedInput).mapToInt(Integer::parseInt).toArray();



        Function<int[], Integer > minNumber = number -> {
            Integer min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            return  min;
        };

        System.out.println(minNumber.apply(numbers));




    }


}