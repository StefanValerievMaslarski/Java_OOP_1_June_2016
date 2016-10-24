package StringsManual;


import java.util.Scanner;

public class pr015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = sc.nextLine();

        int firstIndex = 0;
        int lastIndex = 0;

        while ((input.length() >= 0) && (pattern.length() >= 0)){

            firstIndex = input.indexOf(pattern);
            lastIndex = input.lastIndexOf(pattern);

            if ((firstIndex != -1) && (lastIndex != -1)){

                String firstPart = input.substring(0, firstIndex);
                String secondPart = input.substring(firstIndex + pattern.length(), lastIndex);
                String thirdPart = input.substring(lastIndex + pattern.length(), input.length());
                input = firstPart + secondPart + thirdPart;
                int indexToRemove = pattern.length()/2;
                StringBuilder sb = new StringBuilder(pattern);
                sb = sb.deleteCharAt(indexToRemove);
                pattern = sb.toString();
                System.out.println("Shaked it.");

            } else {
                System.out.println("No shake.");
                System.out.println(input);
                break;
            }

        }



    }
}