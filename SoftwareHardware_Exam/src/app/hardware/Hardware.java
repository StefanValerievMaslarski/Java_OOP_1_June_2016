package app.hardware;

import app.software.Software;

import java.util.LinkedList;
import java.util.List;

public abstract class Hardware {
    private String name;
    private String type;
    protected int maxCapacity;
    protected int maxMemory;
    List<Software> softwares;

    public Hardware(String name, String type, int maxCapacity, int maxMemory) {
        this.setName(name);
        this.setType(type);
        this.setMaxCapacity(maxCapacity);
        this.setMaxMemory(maxMemory);
        this.softwares = new LinkedList<>();
    }
/*
    public Hardware(String name, String type, int maxCapacity, int maxMemory) {
        this.setName(name);
        this.setType(type);
        this.maxCapacity = 0;
        this.maxMemory = 0;
        this.softwares = new LinkedList<>();
    }
    */

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public List<Software> getSoftwares() {
        return this.softwares;
    }

    //check if there is enough capacity to save the software
    public boolean isEnoughCapacity(Software software){
        if (this.maxCapacity > software.getCapacityConsumption()){
            return true;
        }
        return false;
    }
    //check if there is enough memory to save the software
    public boolean isEnoughMemory(Software software){
        if (this.maxMemory > software.getMemoryConsumption()){
            return true;
        }
        return false;
    }
    // check if exist such software component at hardware
    public boolean isThereSoftwareOnHardware(Software software){
        if (softwares.contains(software)){
            return true;
        }
        return false;
    }


    public int calculateTotalCapacity(){

        // TO DO
        return 0;
    };

    public int totalMemoryConsumption(){
        // TO DO
        return 0;
    };

    private void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    private void setMaxMemory(int maxMemory) {
        this.maxMemory = maxMemory;
    }
    public void addSoftware(Software software){
        this.softwares.add(software);
    }
    public void removeSoftware(Software software){
        this.softwares.remove(software);
    }
}
