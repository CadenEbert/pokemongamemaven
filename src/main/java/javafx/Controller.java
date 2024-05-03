package javafx;



import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Controller extends Main {

    @FXML
    public FlowPane inventory;


    @FXML
    private ImageView pokemonImage;


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

    private boolean hasRun = false;

    private static String[] badgeList = {"Boulder", "Cascade", "Thunder", "Rainbow", "Soul", "Marsh", "Volcano", "Earth"};
    private static int[] badgeCost = {100, 500, 1000, 2000, 4000, 6000, 8000, 10000};
    private int currentBadge = 0;
    private int multiplier = 1;

    @FXML
    void countMoney(MouseEvent event) {
        if (hasRun == false) {
            setText();
            hasRun = true;

        }
        coins.set(coins.get() + multiplier);
    }

    public void setText(){
        Text coinsText = new Text();
        coinsText.setStyle("-fx-font: 36 arial;");       
        textBox.getChildren().add(coinsText); 
        coinsText.textProperty().bind(coins.asString());
    }

    @FXML
    void buyBadge(ActionEvent event) {
        if (coins.get() >= badgeCost[currentBadge] && currentBadge != 7) {
            multiplier += currentBadge;
            coins.set(coins.get() - badgeCost[currentBadge]);
            currentBadge += 1;
            badgeText.setText(badgeList[currentBadge] + " Badge");
            badgeCostText.setText(String.valueOf(badgeCost[currentBadge]) + " Coins");
            changeBadge(currentBadge); 
        } else {
            badgeCostText.setText("MAX BADGE");
        }
    }

    private void changeBadge(int currentBadge){
        String badge = badgeList[currentBadge];
        Image newImage = new Image(getClass().getResource("/javafx/images/" + badge + "_Badge.png").toExternalForm());
        badges.setImage(newImage);
        
    }

    


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

            this.inventory.getChildren().add(pane);
            coins.set(coins.get() - 250);
        }
    }

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

            this.inventory.getChildren().add(pane);
            coins.set(coins.get() - 50);
            
        }

    }

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

            this.inventory.getChildren().add(pane);
            coins.set(coins.get() - 500);
            
        }

    }

    
    @FXML
    void sellAll(MouseEvent event) {
        inventory.getChildren().clear();
        for (int i = 0; i < Inventory.totalCost.size(); i++) {
            coins.set(coins.get() + Inventory.totalCost.get(i));
            
        }
        Inventory.totalCost.clear();
    }

}



