package javafx;

import java.io.IOException;
import java.nio.file.Paths;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PC_Controller {

    private Stage stage;
    private Scene scene;


    @FXML
    private Button Exit;

    @FXML
    void switchToMain(ActionEvent event) throws IOException {
        java.net.URL url = Paths.get("./src/main/java/javafx/fxml/gui.fxml").toUri().toURL();
        Parent root = FXMLLoader.load(url);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); 
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
}
