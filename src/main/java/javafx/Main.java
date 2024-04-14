package javafx;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
        public int coins = 0;

        public void start(Stage primaryStage) throws IOException {
                Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
                primaryStage.setTitle("Game");
                primaryStage.setScene(new Scene(root));
                primaryStage.show();
        }


        public static void main(String[] args)  {
                launch();


        }

}
