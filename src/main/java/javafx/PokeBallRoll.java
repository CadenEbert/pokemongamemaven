package javafx;

import java.util.Random;

public class PokeBallRoll  {
    private static final Random RANDOM = new Random();

    private static final String[] POKEBALL_POKEMON = { "Bulbasaur", "Charmander", "Squirtle", "Caterpie", "Metapod", "Weedle",  "Pidgey",  "Rattata", "Ekans", "Pikachu", "Nidoran", "Nidoran", "Clefairy", "Vulpix","Jigglypuff", "Zubat", "Oddish", "Paras", "Venonat", "Diglett", "Meowth", "Psyduck","Mankey", "Growlithe", "Poliwag", "Abra", "Machop", "Bellsprout", "Tentacool","Geodude", "Ponyta", "Slowpoke", "Magnemite", "Doduo", "Seel", "Grimer", "Shellder","Gastly", "Drowzee", "Krabby", "Voltorb", "Exeggcute", "Cubone", "Hitmonlee", "Koffing","Rhyhorn", "Tangela", "Horsea", "Goldeen", "Staryu", "Tauros", "Magikarp", "Eevee","Omanyte", "Kabuto", "Dratini" };
    private static final String[] GREATBALL_POKEMON = { "Ivysaur", "Charmeleon", "Wartortle", "Metapod", "Kakuna", "Pidgeotto","Raticate","Spearow", "Arbok", "Raichu", "Sandslash", "Nidorina", "Nidorino", "Clefable","Ninetales", "Wigglytuff", "Golbat", "Gloom", "Parasect", "Venomoth", "Dugtrio","Persian", "Golduck", "Primeape", "Raichu", "Sandslash", "Nidorina", "Nidorino","Clefable","Ninetales", "Wigglytuff", "Golbat", "Gloom", "Parasect", "Venomoth", "Dugtrio","Persian", "Golduck", "Primeape", "Arcanine", "Poliwhirl", "Kadabra", "Machoke","Weepinbell", "Tentacruel", "Graveler", "Rapidash", "Slowbro", "Magneton", "Dodrio","Dewgong", "Muk", "Cloyster", "Haunter", "Hypno", "Kingler", "Electrode", "Exeggutor","Marowak", "Hitmonchan", "Lickitung", "Weezing", "Rhydon", "Chansey", "Seadra","Seaking", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Pinsir", "Ditto","Vaporeon", "Jolteon", "Flareon", "Porygon", "Omastar", "Kabutops", "Dragonair" };
    private static final String[] ULTRABALL_POKEMON = { "Venusaur", "Charizard", "Blastoise", "Butterfree", "Pidgeotto", "Sandshrew", "Nidoqueen", "Nidoking", "Spearow", "Fearow", "Arbok", "Vileplume", "Poliwrath","Alakazam", "Machamp", "Victreebel", "Golem", "Farfetch'd", "Kangaskhan", "Gengar","Onix", "Magmar", "Gyarados", "Lapras", "Aerodactyl", "Snorlax", "Articuno", "Zapdos","Moltres", "Dragonite", "Mewtwo", "Mew" };

    public static String openBall(String[] pokemonList) {
        int roll = RANDOM.nextInt(pokemonList.length);
        return pokemonList[roll];
    }

    public static String pokeballOpen() {
        return openBall(POKEBALL_POKEMON);
    }

    public static String greatballOpen() {
        return openBall(GREATBALL_POKEMON);
    }

    public static String ultraballOpen() {
        return openBall(ULTRABALL_POKEMON);
    }
}