package FunctionalProgramming;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class pr04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split("\\s+");
        int lowerBounds = Integer.parseInt(numbers[0]);
        int upperBounds = Integer.parseInt(numbers[1]);
        int[] numbersArray = new int[upperBounds - lowerBounds + 1];


        numbersArray[0] = lowerBounds;
        for (int j = lowerBounds + 1; j < upperBounds + 1; j++) {
            numbersArray[j - lowerBounds] = j;
        }


        String oddOrEven = sc.nextLine();

        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isOdd = number -> number % 2 != 0;

        if (oddOrEven.equals("even")) {
            for (Integer el : numbersArray) {
                if (isEven.test(el)) {
                    System.out.printf("%s ", el);
                }
            }
        } else {
            for (Integer el : numbersArray) {

                if (isOdd.test(el)) {
                    System.out.printf("%s ", el);
                }
            }


        }


    }
}



