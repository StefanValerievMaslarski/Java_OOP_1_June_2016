package app;

import app.hardware.Hardware;
import app.hardware.HardwareFactory;
import app.software.Software;
import app.software.SoftwareFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TheSystem ourSystem = new TheSystem();
        String line = null;
        while (!(line = br.readLine()).equals("System Split")) {
            if (line.startsWith("Register")) {
                String whatToRegister = line.substring((line.indexOf("r") + 1), line.length());
                char firstCharForSwitch = whatToRegister.charAt(0);
                String name;
                String type;
                String capacityAsString;
                String memoryAsString;
                Hardware hardware;
                Software software;
                HardwareFactory hardwareFactory = new HardwareFactory();
                SoftwareFactory softwareFactory = new SoftwareFactory();
                String regex = "\\d+";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher;
                List<String> hardwareArgs = new LinkedList<>();
                List<String> softwareArgs = new LinkedList<>();
                String nameHDD;
                List<Hardware> currenthardwares;
                switch (firstCharForSwitch) {
                    case 'P':
                        name = line.substring(line.indexOf("(") + 1, line.indexOf(","));
                        type = "Power";
                        matcher = pattern.matcher(line);
                        matcher.find();
                        capacityAsString = matcher.group();
                        matcher.find();
                        memoryAsString = matcher.group();
                        hardwareArgs.add(name);
                        hardwareArgs.add(type);
                        hardwareArgs.add(capacityAsString);
                        hardwareArgs.add(memoryAsString);
                        hardware = hardwareFactory.createHardware(hardwareArgs);
                        ourSystem.addHardware(hardware);

                        break;
                    case 'H':
                        name = line.substring(line.indexOf("(") + 1, line.indexOf(","));
                        type = "Heavy";
                        matcher = pattern.matcher(line);
                        matcher.find();
                        capacityAsString = matcher.group();
                        matcher.find();
                        memoryAsString = matcher.group();
                        hardwareArgs.add(name);
                        hardwareArgs.add(type);
                        hardwareArgs.add(capacityAsString);
                        hardwareArgs.add(memoryAsString);
                        hardware = hardwareFactory.createHardware(hardwareArgs);
                        ourSystem.addHardware(hardware);

                        break;
                    case 'L':
                        //

                        nameHDD = line.substring(line.indexOf("(") + 1, line.indexOf(","));
                        type = "Light";
                        matcher = pattern.matcher(line);
                        matcher.find();
                        capacityAsString = matcher.group();
                        matcher.find();
                        memoryAsString = matcher.group();
                        softwareArgs.add(nameHDD);
                        softwareArgs.add(type);
                        softwareArgs.add(capacityAsString);
                        softwareArgs.add(memoryAsString);
                        software = softwareFactory.createSoftware(softwareArgs);
                        currenthardwares = ourSystem.getHardwares();

                        for (Hardware hardware1 : currenthardwares) {
                            if (nameHDD.equals(hardware1) && hardware1.isEnoughCapacity(software) && hardware1
                                    .isEnoughMemory(software)) {
                                hardware1.addSoftware(software);
                            }
                        }


                        break;
                    case 'E':
                        //
                        nameHDD = line.substring(line.indexOf("(") + 1, line.indexOf(","));
                        type = "Express";
                        matcher = pattern.matcher(line);
                        matcher.find();
                        capacityAsString = matcher.group();
                        matcher.find();
                        memoryAsString = matcher.group();
                        softwareArgs.add(nameHDD);
                        softwareArgs.add(type);
                        softwareArgs.add(capacityAsString);
                        softwareArgs.add(memoryAsString);
                        software = softwareFactory.createSoftware(softwareArgs);
                        currenthardwares = ourSystem.getHardwares();

                        for (Hardware hardware1 : currenthardwares) {
                            if (nameHDD.equals(hardware1) && hardware1.isEnoughCapacity(software) && hardware1
                                    .isEnoughMemory(software)) {
                                hardware1.addSoftware(software);
                            }
                        }
                        break;

                }

            } else if (line.startsWith("Analyze")) {
                StringBuilder sb = new StringBuilder();
//                sb.append("System Analysis")
//                        .append(System.lineSeparator())
//                        .append(String.format("Hardware Components: %d",ourSystem.getHardwares().size() ))
//                        .append(System.lineSeparator())
//                        .append(String.format("Software Components: %d", ourSystem.)
//                                .append(System.lineSeparator())
//                                .append(String.format("Total Operational Memory: %d | %d", ))
//                                .append(System.lineSeparator())
//                                .append(String.format("Total Capacity Taken: %d | %d", ));
//                return
//                sb.toString();

                /*System Analysis
                Hardware Components: {countOfHardwareComponents}
                Software Components: {countOfSoftwareComponents}
                Total Operational Memory: {totalOperationalMemoryInUse} | {maximumMemory}
                Total Capacity Taken: {totalCapacityTaken} | {maximumCapacity}”*/


            } else {
                //if ("Release")
                String HDDorSSD = line.substring(line.indexOf("(") + 1, line.indexOf(","));
                String softwareToRemove = line.substring(line.indexOf(",") + 2, line.length());
                List<Hardware> currenthardwares = ourSystem.getHardwares();
                for (Hardware hardware1 : currenthardwares) {
                    if (HDDorSSD.equals(hardware1)) {
                        List<Software> currentSoftware = hardware1.getSoftwares();

                        Iterator<Software> i = currentSoftware.iterator();
                        while (i.hasNext()){
                            Software current = i.next();
                            if (current.getName().equals(softwareToRemove)){
                                i.remove();
                            }
                        }

                    }
                }



                /*List<String> names = ....
Iterator<String> i = names.iterator();
while (i.hasNext()) {
   String s = i.next(); // must be called before you can call i.remove()
   // Do something
   i.remove();
}*/


            }

        }
        System.out.println(ourSystem.toString());
    }

}
