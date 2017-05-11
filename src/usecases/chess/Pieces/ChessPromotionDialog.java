package usecases.chess.Pieces;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by odin on 5/11/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
class ChessPromotionDialog {

    private final Map<String, Class> chessClasses = new HashMap<>();

    private final Object[] possibilities;

    ChessPromotionDialog(){
        possibilities = new Object[]{"Queen", "Rook", "Knight", "Bishop"};
        chessClasses.put("Queen", Queen.class);
        chessClasses.put("Rook",Rook.class) ;
        chessClasses.put("Knight",Knight.class);
        chessClasses.put("Bishop",Bishop.class);
    }

    Class getPromotionChoice() {
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
