package app.hardware;


import java.util.List;

public class HardwareFactory {
    public Hardware createHardware(List<String> hardwareArgs){

        String hardwareType = hardwareArgs.get(1);
        Hardware hardware = null;
        switch (hardwareType){
            case "Power":
                hardware = new PowerHardware(hardwareArgs.get(0),
                                        hardwareArgs.get(1),
                                        Integer.valueOf(hardwareArgs.get(2)),
                                        Integer.valueOf(hardwareArgs.get(3)));


                break;
            case "Heavy":
                hardware = new HeavyHardware(hardwareArgs.get(0),
                        hardwareArgs.get(1),
                        Integer.valueOf(hardwareArgs.get(2)),
                        Integer.valueOf(hardwareArgs.get(3)));

                break;

            default:
                break;
        }
//Optional
//        hardware.calculateTotalCapacity();
//        hardware.totalMemoryConsumption();


        return hardware;

    }
}
