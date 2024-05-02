package javafx;



import java.io.FileNotFoundException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controller extends Main {

    @FXML
    public FlowPane inventory;


    @FXML
    private ImageView pokemonImage;


    @FXML
    private Button pokeballButton;

    @FXML
    public static AnchorPane pokemonPanel;

    @FXML
    private Button sellButton;

    @FXML
    public static HBox textBox = new HBox();




    @FXML
    void countMoney(MouseEvent event) {
        
        coins.add(1);
        
        

    }

    


    @FXML
    void openGreatBall(MouseEvent event) throws FileNotFoundException {
        int list = 2;
        boolean shiny = false;
        int shinyRoll = (int) (Math.random() * 10);

        if (shinyRoll == 1) {
            shiny = true;
        }

        if (Main.coins.get() >= 250) {
            String name = PokeBallRoll.greatballOpen();
            VBox pane = Inventory.newPokeRoll(name, list, shiny);

            this.inventory.getChildren().add(pane);
            coins.subtract(250);
            System.out.println(coins);
        }

    }

    @FXML
    void openPokeBall(MouseEvent event) throws FileNotFoundException {
        int list = 1;
        boolean shiny = false;
        int shinyRoll = (int) (Math.random() * 10);

        if (shinyRoll == 1) {
            shiny = true;
        }

        if (coins.get() >= 50) {
            String name = PokeBallRoll.pokeballOpen();
            VBox pane = Inventory.newPokeRoll(name, list, shiny);

            this.inventory.getChildren().add(pane);
            coins.subtract(50);
            
        }

    }

    @FXML
    void openUltraBall(MouseEvent event) throws FileNotFoundException {
        int list = 3;
        boolean shiny = false;
        int shinyRoll = (int) (Math.random() * 10);

        if (shinyRoll == 1) {
            shiny = true;
        }

        if (coins.get() >= 500) {
            String name = PokeBallRoll.ultraballOpen();
            VBox pane = Inventory.newPokeRoll(name, list, shiny);

            this.inventory.getChildren().add(pane);
            coins.subtract(500);
            
        }

    }

    
    @FXML
    void sellAll(MouseEvent event) {
        inventory.getChildren().clear();
        for (int i = 0; i < Inventory.totalCost.size(); i++) {
            coins.add(Inventory.totalCost.get(i));
            
        }
        Inventory.totalCost.clear();
    }

}



