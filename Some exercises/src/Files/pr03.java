package Files;

import java.io.*;
import java.util.HashMap;

public class pr03 {
    public static void main(String[] args) throws IOException {

        String wordsPath = "res\\words.txt";
        String textPath = "res\\text.txt";
        String destinationPath = "res\\output3.txt";

        try (BufferedReader wordReader = new BufferedReader(new FileReader(new File(wordsPath)));
             BufferedReader textReader = new BufferedReader(new FileReader(new File(textPath)));
             BufferedWriter writer = new BufferedWriter(new FileWriter(new File(destinationPath)))) {
            while (true) {
                String input = wordReader.readLine();
                if (input == null) {
                    break;
                }

                String[] words = input.toLowerCase().split("\\s+");
                HashMap<String, Integer> wordsCount = new HashMap<>();
                for (String word : words) {
                    if (!wordsCount.containsKey(word)) {
                        wordsCount.put(word, 0);
                    }
                }

                while (true) {
                    String textInput = textReader.readLine();
                    if (textInput == null) {
                        break;
                    }
                    String[] textWords = textInput.toLowerCase().split("\\W+");
                    for (String textWord : textWords) {
                        if (wordsCount.containsKey(textWord)) {
                            wordsCount.put(textWord, wordsCount.get(textWord) + 1);
                        }
                    }
                }

                wordsCount.entrySet().stream().sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                        .forEach(e -> {
                            try {
                                writer.write(String.format("%s - %d%n", e.getKey(), e.getValue()));

                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }

                        });
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}