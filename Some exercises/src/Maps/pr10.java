//package Maps;
//
//
//
//
//import java.util.*;
//
//public class pr10 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        LinkedHashMap<String, HashMap<String, Integer>> map = new LinkedHashMap<>();
//        LinkedHashMap<String, Long> countryTotalPop = new LinkedHashMap<>();
//
//        String town = "";
//        Integer townPopulation = 0;
//        String country = "";
//        while (!input.equals("report")){
//           String[] splittedInput = input.split("\\|");
//           town = splittedInput[0];
//           country = splittedInput[1];
//           townPopulation = Integer.parseInt(splittedInput[2]);
//            //filling the map
//            if (!map.containsKey(country)){
//                map.put(country, new HashMap<>());
//                countryTotalPop.put(country, 0);
//            }
//            if (!map.get(country).containsKey(town)){
//                map.get(country).put(town, 0);
//            }
//            int oldCityPopulation = map.get(country).get(town);
//            long oldCountryPop = countryTotalPop.get(country);
//            map.get(country).put(town, oldCityPopulation + townPopulation);
//            countryTotalPop.put(country, oldCountryPop + townPopulation);
//
//            input= sc.nextLine();
//        }
//
//        countryTotalPop.entrySet().stream().sorted((o1, o2) -> {
//            long pop1 = o1.getValue();
//            long pop2 = o2.getValue();
//            return Long.compare(pop1, pop2);
//        }).forEach(entry -> {
//            String countryName = entry.getKey();
//            map.get(countryName).entrySet().stream().sorted((o1, o2) -> {
//                Integer townPop1 = o1.getValue();
//                Integer townPop2 = o2.getValue();
//                return Integer.compare(townPop1, townPop2);
//            }).forEach(entry1 -> {
//                String townName = entry.getKey();
//            });
//        });
//
//    }
//}
