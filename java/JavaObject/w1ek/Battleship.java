

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Battleship!") ;

   
        // After each player enters their fifth coordinate, a board representing the player’s ship locations must be printed to the console using the provided method. See step three on how to construct these Locations Boards.


// Player 1 Board
char[][] playerOneBoard = new char[5][5];
for (char[] row: playerOneBoard) {
    Arrays.fill(row, '-');
}

System.out.println("PLAYER 1, ENTER YOUR SHIPS’ COORDINATES.");

for (int i = 0; i < 5; i++) {
    int row, col;
    boolean validCoordinates;
    do {
        System.out.printf("Enter ship %d location (row col): ", i+1);
        row = input.nextInt();
        col = input.nextInt();
        validCoordinates = (row >= 0 && row < 5 && col >= 0 && col < 5 );
        // && playerOneBoard[row][col] != '@'
        if (!validCoordinates) {
            System.out.println("Invalid coordinates. Choose different coordinates.");
        } else if (playerOneBoard[row][col] == '@') {
            System.out.println("You already have a ship there. Choose different coordinates.");
        }
    } while (!validCoordinates || playerOneBoard[row][col] == '@') ;
    playerOneBoard[row][col] = '@';
    printBattleShip(playerOneBoard);
    System.out.println("\n\n\n\n\n\n\n\n\n\n");
}


// Player 2 Board
char[][] playerTwoBoard = new char[5][5];
for (int i = 0; i <5 ; i++) {
    Arrays.fill(playerTwoBoard[i], '-') ; 
}
System.out.println("Player 2, enter the location of your five ships:");

for (int i = 0; i < 5; i++) {
    int row, col;
    boolean validCoordinates;
    // System.out.println(validCoordinates) ;
    do {
        System.out.printf("Enter ship %d location (row col): ", i+1);
        row = input.nextInt();
        col = input.nextInt();
        validCoordinates = (row >= 0 && row < 5 && col >= 0 && col < 5 );
        // && playerTwoBoard[row][col] != '@'
       
         if (!validCoordinates) {
            System.out.println("Invalid coordinates. Choose different coordinates.");
        }  else if (playerTwoBoard[row][col] == '@') {
            System.out.println("You already have a ship there. Choose different coordinates.");
        }
    } while (!validCoordinates || playerTwoBoard[row][col] == '@');
    playerTwoBoard[row][col] = '@';
    printBattleShip(playerTwoBoard);
    System.out.println("\n\n\n\n\n\n\n\n\n\n");
}


// Player 1's turn
int player1Hits = 0;
int player2Hits = 0;
int row, col;
int row2, col2;
boolean validCoordinates;
boolean validCoordinates2;
do {


    
    if (player2Hits < 5) {


        do {

            System.out.println("Player 1, enter hit row/column:");
            row = input.nextInt();
            col = input.nextInt();
            validCoordinates = (row >= 0 && row < 5 && col >= 0 && col < 5 );
            if (!validCoordinates) {
                System.out.println("Invalid coordinates. Choose different coordinates.");
            }
        } 
            while (!validCoordinates) ;
    if (playerTwoBoard[row][col] == 'X' || playerTwoBoard[row][col] == 'O') {
        System.out.println("You already fired on this spot. Choose different coordinates.");
    } else if (playerTwoBoard[row][col] == '@') {
        playerTwoBoard[row][col] = 'X';
        player1Hits++;
        System.out.println("PLAYER 1 HIT PLAYER 2's SHIP!");
        printBattleShip(playerTwoBoard);
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        if (player1Hits == 5) {
            System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
            printBattleShip(playerOneBoard);
            printBattleShip(playerTwoBoard);
        }
    } else {
        playerTwoBoard[row][col] = 'O';
        System.out.println("PLAYER 1 MISSED!");
        printBattleShip(playerTwoBoard);
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }
    
} else {
    return ;
}
    
    
// Player 2's turn 

// while (player2Hits < 5) 
// System.out.println("Player 2, enter a coordinate to fire upon:");
if (player1Hits < 5) {

    do {

        
        System.out.println("Player 2, enter hit row/column:");
        
        row2 = input.nextInt();
        col2 = input.nextInt();
        validCoordinates2 = (row >= 0 && row < 5 && col >= 0 && col < 5  );
        if (!validCoordinates2) {
            System.out.println("Invalid coordinates. Choose different coordinates.");
        }
    } while (!validCoordinates2) ; 
        
    if (playerOneBoard[row2][col2] == 'X'  || playerOneBoard[row2][col2] == 'O' ) {
        System.out.println("You already fired on this spot. Choose different coordinates");
    } else if (playerOneBoard[row2][col2] == '@' ) {
        playerOneBoard[row2][col2] = 'X';
        player2Hits++;
        System.out.println("PLAYER 2 HIT PLAYER 1's SHIP!");
        printBattleShip(playerOneBoard);
        System.out.println("\n\n\n\n\n\n\n\n\n\n") ;
        if (player2Hits == 5) {
            System.out.println("Player 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
            printBattleShip(playerOneBoard);
            printBattleShip(playerTwoBoard);
        }
    } else {
        playerOneBoard[row2][col2] = 'O';
        System.out.println("PLAYER 2 MISSED!") ;
        printBattleShip(playerOneBoard);
        System.out.println("\n\n\n\n\n\n\n\n\n\n") ;
    }


    
} else {
    return ; 
}
} while (player1Hits != 5 || player2Hits != 5 ) ;




input.close() ;
















      
    }
    
    // Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}


}