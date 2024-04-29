package javafx;



public class PokeBallRoll  {

    public static String pokeballOpen(){
        String[] pokeball = { "Bulbasaur", "Ivysaur", "Charmander", "Charmeleon", "Squirtle", "Wartortle","Caterpie", "Metapod", "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeot", "Rattata","Raticate", "Ekans", "Pikachu", "Nidoran", "Nidoran", "Clefairy", "Vulpix","Jigglypuff", "Zubat", "Oddish", "Paras", "Venonat", "Diglett", "Meowth", "Psyduck","Mankey", "Growlithe", "Poliwag", "Abra", "Machop", "Bellsprout", "Tentacool","Geodude", "Ponyta", "Slowpoke", "Magnemite", "Doduo", "Seel", "Grimer", "Shellder","Gastly", "Drowzee", "Krabby", "Voltorb", "Exeggcute", "Cubone", "Hitmonlee", "Koffing","Rhyhorn", "Tangela", "Horsea", "Goldeen", "Staryu", "Tauros", "Magikarp", "Eevee","Omanyte", "Kabuto", "Dratini" };
        int roll = (int) (Math.random() * pokeball.length);
        return pokeball[roll];
    }

    public static String greatballOpen() {
        String[] gretballPokemon = { "Ivysaur", "Charmeleon", "Wartortle", "Metapod", "Kakuna", "Pidgeotto","Raticate","Spearow", "Arbok", "Raichu", "Sandslash", "Nidorina", "Nidorino", "Clefable","Ninetales", "Wigglytuff", "Golbat", "Gloom", "Parasect", "Venomoth", "Dugtrio","Persian", "Golduck", "Primeape", "Raichu", "Sandslash", "Nidorina", "Nidorino","Clefable","Ninetales", "Wigglytuff", "Golbat", "Gloom", "Parasect", "Venomoth", "Dugtrio","Persian", "Golduck", "Primeape", "Arcanine", "Poliwhirl", "Kadabra", "Machoke","Weepinbell", "Tentacruel", "Graveler", "Rapidash", "Slowbro", "Magneton", "Dodrio","Dewgong", "Muk", "Cloyster", "Haunter", "Hypno", "Kingler", "Electrode", "Exeggutor","Marowak", "Hitmonchan", "Lickitung", "Weezing", "Rhydon", "Chansey", "Seadra","Seaking", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Pinsir", "Ditto","Vaporeon", "Jolteon", "Flareon", "Porygon", "Omastar", "Kabutops", "Dragonair" };
        int roll = (int) (Math.random() * gretballPokemon.length);
        return gretballPokemon[roll];
    }

    public static String ultraballOpen() {
        String[] ultraballPokemon = { "Venusaur", "Charizard", "Blastoise", "Butterfree", "Pidgeotto", "Sandshrew", "Nidoqueen", "Nidoking", "Spearow", "Fearow", "Arbok", "Vileplume", "Poliwrath","Alakazam", "Machamp", "Victreebel", "Golem", "Farfetch'd", "Kangaskhan", "Gengar","Onix", "Magmar", "Gyarados", "Lapras", "Aerodactyl", "Snorlax", "Articuno", "Zapdos","Moltres", "Dragonite", "Mewtwo", "Mew" };
        int roll = (int) (Math.random() * ultraballPokemon.length);
        return ultraballPokemon[roll];
    }    
}
