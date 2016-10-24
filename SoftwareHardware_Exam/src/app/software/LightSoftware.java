package app.software;

public class LightSoftware extends Software {

    public LightSoftware(String name, String type,
                         int capacityConsumption,
                         int memoryConsumption) {
        super(name, type, capacityConsumption, memoryConsumption);
        this.setCapacityConsumption(capacityConsumption);
        this.setMemoryConsumption(memoryConsumption);
    }

    private void setCapacityConsumption(int capacityConsumption) {
        this.capacityConsumption = capacityConsumption;
        this.capacityConsumption += 0.5*this.capacityConsumption;
    }

    private void setMemoryConsumption(int memoryConsumption) {
        this.memoryConsumption = memoryConsumption;
        this.memoryConsumption -= 0.5*this.memoryConsumption;
    }
}
