package nl.justid;

import nl.justid.gameboard.GameBoard;
import nl.justid.player.Player;
import nl.justid.rules.*;
import nl.justid.ui.Display;
import nl.justid.ui.PlayerChoice;
import nl.justid.ui.PlayerCommandlineInput;

public class Game {
    private Player currentPlayer = Player.PLAYER_1;

    public void start(){
        final GameBoard gameBoard = new GameBoard();
        final Display display = new Display(gameBoard);
        PlayerCommandlineInput input = new PlayerCommandlineInput();
        final WinCondition winCondition = new WinCondition(gameBoard);
        final MoveCondition moveCondition = new MoveCondition(gameBoard);

        while (winCondition.gameOver() == Status.CONTINUE){
            display.draw();


            PlayerChoice p = input.input(currentPlayer, null);

            // Player may not select a filled field!
            while (!moveCondition.correctCondition(p.row(), p.column() )) {
                p = input.input(currentPlayer,", Field already filled, make an other move!");
            }

            gameBoard
                    .getRow(p.row())
                    .getColumn(p.column())
                    .setPlayer(p.player());

            // check if we have a winner..
            switchPlayer();

            // else
            // end game.
        }

        display.draw();

        if (winCondition.gameOver() == Status.DRAW){
            System.out.println("No winner ='(");
        }

        if (winCondition.gameOver() == Status.WINNER){
            System.out.println("We have a winner! \n" + winCondition.gameOver().getPlayer().getName());
        }

    }

    private void switchPlayer() {
        switch (currentPlayer){// todo: move to method
            case PLAYER_1 : currentPlayer = Player.PLAYER_2;
                break;
            case PLAYER_2 : currentPlayer = Player.PLAYER_1;
                break;
        }
    }
}