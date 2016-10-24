package StringsManual;

import java.util.Scanner;

public  class pr05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        Integer base = Integer.parseInt(input[0]);
        if ((base < 2) || (base > 10)){
            return;
        }


        System.out.println(Long.parseLong(input[1], Integer.parseInt(input[0])));
    }
}