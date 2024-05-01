package javafx;

import java.io.IOException;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
        public static IntegerProperty coins = new SimpleIntegerProperty(1000);
        

        public void start(Stage primaryStage) throws IOException {
                java.net.URL url = Paths.get("./src/main/java/javafx/fxml/gui.fxml").toUri().toURL();
                Parent root = FXMLLoader.load(url);
                primaryStage.setTitle("Game");
                primaryStage.setScene(new Scene(root));

                Text coinsText = new Text("text");
                coinsText.setStyle("-fx-font: 36 arial;");       
                Controller.textBox.getChildren().add(coinsText);      
                coinsText.textProperty().bind(coins.asString());

                primaryStage.show();
        }

        public static void main(String[] args)  {
                launch(args);
                
        }
}
