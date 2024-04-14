package javafx;

import java.io.IOException;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
        public static int coins = 0;



        public void start(Stage primaryStage) throws IOException {


                java.net.URL url = Paths.get("./src/main/java/javafx/fxml/gui.fxml").toUri().toURL();
                Parent root = FXMLLoader.load(url);

                primaryStage.setTitle("Game");
                primaryStage.setScene(new Scene(root));
                primaryStage.show();
        }


        public static void main(String[] args)  {


                launch(args);
                


        }

}
