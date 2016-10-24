package Queues;



import java.util.*;

public class pr05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        sc.nextLine();
        Queue<Long> queue = new ArrayDeque<>();
        queue.add(n);

        for (int i = 0; i < 50 ; i++) {
            long headQueue = queue.poll();
            if(i < 49) {
                System.out.printf("%d ", headQueue);
            }
            if(i == 49){
                System.out.printf("%d", headQueue);
            }

            queue.add(headQueue + 1);
            queue.add(2*headQueue + 1);
            queue.add(headQueue + 2);
        }















    }
}
