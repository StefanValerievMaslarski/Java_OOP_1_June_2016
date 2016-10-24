package StringsRegex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr08 {
    public static void main(String[] args) {
        String regex = "<a[^>]+href\\s*=\\s*(?:\"([^\"]*)\"|'([^']*)'|([^\\s>]*))[^>]*>";
        StringBuilder builder = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        while (!line.equals("END")){

            builder.append(line);
            line = sc.nextLine();

        }

        String text = builder.toString();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            if (matcher.group(1) != null){
                System.out.println(matcher.group(1));
            } else if (matcher.group(2) != null){
                System.out.println(matcher.group(2));
            } else if (matcher.group(3) != null){
                System.out.println(matcher.group(3));
            }
        }

    }
}
