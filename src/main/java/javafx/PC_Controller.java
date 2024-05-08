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
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class PC_Controller extends Controller {

    private Stage stage;
    private Scene scene;


    @FXML
    private Button Exit;

    @FXML
    public static FlowPane pcInventory1;

    @Override
    public void start(Stage primaryStage) throws IOException {
        for (int i = 0; i < paneList.size(); i++) {
            pcInventory1.getChildren().add(paneList.get(i));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }



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
