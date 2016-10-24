package models;

import exceptions.OutOfEnergyException;

public abstract class GameCharacter {
    private int health;
    private int power;
    private int energy;
    private int attackCost;
    private String name;

    public GameCharacter(int health, int power, int energy, int attackCost, String name) {
        this.setHealth(health);
        this.setPower(power);
        this.setEnergy(energy);
        this.setAttackCost(attackCost);
        this.setName(name);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getAttackCost() {
        return attackCost;
    }

    public void setAttackCost(int attackCost) {
        this.attackCost = attackCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void attack(GameCharacter other) throws OutOfEnergyException;
    public abstract void respond(int damage);

}
