package game.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Odin on 4/1/2017.
 */
public class GameCenter {

    private Map<String, Game> games = new HashMap<>();

    public GameCenter(){
        Chess chessGame = new Chess();
        games.put("chess", chessGame);
        Checkers checkersGame = new Checkers();
        games.put("checkers", checkersGame);
    }

    public Game getGame(String game) {
        return games.get(game);
    }
}
