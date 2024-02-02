package nl.justid;

import nl.justid.events.GameBoardUpdate.GameBoardUpdateHandler;
import nl.justid.gameboard.GameBoard;
import nl.justid.gameboard.exceptions.IllegalPlayerMoveException;
import nl.justid.player.Player;
import nl.justid.rules.*;
import nl.justid.ui.PlayerChoice;
import nl.justid.ui.PlayerCommandlineInput;

public class Game {
    private Player currentPlayer = Player.PLAYER_1;

    public void start(){
        PlayerCommandlineInput input = new PlayerCommandlineInput();
        final WinCondition winCondition = new WinCondition();

        GameBoardUpdateHandler.update();

        while (winCondition.gameOver() == Status.CONTINUE){
            playerMove(input);
            switchPlayer();
        }


        if (winCondition.gameOver() == Status.DRAW){
            System.out.println("No winner ='(");
        }

        if (winCondition.gameOver() == Status.WINNER){
            System.out.println("We have a winner! \n" + winCondition.gameOver().getPlayer().getName());
        }

    }

    private void playerMove(PlayerCommandlineInput input) {
        try {
            PlayerChoice p = input.input(currentPlayer, null);

            GameBoard
                    .getRow(p.row())
                    .getColumn(p.column())
                    .setGameSquare(p.player());
        } catch (final IllegalPlayerMoveException e){
            playerMove(input);
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