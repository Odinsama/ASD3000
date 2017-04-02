package game;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Odin on 4/1/2017.
 */
public class GameCenter {

    private Map<String, Game> games = new HashMap<>();

    public GameCenter(){
        ChessGame chessGame = new ChessGame();
        games.put("chess", chessGame);
        CheckersGame checkersGame = new CheckersGame();
        games.put("checkers", checkersGame);
    }

    public Game getGame(String game) {
        return games.get(game);
    }
}
