package nl.justid;

import nl.justid.events.GameBoardUpdate.GameBoardUpdateHandler;
import nl.justid.events.WinConditionUpdate.WinConditionEventHandler;
import nl.justid.gameboard.GameBoard;
import nl.justid.gameboard.exceptions.IllegalPlayerMoveException;
import nl.justid.ui.PlayerChoice;
import nl.justid.ui.PlayerCommandlineInput;

public class Game {

    public void start(){
        PlayerCommandlineInput input = new PlayerCommandlineInput();
        WinConditionEventHandler.subscribeDraw(() ->  System.out.println("No winner"));
        WinConditionEventHandler.subscribeWinner(() ->   System.out.println("We have a winner! \n"));
        WinConditionEventHandler.subscribeContinue(() -> playerMove(input));

        GameBoardUpdateHandler.update();
    }

    private void playerMove(PlayerCommandlineInput input) {
        try {
            PlayerChoice p = input.input();

            GameBoard
                    .getRow(p.row())
                    .getColumn(p.column())
                    .setGameSquare(p.player());
        } catch (final IllegalPlayerMoveException e){
            playerMove(input);
        }
    }
}