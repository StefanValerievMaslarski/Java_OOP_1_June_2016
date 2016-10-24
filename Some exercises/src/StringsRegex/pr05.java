package StringsRegex;



import java.io.IOException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class pr05 {
    public static void main(String[] args) throws IOException {

        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String regex = "((?:(?<=\\s)|^)([a-z1-9]+[\\-\\._]?[a-z1-9]+)@(?:[a-z]+[\\-]?[a-z]+)(:?\\.[a-z]+[\\-]?[a-z]+)+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group(1));
        }
    }
}

