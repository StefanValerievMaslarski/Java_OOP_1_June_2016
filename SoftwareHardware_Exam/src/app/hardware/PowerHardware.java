package app.hardware;

public class PowerHardware extends Hardware {

    public PowerHardware(String name, String type,
                         int maxCapacity, int maxMemory) {
        super(name,type , maxCapacity, maxMemory);
        this.setMaxCapacity(maxCapacity);
        this.setMaxMemory(maxMemory);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    protected void setType(String type) {
        super.setType(type);
    }


    public int getMaxCapacity() {
        return this.getMaxCapacity();
    }


    private void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.maxCapacity -= 0.75* maxCapacity;
    }


    public int getMaxMemory() {
        return this.getMaxMemory();
    }


    private void setMaxMemory(int maxMemory) {
        this.maxMemory = maxMemory;
        this.maxMemory += 0.75*this.maxMemory;

    }
}
