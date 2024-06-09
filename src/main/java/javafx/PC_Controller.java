package javafx;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PC_Controller extends Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button Exit;

    @FXML
    FlowPane pcInventory1;

    @FXML
    FlowPane pcInventory2;

    // switches to main scene
    @FXML
    void switchToMain(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/gui.fxml"));
        root = loader.load();

        Controller mainControl = loader.getController();
        mainControl.update();
        Text coinsText = new Text();
        coinsText.setStyle("-fx-font: 36 arial;");
        mainControl.textBox.getChildren().add(coinsText);
        coinsText.textProperty().bind(coins.asString());

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        scene2 = false;
    }

    

    // updates panels when switching scenes
    @Override
    public void update() {
        for (int i = 0; i < paneList.size(); i++) {
            pcInventory1.getChildren().add(paneList.get(i));
        }

    }

}
