package StringsManual;


import java.util.Scanner;

public class pr06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        String keyWord = sc.nextLine();
        int keyWordLenght = keyWord.length();
        int counter = 0;

        for (int i = 0; i <= input.length() - keyWordLenght; i++) {
           String match = input.substring(i, i + keyWordLenght);
            if (match.equals(keyWord)){
                counter++;
            }

        }
        System.out.println(counter);


    }
}
