package pieces;

import java.util.ArrayList;
import java.util.List;

public class Empty extends Piece {
	public Empty(Color color, Position position) {
		super(color, Type.EMPTY, position);
	}

	List<Position> getPossibleMoves() {
		List<Position> empty = new ArrayList<Position>();//왜 List<Position>하면 난리나지?
		return empty;
	}
}
