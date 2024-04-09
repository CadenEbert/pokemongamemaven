package javafx;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


public class Controller extends PokeBallRoll {

    @FXML
    private Button greatballBuy;

    @FXML
    private Button pokeballBuy;

    @FXML
    private Button ultraballBuy;

    @FXML
    void countMoney(MouseEvent event) {

    }

    @FXML
    void openGreatBall(MouseEvent event) {

    }

    @FXML
    void openPokeBall(MouseEvent event)  {
        if (coins >= 50) {
            

        }

    }

    @FXML
    void openUltraBall(MouseEvent event) {

    }

}

