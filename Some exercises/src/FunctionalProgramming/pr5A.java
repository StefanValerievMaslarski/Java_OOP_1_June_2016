package FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class pr5A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(sc.nextLine().split("\\s+")).stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        Comparator<Integer> customComparator = (x1, x2) -> {
            if ((x1 % 2 == 0) && (x2 % 2 != 0)){
                return  -1;
            } else if (x1 % 2 == 0 && x2 % 2 != 0){
                return 1;
            } else {
                if (x1 < x2){
                    return -1;
                } else if (x1 > x2){
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        Collections.sort(numbers, customComparator);

        for (Integer number :
                numbers) {
            System.out.printf(number + " ");
        }
    }
}
