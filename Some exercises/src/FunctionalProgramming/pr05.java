package FunctionalProgramming;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class pr05 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split("\\s+");
        long[] numbers = Arrays.stream(nums).mapToLong(Integer::parseInt).toArray();

//        """add" -> add 1; "multiply" -> multiply by 2; "subtract" -> subtract 1"" +
        String command = sc.nextLine();

        Function<Long, Long> add = number -> number + 1;
        Function<Long, Long> multiply = number -> number * 2;
        Function<Long, Long> subtract = number -> number - 1;



        while (!command.equals("end")){

            if (command.equals("add")){

                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = add.apply(numbers[i]);
                }
            }  else if (command.equals("multiply")){
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = multiply.apply(numbers[i]);
                }

            } else if (command.equals("subtract")){
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = subtract.apply(numbers[i]);
                }

            } else if (command.equals("print")){
                for (int i = 0; i < numbers.length; i++) {
                    System.out.printf("%s ", numbers[i]);
                }

            }


            command = sc.nextLine();
        }





    }
}
