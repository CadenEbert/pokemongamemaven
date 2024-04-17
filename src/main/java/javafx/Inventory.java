package javafx;

public class Inventory extends Main {

    public String image;
    public String name;
    public int cost;
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
        System.out.println(getImage("Bulbasaur"));
    }

    public Inventory(String name){
        this.name = name;
        newRoll(name);
    }
    

    public void newRoll(String name){
         
    }


    public static String getImage(String name){
        int index = 0;

        for (int i = 0; i < pokemon.length; i++) {
            if (name == pokemon[i]) {
                index = i;
            }
        }
        System.out.println(index);

        return " ";
    }
    
}
