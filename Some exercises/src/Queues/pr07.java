package Queues;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class pr07 {
    public static boolean isPair(char c1, char c2) {
        if (((c1 == '{') && (c2 == '}')) || ((c1 == '[') && (c2 == ']')) ||
                ((c1 == '(') && (c2 == ')'))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {



//        Deque<Character> queue = new ArrayDeque<>();
        Stack<Character> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

//        if (input.length > 1001){
//            return;
//        }
//
//        for (int i = 0; i < input.length; i++) {
//            if ((input[i] != '{')||(input[i] != '}')||(input[i] != '[')||
//            (input[i] != ']')||(input[i] != '(')||(input[i] != '0')){
//                return;
//            }
//        }


        boolean isBalanced = true;


        for (int i = 0; i < input.length(); i++) {
            if (input.startsWith(")")|| input.startsWith("]")||
            input.startsWith("}")){
                System.out.println("NO");
                return;
            }
            if ((input.charAt(i) == '{') || (input.charAt(i) == '[') ||
                    (input.charAt(i) == '(')) {
                stack.push(input.charAt(i));
            } else if ((input.charAt(i) == '}') || (input.charAt(i) == ']') ||
                    (input.charAt(i) == ')')) {
                if ((stack.isEmpty()) || (!isPair(stack.peek(), input.charAt(i)))) {
                    isBalanced = false;
                    break;
                } else {

                    stack.pop();
                }
            }
        }

//        System.out.println(stack.isEmpty()? true:false);
        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}













