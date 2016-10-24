package StringsManual;

import java.util.Scanner;

public  class pr04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        Integer convertBase = Integer.parseInt(input[0]);
        if ((convertBase < 2) || (convertBase > 10)){
            return;
        }

//        String convertBase = input[0];
        Long numberInDecimal = Long.parseLong(input[1]);
        String numberDecimal = numberInDecimal.toString();


        String newNumber = Long.toString(numberInDecimal, convertBase);
        System.out.println(newNumber);
    }
}