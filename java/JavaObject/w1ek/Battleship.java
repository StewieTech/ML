// Below is the current code for Battleship. Please provide me with the code snippet that will allow Player 2 to get a turn after each turn that Player 1 takes, which will function in the same way as Player 1’s turns.

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Battleship {
	public static void main(String[] args) {
        System.out.println("Welcome to Battleship!") ;

        // for ( int i = 0; i < row.length; i ++) {
        //     System.out.printf("Enter ship %d location:", i )
        //     if (input.hasNextInt()) {
        //         playerOneBoard.put
        //     }
        // } else {
        //     System.out.println("Invalid coordinates. Choose different coordinates.")
        // }

        // if (playerOneBoard !empty()) {
        //     System.out.println("You already have a ship there. Choose different coordinates.")
        // }
        
        // After each player enters their fifth coordinate, a board representing the player’s ship locations must be printed to the console using the provided method. See step three on how to construct these Locations Boards.
        // 100 new lines must follow the printed board so that the other player will not see the entered coordinates and board of their opponent.
        // Create two 5x5 grids in the form of 2D arrays using the coordinates entered by the players. These Location Boards store each player's ship locations and will be used to keep track of the damage states of each player’s ships, as well as any misses. The corresponding Location Board must be printed to the console right after a player enters the coordinates of their ships.
// A ‘–’ character must represent an empty space.
// An ‘@’ character must represent a ship that is not hit. When the game begins, all ships will start fresh with no hits.
// An ‘X’ character will represent a space with a ship that has been hit.
// An ‘O’ character will represent a space that was fired upon, but since there is not ship at that location, the shot was a miss.
// Each player’s board must have five ships of length one. Five of the 25 grid spaces will start with ships on them.
Scanner input = new Scanner(System.in);

// Player 1 Board
char[][] playerOneBoard = new char[5][5];
System.out.println("Player 1, enter the location of your five ships:");

for (int i = 0; i < 5; i++) {
    int row, col;
    boolean validCoordinates;
    do {
        System.out.printf("Enter ship %d location (row col): ", i+1);
        row = input.nextInt();
        col = input.nextInt();
        validCoordinates = (row >= 0 && row < 5 && col >= 0 && col < 5 && playerOneBoard[row][col] != '@');
        if (!validCoordinates) {
            System.out.println("Invalid coordinates. Choose different coordinates.");
        }
    } while (!validCoordinates);
    playerOneBoard[row][col] = '@';
    printBattleShip(playerOneBoard);
    System.out.println("\n\n\n\n\n\n\n\n\n\n");
}

// P1 Target History Board
char[][] playerOneHistoryBoard = new char[5][5];
for (int i = 0; i <5 ; i++) {
    Arrays.fill(playerOneHistoryBoard[i], '-') ; 
}

// Player 2 Board
char[][] playerTwoBoard = new char[5][5];
System.out.println("Player 2, enter the location of your five ships:");

for (int i = 0; i < 5; i++) {
    int row, col;
    boolean validCoordinates;
    do {
        System.out.printf("Enter ship %d location (row col): ", i+1);
        row = input.nextInt();
        col = input.nextInt();
        validCoordinates = (row >= 0 && row < 5 && col >= 0 && col < 5 && playerTwoBoard[row][col] != '@');
        if (!validCoordinates) {
            System.out.println("Invalid coordinates. Choose different coordinates.");
        }
    } while (!validCoordinates);
    playerTwoBoard[row][col] = '@';
    printBattleShip(playerTwoBoard);
    System.out.println("\n\n\n\n\n\n\n\n\n\n");
}

// P2 Target History Board
char[][] playerTwoHistoryBoard = new char[5][5];
for (int i = 0; i <5 ; i++) {
    Arrays.fill(playerTwoHistoryBoard[i], '-') ; 
}

// Player 1's turn
int player1Hits = 0;
while (player1Hits < 5) {
    System.out.println("Player 1, enter a coordinate to fire upon:");
    int row = input.nextInt();
    int col = input.nextInt();
    if (row < 0 || row >= 5 || col < 0 || col >= 5) {
        System.out.println("Invalid coordinates. Choose different coordinates.");
    } else if (playerTwoBoard[row][col] == 'X' || playerTwoBoard[row][col] == 'O') {
        System.out.println("You already fired on this spot. Choose different coordinates.");
    } else if (playerTwoBoard[row][col] == '@') {
        playerTwoBoard[row][col] = 'X';
        player1Hits++;
        System.out.println("PLAYER 1 HIT PLAYER 2's SHIP!");
        if (player1Hits == 5) {
            System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!");
        }
    } else {
        playerTwoBoard[row][col] = 'O';
        System.out.println("PLAYER 1 MISSED!");
    }
    printBattleShip(playerTwoBoard);
    System.out.println("\n\n\n\n\n\n\n\n\n\n");
}

// Player 2's turn 

int player2Hits = 0;
while (player2Hits < 5) {
    System.out.println("Player 2, enter a coordinate to fire upon:");
    int row = input.nextInt();
    int col = input.nextInt();
    if (row < 0 || row >= 5 || col < 0 || col >=5 ) {
        System.out.println("Invalid coordinates. Choose different coordinates.");

    } else if (playerOneBoard[row][col] == 'X'  || playerOneBoard[row][col] == 'O' ) {
        System.out.println("You already fired on this spot. Choose different coordinates");
    } else if (playerOneBoard[row][col] == '@' ) {
        playerOneBoard[row][col] = 'X';
        player2Hits++;
        System.out.println("PLAYER 2 HIT PLAYER 1's SHIP!");
        if (player2Hits == 5) {
            System.out.println("Player 2 WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
        }
    } else {
        playerOneBoard[row][col] = 'O';
        System.out.println("PLAYER 2 MISSED!") ;
    }
    printBattleShip(playerTwoBoard);
    System.out.println("\n\n\n\n\n\n\n\n\n\n") ;
}









// When a ship is hit by a player, the Location board (which tracks the damage states) of the corresponding player’s ships must be updated. Misses should be updated on the Location board as well.
// The program must terminate gracefully after a player wins. This will occur when all of the ‘@’ signs on their opponent’s board have been replaced with ‘X’ symbols.

// Using the provided method, print both players’ Location Boards in order to verify the results of the game to the players. Player 1’s Location Board should be printed first.
// In your solution, you must use each of the following Java features at least once:





      
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