package pieces;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {
	public Queen(Color color, Position position) {
		super(color, Type.QUEEN, position);
	}

	@Override
	List<Position> getPossibleMoves() {
		List<Position> listPosition = new ArrayList<Position>();
		PositionController controller = new PositionController(position);
		listPosition.addAll(controller.findsDiagonalPositionAll());
		listPosition.addAll(controller.findsLinearPositionAll());

		return listPosition;
	}
}
