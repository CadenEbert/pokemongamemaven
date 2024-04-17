package javafx;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller extends Main {

    @FXML
    private Text coinsText;

    @FXML
    private Button pokeballButton;

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
            

        }

    }

    @FXML
    void openUltraBall(MouseEvent event) {

    }

}



