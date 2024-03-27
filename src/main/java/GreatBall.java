
public class GreatBall {
    public static String greatballRoll(String[] pokemon) {
        int roll = (int) (Math.random() * pokemon.length);
        return pokemon[roll];
    }
}
