package nl.justid.beans;

import nl.justid.events.GameBoardUpdate.GameBoardUpdateHandler;
import nl.justid.events.WinConditionUpdate.WinConditionEventHandler;
import nl.justid.gameboard.GameBoard;
import nl.justid.gameboard.exceptions.IllegalPlayerMoveException;
import nl.justid.player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinConditionTest {

    @Test
    void givenWinConditionBean_when3InARowPlayer1_thenWinnerIsThrown() throws IllegalPlayerMoveException {
        // Given
        BeanInitializer.init();
        GameBoard.reset();
        WinConditionEventHandler.unSubscribeAll();

        GameBoard.getRow('a').getColumn(1).setGameSquare(Player.PLAYER_1);
        GameBoard.getRow('b').getColumn(1).setGameSquare(Player.PLAYER_1);
        GameBoard.getRow('c').getColumn(1).setGameSquare(Player.PLAYER_1);

        // Then
        WinConditionEventHandler.subscribeWinner(()-> pass());
        WinConditionEventHandler.subscribeDraw(()-> fail());
        WinConditionEventHandler.subscribeContinue(()-> fail());

        // When
        GameBoardUpdateHandler.update();
    }

    @Test
    void givenWinConditionBean_when3InARowPlayer2_thenWinnerIsThrown() throws IllegalPlayerMoveException {
        // Given
        BeanInitializer.init();
        GameBoard.reset();
        WinConditionEventHandler.unSubscribeAll();

        GameBoard.getRow('a').getColumn(1).setGameSquare(Player.PLAYER_2);
        GameBoard.getRow('b').getColumn(1).setGameSquare(Player.PLAYER_2);
        GameBoard.getRow('c').getColumn(1).setGameSquare(Player.PLAYER_2);

        // Then
        WinConditionEventHandler.subscribeWinner(()-> pass());
        WinConditionEventHandler.subscribeDraw(()-> fail());
        WinConditionEventHandler.subscribeContinue(()-> fail());

        // When
        GameBoardUpdateHandler.update();
    }

    @Test
    void givenWinConditionBean_whenDraw_thenWinnerIsThrown() throws IllegalPlayerMoveException {
        // Given
        BeanInitializer.init();
        GameBoard.reset();
        WinConditionEventHandler.unSubscribeAll();

        GameBoard.getRow('a').getColumn(1).setGameSquare(Player.PLAYER_2);
        GameBoard.getRow('b').getColumn(1).setGameSquare(Player.PLAYER_1);
        GameBoard.getRow('c').getColumn(1).setGameSquare(Player.PLAYER_2);

        GameBoard.getRow('a').getColumn(2).setGameSquare(Player.PLAYER_1);
        GameBoard.getRow('b').getColumn(2).setGameSquare(Player.PLAYER_2);
        GameBoard.getRow('c').getColumn(2).setGameSquare(Player.PLAYER_1);

        GameBoard.getRow('a').getColumn(3).setGameSquare(Player.PLAYER_1);
        GameBoard.getRow('b').getColumn(3).setGameSquare(Player.PLAYER_2);
        GameBoard.getRow('c').getColumn(3).setGameSquare(Player.PLAYER_1);

        // Then
        WinConditionEventHandler.subscribeWinner(()-> fail());
        WinConditionEventHandler.subscribeDraw(()-> pass());
        WinConditionEventHandler.subscribeContinue(()-> fail());

        // When
        GameBoardUpdateHandler.update();
    }


    private void pass(){
        assertTrue(true);
    }
}