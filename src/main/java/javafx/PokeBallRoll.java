package javafx;


import java.util.Dictionary;


public class PokeBallRoll extends Inventory {


    public String[] pokemon = { "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard",
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
    public static String[] pokeball = { "Bulbasaur", "Ivysaur", "Charmander", "Charmeleon", "Squirtle", "Wartortle","Caterpie", "Metapod", "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeot", "Rattata","Raticate", "Ekans", "Pikachu", "Nidoran", "Nidoran", "Clefairy", "Vulpix","Jigglypuff", "Zubat", "Oddish", "Paras", "Venonat", "Diglett", "Meowth", "Psyduck","Mankey", "Growlithe", "Poliwag", "Abra", "Machop", "Bellsprout", "Tentacool","Geodude", "Ponyta", "Slowpoke", "Magnemite", "Doduo", "Seel", "Grimer", "Shellder","Gastly", "Drowzee", "Krabby", "Voltorb", "Exeggcute", "Cubone", "Hitmonlee", "Koffing","Rhyhorn", "Tangela", "Horsea", "Goldeen", "Staryu", "Tauros", "Magikarp", "Eevee","Omanyte", "Kabuto", "Dratini" };
    public static String[] greatball = { "Ivysaur", "Charmeleon", "Wartortle", "Metapod", "Kakuna", "Pidgeotto","Raticate","Spearow", "Arbok", "Raichu", "Sandslash", "Nidorina", "Nidorino", "Clefable","Ninetales", "Wigglytuff", "Golbat", "Gloom", "Parasect", "Venomoth", "Dugtrio","Persian", "Golduck", "Primeape", "Raichu", "Sandslash", "Nidorina", "Nidorino","Clefable","Ninetales", "Wigglytuff", "Golbat", "Gloom", "Parasect", "Venomoth", "Dugtrio","Persian", "Golduck", "Primeape", "Arcanine", "Poliwhirl", "Kadabra", "Machoke","Weepinbell", "Tentacruel", "Graveler", "Rapidash", "Slowbro", "Magneton", "Dodrio","Dewgong", "Muk", "Cloyster", "Haunter", "Hypno", "Kingler", "Electrode", "Exeggutor","Marowak", "Hitmonchan", "Lickitung", "Weezing", "Rhydon", "Chansey", "Seadra","Seaking", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Pinsir", "Ditto","Vaporeon", "Jolteon", "Flareon", "Porygon", "Omastar", "Kabutops", "Dragonair" };
    public static String[] ultraball = { "Venusaur", "Charizard", "Blastoise", "Butterfree", "Pidgeotto", "Sandshrew", "Nidoqueen", "Nidoking", "Spearow", "Fearow", "Arbok", "Vileplume", "Poliwrath","Alakazam", "Machamp", "Victreebel", "Golem", "Farfetch'd", "Kangaskhan", "Gengar","Onix", "Magmar", "Gyarados", "Lapras", "Aerodactyl", "Snorlax", "Articuno", "Zapdos","Moltres", "Dragonite", "Mewtwo", "Mew" };
    
    public static void main(String[] args){



    }

    public static String pokeballOpen(String[] pokemon){
        int roll = (int) (Math.random() * pokemon.length);
        return pokemon[roll];
    }

    public static String greatballOpen(String[] pokemon) {
        int roll = (int) (Math.random() * pokemon.length);
        return pokemon[roll];
    }

    public static String ultraballOpen(String[] pokemon) {
        int roll = (int) (Math.random() * pokemon.length);
        return pokemon[roll];
    }


    
}
