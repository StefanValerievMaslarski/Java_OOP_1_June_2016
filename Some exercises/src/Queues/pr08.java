package Queues;


import java.math.BigInteger;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class pr08 {
    public static Integer getFibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    static Map<Integer, BigInteger> memo = new TreeMap<Integer, BigInteger>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        if (number > 49) {
            return;
        }
//        System.out.println(getFibonacci(number));
        System.out.println(memorizedFibonacci(number));
    }
    static BigInteger memorizedFibonacci(int n){
        if (n <= 1) return BigInteger.ONE;
        if (memo.get(n) == null){
            memo.put(n, memorizedFibonacci(n- 1).add(memorizedFibonacci(n -2)));

        }
        return memo.get(n);
    }
}
