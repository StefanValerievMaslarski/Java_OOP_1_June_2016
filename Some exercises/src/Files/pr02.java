package Files;

import java.io.*;

public class pr02 {
    public static void main(String[] args) throws IOException {

        String source = "res\\input.txt";
        String destination = "res\\output2.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(new File(source)));
             BufferedWriter writer = new BufferedWriter(new FileWriter(new File(destination)))) {
            int count = 1;

            while (true) {
                String input = reader.readLine();
                if (input == null) {
                    break;
                }
                else  {
                    writer.write(count + ". " + input);
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