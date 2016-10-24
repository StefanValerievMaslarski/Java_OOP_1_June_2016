package StringsManual;


import java.util.Scanner;

public class pr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        String[] nums = input.split("\\s+");
        int a = Integer.parseInt(nums[0]);
        double b = Double.parseDouble(nums[1]);
        double c = Double.parseDouble(nums[2]);






        String binary = Integer.toBinaryString(a);

        int binaryLenght = binary.length();
        if (binary.length() > 10){
            binary = binary.substring(0,11);
        }
        StringBuilder sb = new StringBuilder();
        int numberOfZeroes = 10 - binaryLenght;

        for (int i = 0; i < numberOfZeroes; i++) {
            sb.append("0");
        }
        sb = sb.append(binary);


        String hex = Integer.toHexString(a);


        if (sb.length() != 0){
            System.out.printf(String.format("|%-10s|%10s|%10.2f|%-10.3f|", hex.toUpperCase(), sb, b, c));
        }

    }
}





