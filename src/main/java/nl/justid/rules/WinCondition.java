package nl.justid.rules;

import nl.justid.gameboard.GameBoard;
import nl.justid.player.Player;

import java.util.ArrayList;
import java.util.List;

public class WinCondition {
//    private final GameBoard gameBoard;

//    public WinCondition(final GameBoard gameBoard){
//        this.gameBoard = gameBoard;
//    }

    public Status gameOver(){
        final List<String> winOption = initWinOptions();

        return getWinner(winOption);
    }

    // Continue
    // Win (Player)
    // Draw

    private static Status getWinner(List<String> winOption) {
        boolean boardIsFull = true;

        for (String option : winOption) {
            if(option.equalsIgnoreCase("XXX")){
                final Status status = Status.WINNER;
                status.setPlayer(Player.PLAYER_1);
                return status;
            }

            if(option.equalsIgnoreCase("OOO")){
                final Status status = Status.WINNER;
                status.setPlayer(Player.PLAYER_2);
                return status;
            }

            if(option.replace(" ", "").length() < 3){
                boardIsFull = false;
            }
        }

        if(boardIsFull){
            return Status.DRAW;
        }

        return Status.CONTINUE;
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