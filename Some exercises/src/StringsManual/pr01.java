package StringsManual;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class pr01 {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
        //burzo chetene ot konzolata
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringBuilder output = new StringBuilder();

        for (int i = input.length() - 1; i >= 0 ; i--) {
            output.append(input.charAt(i));
        }

        System.out.println(output);


//        for (int i = sb.length() - 1; i >= 0; i--) {
//            sb.append(br.read());
//        }


    }
}
