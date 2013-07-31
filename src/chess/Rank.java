package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Bishop;
import pieces.Empty;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Piece.Color;
import pieces.Position;
import pieces.Queen;
import pieces.Rook;

public class Rank {
	private List<Piece> rank = new ArrayList<Piece>();
	
	private int y;
	
	public Rank(int yPosition) {
		this.y = yPosition;
	}

	void initializeEmpty() {
		for (int i = 0; i < Board.COLUMN_SIZE; i++) {
			rank.add( new Empty(Color.NOCOLOR, new Position(i, y)) );
		}
	}
	
	void initializeWhitePawn() {
		for (int i = 0; i < Board.COLUMN_SIZE; i++) {
			rank.add(new Pawn(Color.WHITE, new Position(i, y)) );
		}
	}
	
	void initializeBlackPawn() {
		for (int i = 0; i < Board.COLUMN_SIZE; i++) {
			rank.add(new Pawn(Color.BLACK, new Position(i, y)) );
		}
	}
	
	void initializeWhiteExceptPawn() {
		rank.add(new Rook(Color.WHITE, new Position(0, y)) );
		rank.add(new Knight(Color.WHITE, new Position(1, y)) );
		rank.add(new Bishop(Color.WHITE, new Position(2, y)) );
		rank.add(new Queen(Color.WHITE, new Position(3, y)) );
		rank.add(new King(Color.WHITE, new Position(4, y)) );
		rank.add(new Bishop(Color.WHITE, new Position(5, y)) );
		rank.add(new Knight(Color.WHITE, new Position(6, y)) );
		rank.add(new Rook(Color.WHITE, new Position(7, y)) );
	}
	

	void initializeBlackExceptPawn() {
		rank.add(new Rook(Color.BLACK, new Position(0, y)) );
		rank.add(new Knight(Color.BLACK, new Position(1, y)) );
		rank.add(new Bishop(Color.BLACK, new Position(2, y)) );
		rank.add(new Queen(Color.BLACK, new Position(3, y)) );
		rank.add(new King(Color.BLACK, new Position(4, y)) );
		rank.add(new Bishop(Color.BLACK, new Position(5, y)) );
		rank.add(new Knight(Color.BLACK, new Position(6, y)) );
		rank.add(new Rook(Color.BLACK, new Position(7, y)) );
	}

	String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Board.COLUMN_SIZE; i++) {
			sb.append(rank.get(i).getSymbol());
		}
		return sb.toString();
	}

	Piece findPiece(int xPosition) {
		return rank.get(xPosition);
	}

	void changePiece(int xPosition, Piece targetPiece) {
		rank.set(xPosition, targetPiece);
	}
}
