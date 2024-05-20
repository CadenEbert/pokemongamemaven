package javafx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
        public static IntegerProperty coins = new SimpleIntegerProperty(100000);
        public static ArrayList<VBox> paneList = new ArrayList<VBox>();
        public static int currentBadge = 0;
        public static int multiplier = 1;
        public static boolean scene2 = false;
        
        Parent root;
        
        public void start(Stage primaryStage) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/gui.fxml"));
                root = loader.load();

                Controller mainControl = loader.getController();
                mainControl.setText();

                primaryStage.setTitle("Game");
                primaryStage.setScene(new Scene(root));
                primaryStage.show();

                
        }

        public static void main(String[] args)  {
                launch(args);                
        }
}
