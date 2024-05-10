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
import javafx.stage.Stage;

public class PC_Controller extends Controller {
    PC_Controller instance = null;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button Exit;

    @FXML
    public FlowPane pcInventory1;


    @FXML
    void switchToMain(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/gui.fxml"));
        root = loader.load();

        Controller mainControl = loader.getController();
        mainControl.update();
        mainControl.setText();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); 
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void update() {
        for (int i = 0; i < paneList.size(); i++) {
            pcInventory1.getChildren().add(paneList.get(i));
        }

    }
    
}
