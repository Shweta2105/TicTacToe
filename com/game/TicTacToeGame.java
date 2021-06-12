package com.game;


/* @shweta........
 * building tic tac toe game
 */

public class TicTacToeGame {

	static char[] board = new char[9];
	private static void createBoard() {
		for(int i=0; i<9;i++) {
			System.out.print(board[i]);
		}
	}

	public static void printBoard() {  //printing board
		System.out.println("---|---|---");
		System.out.println("|  " + board[0] + " | " + board[1] + " | " + board[2] + "|");
		System.out.println("|----------|");
		System.out.println("|  " + board[3] + " | " + board[4] + " | " + board[5] + "|");
		System.out.println("|----------|");
		System.out.println("|  " + board[6] + " | " + board[7] + " | " + board[8] + "|");
		System.out.println("---|---|---");

	}

	public static void main(String[] args) {
		System.out.println("<<<<Welcome to Tic Tac Toe game >>>>");
		createBoard();
		System.out.println();
		printBoard();
	}

	

}
