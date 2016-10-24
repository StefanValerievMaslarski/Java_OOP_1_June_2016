package app;

import app.hardware.Hardware;

import java.util.LinkedList;
import java.util.List;

public class TheSystem {
    List<Hardware> hardwares;

    public TheSystem() {
        this.hardwares = new LinkedList<>();
    }
    public void addHardware(Hardware hardware){
        this.hardwares.add(hardware);
    }
    boolean isHardwareComponentExist(Hardware hardware){
        if (hardwares.contains(hardware)){
            return true;
        }
        return false;
    }

    public List<Hardware> getHardwares() {
        return this.hardwares;
    }

    //TO DO
    public int getNumberOfHardwareComponents(){
        return 0;
    }
    public int getNumberOfSoftwareComponents(){
        return 0;
    }
    public int getUsedMemory(){
        return 0;
    }
    public int getUsedCapacity(){
        return 0;
    }
    public int getTotalMemory(){
        return 0;
    }
    public int getTotalCapacity(){
        return 0;
    }

    @Override
    public String toString() {
        for (Hardware hardware : hardwares) {

            StringBuilder sb = new StringBuilder();
//            sb.append(String.format("Hardware Component %s",  this.))
//                    .append(System.lineSeparator())
//                    .append(String.format("Express Software Components %s", this.getName))
//                    .append(System.lineSeparator())
//                    .append(String.format("Light Software Components %s", this.getName))
//                    .append(System.lineSeparator())
//                    .append(String.format("Memory Usage: %d", this.getName))
//                    .append(System.lineSeparator())
//                    .append(String.format("Capacity Usage: %d", this.getName))
//                    .append(System.lineSeparator())
//                    .append(String.format("Type: %d", this.getName))
//                    .append(String.format("Software Components: %s", this.getName));
        }


        /*“Hardware Component – {componentName}
        Express Software Components: {countOfExpressSoftwareComponents}
        Light Software Components: {countOfLightSoftwareComponents}
        Memory Usage: {memoryUsed} | {maximumMemory}
        Capacity Usage: {capacityUsed} | {maximumCapacity}
        Type: {Power/Heavy}
        Software Components: {softwareComponent1, softwareComponent2…}”*/





//        return sb.toString();
        return "";
    }
}
