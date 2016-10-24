import exceptions.OutOfEnergyException;
import models.GameCharacter;
import models.Mage;
import models.Warrior;


public class Main {

    public static void main(String[] args) {


        GameCharacter goshoTheWarrior = new Warrior("Gosho");
        GameCharacter peshoTheMage = new Mage("Pesho");

        int countRounds = 0;
        int countMageAttack = 0;
        while (true){
            System.out.println("Round: " + ++countRounds);

            countMageAttack++;
            if (countMageAttack % 2 == 0){
                try{
                    peshoTheMage.attack(goshoTheWarrior);
                    goshoTheWarrior.attack(peshoTheMage);
                } catch (OutOfEnergyException | IllegalStateException e) {
                    System.out.println(e.getMessage());
                    break;
                }
                System.out.println();

            } else {
                try{
                    goshoTheWarrior.attack(peshoTheMage);
                    peshoTheMage.attack(goshoTheWarrior);
                } catch (OutOfEnergyException | IllegalStateException e) {
                    System.out.println(e.getMessage());
                    break;
                }
                System.out.println();

            }

        }
        if (goshoTheWarrior.getHealth() < peshoTheMage.getHealth()){
            System.out.println("The winner is Pesho!");
            System.out.println("Pesho health: " + peshoTheMage.getHealth());
            System.out.println("Gosho health: " + goshoTheWarrior.getHealth());
        } else {
            System.out.println("The winner is Gosho!");
            System.out.println("Gosho health: " + goshoTheWarrior.getHealth());
            System.out.println("Pesho health: " + peshoTheMage.getHealth());
        }

    }

}
