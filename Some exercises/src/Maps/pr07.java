package Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pr07 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Map<String, String> map = new LinkedHashMap<>();
            String input = sc.nextLine();
            while (!input.equals("stop")) {
                String name = input;
                String mail = sc.nextLine();
                Pattern pattern = Pattern.compile("[a-z]+@[a-z]+.uk|[a-z]+@[a-z]+.us");
                Matcher matcher = pattern.matcher(mail);
                if (matcher.find()) {
                    input = sc.nextLine();
                    continue;

                } else {
                    map.put(name, mail);
                }
                input = sc.nextLine();
//        System.out.println(map);

            }

            for (Map.Entry<String, String > entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());

            }

        }

}
