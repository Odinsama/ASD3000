package gui.domain.concreteObjects.Chess;

import gui.domain.abstractObjects.Piece;
import gui.domain.concreteObjects.Chess.Pieces.*;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Odin on 2/16/2017.
 */
class ChessSet extends ArrayList {
    ChessSet(){
        final Piece[] chessPieces = new Piece[]{

                new Rook(true), new Knight(true), new Bishop(true), new Queen(true), new King(true), new Bishop(true), new Knight(true), new Rook(true),
                new Pawn(true), new Pawn(true), new Pawn(true), new Pawn(true), new Pawn(true), new Pawn(true), new Pawn(true), new Pawn(true),

                null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null,

                new Pawn(false), new Pawn(false), new Pawn(false), new Pawn(false), new Pawn(false), new Pawn(false), new Pawn(false), new Pawn(false),
                new Rook(false), new Knight(false), new Bishop(false), new Queen(false), new King(false), new Bishop(false), new Knight(false), new Rook(false)
        };
    Collections.addAll(this, chessPieces);
    }
}
