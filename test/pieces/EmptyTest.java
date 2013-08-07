package pieces;

import junit.framework.TestCase;

public class EmptyTest extends TestCase {
public void testEmptyTest() throws Exception {
	Empty empty = new Empty(Piece.Color.NOCOLOR, new Position("a1") );
	assertEquals(0, empty.getPossibleMoves().size() );	
}
}
