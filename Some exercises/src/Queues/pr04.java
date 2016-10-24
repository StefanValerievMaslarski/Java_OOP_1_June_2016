package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class pr04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elToInput = sc.nextInt();
        int elToPoll = sc.nextInt();
        int elToCheck = sc.nextInt();
        sc.nextLine();

        Queue<Integer> queue = new ArrayDeque<>();

        //add el to queue
        for (int i = 0; i < elToInput; i++) {
            queue.add(sc.nextInt());
        }



        //poll element from stack
        for (int i = 0; i < elToPoll; i++) {
            queue.poll();
        }
//        System.out.println(queue);

        // isElThere
        if (queue.isEmpty() ){
            System.out.println("0");
            return;
        }

        if (queue.contains(elToCheck)) {
            System.out.println(true);

        }
        else {
            // print the smallest element in the stack
            int minEl = Integer.MAX_VALUE;
            for (Integer element : queue) {
                if (element < minEl){
                    minEl  =  element;
                }
            }
            System.out.println(minEl);
        }


    }
}