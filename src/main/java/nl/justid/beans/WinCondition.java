package nl.justid.beans;

import nl.justid.events.GameBoardUpdate.GameBoardUpdateHandler;
import nl.justid.events.GameBoardUpdate.GameBoardUpdateListener;
import nl.justid.events.WinConditionUpdate.WinConditionEventHandler;
import nl.justid.gameboard.GameBoard;
import nl.justid.player.CurrentPlayerHolder;

import java.util.ArrayList;
import java.util.List;

public class WinCondition implements GameBoardUpdateListener {

    WinCondition(){
        GameBoardUpdateHandler.subscribe(this);
    }

    @Override
    public void onGameBoardUpdateEvent() {
        gameOver();
    }

    public void gameOver(){
        final List<String> winOption = initWinOptions();
        CurrentPlayerHolder.switchPlayer();
        getWinner(winOption);

    }

    private static void getWinner(List<String> winOption) {
        boolean boardIsFull = true;

        for (String option : winOption) {
            if(option.equalsIgnoreCase("XXX")){
                WinConditionEventHandler.updateWinner();
                return;
            }

            if(option.equalsIgnoreCase("OOO")){
                WinConditionEventHandler.updateWinner();
                return;
            }

            if(option.replace(" ", "").length() < 3){
                boardIsFull = false;
            }
        }

        if(boardIsFull){
            WinConditionEventHandler.updateDraw();
            return;
        }

        WinConditionEventHandler.updateContinue();
    }

    private List<String> initWinOptions() {
        List<String> winOption = new ArrayList<>();
        winOption.add(winningRow('a'));
        winOption.add(winningRow('b'));
        winOption.add(winningRow('c'));

        winOption.add(winningColumn(1));
        winOption.add(winningColumn(2));
        winOption.add(winningColumn(3));

        winOption.add(winningLeft());
        winOption.add(winningRechts());
        return winOption;
    }

    private String winningRow(final char row){
        String _1 = GameBoard.getRow(row).getColumn(1).getGameSquare();
        String _2 = GameBoard.getRow(row).getColumn(2).getGameSquare();
        String _3 = GameBoard.getRow(row).getColumn(3).getGameSquare();

        return _1 + _2 + _3;
    }

    private String winningColumn(final int column){
        String _1 = GameBoard.getRow('a').getColumn(column).getGameSquare();
        String _2 = GameBoard.getRow('b').getColumn(column).getGameSquare();
        String _3 = GameBoard.getRow('c').getColumn(column).getGameSquare();

        return  _1 + _2 + _3;
    }

    private String winningLeft(){
        String _1 = GameBoard.getRow('a').getColumn(1).getGameSquare();
        String _2 = GameBoard.getRow('b').getColumn(2).getGameSquare();
        String _3 = GameBoard.getRow('c').getColumn(3).getGameSquare();

        return  _1 + _2 + _3;
    }

    private String winningRechts(){
        String _1 = GameBoard.getRow('a').getColumn(3).getGameSquare();
        String _2 = GameBoard.getRow('b').getColumn(2).getGameSquare();
        String _3 = GameBoard.getRow('c').getColumn(1).getGameSquare();

        return  _1 + _2 + _3;
    }
}