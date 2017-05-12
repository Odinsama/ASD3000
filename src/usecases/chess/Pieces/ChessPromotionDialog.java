package usecases.chess.Pieces;

import simpleBoardGameEngine.coreComponents.Piece;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by odin on 5/11/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
class ChessPromotionDialog {

    private final Map<String, Piece> chessClasses = new HashMap<>();

    private final Object[] possibilities;

    ChessPromotionDialog(boolean isNorth){
        possibilities = new Object[]{"Queen", "Rook", "Knight", "Bishop"};
        chessClasses.put("Queen", new Queen(isNorth));
        chessClasses.put("Rook", new Rook(isNorth)) ;
        chessClasses.put("Knight", new Knight(isNorth));
        chessClasses.put("Bishop", new Bishop(isNorth));
    }

    Piece getPromotionChoice() {
        Object o = JOptionPane.showInputDialog(
                null,
                "Pick what Piece you want to promote this pawn to!",
                "Promotion dialog",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                "Queen"
        );
        return chessClasses.get(o);
    }

}
