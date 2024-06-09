package javafx;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
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
    private ImageView trainerImage;

    @FXML
    private Text trainerNameText;

    @FXML
    public HBox textBox;

    @FXML
    private Text trainerText;

    private Stage stage;
    private Scene scene;
    private Parent root;
    ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    @FXML
    public FlowPane pcInventory1;

    private static String[] badgeList = {"Boulder", "Cascade", "Thunder", "Rainbow", "Soul", "Marsh", "Volcano", "Earth"};
    private static int[] badgeCost = {100, 500, 1000, 2000, 4000, 6000, 8000, 10000};
    private static boolean shiny;
    private int trainerIndex = 0;
    private int trainerPeriod = 5;
    private int[] trainerCost = {300, 500, 1000, 2000};
    private String[] trainerList = {"Blackbelt", "Blue", "Red"};

    FXMLLoader pcLoader = new FXMLLoader(getClass().getResource("fxml/PC.fxml"));
    public static PC_Controller pc = new PC_Controller();
    
    
    //adds # of multiplier to coins
    @FXML
    void countMoney(MouseEvent event) {
        coins.set(coins.get() + multiplier);
    }

    @FXML
    void addTrainer(ActionEvent event) throws InterruptedException {
        if (Main.coins.get() > trainerCost[trainerIndex] && trainerIndex < trainerList.length) {
            executorService.scheduleAtFixedRate(() -> {
                Main.coins.set(Main.coins.get() + multiplier);
            }, 0, trainerPeriod, TimeUnit.SECONDS);
            Main.coins.set(Main.coins.get() - trainerCost[trainerIndex]);
            trainerImage.setImage(new Image(getClass().getResource("/javafx/images/" + trainerList[trainerIndex]   + ".png" ).toExternalForm()));
            trainerText.setText(String.valueOf(trainerCost[trainerIndex] + " Coins"));
            trainerNameText.setText(trainerList[trainerIndex]);
            trainerIndex += 1;
            trainerPeriod -= 1;
        }
        
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
        
        VBox pane = PokeBallRoll.openPokeBall(shiny, list, 250);

        this.inventory.getChildren().add(pane);
    }

    //rolls poekball and adds panel
    @FXML
    void openPokeBall(MouseEvent event) throws FileNotFoundException {
        int list = 1;

        VBox pane = PokeBallRoll.openPokeBall(shiny, list, 50);

        this.inventory.getChildren().add(pane);

    }

    //rolls ultraball and adds panel
    @FXML
    void openUltraBall(MouseEvent event) throws FileNotFoundException {
        int list = 3;

        VBox pane = PokeBallRoll.openPokeBall(shiny, list, 500);

        this.inventory.getChildren().add(pane);
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



