package javafx;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.File;


public class Inventory extends Main {

    private static ImageView image;
    private String name;
    private Text pokemonCost = new Text("");
    public static AnchorPane pane = new AnchorPane();
    private Button button = new Button("Sell");

    
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

    @Override
    public void init() {
        AnchorPane.setTopAnchor(button, 10.0);
        AnchorPane.setLeftAnchor(button, 20.0);
        AnchorPane.setTopAnchor(image, 10.0);
        AnchorPane.setLeftAnchor(image, 10.0);
        pane.getChildren().addAll(button, image);
    }

    public Inventory(String name, ImageView image, String pokemonCost){
        this.name = name;
        this.pokemonCost.setText(pokemonCost);
        
        
    }
    

    public void newRoll(String name) throws FileNotFoundException{
        
    }


    public static String getImage(String name) throws FileNotFoundException {
        String index = "";
        String image = "";
        Scanner sc = new Scanner(new File("pokemon.txt"));
        
        for (int i = 1; i < pokemon.length; i++) {
            if (name == pokemon[i]) {
                index = String.valueOf(i);
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

    public int getCost(String name) {
        return 0;
    }
    
}
