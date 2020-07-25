package SuperFarmer;

import java.util.ArrayList;
import java.util.Collections;

public class Game {


    public void run() {
        //Tworzę obiekty
        UserAnimalList userAnimalList = new UserAnimalList();
        ComputerAnimalLIst computerAnimalLIst = new ComputerAnimalLIst();

        //Tworzę listę dla komputera i usera
        ArrayList userList = userAnimalList.getlist();
        ArrayList computerList = computerAnimalLIst.getList();
        //Tworzę zmienne do warunku z wartościa inicjalną False
        boolean getWinnerUser = false;
        boolean getWinnerComputer = false;

        /*while (getWinnerComputer == false ||  getWinnerUser == false) {*/

                //na obiekcie userList wywołuję metodę greeding
                //ArrayList userListAfterGreeding = userAnimalList.greedingUser(userList);
                //na obiekcie userList AfterGreeding wywołuję mwtodę checkCollection
                //getWinnerUser = userAnimalList.checkAnimalsInCollection(userListAfterGreeding);

                ArrayList computerListAfterGreeding = computerAnimalLIst.greedingComputer(computerList);
                getWinnerComputer = computerAnimalLIst.checkAnimalsInCollection(computerListAfterGreeding);
                //
                //Animal choice = Animal.PIG;
                //System.out.println("User after greeding " + userListAfterGreeding.size());
                System.out.println("Computer after greeding " + computerListAfterGreeding.size());
                System.out.println(computerListAfterGreeding.contains(Animal.RABBIT));

                if (computerListAfterGreeding.contains(Animal.RABBIT)) {
                    computerListAfterGreeding.remove(Animal.RABBIT);
                    computerListAfterGreeding.remove(Animal.RABBIT);
                    computerListAfterGreeding.remove(Animal.RABBIT);
                    computerListAfterGreeding.remove(Animal.RABBIT);
                    computerListAfterGreeding.remove(Animal.RABBIT);
                    computerListAfterGreeding.remove(Animal.RABBIT);
                    computerListAfterGreeding.add(Animal.RABBIT);
                    computerListAfterGreeding.add(Animal.SHEEP);
                    computerListAfterGreeding.add(Animal.PIG);
                    computerListAfterGreeding.add(Animal.COW);
                    computerListAfterGreeding.add(Animal.HORSE);
                    System.out.println("Wymiana");
                    System.out.println("Computer after exchange " + computerListAfterGreeding.size());
                } else if (Collections.frequency(computerListAfterGreeding, Animal.RABBIT) == 1) {
                /*computerListAfterGreeding.remove(Animal.SHEEP);
                computerListAfterGreeding.remove(Animal.SHEEP);*/
                    computerListAfterGreeding.add(Animal.SHEEP);
                    computerListAfterGreeding.add(Animal.PIG);
                    computerListAfterGreeding.add(Animal.COW);
                    computerListAfterGreeding.add(Animal.HORSE);
                    System.out.println("Wymiana");

                    //System.out.println("After exchange " + userListAfterGreeding.size());

                }
            }
       /* }*/
    }

