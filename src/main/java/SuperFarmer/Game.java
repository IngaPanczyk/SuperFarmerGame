package SuperFarmer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {


    public void run() {
        UserAnimalList userAnimalList = new UserAnimalList();
        ComputerAnimalLIst computerAnimalLIst = new ComputerAnimalLIst();

        ArrayList userList = userAnimalList.getlist();
        ArrayList computerList = computerAnimalLIst.getList();

        Scanner scanner = new Scanner(System.in);

        boolean getWinnerUser = false;
        boolean getWinnerComputer = false;
        int counter = 0;


        while (getWinnerComputer == false && getWinnerUser == false) {
            counter++;
            System.out.println("Loop:" + counter);


            ArrayList userListAfterGreeding = userAnimalList.greedingUser(userList);
            System.out.println("Users animals: " + userListAfterGreeding);
            if (userListAfterGreeding.size()>=2) {
                System.out.println("Exchange! 6 RABBIT = 1 SHEEP - (Press 1), 3 SHEEP = 1 PIG - (Press 2), 2 PIG = 1 COW - (Press 3), 2 COW = 1 HORSE - (Press 4), EXIT- (Press 0)");
                int animalToChange = scanner.nextInt();
                if (animalToChange == 1) {
                    userAnimalList.exRabbittoSheep(userListAfterGreeding);
                } else if (animalToChange == 2) {
                    userAnimalList.exSheepToPig(userListAfterGreeding);
                } else if (animalToChange == 3) {
                    userAnimalList.exPigToCow(userListAfterGreeding);
                } else if (animalToChange == 4) {
                    userAnimalList.exCowToHorse(userListAfterGreeding);
                }
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
            getWinnerUser = userAnimalList.checkAnimalsInCollection(userListAfterGreeding);
            System.out.println("User after greeding has " + userListAfterGreeding.size() + " animals");
            System.out.println("------------------------------------------------------------------------");





            ArrayList computerListAfterGreeding = computerAnimalLIst.greedingComputer(computerList);

            if (Collections.frequency(computerListAfterGreeding, Animal.RABBIT) > 7) {
                computerAnimalLIst.exRabbitToScheep(computerListAfterGreeding);
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
            if (Collections.frequency(computerListAfterGreeding, Animal.SHEEP) > 4) {
                computerAnimalLIst.exSheepToPig(computerListAfterGreeding);
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
            if (Collections.frequency(computerListAfterGreeding, Animal.PIG) > 2) {
                computerAnimalLIst.exPigToCow(computerListAfterGreeding);
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
            if (Collections.frequency(computerListAfterGreeding, Animal.COW) > 2) {
                computerAnimalLIst.exCowToHorse(computerListAfterGreeding);
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }

            getWinnerComputer = computerAnimalLIst.checkAnimalsInCollection(computerListAfterGreeding);

            System.out.println("Computer after greeding has " + computerListAfterGreeding.size()+ " animals");
            System.out.println("------------------------------------------------------------------------");

            if (getWinnerComputer == true) {
                System.out.println("Computer WON!!!");
            } else if (getWinnerUser == true) {
                System.out.println("User WON!!!");
            }


        }
    }
}


