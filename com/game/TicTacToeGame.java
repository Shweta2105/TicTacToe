package com.game;

import java.util.Scanner;

/* @shweta........
 * building tic tac toe game
 */

public class TicTacToeGame {

	static char[] board = new char[10];
	char turn;

	// initializing board
	private void createBoard() {
		for (int i = 1; i < 10; i++) {
			System.out.print(board[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("<<<<Welcome to Tic Tac Toe game >>>>");
		TicTacToeGame tobj = new TicTacToeGame();
		Scanner userchoice = new Scanner(System.in);

		tobj.createBoard(); // calling the method
		// choosing player X or O
		char player = checkChoice(userchoice);
		char compChoice = (player == 'X') ? 'O' :'X';
		System.out.println("user choice "+player+" , computer choice "+compChoice);

	}

	private static char checkChoice(Scanner userchoice) {
		System.out.println("Choose your choice :");

		return userchoice.next().toUpperCase().charAt(0);
	}

}
