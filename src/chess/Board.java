package chess;

import java.util.ArrayList;

import pieces.Piece;
import pieces.Position;

class Board {
	static final String NEW_LINE = System.getProperty("line.separator");
	
	ArrayList<Rank> ranks = new ArrayList<Rank>();
	
	Board() {
	}

	void initialize() {
		for (int i = 0; i < 8; i++) {
			Rank rank = new Rank(i);
			if (i==0) {
				rank.initializeWhiteExceptPawn();
			} else if (i==1) {
				rank.initializeWhitePawn();
			} else if (i==6) {	
				rank.initializeBlackPawn();
			} else if (i==7) {
				rank.initializeBlackExceptPawn();
			} else {
				rank.initializeEmpty();
			}
			ranks.add(rank);
		}
	}
	
	void initializeEmpty() {
		for (int i = 0; i < 8; i++) {
			Rank rank = new Rank(i);
			rank.initializeEmpty();
			ranks.add(rank);
		}
	}

	String printRank(int rankIndex) {
		Rank rank = ranks.get(rankIndex);
		StringBuilder sb = new StringBuilder();
		sb.append(rank.print());
		return sb.toString();
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 8; i > 0; i--) {
			sb.append(printRank(i-1) + NEW_LINE);
		}
		return sb.toString();
	}

	Piece findPiece(String xy) {
		Position position = new Position(xy);
		return findPiece(position);
	}

	Piece findPiece(Position position) {
		Rank rank = ranks.get(position.getY());
		return rank.findPiece(position.getX());
	}

	void addPiece(String xy, Piece targetPiece) {
		Position position = new Position(xy);
		movePiece(position, targetPiece);
	}

	void movePiece(Position position, Piece targetPiece) {
		Rank rank = ranks.get(position.getY());
		rank.changePiece(position.getX(), targetPiece);
	}
}
