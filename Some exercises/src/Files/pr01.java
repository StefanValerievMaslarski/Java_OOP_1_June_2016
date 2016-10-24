package Files;

import java.io.*;

public class pr01 {
    public static void main(String[] args) throws IOException {

        String source = "res\\input.txt";
        String destination = "res\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(source)));
             BufferedWriter writer = new BufferedWriter(new FileWriter(new File(destination)))) {
            int count = 0;
            while (true) {
                String input = reader.readLine();
                if (input == null) {
                    break;
                }
                if (count % 2 != 0) {
                    writer.write(input);
                    writer.newLine();
                }
                count++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}