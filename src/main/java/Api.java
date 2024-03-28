
import javax.net.ssl.HttpsURLConnection;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class Api {
    public static String[] pokemon = { "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard",
            "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill",
            "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu",
            "Raichu", "Sandshrew", "Sandslash", "Nidoran", "Nidorina", "Nidoqueen", "Nidoran", "Nidorino", "Nidoking",
            "Clefairy", "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff", "Zubat", "Golbat", "Oddish",
            "Gloom", "Vileplume", "Paras", "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian",
            "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag", "Poliwhirl", "Poliwrath",
            "Abra", "Kadabra", "Alakazam", "Machop", "Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel",
            "Tentacool", "Tentacruel", "Geodude", "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro",
            "Magnemite", "Magneton", "Farfetch'd", "Doduo", "Dodrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder",
            "Cloyster", "Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb",
            "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan", "Lickitung",
            "Koffing", "Weezing", "Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra",
            "Goldeen", "Seaking", "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar", "Pinsir",
            "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Porygon",
            "Omanyte", "Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos", "Moltres",
            "Dratini", "Dragonair", "Dragonite", "Mewtwo", "Mew" };

    public static void main(String[] args) throws IOException {
        // BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        // Transcript transcript = new Transcript();
        // transcript.setSprite("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/132.png");

        // Gson gson = new Gson();
        // String jsonRequest = gson.toJson(transcript);
        // System.out.println(jsonRequest);

        // for (int i = 0; i < pokemon.length; i++){

        // @SuppressWarnings("deprecation")
        // URL url = new URL("https://pokeapi.co/api/v2/pokemon/pikachu/");
        // HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        // connection.setRequestMethod("GET");

        // int responseCode = connection.getResponseCode();

        // if (responseCode == HttpsURLConnection.HTTP_OK){
        // Scanner scanner = new Scanner(connection.getInputStream());
        // while(scanner.hasNext()){
        // writer.write(scanner.nextLine());
        // }
        // scanner.close();
        // writer.close();

        // } else {
        // System.out.println("error");
        // }
        // }

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://pokeapi.co/api/v2/pokemon/pikachu/")
                .build();

        Response response = client.newCall(request).execute();
        String responseString = response.body().string();

        System.out.println(parse(responseString));
    }


    public static String parse(String jsonLine) {
        @SuppressWarnings("deprecation")
        JsonElement jelement = new JsonParser().parse(jsonLine);
        JsonObject  jobject = jelement.getAsJsonObject();
        jobject = jobject.getAsJsonObject("sprites");
        String result = jobject.get("front_default").getAsString();
        return result;
}
}

class Transcript {
    private String sprites;

    public String getSprite() {
        return sprites;
    }

    public void setSprite(String sprites) {
        this.sprites = sprites;
    }

}


