package SuperFarmer;

import java.util.ArrayList;
import java.util.Collections;


public class ComputerAnimalLIst {
    public boolean checkAnimalsInCollection(ArrayList computerListAfterGreeding) {

        if (computerListAfterGreeding.contains(Animal.RABBIT)) {
        }
        if (computerListAfterGreeding.contains(Animal.SHEEP)) {

        }
        if (computerListAfterGreeding.contains(Animal.PIG)) {

        }
        if (computerListAfterGreeding.contains(Animal.COW)) {

        }
        if (computerListAfterGreeding.contains(Animal.HORSE)) {
            return true;
        } else {
        }
        return false;
    }

    public ArrayList greedingComputer(ArrayList computerAnimalList) {
        Dice dice = new Dice();
        Animal orange = dice.orangeDice();
        Animal blue = dice.blueDice();
        System.out.println("Computer move: " + orange + " " + blue);

        if (orange == blue) {
            computerAnimalList.add(orange);
            System.out.println("Computer +" + orange);
        } else {

            int qantityOfPig = Collections.frequency(computerAnimalList, Animal.PIG);
            ;
            if (orange == Animal.PIG) {
                for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                    computerAnimalList.add(Animal.PIG);
                    System.out.println("Computer +" + orange);
                    computerAnimalList.size();
                }
            } else if (blue == Animal.PIG) {
                for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                    computerAnimalList.add(Animal.PIG);
                    System.out.println("Computer +" + blue);
                    computerAnimalList.size();
                }
            }
            int qantityOfRabbit = Collections.frequency(computerAnimalList, Animal.RABBIT);
            ;
            if (orange == Animal.RABBIT) {
                for (int n = 0; n < (qantityOfRabbit + 1) / 2; n++) {
                    computerAnimalList.add(Animal.RABBIT);
                    System.out.println("Computer +" + orange);
                    computerAnimalList.size();
                }
            } else if (blue == Animal.RABBIT) {
                for (int n = 0; n < (qantityOfRabbit + 1) / 2; n++) {
                    computerAnimalList.add(Animal.RABBIT);
                    System.out.println("Computer +" + blue);
                    computerAnimalList.size();
                }
            }
            int qantityOfSheep = Collections.frequency(computerAnimalList, Animal.SHEEP);
            if (orange == Animal.SHEEP) {
                for (int n = 0; n < (qantityOfSheep + 1) / 2; n++) {
                    computerAnimalList.add(Animal.SHEEP);
                    System.out.println("Computer +" + orange);
                    computerAnimalList.size();
                }
            } else if (blue == Animal.SHEEP) {
                for (int n = 0; n < (qantityOfSheep + 1) / 2; n++) {
                    computerAnimalList.add(Animal.SHEEP);
                    System.out.println("Computer +" + blue);
                    computerAnimalList.size();
                }
            }
            int qantityOfCow = Collections.frequency(computerAnimalList, Animal.COW);
            if (orange == Animal.COW) {
                for (int n = 0; n < (qantityOfCow + 1) / 2; n++) {
                    computerAnimalList.add(Animal.COW);
                    System.out.println("Computer +" + orange);
                    computerAnimalList.size();
                }
            } else if (blue == Animal.COW) {
                for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                    computerAnimalList.add(Animal.COW);
                    System.out.println("Computer +" + blue);
                    computerAnimalList.size();
                }
            }
            int qantityOfHorse = Collections.frequency(computerAnimalList, Animal.HORSE);
            if (orange == Animal.HORSE) {
                for (int n = 0; n < (qantityOfHorse + 1) / 2; n++) {
                    computerAnimalList.add(Animal.HORSE);
                    System.out.println("Computer +" + orange);
                    computerAnimalList.size();
                }
            } else if (blue == Animal.HORSE) {
                for (int n = 0; n < (qantityOfHorse + 1) / 2; n++) {
                    computerAnimalList.add(Animal.HORSE);
                    System.out.println("Computer +" + blue);
                    computerAnimalList.size();
                }
            } else if (blue == Animal.WOLF) {

                computerAnimalList.add(Animal.RABBIT);
            } else if (blue == Animal.FOX) {
                for (int n = 0; n < qantityOfRabbit; n++) {
                    computerAnimalList.remove(Animal.RABBIT);
                }
            }
            if (blue == Animal.WOLF) {
                for (int n = 0; computerAnimalList.size() > n; n++) {
                    computerAnimalList.remove(n);
                }
                computerAnimalList.add(Animal.RABBIT);
            }else if (orange == Animal.WOLF) {
                for (int n = 0; computerAnimalList.size() > n; n++) {
                    computerAnimalList.remove(n);
                }
                computerAnimalList.add(Animal.RABBIT);
            }
            if (blue == Animal.FOX) {
                for (int n = 0; n < qantityOfRabbit; n++) {
                    computerAnimalList.remove(Animal.RABBIT);
                }
            }else if (orange == Animal.FOX) {
                for (int n = 0; n < qantityOfRabbit; n++) {
                    computerAnimalList.remove(Animal.RABBIT);
                }
            }

        }
        return computerAnimalList;
    }


    public ArrayList getList() {
        ArrayList animalList = new ArrayList();
        return animalList;
    }

    public ArrayList exRabbitToScheep(ArrayList greedingComputer) {
        greedingComputer.remove(Animal.RABBIT);
        greedingComputer.remove(Animal.RABBIT);
        greedingComputer.remove(Animal.RABBIT);
        greedingComputer.remove(Animal.RABBIT);
        greedingComputer.remove(Animal.RABBIT);
        greedingComputer.remove(Animal.RABBIT);
        greedingComputer.add(Animal.SHEEP);

        return greedingComputer;
    }

    public void exSheepToPig(ArrayList computerListAfterGreeding) {
        computerListAfterGreeding.remove(Animal.SHEEP);
        computerListAfterGreeding.remove(Animal.SHEEP);
        computerListAfterGreeding.add(Animal.PIG);
    }

    public void exPigToCow(ArrayList computerListAfterGreeding) {
        computerListAfterGreeding.remove(Animal.PIG);
        computerListAfterGreeding.remove(Animal.PIG);
        computerListAfterGreeding.add(Animal.COW);
    }

    public void exCowToHorse(ArrayList computerListAfterGreeding) {
        computerListAfterGreeding.remove(Animal.COW);
        computerListAfterGreeding.add(Animal.HORSE);
    }
}
