package Queues;

import java.util.ArrayDeque;
import java.util.Scanner;


public class pr06 {
    //TruckTour
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        ArrayDeque<Station> queue = new ArrayDeque<>();


        for (int i = 0; i < n; i++) {
            String[] token = sc.nextLine().split("\\s+");
            int gas = Integer.valueOf(token[0]);
            int distance = Integer.valueOf(token[1]);
            Station station = new Station();
            station.gasGiven = gas;
            station.distanceToNext = distance;
            queue.addLast(station);
        }


        int gasInTank = 0;
        boolean foundFirst = false;
        Integer index = 0;

        while (true) {
            Station currentStation = queue.removeFirst();
            gasInTank += currentStation.gasGiven;
            queue.addLast(currentStation);

            Station firstStation = currentStation;
            Integer indexAddUp = 1;


            while (gasInTank >= currentStation.distanceToNext) {
                gasInTank -= currentStation.distanceToNext;
                currentStation = queue.removeFirst();
                queue.addLast(currentStation);
                gasInTank += currentStation.gasGiven;
                indexAddUp++;

                if (currentStation == firstStation) {
                    foundFirst = true;
                    break;
                }
            }


            if (foundFirst) {
                break;
            }
            index += indexAddUp;
            gasInTank = 0;
        }
        System.out.println(index);
    }

}

class Station {
    int gasGiven;
    int distanceToNext;
}