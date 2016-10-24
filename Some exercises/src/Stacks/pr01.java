package Stacks;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class pr01 {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
//        int[] num = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // secondWay
        String input = sc.nextLine();
        String[] splitted = input.split("\\s+");
        int[] numb = new int[splitted.length];


        for (int i = 0; i < splitted.length; i++) {
            numb[i] = Integer.parseInt(splitted[i]);
        }


        for (int i = 0; i < numb.length; i++) {
            myStack.push(numb[i]);
        }
        while (myStack.size() > 0) {
            System.out.printf("%d ", myStack.pop());
        }

    }
}
