package Maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class pr06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        String input = sc.nextLine();
        while (!input.equals("stop")) {
            String resource = input;
            Integer quantity = Integer.valueOf(sc.nextLine());
            if (map.containsKey(resource)) {
                Integer oldQuantity = map.get(resource);
                Integer newQuantity = oldQuantity + quantity;
                map.put(resource, newQuantity);
            } else {
                map.put(resource, quantity);

            }
            input = sc.nextLine();
//        System.out.println(map);

        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }
}
