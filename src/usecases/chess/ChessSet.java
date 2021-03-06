package usecases.chess;

import simpleBoardGameEngine.coreComponents.PieceSet;
import usecases.chess.Pieces.*;

/**
 * Created by Odin on 2/16/2017.
 * Unless it is poorly made, then it must
 * have been someone else.
 */
class ChessSet extends PieceSet{

    //adds all the pieces needed for a game of chess in their starting position.
    ChessSet() {
                //black pieces
                pieces.add(new Rook(true));pieces.add(new Knight(true)); pieces.add(new Bishop(true)); pieces.add(new King(true)); pieces.add(new Queen(true)); pieces.add(new Bishop(true)); pieces.add(new Knight(true)); pieces.add(new Rook(true));
                pieces.add(new Pawn(true)); pieces.add(new Pawn(true)); pieces.add(new Pawn(true)); pieces.add(new Pawn(true)); pieces.add(new Pawn(true)); pieces.add(new Pawn(true)); pieces.add(new Pawn(true)); pieces.add(new Pawn(true));
                //empty tiles
                pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null);
                pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null);
                pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null);
                pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null); pieces.add(null);
                //white pieces
                pieces.add(new Pawn(false)); pieces.add(new Pawn(false)); pieces.add(new Pawn(false)); pieces.add(new Pawn(false)); pieces.add(new Pawn(false)); pieces.add(new Pawn(false)); pieces.add(new Pawn(false)); pieces.add(new Pawn(false));
                pieces.add(new Rook(false)); pieces.add(new Knight(false)); pieces.add(new Bishop(false)); pieces.add(new Queen(false)); pieces.add(new King(false)); pieces.add(new Bishop(false)); pieces.add(new Knight(false)); pieces.add(new Rook(false));

    }
}
