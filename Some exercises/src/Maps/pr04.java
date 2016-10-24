package Maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class pr04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int val = 0 ;

        TreeMap<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            if(!map.containsKey(input.charAt(i))){
                map.put(input.charAt(i), 1);
            } else {
                val = map.get(input.charAt(i)) + 1;
                map.put(input.charAt(i), val);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.printf("%s: %s time/s \n", entry.getKey(), entry.getValue());
        }

    }
}
