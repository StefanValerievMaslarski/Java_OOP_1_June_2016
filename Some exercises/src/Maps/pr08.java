package Maps;


import java.util.*;

public class pr08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, HashSet<String>> map = new LinkedHashMap<>();
        String input = sc.nextLine();
        while (!input.equals("JOKER")) {
            String[] splited = input.split(":");
            String name = splited[0];
            String cards = splited[1].trim();
            String separateCard[] = cards.split(", ");
            if (!map.containsKey(name)) {
                map.put(name, new HashSet<>());
                for (int i = 0; i < separateCard.length; i++) {
                    map.get(name).add(separateCard[i]);
                }


            } else {
                for (int i = 0; i < separateCard.length; i++) {
                    map.get(name).add(separateCard[i]);
                }
            }

            input = sc.nextLine();

        }


//        for (Map.Entry<String, HashSet<String>> entry : map.entrySet()) {
//            String nameOfPlayer = entry.getKey();
//            HashSet<String> cardsOfPlayer = entry.getValue();
//            String cardsOfPlayerStr = "";
//            for (String el :
//                    cardsOfPlayer) {
//
//                cardsOfPlayerStr = cardsOfPlayerStr + el + ", ";
//            }
//
//
//        }


        for (Map.Entry<String, HashSet<String>> entry : map.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), transferPoint(entry.getValue().toString()));
        }


    }

    static Integer transferPoint(String cards) {
        int sumFromcards = 0;
        String[] splitedCards = cards.split(", ");
        for (String el :
                splitedCards) {

            if ((el.startsWith("2")||el.startsWith("[2"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 2 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 2 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 2 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 2 * 1;

                }
            }
            if ((el.startsWith("3")||el.startsWith("[3"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 3 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 3 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 3 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 3 * 1;

                }
            }
            if ((el.startsWith("4")||el.startsWith("[4"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 4 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 4 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 4 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 4 * 1;

                }
            }
            if ((el.startsWith("5")||el.startsWith("[5"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 5 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 5 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 5 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 5 * 1;

                }
            }
            if ((el.startsWith("6")||el.startsWith("[6"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 6 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 6 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 6 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 6 * 1;

                }
            }
            if ((el.startsWith("7")||el.startsWith("[7"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 7 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 7 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 7 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 7 * 1;

                }
            }
            if ((el.startsWith("8")||el.startsWith("[8"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 8 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 8 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 8 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 8 * 1;

                }
            }
            if ((el.startsWith("9")||el.startsWith("[9"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 9 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 9 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 9 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 9 * 1;

                }
            }
            if ((el.startsWith("10")||el.startsWith("[10"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 10 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 10 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 10 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 10 * 1;

                }
            }
            if ((el.startsWith("J")||el.startsWith("[J"))){
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 11 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 11 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 11 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 11 * 1;

                }
            }
            if ((el.startsWith("Q")||el.startsWith("[Q"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 12 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 12 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 12 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 12 * 1;

                }
            }
            if ((el.startsWith("K")||el.startsWith("[K"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 13 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 13 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 13 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 13 * 1;

                }
            }
            if ((el.startsWith("A")||el.startsWith("[A"))) {
                if ((el.endsWith("S"))||(el.endsWith("S]"))) {
                    sumFromcards += 14 * 4;
                } else if ((el.endsWith("H"))||(el.endsWith("H]"))) {
                    sumFromcards += 14 * 3;

                } else if ((el.endsWith("D"))||(el.endsWith("D]"))) {
                    sumFromcards += 14 * 2;

                } else if ((el.endsWith("C"))||(el.endsWith("C]"))){
                    sumFromcards += 14 * 1;

                }
            }

        }
        return sumFromcards;
    }
}
