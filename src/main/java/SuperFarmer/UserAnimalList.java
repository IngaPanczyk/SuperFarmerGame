package SuperFarmer;

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
        public ArrayList greedingUser (ArrayList userAnimalList){
            Dice dice = new Dice();
            Animal orange = dice.orangeDice();
            Animal blue = dice.blueDice();
            System.out.println(orange + " " + blue);

            if (orange == blue) {
                userAnimalList.add(orange);
                System.out.println("+++" + orange);
            }

            int qantityOfPig = Collections.frequency(userAnimalList, Animal.PIG);
            ;
            if (orange == Animal.PIG) {
                for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                    userAnimalList.add(Animal.PIG);
                    System.out.println("+++" + orange);
                    userAnimalList.size();
                }
            } else if (blue == Animal.PIG) {
                for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                    userAnimalList.add(Animal.PIG);
                    System.out.println("+++" + blue);
                    userAnimalList.size();
                }
            }
            int qantityOfRabbit = Collections.frequency(userAnimalList, Animal.RABBIT);
            ;
            if (orange == Animal.RABBIT) {
                for (int n = 0; n < (qantityOfRabbit + 1) / 2; n++) {
                    userAnimalList.add(Animal.RABBIT);
                    System.out.println("+++" + orange);
                    userAnimalList.size();
                }
            } else if (blue == Animal.RABBIT) {
                for (int n = 0; n < (qantityOfRabbit + 1) / 2; n++) {
                    userAnimalList.add(Animal.RABBIT);
                    System.out.println("+++" + blue);
                    userAnimalList.size();
                }
            }
            int qantityOfSheep = Collections.frequency(userAnimalList, Animal.SHEEP);
            if (orange == Animal.SHEEP) {
                for (int n = 0; n < (qantityOfSheep + 1) / 2; n++) {
                    userAnimalList.add(Animal.SHEEP);
                    System.out.println("+++" + orange);
                    userAnimalList.size();
                }
            } else if (blue == Animal.SHEEP) {
                for (int n = 0; n < (qantityOfSheep + 1) / 2; n++) {
                    userAnimalList.add(Animal.SHEEP);
                    System.out.println("+++" + blue);
                    userAnimalList.size();
                }
            }
            int qantityOfCow = Collections.frequency(userAnimalList, Animal.COW);
            if (orange == Animal.COW) {
                for (int n = 0; n < (qantityOfCow + 1) / 2; n++) {
                    userAnimalList.add(Animal.COW);
                    System.out.println("+++" + orange);
                    userAnimalList.size();
                }
            } else if (blue == Animal.COW) {
                for (int n = 0; n < (qantityOfPig + 1) / 2; n++) {
                    userAnimalList.add(Animal.COW);
                    System.out.println("+++" + blue);
                    userAnimalList.size();
                }
            }
            int qantityOfHorse = Collections.frequency(userAnimalList, Animal.HORSE);
            if (orange == Animal.HORSE) {
                for (int n = 0; n < (qantityOfHorse + 1) / 2; n++) {
                    userAnimalList.add(Animal.HORSE);
                    System.out.println("+++" + orange);
                    userAnimalList.size();
                }
            } else if (blue == Animal.HORSE) {
                for (int n = 0; n < (qantityOfHorse + 1) / 2; n++) {
                    userAnimalList.add(Animal.HORSE);
                    System.out.println("+++" + blue);
                    userAnimalList.size();
                }
            }
            return userAnimalList;
        }

        public ArrayList getlist () {
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
        return  greedingUser;
    }

    public void exSheepToPig(ArrayList greedingUser) {
    }
}
