package app.software;

public class ExpressSoftware extends Software {

    public ExpressSoftware(String name,
                           String type,
                           int capacityConsumption,
                           int memoryConsumption) {

        super(name, type, capacityConsumption, memoryConsumption);
        this.setCapacityConsumption(capacityConsumption);
        this.setMemoryConsumption(memoryConsumption);
    }



    private void setCapacityConsumption(int capacityConsumption) {
        this.capacityConsumption = capacityConsumption;
    }

    private void setMemoryConsumption(int memoryConsumption) {
        this.memoryConsumption = memoryConsumption;
        this.memoryConsumption += 1.00*this.memoryConsumption;
    }
}
