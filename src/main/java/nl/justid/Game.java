package nl.justid;

import nl.justid.gameboard.GameBoard;
import nl.justid.ui.Display;
import nl.justid.ui.PlayerChoice;
import nl.justid.ui.PlayerCommandlineInput;

public class Game {
    public void start(){
        final GameBoard gameBoard = new GameBoard();

        final Display display = new Display(gameBoard);

        PlayerCommandlineInput input = new PlayerCommandlineInput();

        int i = 0;
        while (i < 10){
            display.draw();
            PlayerChoice p = input.input();
            gameBoard.getRow(p.row()).getColumn(p.column()).setPlayer("x");

            i++;
        }

        // Get user input from the commandline like so: new Scanner(system.in).nextLine();

        // Map the user input to a 3 by 3 game board
        //  1   2   3
        //a x |   | o
        // ---|---|---
        //b   | x | x
        // ---|---|---
        //c   |   | o

        // Pint the board like so: System.out.println();

        // Ask player 2 to put something on the board
        // and repeat, player 1, player 2, player 1...

        // No need for AI
        // No need for win conditions (yet)
        // No need for  an end of the game

        // Try to make it Test Driven
        // Aim for high test coverage


        // Select player (1)
        // Get user input -> Class get user input
        System.out.println(new PlayerCommandlineInput().input().toString());

        // Map to board -> input xa1 mapTo: [[X][][],[][][],[][][]] -> GameState Class
        // is there a winner? GameBoard -> Geen winnar, Plater 1 of player 2
        // continue with other player (2)
        // Or -  Player X wins!
    }
}
