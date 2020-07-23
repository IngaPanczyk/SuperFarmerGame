package SuperFarmer;

import java.util.ArrayList;

public class Game {


    public void run() {
        UserAnimalList userAnimalList = new UserAnimalList();
        ComputerAnimalLIst computerAnimalLIst = new ComputerAnimalLIst();
        boolean getWinnerUser = false;
        boolean getWinnerComputer = false;

        while (getWinnerComputer != true || getWinnerUser != true){
            //Scanner
            userAnimalList.exchange();
            //Scanner
            ArrayList userListAfterGreeding = userAnimalList.greedingUser(userAnimalList.getlist());
            getWinnerUser = userAnimalList.checkAnimalsInCollection(userListAfterGreeding);

            userAnimalList.exchange();
            ArrayList computerListAfterGreeding = computerAnimalLIst.greedingComputer(computerAnimalLIst.getList());
            getWinnerComputer = computerAnimalLIst.checkAnimalsInCollection(computerListAfterGreeding);

        }
    }
}
