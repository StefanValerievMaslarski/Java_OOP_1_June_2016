package Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Stefan Maslarski
 * @see java.util.Scanner;
 * Created by user1 on 17.5.2016 г..
 */
public class pr02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elToInput = sc.nextInt();
        int elToPop = sc.nextInt();
        int elToCheck = sc.nextInt();
        sc.nextLine();

        Stack<Integer> stack = new Stack<>();

        //push el to stack
        for (int i = 0; i < elToInput; i++) {
            stack.push(sc.nextInt());
        }


        //pop element from stack
        for (int i = 0; i < elToPop; i++) {
            stack.pop();
        }

        // isElThere
        if (stack.empty() == true){
            System.out.println("0");
            return;
        }


        if (stack.contains(elToCheck)) {
            System.out.println(true);

        }
        else {
            // print the smallest element in the stack
            int minEl = Integer.MAX_VALUE;
            for (Integer element : stack) {
                if (element < minEl){
                    minEl  =  element;
                }
            }
            System.out.println(minEl);
        }


    }
}