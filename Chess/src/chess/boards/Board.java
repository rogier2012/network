package chess.boards;

import chess.*;
import chess.pieces.*;

import java.util.List;
import java.util.ArrayList;

public class Board {
	
	public static final int FILES = 8;
	public static final int RANKS = 8;
	
	private List<ChessPiece> whitePawnList;
	private List<ChessPiece> blackPawnList;
	
	private byte[][] fields;
	
	public Board()	{
		fields = new byte[RANKS][FILES];
		
		whitePawnList = new ArrayList<ChessPiece>();
		blackPawnList = new ArrayList<ChessPiece>();
	}

	public byte getPiece(int rank, int file)	{
		return this.fields[rank][file];
	}

	public void setPiece(int rank, int file, byte piece)	{
		this.fields[rank][file] = piece;
	}

	public List<ChessPiece> getWhitePawnList()	{
		return this.whitePawnList;
	}

	public List<ChessPiece> getBlackPawnList()	{
		return this.blackPawnList;
	}
}
