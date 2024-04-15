package javafx;



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
    private ImageView image;

    @FXML
    private Text coinsText;

    @FXML
    private Button pokeballButton;

    @FXML
    private AnchorPane pokemonPanel;

    @FXML
    private Button sellButton;

    @FXML
    void countMoney(MouseEvent event) {
        coinsText.setText("Coins: " + coins);
        coins += 1;

    }

    @FXML
    void openGreatBall(MouseEvent event) {

    }

    @FXML
    void openPokeBall(MouseEvent event) {
        if (coins >= 50) {
            coinsText.setText("it worked");

        }

    }

    @FXML
    void openUltraBall(MouseEvent event) {

    }

    @FXML
    void sell(MouseEvent event) {

    }

}



