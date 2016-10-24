//package Queues;
//
//import java.util.Scanner;
//import java.util.Stack;
//import java.util.*;
//
//
//public class pr10 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//
//        Stack<String> stackCommands = new Stack<>();
//        Stack<String> stackUndo1 = new Stack<>();
//        Stack<String> stackUndo2 = new Stack<>();
//
//        int numberOperations = sc.nextInt();
//        sc.nextLine();
//
//        String lastToAppend = "";
//        String lastAdded = "";
//
//        for (int i = 0; i < numberOperations; i++) {
//            String[] input = sc.nextLine().split("\\s+");
//            int command = Integer.parseInt(input[0]);
//
//
//            if (command == 1) {
//                //appends str to the end of the text
//                sb.append(input[1]);
//                lastToAppend = input[1];
//                stack.push("1");
//
//
//            } else if (command == 2) {
//                //erases the last count elements from the text
//                int count = Integer.parseInt(input[1]);
//                lastAdded = sb.toString().substring(sb.length() - count, sb.length());
//               sb =  new StringBuilder(sb.toString().substring(0, sb.length() - count)) ;
//
//
//                stack.push("2");
//
//            } else if (command == 3) {
//                //returns the element at position index from the text
////                if (!sb.toString().isEmpty()){
//                    int indexToShow = Integer.parseInt(input[1]);
//                    char symbol = sb.toString().charAt(indexToShow - 1);
//                    System.out.println(symbol);
////                }
////                else {
////                    System.out.println("Empty stringbuilder");
////                }
//
//
//            } else {
//                //undoes the last not undone command of type 1 / 2
//                // and returns the text to the state before that operation
//               if (stack.isEmpty()){
//                   continue;
//               }
//                String lastCommand = stack.pop();
//                if (lastCommand.equals("1")){
//                    // undo 1
//
//                    String sbToString = sb.toString();
//
//                    int index = sbToString.indexOf(lastToAppend, 0);
//                    sb = new StringBuilder(sb.toString().substring(0, index));
//                } else {
//                    // undo 2
//                   sb.append(lastAdded);
//
//                }
//
//            }
//
//        }
//
//    }
//}
