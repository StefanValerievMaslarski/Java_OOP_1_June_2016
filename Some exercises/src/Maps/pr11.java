package Maps;



//
//
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class pr11 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        String ipAddress = "";
//        String user = "";
//        Integer duration = 0;
//        TreeMap<String, TreeMap<String, Integer>> map = new TreeMap<>();
//
//        int firstDuration = 0;
//        int totalUserDuration = 0;
//        int currentDuration = 0;
//
//
//        for (int i = 0; i < n; i++) {
//            String input = sc.nextLine();
//            String[] splittedInput = input.split("\\s+");
//            ipAddress = splittedInput[0];
//            user = splittedInput[1];
//            duration = Integer.parseInt(splittedInput[2]);
//            if (!map.containsKey(user)) {
//                map.put(user, new TreeMap<>());
//                map.get(user).put(ipAddress, duration);
//                firstDuration = duration;
//
//            } else {
//                // user exists
//                TreeMap<String, Integer> helpMap = map.get(user);
//                if (!helpMap.containsKey(ipAddress)){
//                    currentDuration = firstDuration + duration;
//                    map.get(user).put(ipAddress, duration);
//                } else {
//                    map.get(user).get(ipAddress). duration);
//                }
//
//                currentDuration = map.get(user).get(ipAddress);
//
////                currentDuration = helpMap.get(ipAddress);
//                int newDuration = currentDuration + duration;
//                map.get(user).put(ipAddress, newDuration);
//
//            }
//        }
//        System.out.println(map);
//    }
//}
