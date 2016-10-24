package StringsManual;


import java.util.Scanner;

public class pr010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] input = sc.nextLine().toCharArray();

        for (char ch :
                input) {
            System.out.printf("%s", toUnicode(ch));
        }
    }

    private static String toUnicode(char ch) {
        return String.format("\\u%04x", (int) ch);
    }
}