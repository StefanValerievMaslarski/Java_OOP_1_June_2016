package app.hardware;

public class HeavyHardware extends Hardware {

    public HeavyHardware(String name, String type, int maxCapacity, int maxMemory) {
        super(name, type, maxCapacity, maxMemory);
        this.setMaxCapacity(maxCapacity);
        this.setMaxMemory(maxMemory);
    }

    public int getMaxCapacity() {
        return this.getMaxCapacity();
    }


    private void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.maxCapacity += 1.00* maxCapacity;
    }


    public int getMaxMemory() {
        return this.getMaxMemory();
    }


    private void setMaxMemory(int maxMemory) {
        this.maxMemory = maxMemory;
        this.maxMemory -= 0.25*this.maxMemory;

    }

}
