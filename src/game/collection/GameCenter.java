package game.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Odin on 4/1/2017.
 */
public class GameCenter {

    private Map<String, Game> games = new HashMap<>();

    public GameCenter(){

        Checkers checkers = new Checkers();
        games.put("checkers", checkers);

        Chess chess = new Chess();
        games.put("chess", chess);

        Shogi shogi = new Shogi();
        games.put("shogi", shogi);

    }

    public Game getGame(String game) {
        return games.get(game);
    }
}
