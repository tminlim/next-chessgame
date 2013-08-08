package pieces;

import java.util.List;

import pieces.Piece.Color;
import junit.framework.TestCase;

public class RookTest extends TestCase {

	public void testRook() throws Exception {
		Rook rook = new Rook(Piece.Color.NOCOLOR, new Position("e5"));
		assertEquals(14, rook.getPossibleMoves().size());
	}
}
