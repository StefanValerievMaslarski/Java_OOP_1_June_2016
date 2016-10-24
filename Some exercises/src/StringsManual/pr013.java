package StringsManual;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class pr013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        boolean condition = true;
        if (firstWord.length() == secondWord.length()) {
            Map<Character, Character> encodingOfLetters = new HashMap<>();
            for (int i = 0; i < firstWord.length(); i++) {
                if (encodingOfLetters.containsKey(firstWord.charAt(i))
                        && !encodingOfLetters.get(firstWord.charAt(i)).equals(secondWord.charAt(i))) {
                    condition = false;
                } else if (!encodingOfLetters.containsKey(firstWord.charAt(i))) {
                    encodingOfLetters.put(firstWord.charAt(i),secondWord.charAt(i));
                }
            }
        } else {
            System.out.println("Words must be of the same length.");
        }
        System.out.println(condition);
    }
}
