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
import javafx.scene.text.Text;

public class Controller extends Main {

    @FXML
    public FlowPane inventory;

    @FXML
    private Text coinsPokeText;

    @FXML
    private ImageView pokemonImage;


    @FXML
    public static Text coinsText = new Text("");

    @FXML
    private Button pokeballButton;

    @FXML
    public static AnchorPane pokemonPanel;

    @FXML
    private Button sellButton;

    @FXML
    private HBox textBox;



    @FXML
    void countMoney(MouseEvent event) {
        Main.coins.add(1);
        

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
            coins.add(-250);
            coinsText.setText("Coins: " + coins);
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
            coins.add(-50);
            
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
            coins.add(-500);
            
        }

    }

    @FXML
    void sell(MouseEvent event) {

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



