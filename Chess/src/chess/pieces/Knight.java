package chess.pieces;

import chess.*;

public class Knight extends ChessPiece {

	public Knight(Color color, int rank, int file) {
		super(color, rank, file);
	}

	public boolean isValidMove(Move move) {
		return false;
	}

	public String toString() {
		return "Knight ";
	}
	
}
