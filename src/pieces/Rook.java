package pieces;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

	public Rook(Color color, Position position) {
		super(color, Type.ROOK, position);
	}

	@Override
	List<Position> getPossibleMoves() {
		PositionController controller = new PositionController(position);
		return controller.findsLinearPositionAll();
	}
}
