package SuperFarmer;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class UserAnimalList {

    public boolean checkAnimalsInCollection(ArrayList userListAfterGreeding) {
        if (userListAfterGreeding.contains(Animal.RABBIT)) {

        } else if (userListAfterGreeding.contains(Animal.SHEEP)) {

        } else if (userListAfterGreeding.contains(Animal.PIG)) {

        } else if (userListAfterGreeding.contains(Animal.COW)) {

        } else if (userListAfterGreeding.contains(Animal.HORSE)) {
            return true;
        } else {
        }
        return false;
    }


    public ArrayList greedingUser(ArrayList userAnimalList) {
       /* Dice dice = new Dice();
        Animal orange = dice.orangeDice();
        Animal blue = dice.blueDice();*/
        Dice dice = new Dice();
        Animal orange = dice.throwOrangeDice();
        Animal blue = dice.throwBlueDice();
        System.out.println("User move: " + orange + " " + blue);

        if (orange == blue) {
            userAnimalList.add(orange);
            System.out.println("User +" + orange);

            int qantityOfPig = Collections.frequency(userAnimalList, Animal.PIG);

            if (orange == Animal.PIG) {
                for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                    userAnimalList.add(Animal.PIG);
                    System.out.println("User +" + orange);
                    userAnimalList.size();
                }
            } else if (blue == Animal.PIG) {
                for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                    userAnimalList.add(Animal.PIG);
                    System.out.println("User +" + blue);
                    userAnimalList.size();
                }
            }
            int qantityOfRabbit = Collections.frequency(userAnimalList, Animal.RABBIT);
            ;
            if (orange == Animal.RABBIT) {
                for (int n = 0; n < (qantityOfRabbit + 1) / 2; n++) {
                    userAnimalList.add(Animal.RABBIT);
                    System.out.println("User + " + orange);
                    userAnimalList.size();
                }
            } else if (blue == Animal.RABBIT) {
                for (int n = 0; n < (qantityOfRabbit + 1) / 2; n++) {
                    userAnimalList.add(Animal.RABBIT);
                    System.out.println("User + " + blue);
                    userAnimalList.size();
                }
            }
            int qantityOfSheep = Collections.frequency(userAnimalList, Animal.SHEEP);
            if (orange == Animal.SHEEP) {
                for (int n = 0; n < (qantityOfSheep + 1) / 2; n++) {
                    userAnimalList.add(Animal.SHEEP);
                    System.out.println("User + " + orange);
                    userAnimalList.size();
                }
            } else if (blue == Animal.SHEEP) {
                for (int n = 0; n < (qantityOfSheep + 1) / 2; n++) {
                    userAnimalList.add(Animal.SHEEP);
                    System.out.println("User + " + blue);
                    userAnimalList.size();
                }
            }
            int qantityOfCow = Collections.frequency(userAnimalList, Animal.COW);
            if (orange == Animal.COW) {
                for (int n = 0; n < (qantityOfCow + 1) / 2; n++) {
                    userAnimalList.add(Animal.COW);
                    System.out.println("User + " + orange);
                    userAnimalList.size();
                }
            } else if (blue == Animal.COW) {
                for (int n = 0; n < (qantityOfCow + 1) / 2; n++) {
                    userAnimalList.add(Animal.COW);
                    System.out.println("User + " + blue);
                    userAnimalList.size();
                }
            }
            int qantityOfHorse = Collections.frequency(userAnimalList, Animal.HORSE);
            if (orange == Animal.HORSE) {
                for (int n = 0; n < (qantityOfHorse + 1) / 2; n++) {
                    userAnimalList.add(Animal.HORSE);
                    System.out.println("User + " + orange);
                    userAnimalList.size();
                }
            } else if (blue == Animal.HORSE) {
                for (int n = 0; n < (qantityOfHorse + 1) / 2; n++) {
                    userAnimalList.add(Animal.HORSE);
                    System.out.println("User + " + blue);
                    userAnimalList.size();
                }
            }
            if (blue == Animal.WOLF) {
                for (int n = 0; userAnimalList.size() > n; n++) {
                    userAnimalList.remove(n);
                }
                userAnimalList.add(Animal.RABBIT);
            } else if (orange == Animal.WOLF) {
                for (int n = 0; userAnimalList.size() > n; n++) {
                    userAnimalList.remove(n);
                }
                userAnimalList.add(Animal.RABBIT);
            }
            if (blue == Animal.FOX) {
                for (int n = 0; n < qantityOfRabbit; n++) {
                    userAnimalList.remove(Animal.RABBIT);
                }
            } else if (orange == Animal.FOX) {
                for (int n = 0; n < qantityOfRabbit; n++) {
                    userAnimalList.remove(Animal.RABBIT);
                }
            }

        }
        return userAnimalList;
    }

    public ArrayList getlist() {
        ArrayList userList = new ArrayList();
        return userList;
    }

    public ArrayList exchange() {
        return null;
    }

    public ArrayList exRabbittoScheep(ArrayList greedingUser) {
        greedingUser.remove(Animal.RABBIT);
        greedingUser.remove(Animal.RABBIT);
        greedingUser.remove(Animal.RABBIT);
        greedingUser.remove(Animal.RABBIT);
        greedingUser.remove(Animal.RABBIT);
        greedingUser.remove(Animal.RABBIT);
        greedingUser.add(Animal.RABBIT);
        greedingUser.add(Animal.SHEEP);
        greedingUser.add(Animal.PIG);
        greedingUser.add(Animal.COW);
        greedingUser.add(Animal.HORSE);
        return greedingUser;
    }

    public void exRabbittoSheep(ArrayList userListAfterGreeding) {

        if (Collections.frequency(userListAfterGreeding, Animal.RABBIT) >= 6) {
            userListAfterGreeding.remove(Animal.RABBIT);
            userListAfterGreeding.remove(Animal.RABBIT);
            userListAfterGreeding.remove(Animal.RABBIT);
            userListAfterGreeding.remove(Animal.RABBIT);
            userListAfterGreeding.remove(Animal.RABBIT);
            userListAfterGreeding.remove(Animal.RABBIT);
            userListAfterGreeding.add(Animal.SHEEP);
            System.out.println("Exchange RABBIT-SHEEP DONE");
        } else {
            System.out.println("!!! Not enough RABBITS !!!");
        }
    }

    public void exSheepToPig(ArrayList userListAfterGreeding) {
        if (Collections.frequency(userListAfterGreeding, Animal.SHEEP) >= 3) {
            userListAfterGreeding.remove(Animal.SHEEP);
            userListAfterGreeding.remove(Animal.SHEEP);
            userListAfterGreeding.remove(Animal.SHEEP);
            userListAfterGreeding.add(Animal.PIG);
            System.out.println("Exchange SHEEP-PIG DONE");
        } else {
            System.out.println("!!! Not enough SHEEP !!!");
        }
    }

    public void exPigToCow(ArrayList userListAfterGreeding) {
        if (Collections.frequency(userListAfterGreeding, Animal.PIG) >= 2) {
            userListAfterGreeding.remove(Animal.PIG);
            userListAfterGreeding.remove(Animal.PIG);
            userListAfterGreeding.add(Animal.COW);
        } else {
            System.out.println("!!! Not enough PIGS !!!");
        }
    }

    public void exCowToHorse(ArrayList userListAfterGreeding) {
        if (Collections.frequency(userListAfterGreeding, Animal.COW) >= 2) {
            userListAfterGreeding.remove(Animal.COW);
            userListAfterGreeding.remove(Animal.COW);
            userListAfterGreeding.add(Animal.HORSE);
        } else {
            System.out.println("!!! Not enough COWS !!!");
        }
    }
}