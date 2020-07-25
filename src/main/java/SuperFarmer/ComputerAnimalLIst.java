package SuperFarmer;

import java.util.ArrayList;
import java.util.Collections;


public class ComputerAnimalLIst {
    public boolean checkAnimalsInCollection(ArrayList computerListAfterGreeding) {

       if (computerListAfterGreeding.contains(Animal.RABBIT)) {
            System.out.println(computerListAfterGreeding.contains(Animal.RABBIT));
        } if (computerListAfterGreeding.contains(Animal.SHEEP)) {
           System.out.println("SHEEP: " + computerListAfterGreeding.contains(Animal.SHEEP));

        } if (computerListAfterGreeding.contains(Animal.PIG)) {

        }  if (computerListAfterGreeding.contains(Animal.COW)) {

        }  if (computerListAfterGreeding.contains(Animal.HORSE)) {
            return true;
        } else {

        }
        System.out.println("Nie ma nic");
        return false;
    }

    public ArrayList greedingComputer(ArrayList computerAnimalList) {
        Dice dice = new Dice();
        Animal orange = dice.orangeDice();
        Animal blue = dice.blueDice();
        System.out.println(orange + " " + blue);

        if (orange == blue) {
            computerAnimalList.add(orange);
            System.out.println("+++" + orange);
        }

        int qantityOfPig = Collections.frequency(computerAnimalList, Animal.PIG);
        ;
        if (orange == Animal.PIG) {
            for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                computerAnimalList.add(Animal.PIG);
                System.out.println("+++" + orange);
                computerAnimalList.size();
            }
        } else if (blue == Animal.PIG) {
            for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                computerAnimalList.add(Animal.PIG);
                System.out.println("+++" + blue);
                computerAnimalList.size();
            }
        }
        int qantityOfRabbit = Collections.frequency(computerAnimalList, Animal.RABBIT);
        ;
        if (orange == Animal.RABBIT) {
            for (int n = 0; n < (qantityOfRabbit + 1) / 2; n++) {
                computerAnimalList.add(Animal.RABBIT);
                System.out.println("+++" + orange);
                computerAnimalList.size();
            }
        } else if (blue == Animal.RABBIT) {
            for (int n = 0; n < (qantityOfRabbit + 1) / 2; n++) {
                computerAnimalList.add(Animal.RABBIT);
                System.out.println("+++" + blue);
                computerAnimalList.size();
            }
        }
        int qantityOfSheep = Collections.frequency(computerAnimalList, Animal.SHEEP);
        if (orange == Animal.SHEEP) {
            for (int n = 0; n < (qantityOfSheep + 1) / 2; n++) {
                computerAnimalList.add(Animal.SHEEP);
                System.out.println("+++" + orange);
                computerAnimalList.size();
            }
        } else if (blue == Animal.SHEEP) {
            for (int n = 0; n < (qantityOfSheep + 1) / 2; n++) {
                computerAnimalList.add(Animal.SHEEP);
                System.out.println("+++" + blue);
                computerAnimalList.size();
            }
        }
        int qantityOfCow = Collections.frequency(computerAnimalList, Animal.COW);
        if (orange == Animal.COW) {
            for (int n = 0; n < (qantityOfCow + 1) / 2; n++) {
                computerAnimalList.add(Animal.COW);
                System.out.println("+++" + orange);
                computerAnimalList.size();
            }
        } else if (blue == Animal.COW) {
            for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                computerAnimalList.add(Animal.COW);
                System.out.println("+++" + blue);
                computerAnimalList.size();
            }
        }
        int qantityOfHorse = Collections.frequency(computerAnimalList, Animal.HORSE);
        if (orange == Animal.HORSE) {
            for (int n = 0; n < (qantityOfHorse + 1) / 2; n++) {
                computerAnimalList.add(Animal.HORSE);
                System.out.println("+++" + orange);
                computerAnimalList.size();
            }
        } else if (blue == Animal.HORSE) {
            for (int n = 0; n < (qantityOfHorse + 1) / 2; n++) {
                computerAnimalList.add(Animal.HORSE);
                System.out.println("+++" + blue);
                computerAnimalList.size();
            }
        }
        return computerAnimalList;
    }


    public ArrayList getList() {
        ArrayList animalList = new ArrayList();
        return animalList;
    }
}
