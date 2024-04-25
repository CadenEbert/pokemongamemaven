package javafx;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

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


    
    public static void main(String[] args) {
        

        
    }


    public static AnchorPane newPane(String imageString, String name, int list) {
        AnchorPane pane = new AnchorPane();
        Button button = new Button("Sell");
        String cost = getCost(name, list);
        Text textCost = new Text(cost);
        ImageView image = new ImageView(imageString);
        pane.setStyle("-fx-background-color: #ffffff");
        AnchorPane.setTopAnchor(button, 100.0);
        AnchorPane.setLeftAnchor(button, 60.0);
        AnchorPane.setTopAnchor(textCost, 105.0);
        AnchorPane.setLeftAnchor(textCost, 20.0);
        AnchorPane.setTopAnchor(image, 0.0);
        AnchorPane.setLeftAnchor(image, 10.0);
        pane.getChildren().addAll(button, image, textCost);
        return pane;
    }
    

    public static AnchorPane newPokeRoll(String name, int list) throws FileNotFoundException{
        String image = getImage(name);
        AnchorPane newPane = newPane(image, name, list);
        
        return newPane;
    }



    public static String getImage(String name) throws FileNotFoundException {
        String index = "";
        String image = "";
        Scanner sc = new Scanner(new File("pokemon.txt"));
        
        for (int i = 0; i < pokemon.length; i++) {
            if (name == pokemon[i]) {
                index = String.valueOf(i + 1);
                System.out.println(name);
                System.out.println(pokemon[i]);
                System.out.println(index);
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
        System.out.println(image);
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
