package StringsRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr02 {
    public static void main(String[] args) {
        String regex = "(\\+359( )2( )\\d{3}( )\\d{4}\\b)|(\\++359(-)2(-)\\d{3}(-)\\d{4}\\b)";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("end")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                System.out.println(matcher.group(0));
            }



            input = sc.nextLine();
        }
    }
}
