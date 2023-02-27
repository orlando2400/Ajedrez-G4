package model.pieces;

import model.board.ChessGameBoard;
import model.game.ChessGamePiece;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.Objects;
// -------------------------------------------------------------------------
/**
 * Represents a model.pieces.Rook game piece.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class Rook
    extends ChessGamePiece {
    // ----------------------------------------------------------
    /**
     * Create a new model.pieces.Rook object.
     *
     * @param board
     *            the board to create the rook on
     * @param row
     *            the row to create the rook on
     * @param col
     *            the column to create the rook on
     * @param color
     *            either GamePiece.WHITE, BLACK, or UNASSIGNED
     */
    public Rook(ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color );
    }
    /**
     * Calculates the possible moves for this model.pieces.Rook.
     * @param board the board to check on
     * @return ArrayList<String> the list of moves
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){

        ArrayList<String> allMoves = new ArrayList<>();

        allMoves.addAll( calculateNorthMoves( board, 8 ) );
        allMoves.addAll( calculateSouthMoves( board, 8 ) );
        allMoves.addAll( calculateWestMoves( board, 8 ) );
        allMoves.addAll( calculateEastMoves( board, 8 ) );

        return allMoves;
    }
    /**
     * Creates an icon for this piece depending on the piece's color.
     *
     * @return ImageIcon the ImageIcon representation of this piece.
     */
    @Override
    public ImageIcon createImageByPieceType() {

        String fileName;
        if (getColorOfPiece() == ChessGamePiece.WHITE) {
            fileName = "WhiteRook.gif";
        } else if (getColorOfPiece() == ChessGamePiece.BLACK) {
            fileName = "BlackRook.gif";
        } else {
            fileName = "default-Unassigned.gif";
        }

        return new ImageIcon(Objects.requireNonNull(getClass().getResource("../../ChessImages/" + fileName)));

    }


}
