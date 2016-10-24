package StringsRegex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();



        while (!input.equals("end")){

            Pattern pattern = Pattern.compile("(\\b[A-Z][a-z]+ [A-Z][a-z]+\\b)");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()){
                System.out.println(matcher.group(0));
            }
            input = sc.nextLine();
        }
    }
}
