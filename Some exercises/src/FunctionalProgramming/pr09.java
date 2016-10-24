//package FunctionalProgramming;
//
//
//import java.util.*;
//import java.util.List;
//import java.util.Scanner;
//import java.util.function.Predicate;
//
//public class pr09 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<String> names = Arrays.asList(sc.nextLine().split("\\s+"));
//
//        String input = sc.nextLine();
//        while (!input.equals("Party")){
//            String[] tokens = input.split("\\s+");
//            String command = tokens[0];
//            String modifier = tokens[1];
//            String variable = tokens[2];
//            Predicate<String> tester = buildPredicate(modifier, variable);
//            if (command.equals("Remove")){
//                names = processRemoveCommand(names, tester);
//
//            } else if (command.equals("Double")){
//                names = processDoubleCommand(names, tester);
//            }
//        }
//        if (names.size() == 0) {
//            System.out.println("Nobody is going to the party!");
//        } else {
//            String result = String.join("," , names);
//            System.out.println(result + "are going to the party!");
//
//        }
//    }
//    }
//
//    private static List<String> processDoubleCommand(List<String> names, Predicate<String> tester) {
//        List<String> rezult = new ArrayList<>();
//        for (String name: names){
//            if (! tester.test(name)){
//                rezult.add(name);
//            }
//
//
//
//        }
//
//    private static List<String> processRemoveCommand(List<String> names, Predicate<String> tester) {
//
//        List<String> rezult = new ArrayList<>();
//        for (String name: names){
//            if (! tester.test(name)){
//                rezult.add(name);
//            }
//
//
//        }
//        return rezult;
//    }
//
//    private static Predicate<String> buildPredicate(String modifier, String variable) {
//
//        switch (modifier){
//            case "StartsWith":
//                return name -> name.startsWith(variable);
//            case "EndsWith":
//                return name -> name.endsWith(variable);
//            case "Lenght":
//                return name -> name.length() == Integer.parseInt(variable);
//            default:
//                return null;
//        }
//    }
//}
