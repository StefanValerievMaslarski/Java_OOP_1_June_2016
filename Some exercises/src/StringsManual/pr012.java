package StringsManual;

import java.util.Scanner;
import java.util.StringJoiner;

public class pr012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        String firstString = input[0];
        String secondString = input[1];
        long sum = 0;

        if ((firstString.length() == 0) || (firstString.length() == 0)){
            sum = 0;
        }



        if (firstString.length() == secondString.length()) {
            for (int i = 0; i < firstString.toCharArray().length; i++) {
                sum += (int) firstString.charAt(i) * secondString.charAt(i);
            }

        } else {
            // different size of strings

//first String is shorter
            if (firstString.length() < secondString.length()){
                for (int i = 0; i < firstString.length(); i++) {
                    sum += (int) firstString.charAt(i) * secondString.charAt(i);
                }

                secondString = secondString.substring(firstString.length(), secondString.length());
                for (int i = 0; i < secondString.length(); i++) {
                    sum += (int) secondString.charAt(i);
                }

            } else {//second String is shorter

                for (int i = 0; i < secondString.length(); i++) {
                    sum += (int) firstString.charAt(i) * secondString.charAt(i);

                }

                firstString = firstString.substring(secondString.length(), firstString.length());
                for (int i = 0; i < firstString.length(); i++) {
                    sum += (int) secondString.charAt(i);
                }

            }

        }

        System.out.println(sum);
    }
}

