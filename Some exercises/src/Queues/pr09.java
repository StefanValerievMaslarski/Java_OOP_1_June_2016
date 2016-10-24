package Queues;


import java.util.Scanner;
import java.util.Stack;

public class pr09 {
    public static void main(String[] args) {
        Stack<Long> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int elementToCalcFor = sc.nextInt();
        sc.nextLine();
//        if ((elementToCalcFor == 1)){
//            System.out.println("1");
//        }

        stack.push(1L);
        stack.push(1L);

        for (int i = 0; i <= elementToCalcFor - 2; i++) {

            long number1 = stack.pop();
            long number2 = stack.peek();
            long number3 = number1 + number2;
            stack.push(number1);
            stack.push(number3);
//            System.out.println(stack);
        }
        System.out.println(stack.peek());

    }
}
