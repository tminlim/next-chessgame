import pieces.Bishop;
import pieces.Position;
import pieces.Piece.Color;
import junit.framework.TestCase;


public class BishopTest extends TestCase {
	public void testBishop() throws Exception {
	Bishop bishop = new Bishop(Color.NOCOLOR, new Position("a2"));
	bishop.getPossibleMoves();
	assertEquals(7, bishop.getPossibleMoves().size());
	}

}
