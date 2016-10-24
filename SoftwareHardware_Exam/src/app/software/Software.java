package app.software;

public abstract class Software {
    private String name;
    private String type;
    protected int capacityConsumption;
    protected int memoryConsumption;

    public Software(String name, String type, int capacityConsumption, int memoryConsumption) {
        this.setName(name);
        this.setType(type);
        this.setCapacityConsumption(capacityConsumption);
        this.setMemoryConsumption(memoryConsumption);
    }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public int getCapacityConsumption() {
        return this.capacityConsumption;
    }

    public int getMemoryConsumption() {
        return this.memoryConsumption;
    }

    private void setCapacityConsumption(int capacityConsumption) {
        this.capacityConsumption = capacityConsumption;
    }

    private void setMemoryConsumption(int memoryConsumption) {
        this.memoryConsumption = memoryConsumption;
    }
}
