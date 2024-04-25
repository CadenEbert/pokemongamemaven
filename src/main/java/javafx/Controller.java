package javafx;



import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;

public class Controller extends Main {

    @FXML
    private FlowPane inventory;

    @FXML
    private Text coinsPokeText;

    @FXML
    private ImageView pokemonImage;

    @FXML
    private Text coinsText;

    @FXML
    private Button pokeballButton;

    @FXML
    public static AnchorPane pokemonPanel;

    @FXML
    private Button sellButton;

    @FXML
    void countMoney(MouseEvent event) {
        coinsText.setText("Coins: " + coins);
        coins += 1;

    }


    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        

    }


    @FXML
    void openGreatBall(MouseEvent event) throws FileNotFoundException {
        int list = 2;
        if (coins >= 250) {
            String name = PokeBallRoll.greatballOpen();
            AnchorPane pane = Inventory.newPokeRoll(name, list);

            this.inventory.getChildren().add(pane);
            coins -= 50;
        }

    }

    @FXML
    void openPokeBall(MouseEvent event) throws FileNotFoundException {
        int list = 1;
        if (coins >= 50) {
            String name = PokeBallRoll.pokeballOpen();
            AnchorPane pane = Inventory.newPokeRoll(name, list);

            this.inventory.getChildren().add(pane);
            coins -= 50;
        }

    }

    @FXML
    void openUltraBall(MouseEvent event) throws FileNotFoundException {
        int list = 3;
        if (coins >= 500) {
            String name = PokeBallRoll.ultraballOpen();
            AnchorPane pane = Inventory.newPokeRoll(name, list);

            this.inventory.getChildren().add(pane);
            coins -= 50;
        }

    }

    @FXML
    void sell(MouseEvent event) {

    }

}



