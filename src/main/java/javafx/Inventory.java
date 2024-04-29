package javafx;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.paint.Color;

import java.io.File;

public class Inventory extends Main {
    public static String[] pokemon = { "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard",
    "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna","Beedrill",
    "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok","Pikachu",
    "Raichu", "Sandshrew", "Sandslash", "Nidoran", "Nidorina", "Nidoqueen", "Nidoran", "Nidorino","Nidoking",
    "Clefairy", "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff", "Zubat", "Golbat","Oddish",
    "Gloom", "Vileplume", "Paras", "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio","Meowth", "Persian",
    "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag", "Poliwhirl","Poliwrath",
    "Abra", "Kadabra", "Alakazam", "Machop", "Machoke", "Machamp", "Bellsprout", "Weepinbell","Victreebel",
    "Tentacool", "Tentacruel", "Geodude", "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke","Slowbro",
    "Magnemite", "Magneton", "Farfetch'd", "Doduo", "Dodrio", "Seel", "Dewgong", "Grimer", "Muk","Shellder",
    "Cloyster", "Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler","Voltorb",
    "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan","Lickitung",
    "Koffing", "Weezing", "Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea","Seadra",
    "Goldeen", "Seaking", "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz","Magmar", "Pinsir",
    "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon",
    "Porygon","Omanyte", "Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos",
    "Moltres","Dratini", "Dragonair", "Dragonite", "Mewtwo", "Mew" };



    public static VBox newPane(String imageString, String name, int list) {
        VBox pane = new VBox();
        pane.setPrefSize(70,130);
        Button button = new Button("Sell");
        String cost = getCost(name, list);
        Text textCost = new Text("$" + cost);
        ImageView image = new ImageView(imageString);
        Text pokemonName = new Text(name);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(textCost, button);


        pane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        pokemonName.setStyle("-fx-alignment: center");
        pokemonName.setStyle("flex-direction: column");
        pane.setStyle("-fx-background-color: #DCDCDC");
        pokemonName.setTextAlignment(TextAlignment.CENTER);
        pokemonName.setLayoutY(0.0);

        hbox.setAlignment(Pos.CENTER);
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10,10,10,10));
        hbox.setSpacing(15.0);

        EventHandler<ActionEvent> sell = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
                Main.coins += Integer.parseInt(cost);
                ((FlowPane) pane.getParent()).getChildren().remove(pane);
            } 
        }; 
        button.setOnAction(sell);
        pane.getChildren().addAll(pokemonName, image, hbox);
        return pane;
    }
    

    public static VBox newPokeRoll(String name, int list, boolean shiny) throws FileNotFoundException{
        String image = getImage(name, shiny);
        VBox newPane = newPane(image, name, list);
        return newPane;
    }



    public static String getImage(String name, boolean shiny) throws FileNotFoundException {
        String index = "";
        String image = "";
        File f = new File("");

        

        if (shiny == false){
            f = new File("pokemon.txt");
        } else if (shiny == true) {
            f = new File("pokemonShinys.txt");  
        }

        Scanner sc = new Scanner(f);
        
        
        for (int i = 0; i < pokemon.length; i++) {
            if (name == pokemon[i]) {
                index = String.valueOf(i + 1);
                break;      
            }
        }
        while (sc.hasNext()){
            String line = sc.nextLine();
            if (line.contains(index)) {
                image = line;
                break;
            }
        }
        sc.close();
        return image;
    }

    public static String getCost(String name, int list) {
        int roll = 0;
        String cost = "";

        switch(list) {
            case 1:
            roll += (int)(Math.random() * 100) + 1;
            cost = String.valueOf(roll);
            break;
            case 2:
            roll += (int)(Math.random() * 100) + 200;
            cost = String.valueOf(roll);
            break;
            case 3:
            roll += (int)(Math.random() * 500) + 300;
            cost = String.valueOf(roll);
            break;
        }
        return cost;
    }

    
    
}
