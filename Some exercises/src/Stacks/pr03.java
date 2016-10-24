package Stacks;


import java.util.Scanner;
import java.util.Stack;

public class pr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commandCount = sc.nextInt();
        sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < commandCount; i++) {
            int command = sc.nextInt();
            if (command == 1) {
                int temp = sc.nextInt();
                stack.push(temp);
                if (temp > max) {
                    max = temp;
                    maxStack.push(max);
                }

                } else if (command == 2) {
                    int temp = stack.pop();
                    if (temp == max) {
                        maxStack.pop();
                        if (maxStack.empty()) {
                            max = Integer.MIN_VALUE;
                        } else {
                            max = maxStack.peek();
                        }
                    }
                } else {
                    System.out.println(max);
                }

            }

        }


    }
