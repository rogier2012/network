package chess.pieces;

import chess.*;

public class King extends ChessPiece {
	private boolean firstMoveMade;

	public King(Color color, int rank, int file) {
		super(color, rank, file);
		firstMoveMade = false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValidMove() {
		// TODO Auto-generated method stub
		return false;
	}


}
