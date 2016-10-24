package StreamAPI;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class pr01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        List<String> fullName = new ArrayList<>();
        while (!line.equals("END")){
            String[] tokens = line.split(" ");
            String firstName = tokens[0];
            String secondName = tokens[1];
            Integer group = Integer.valueOf(tokens[2]);
            if (group == 2){
                String fullNameStudent = firstName + " "+ secondName;
                fullName.add(fullNameStudent);

            }

            line = br.readLine();

        }

        fullName.stream().sorted().forEach(System.out::println);
    }
}
