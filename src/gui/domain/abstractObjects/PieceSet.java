package gui.domain.abstractObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Odin on 4/2/2017.
 */
public abstract class PieceSet {
    protected final List<Piece> pieces = new ArrayList<>();

    public List<Piece> getPieces() {
        return Collections.unmodifiableList(pieces);
    }

}
