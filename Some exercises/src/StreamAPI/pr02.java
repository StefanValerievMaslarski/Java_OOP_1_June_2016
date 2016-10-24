package StreamAPI;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class pr02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        List<String> names = new ArrayList<>();

        while (!(line = br.readLine()).equals("END")) {
            names.add(line);
        }


        names.stream().filter(student -> {
            String[] input = student.split(" ");
            String firstName = input[0];
            String lastName = input[1];
            return firstName.compareTo(lastName) < 0;
        }).forEach(System.out::println);
    }
}

