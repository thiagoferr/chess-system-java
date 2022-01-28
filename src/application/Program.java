package application;

import boardgame.Board;
import boardgame.Piece;

public class Program {

	public static void main(String[] args) {
		Board board = new Board (10,8);
		Piece pieces = new Piece(board);
		System.out.println(board.getRows()+", "+board.getCollumns());
		System.out.println(pieces);
	}

}
