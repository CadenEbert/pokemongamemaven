package javafx;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
        public static final IntegerProperty coins = new SimpleIntegerProperty(100000);
        public static ArrayList<VBox> paneList = new ArrayList<VBox>();
        public static int currentBadge = 0;
        public static int multiplier = 1;
        public static boolean scene2 = true;
        
        
        
        Parent root;
        
        public void start(Stage primaryStage) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/gui.fxml"));
                root = loader.load();

                Controller mainControl = loader.getController();
                Text coinsText = new Text();
                coinsText.setStyle("-fx-font: 36 arial;");       
                mainControl.textBox.getChildren().add(coinsText); 
                coinsText.textProperty().bind(coins.asString());
               

                primaryStage.setTitle("Game");
                primaryStage.setScene(new Scene(root));
                primaryStage.show();
                primaryStage.setOnCloseRequest(event -> {
                mainControl.executorService.shutdown();
                });

                
        }

        public static void main(String[] args)  {
                launch(args);                
        }
}
