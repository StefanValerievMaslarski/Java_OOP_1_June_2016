package models;

import exceptions.OutOfEnergyException;

public class Warrior extends GameCharacter{

    private static final int BASE_HEALTH = 5000;
    private static final int BASE_POWER = 200;
    private static final int BASE_ENERGY = 1000;
    private static final int BASE_ATTACK_COST = 150;
    private static final double POWER_SURGE = 0.3;
    private static final double SUCCESS_BLOCK = 0.6;

    public Warrior(int health,
            int power,
            int energy,
            int attackCost,
            String name) {
        super(health, power, energy, attackCost, name);
    }
    public Warrior(String name){
        this(BASE_HEALTH, BASE_POWER,BASE_ENERGY,BASE_ATTACK_COST, name);
    }


    @Override
    public void attack(GameCharacter other) throws OutOfEnergyException {
        if (other == this){
            throw new IllegalStateException("Cannot attack itself");
        }
        if (this.getEnergy() < this.getAttackCost()){
            throw new IllegalStateException(this.getName() + " is out of energy. Battle over.");
        }
        boolean isSerge = Math.random() < POWER_SURGE;
        int damage = this.getPower();
        if (isSerge){
            System.out.println(this.getName() + " was lucky. Free attack.");

        } else {
            this.setEnergy(this.getEnergy() - this.getAttackCost());

        }
        other.respond(damage);

    }

    @Override
    public void respond(int damage) {


        boolean hasBlocked = Math.random() < SUCCESS_BLOCK;
        if (hasBlocked){
            System.out.println("Attack has blocked!");
            damage = damage / 2;

        }
            this.setHealth(this.getHealth() - damage);
            System.out.println(damage + " damage dealth.");
    }
}
