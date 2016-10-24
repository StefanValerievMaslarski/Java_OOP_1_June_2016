package app.software;


import java.util.List;

public class SoftwareFactory {
    public Software createSoftware(List<String> softwareArgs){
        Software software = null;
        String softwareType = softwareArgs.get(1);

        switch (softwareType){
            case "Light":
                software = new LightSoftware(softwareArgs.get(0),
                                            softwareArgs.get(1),
                                            Integer.valueOf(softwareArgs.get(2)),
                                            Integer.valueOf(softwareArgs.get(3)));

                break;
            case "Express":
                software = new ExpressSoftware(softwareArgs.get(0),
                        softwareArgs.get(1),
                        Integer.valueOf(softwareArgs.get(2)),
                        Integer.valueOf(softwareArgs.get(3)));

                break;

            default:
                break;
        }

        return software;
    }

}
