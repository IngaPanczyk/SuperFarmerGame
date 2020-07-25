package SuperFarmer;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.*;

import static javafx.application.Application.launch;

public class GameRunner extends Application {
    private Image imageback = new Image("file:src/main/resources/Plansza do gry (2).png");
    private Image rabbit = new Image("file:src/main/resources/Rabbit.png", 100.0, 100.0, true, true);
    private Image fox = new Image("file:src/main/resources/Fox.png", 100.0, 100.0, true, true);
    private Image sheep = new Image("file:src/main/resources/Sheep.png", 100.0, 100.0, true, true);
    private Image pig = new Image("file:src/main/resources/Pig.png", 100.0, 100.0, true, true);
    private Image cow = new Image("file:src/main/resources/Cow.png", 100.0, 100.0, true, true);
    private Image horse = new Image("file:src/main/resources/Horse.png", 100.0, 100.0, true, true);
    private Image bigDog = new Image("file:src/main/resources/Sheep.png", 100.0, 100.0, true, true);
    private FlowPane animals = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane rabbits = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane sheep1 = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane pigs = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane cows = new FlowPane(Orientation.HORIZONTAL);
    private FlowPane horses = new FlowPane(Orientation.HORIZONTAL);
    private Label totalLabel = new Label();
    private Label blueDice = new Label();
    private Label orangeDice = new Label();
    private Label qOfRabbits = new Label();
    private Label qOfPigs = new Label();
    private Label qOfSheep = new Label();
    private Label qofCows = new Label();
    private Label qofHorses = new Label();

    public static void main(String[] args) {
      /*  Game game = new Game();
        game.run();*/
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        //Mechanika Gry----------------------------------------------------------------------------------------------
        UserAnimalList userAnimalList = new UserAnimalList();
        ComputerAnimalLIst computerAnimalLIst = new ComputerAnimalLIst();

        ArrayList userList = userAnimalList.getlist();
        ArrayList computerList = computerAnimalLIst.getList();

        boolean getWinnerUser = false;
        boolean getWinnerComputer = false;
        int counter = 0;

        //-----------------------------------------------------------------------------------------------------------


        GridPane grid = new GridPane();

        Button startGame = new Button();
        startGame.setText("START GAME");
        startGame.setOnAction((e) -> {
        });
        grid.add(startGame, 1, 2);


        Button throwDice = new Button();
        throwDice.setText("THROW DICE");
        throwDice.setOnAction((e) -> {
            boolean game = true;
            while (game == true) {
                ArrayList userListAfterGreeding = userAnimalList.greedingUser(userList);
                ArrayList computerListAfterGreeding = computerAnimalLIst.greedingComputer(computerList);

                ImageView img = new ImageView(rabbit);
                ImageView img1 = new ImageView(sheep);
                ImageView img2 = new ImageView(pig);
                ImageView img3 = new ImageView(cow);
                ImageView img4 = new ImageView(horse);

                if (userListAfterGreeding.contains(Animal.RABBIT)) {
                    rabbits.getChildren().add(img);
                }
                if (userListAfterGreeding.contains(Animal.SHEEP)) {
                    sheep1.getChildren().add(img1);
                }
                if (userListAfterGreeding.contains(Animal.PIG)) {
                    pigs.getChildren().add(img2);
                }
                if (userListAfterGreeding.contains(Animal.COW)) {
                    cows.getChildren().add(img3);
                }
                if (userListAfterGreeding.contains(Animal.HORSE)) {
                    horses.getChildren().add(img4);
                }

                if (userListAfterGreeding.contains(Animal.SHEEP)) {
                    game = false;
                }
            }
            System.out.println("YOU WON");

            Label orangeDice = new Label();

            // orange.setText(String.valueOf(orange));
        });
        grid.add(throwDice, 2, 2);


        grid.getColumnConstraints().

                add(new ColumnConstraints(200)); // column 0 is 100 wide
        grid.getColumnConstraints().

                add(new ColumnConstraints(200)); // column 1 is 200 wide
        grid.getColumnConstraints().

                add(new ColumnConstraints(200)); // column 0 is 100 wide
        grid.getColumnConstraints().

                add(new ColumnConstraints(200)); // column 1 is 200 wide
        grid.getColumnConstraints().

                add(new ColumnConstraints(200)); // column 0 is 100 wide
        grid.getColumnConstraints().

                add(new ColumnConstraints(200)); // column 1 is 200 wide
        grid.getRowConstraints().

                add(new RowConstraints(10)); // column 0 is 100 wide
        grid.getRowConstraints().

                add(new RowConstraints(10)); // column 0
        grid.setBackground(background);
        grid.add(rabbits, 1, 10);
        grid.add(sheep1, 1, 11);
        grid.add(pigs, 1, 12);
        grid.add(cows, 1, 13);
        grid.add(horses, 1, 14);


        Scene scene = new Scene(grid, 1600, 900, Color.YELLOW);
        primaryStage.setTitle("SuperFarmer");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
