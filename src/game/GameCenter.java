package game;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Odin on 4/1/2017.
 */
public class GameCenter {


    private Map<String, Game> games = new HashMap<>();

    public GameCenter(){
        games.put("chess", new ChessGame());
        games.put("checkers", new CheckersGame());
    }

    public Game getGame(String game) {
        return games.get(game);
    }
}
