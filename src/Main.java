import game.Game;
import game.Map;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Map map = new Map();
        game.hud();
        game.start();
    }
}