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
    PC_Controller instance = null;

    private Stage stage;
    private Scene scene;

    @FXML
    private Button Exit;

    @FXML
    public FlowPane pcInventory1;


    public void update() {
        
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

    @Override
    void pcScene(ActionEvent event) throws IOException {
        super.pcScene(event);
        System.out.println("helloo");
        for (int i = 0; i < paneList.size(); i++) {
            pcInventory1.getChildren().add(paneList.get(i));
            System.out.println("Hello");
        }
    }
    
}
