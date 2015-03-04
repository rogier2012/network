package chess;

import chess.pieces.*;

public class Board {

	public static final int FILES = 8;
	public static final int RANKS = 8;
	
	private Field[][] fields = new Field[RANKS][FILES];
	
	public Board() {
		
		// Create new fields
		Color color = Color.WHITE;
		for (int rank = 0; rank < RANKS; rank++)	{
			color = color.other();
			for (int file = 0; file < FILES; file++)	{
				fields[rank][file].setColor(color);
				color = color.other();
			}
		}
		
		this.reset();
	}
	
	public void reset(){
	
		// Reset white
		for (int file = 0; file < FILES; file++)	{
			fields[1][file].setPiece(new Pawn(Color.WHITE, 1, file));
		}
		for (int file = 0; file < FILES; file++)	{
			if (file == 0 || file == 7)	{
				fields[0][file].setPiece(new Rook(Color.WHITE, 0, file));
			}
			if (file == 1 || file == 6)	{
				fields[0][file].setPiece(new Knight(Color.WHITE, 0, file));
			}
			if (file == 2 || file == 5)	{
				fields[0][file].setPiece(new Bishop(Color.WHITE, 0, file));
			}
			if (file == 3)	{
				fields[0][file].setPiece(new Queen(Color.WHITE, 0, file));
			}
			if (file == 4)	{
				fields[0][file].setPiece(new King(Color.WHITE, 0, file));
			}
		}
		
		// Reset black
		for (int file = 0; file < FILES; file++)	{
			fields[RANKS - 2][file].setPiece(new Pawn(Color.BLACK, RANKS - 2, file));
		}
		for (int file = 0; file < FILES; file++)	{ 
			if (file == 0 || file == 7)	{
				fields[RANKS - 1][file].setPiece(new Rook(Color.BLACK, RANKS - 1, file));
			}
			if (file == 1 || file == 6)	{
				fields[RANKS - 1][file].setPiece(new Knight(Color.BLACK, RANKS - 1, file));
			}
			if (file == 2 || file == 5)	{
				fields[RANKS - 1][file].setPiece(new Bishop(Color.BLACK, RANKS - 1, file));
			}
			if (file == 3)	{
				fields[RANKS - 1][file].setPiece(new Queen(Color.BLACK, RANKS - 1, file));
			}
			if (file == 4)	{
				fields[RANKS - 1][file].setPiece(new King(Color.BLACK, RANKS - 1, file));
			}
		}
	}

	public boolean isValidRank(int rank)	{
		return rank >= 0 && rank < RANKS;
	}
	
	public boolean isValidFile(int file)	{ 
		return file >= 0 && file < FILES;
	}
	
	public boolean isWithinBoard(int rank, int file)	{
		return isValidRank(rank) && isValidFile(file);
	}
	
	public Field getField(int rank, int file)	{
		return this.fields[rank][file];
	}
	
	public Field[][] getFields() {
		return fields;
	}
}
