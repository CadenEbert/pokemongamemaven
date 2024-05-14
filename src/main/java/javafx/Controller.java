package javafx;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller extends Main  {

    @FXML
    public FlowPane inventory;


    @FXML
    private ImageView pokemonImage;

    @FXML
    private Button badgeBut;


    @FXML
    private Button pokeballButton;

    @FXML
    public static AnchorPane pokemonPanel;

    @FXML
    private Text badgeCostText;

    @FXML
    private Button sellButton;

    @FXML
    private Text badgeText;

    @FXML
    private ImageView badges;

    @FXML
    public HBox textBox;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public FlowPane pcInventory1;

    private static String[] badgeList = {"Boulder", "Cascade", "Thunder", "Rainbow", "Soul", "Marsh", "Volcano", "Earth"};
    private static int[] badgeCost = {100, 500, 1000, 2000, 4000, 6000, 8000, 10000};
    
    
    //adds # of multiplier to coins
    @FXML
    void countMoney(MouseEvent event) {
        coins.set(coins.get() + multiplier);
    }

    @FXML
    void addTrainer(ActionEvent event) throws InterruptedException {
        

    }

    
    //switches to pc scene
    @FXML
    void pcScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/PC.fxml"));
        root = loader.load();

        PC_Controller pc = loader.getController();
        pc.update();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); 
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //updates badges and coins when switching scenes
    public void update() {
        for (int i = 0; i < paneList.size(); i++) {
            inventory.getChildren().add(paneList.get(i));
        }
        if (currentBadge < 8) {
            badgeText.setText(badgeList[currentBadge] + " Badge");
            badgeCostText.setText(String.valueOf(badgeCost[currentBadge]) + " Coins");
            changeBadge(currentBadge); 
        } else {
            changeBadge(currentBadge - 1);
            badgeCostText.setText("MAX BADGE");
            badgeBut.setDisable(true);
        }

    }

    
    //binds text of coins
    public void setText(){
        Text coinsText = new Text();
        coinsText.setStyle("-fx-font: 36 arial;");       
        textBox.getChildren().add(coinsText); 
        coinsText.textProperty().bind(coins.asString());
    }

    //changes badge picture and adds to multiplier
    @FXML
    void buyBadge(ActionEvent event) {
        if (coins.get() >= badgeCost[currentBadge] && currentBadge != 7) {
            multiplier += currentBadge + 1;
            coins.set(coins.get() - badgeCost[currentBadge]);
            currentBadge += 1;
            badgeText.setText(badgeList[currentBadge] + " Badge");
            badgeCostText.setText(String.valueOf(badgeCost[currentBadge]) + " Coins");
            changeBadge(currentBadge); 
        } else {
            badgeCostText.setText("MAX BADGE");
            multiplier += currentBadge + 1;
            coins.set(coins.get() - badgeCost[currentBadge]);
            badgeBut.setDisable(true);
            currentBadge += 1;
        }
    }

    //changes badge picture
    private void changeBadge(int currentBadge){
        String badge = badgeList[currentBadge];
        Image newImage = new Image(getClass().getResource("/javafx/images/" + badge + "_Badge.png").toExternalForm());
        badges.setImage(newImage);
        
    }
    
    //rolls greatball and adds panel
    @FXML
    void openGreatBall(MouseEvent event) throws FileNotFoundException {
        int list = 2;
        boolean shiny = false;
        int shinyRoll = (int) (Math.random() * 10);

        if (shinyRoll == 1) {
            shiny = true;
        }

        if (Main.coins.get() >= 250) {
            String name = PokeBallRoll.greatballOpen();
            VBox pane = Inventory.newPokeRoll(name, list, shiny);

            paneList.add(pane);

            inventory.getChildren().add(pane);
            coins.set(coins.get() - 250);
        }
    }

    //rolls poekball and adds panel
    @FXML
    void openPokeBall(MouseEvent event) throws FileNotFoundException {
        int list = 1;
        boolean shiny = false;
        int shinyRoll = (int) (Math.random() * 10);

        if (shinyRoll == 1) {
            shiny = true;
        }

        if (coins.get() >= 50) {
            String name = PokeBallRoll.pokeballOpen();
            VBox pane = Inventory.newPokeRoll(name, list, shiny);

            paneList.add(pane);

            this.inventory.getChildren().add(pane);
            coins.set(coins.get() - 50);
            
        }

    }

    //rolls ultraball and adds panel
    @FXML
    void openUltraBall(MouseEvent event) throws FileNotFoundException {
        int list = 3;
        boolean shiny = false;
        int shinyRoll = (int) (Math.random() * 10);

        if (shinyRoll == 1) {
            shiny = true;
        }

        if (coins.get() >= 500) {
            String name = PokeBallRoll.ultraballOpen();
            VBox pane = Inventory.newPokeRoll(name, list, shiny);

            paneList.add(pane);

            this.inventory.getChildren().add(pane);
            coins.set(coins.get() - 500);
            
        }
    }

    //sells every panel in inventory (not in pc)
    @FXML
    void sellAll(MouseEvent event) {
        inventory.getChildren().clear();
        for (int i = 0; i < Inventory.totalCost.size(); i++) {
            coins.set(coins.get() + Inventory.totalCost.get(i));
            
        }
        paneList.clear();
        Inventory.totalCost.clear();
    }

}



