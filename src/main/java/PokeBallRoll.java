
import java.util.Dictionary;


public class PokeBallRoll {
    
    public static void main(String[] args){
        String[] pokeball = {"Bulbasaur", "Venusaur","Charmander","Charizard","Squirtle","Blastoise","Caterpie","Butterfree","Weedle","Beedrill","Pidgey","Pidgeot","Rattata","Fearow","Ekans","Pikachu","Sandshrew","Nidoran","Nidoqueen","Nidoran","Nidoking","Clefairy","Vulpix","Jigglypuff","Zubat","Oddish","Vileplume","Paras","Venonat","Diglett","Meowth","Psyduck","Mankey","Growlithe","Arcanine","Poliwag","Poliwhirl","Poliwrath","Abra","Kadabra","Alakazam","Machop","Machoke","Machamp","Bellsprout","Weepinbell","Victreebel","Tentacool","Tentacruel","Geodude","Graveler","Golem","Ponyta","Rapidash","Slowpoke","Slowbro","Magnemite","Magneton","Farfetch'd","Doduo","Dodrio","Seel","Dewgong","Grimer","Muk","Shellder","Cloyster","Gastly","Haunter","Gengar","Onix","Drowzee","Hypno","Krabby","Kingler","Voltorb","Electrode","Exeggcute","Exeggutor","Cubone","Marowak","Hitmonlee","Hitmonchan","Lickitung","Koffing","Weezing","Rhyhorn","Rhydon","Chansey","Tangela","Kangaskhan","Horsea","Seadra","Goldeen","Seaking","Staryu","Starmie","Mr. Mime","Scyther","Jynx","Electabuzz","Magmar","Pinsir","Tauros","Magikarp","Gyarados","Lapras","Ditto","Eevee","Vaporeon","Jolteon","Flareon","Porygon","Omanyte","Omastar","Kabuto","Kabutops","Aerodactyl","Snorlax","Articuno","Zapdos","Moltres","Dratini","Dragonair","Dragonite","Mewtwo","Mew"};
        String[] greatball = {"Ivysaur", "Charmeleon","Wartortle", "Metapod","Kakuna" ,"Pidgeotto","Raticate", "Spearow","Arbok","Raichu","Sandslash","Nidorina","Nidorino","Clefable","Ninetales","Wigglytuff","Golbat","Gloom","Parasect","Venomoth","Dugtrio","Persian","Golduck","Primeape"};
        System.out.println(pokeballOpen(pokeball));


    }

    public static String pokeballOpen(String[] pokemon){
        int roll = (int) (Math.random() * pokemon.length);
        return pokemon[roll];
    }


    
}
