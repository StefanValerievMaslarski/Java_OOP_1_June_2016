package Maps;


import java.util.*;

public class pr09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int oldValueforIP = 0;
        int oldCount = 0;
        int countOfUser = 0;

        TreeMap<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();

        while (!input.equals("end")) {
            String[] splittedInput = input.split("\\s+");
            String iPAddress = splittedInput[0].substring(3, splittedInput[0].length());
            String message = splittedInput[1].substring(8, splittedInput[1].length());
            String user = splittedInput[2].substring(5, splittedInput[2].length());
            if (!map.containsKey(user)) {
                countOfUser++;
                map.put(user, new LinkedHashMap<>());
                if (!map.get(user).containsKey(iPAddress)) {
                    map.get(user).put(iPAddress, 1);
                    oldValueforIP = 1;
                }

            } else {

                if (!map.get(user).containsKey(iPAddress)) {
                    map.get(user).put(iPAddress, 1);

                } else {
                    oldCount = map.get(user).get(iPAddress);
                    map.get(user).put(iPAddress, oldCount + 1);
                }
            }

            input = sc.nextLine();
        }
//        System.out.println(map);
        String ip = "";
        int number = 0;
        int counterPrint = 0;
        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : map.entrySet()) {
            LinkedHashMap<String, Integer> iPAddresses = entry.getValue();
            for (Map.Entry<String, Integer> entry1 : iPAddresses.entrySet()) {
                ip = entry1.getKey();
                number = entry1.getValue();
                counterPrint++;
            }
            if (countOfUser > 1){
                System.out.printf("%s:%n%s => %d.%n", entry.getKey(),ip,number );
            } else {
                System.out.printf("%s: %n", entry.getKey());
                int remaining = counterPrint;
                for (Map.Entry<String, Integer> entry2: iPAddresses.entrySet()){

                    if (remaining > 1){
                        System.out.printf("%s => %d, ", entry2.getKey(), entry2.getValue());
                    }


                    if (remaining == 1){
                        System.out.printf("%s => %d.", entry2.getKey(), entry2.getValue());
                        break;
                    }
                    remaining--;



                }
            }



        }
    }
}
