package StringsManual;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class pr02 {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();


        if (input.length >= 21){
            for (int i = 0; i < 20; i++) {
                sb.append(input[i]);
//                sb.toString().substring(0, 19);
            }
        }
        else {
            for (int i = 0; i < input.length; i++) {
                sb.append(input[i]);
            }
            for (int i = input.length; i < 20; i++) {
                sb.append("*");
            }
        }
        System.out.println(sb.toString());
    }
}