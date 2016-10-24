package Maps;

import java.util.*;

public class pr05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        String input = sc.nextLine();
        //filling the map
        while (!input.equals("search")) {
            String[] splitted = input.split("-");
            String name = splitted[0];
            String phoneNumber = splitted[1];
            map.put(name, phoneNumber);
            input = sc.nextLine();

        }

        // printing containing contacts
        while (!input.equals("stop")) {

            input = sc.nextLine();
            if (input.equals("stop")){
                break;
            }

            if (map.containsKey(input)) {

                System.out.printf("%s -> %s%n", input, map.get(input));



            } else {
                System.out.printf("Contact %s does not exist.%n", input);

            }

        }
//        System.out.println(map);


    }
}
