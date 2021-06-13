package com.game;

import java.util.Scanner;

/* @shweta........
 * building tic tac toe game
 */

public class TicTacToeGame {

	static char[] board = new char[10];
	static char player ;
	
	// initializing board
	private void createBoard() {
		for (int i = 1; i < 10; i++) {
			board[i]= ' ';
			System.out.print(board[i]);
		}
	}

	
	public static void move(char player) {
		Scanner in = new Scanner(System.in);
		System.out.println("select the block to move :");
		
		int numMove = in.nextInt();
		
		if (numMove < 0 && numMove > 9) {
			System.out.println("Invalid try");
		} else {

			if (board[numMove] == ' ') {
				board[numMove] = player;
			} else {
				System.out.println("block is nt empty try other block");
			}
		}
		
	}

	private void showBoard(char[] board) {
		
		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("-----------");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("-----------");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);

	}

	private static char checkChoice(Scanner userchoice) {
		System.out.println("Choose your choice :");

		return userchoice.next().toUpperCase().charAt(0);
	}
	
	public static void main(String[] args) {
		System.out.println("<<<<Welcome to Tic Tac Toe game >>>>");
		TicTacToeGame tobj = new TicTacToeGame();
		Scanner userchoice = new Scanner(System.in);

		tobj.createBoard(); // calling the method
		// choosing player X or O
		char player = checkChoice(userchoice);
		char compChoice = (player == 'X') ? 'O' : 'X';
		System.out.println("user choice " + player + " , computer choice " + compChoice);
		tobj.showBoard(board);
		move(player);
		tobj.showBoard(board);

	}


}
