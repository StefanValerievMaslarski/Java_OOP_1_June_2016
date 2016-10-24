
package StreamAPI;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class pr03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        Map<String, Integer> names = new LinkedHashMap<>();

        while (!(line = br.readLine()).equals("END")) {
           String[] input = line.split("[\\s]+");
            String name = input[0] +" "+ input[1];
            Integer age  = Integer.valueOf(input[2]);
            names.put(name,age);
        }


        names.entrySet().stream()
                .filter(entry -> entry.getValue() >=18 && entry.getValue() <= 24)
                .forEach(x -> System.out.printf("%s %d%n", x.getKey(), x.getValue()));

//        for (Map.Entry<String, Integer> entry : names.entrySet()) {
//            System.out.println(String.format("%s %d", entry.getKey(), entry.getValue()));
//
//        }
    }
}

