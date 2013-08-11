package pieces;

import pieces.Piece.Color;
import junit.framework.TestCase;

public class PieceTest extends TestCase {
	private Position source;

	public void setUp() {
		source = new Position("a1");
	}

	public void testIsWhite() throws Exception {
		Piece whitePawn = new Pawn(Color.WHITE, null);
		assertTrue(whitePawn.isWhite());
	}

	public void testIsBlack() throws Exception {
		Piece blackPawn = new Pawn(Color.BLACK, null);
		assertTrue(blackPawn.isBlack());
	}

	public void testMove() throws Exception {
		Position target = new Position("a2");
		Piece whitePawn = new Pawn(Color.WHITE, source);
		assertEquals(new Pawn(Color.WHITE, target), whitePawn.move(target));
	}

	public void testLeave() throws Exception {
		Piece whitePawn = new Pawn(Color.WHITE, source);
		assertEquals(new Empty(Color.NOCOLOR, source), whitePawn.leave());
	}

	public void testEmpty() throws Exception {
		Empty empty = new Empty(Piece.Color.NOCOLOR, source);
		assertEquals(0, empty.getPossibleMoves().size());
	}

	public void testRook() throws Exception {
		Rook rook = new Rook(Color.WHITE, source);
		assertEquals(14, rook.getPossibleMoves().size());
	}

	public void testBishop() throws Exception {
		Bishop bishop = new Bishop(Color.WHITE, source);
		assertEquals(7, bishop.getPossibleMoves().size());
	}

	public void testQueen() throws Exception {
		Queen queen = new Queen(Color.WHITE, source);
		assertEquals(21, queen.getPossibleMoves().size());

	}
}
