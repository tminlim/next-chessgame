package chess;

import junit.framework.TestCase;
import pieces.Piece;

public class RankTest extends TestCase {
	static final String EMPTY_RANK = "........";
	static final String WHITE_EXCEPT_PAWN_RANK = "rnbqkbnr";
	static final String BLACK_EXCEPT_PAWN_RANK = "RNBQKBNR";
	static final String WHITE_PAWN_RANK = "pppppppp";
	static final String BLACK_PAWN_RANK = "PPPPPPPP";
	
	private Rank rank;
	
	@Override
	protected void setUp() throws Exception {
		rank = new Rank(0);
	}
	
	public void testInitializeEmpty() throws Exception {
		rank.initializeEmpty();
		assertEquals(EMPTY_RANK, rank.print());
	}
	
	public void testInitializeWhitePawn() throws Exception {
		rank.initializeWhitePawn();
		assertEquals(WHITE_PAWN_RANK, rank.print());
	}
	
	
	public void testInitializeBlackPawn() throws Exception {
		rank.initializeBlackPawn();
		assertEquals(BLACK_PAWN_RANK, rank.print());
	}
	
	public void testInitializeWhiteExceptPawn() throws Exception {
		rank.initializeWhiteExceptPawn();
		assertEquals(WHITE_EXCEPT_PAWN_RANK, rank.print());
	}
	
	public void testInitializeBlackExceptPawn() throws Exception {
		rank.initializeBlackExceptPawn();
		assertEquals(BLACK_EXCEPT_PAWN_RANK, rank.print());
	}
	
	public void testFindPiece() throws Exception {
		rank.initializeWhiteExceptPawn();
		Piece queen = rank.findPiece(3);
		assertEquals('q', queen.getSymbol());
		
		Piece king = rank.findPiece(4);
		assertEquals('k', king.getSymbol());
	}
}
