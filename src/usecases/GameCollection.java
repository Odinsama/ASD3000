package usecases;

import usecases.checkers.Checkers;
import simpleBoardGameEngine.controller.Game;
import usecases.chess.Chess;
import usecases.shogi.Shogi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Odin on 4/1/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
public class GameCollection {

    private final Map<String, Game> games = new HashMap<>();

    public GameCollection(){

        Checkers checkers = new Checkers();
        games.put("checkers", checkers);

        Chess chess = new Chess();
        games.put("chess", chess);

        Shogi shogi = new Shogi();
        games.put("logic", shogi);

    }

    public Game getGame(String game) {
        return games.get(game);
    }
}
