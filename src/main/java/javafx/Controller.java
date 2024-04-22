package javafx;



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
    void openGreatBall(MouseEvent event) {

    }

    @FXML
    void openPokeBall(MouseEvent event) {
        if (coins >= 50) {
            Inventory pokemonP = new Inventory("Bulbasaur", null, "3000");
            inventory.getChildren().add(inventory);
            

        }

    }

    @FXML
    void openUltraBall(MouseEvent event) {

    }

    @FXML
    void sell(MouseEvent event) {

    }

}



