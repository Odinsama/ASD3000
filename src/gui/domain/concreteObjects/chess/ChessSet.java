package gui.domain.concreteObjects.chess;

import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.chess.Pieces.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Odin on 2/16/2017.
 */
class ChessSet {
    private final List<Piece> chessPieces = new ArrayList<>();
    ChessSet(){



                chessPieces.add(new Rook(true));chessPieces.add(new Knight(true)); chessPieces.add(new Bishop(true)); chessPieces.add(new King(true)); chessPieces.add(new Queen(true)); chessPieces.add(new Bishop(true)); chessPieces.add(new Knight(true)); chessPieces.add(new Rook(true));
                chessPieces.add(new Pawn(true)); chessPieces.add(new Pawn(true)); chessPieces.add(new Pawn(true)); chessPieces.add(new Pawn(true)); chessPieces.add(new Pawn(true)); chessPieces.add(new Pawn(true)); chessPieces.add(new Pawn(true)); chessPieces.add(new Pawn(true));

                chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null);
                chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null);
                chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null);
                chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null); chessPieces.add(null);

                chessPieces.add(new Pawn(false)); chessPieces.add(new Pawn(false)); chessPieces.add(new Pawn(false)); chessPieces.add(new Pawn(false)); chessPieces.add(new Pawn(false)); chessPieces.add(new Pawn(false)); chessPieces.add(new Pawn(false)); chessPieces.add(new Pawn(false));
                chessPieces.add(new Rook(false)); chessPieces.add(new Knight(false)); chessPieces.add(new Bishop(false)); chessPieces.add(new Queen(false)); chessPieces.add(new King(false)); chessPieces.add(new Bishop(false)); chessPieces.add(new Knight(false)); chessPieces.add(new Rook(false));

    }

    public List<Piece> getChessPieces() {
        return Collections.unmodifiableList(chessPieces);
    }
}
