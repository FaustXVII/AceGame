package nl.justid.ui;

import nl.justid.gameboard.BoardRow;
import nl.justid.gameboard.GameBoard;

public class Display {
    private final GameBoard gameBoard;

    public Display(final GameBoard gameBoard){
        this.gameBoard = gameBoard;
    }

    public void draw(){
        BoardRow rowA = gameBoard.getRow('a');
        BoardRow rowB = gameBoard.getRow('b');
        BoardRow rowC = gameBoard.getRow('c');

        String board = String.format(
                """
                  1   2   3
                a %s | %s | %s
                 ---|---|---
                b %s | %s | %s
                 ---|---|---
                c %s | %s | %s
                """,
                rowA.getColumn(1).getGameSquare(), rowA.getColumn(2).getGameSquare(), rowA.getColumn(3).getGameSquare(),
                rowB.getColumn(1).getGameSquare(), rowB.getColumn(2).getGameSquare(), rowB.getColumn(3).getGameSquare(),
                rowC.getColumn(1).getGameSquare(), rowC.getColumn(2).getGameSquare(), rowC.getColumn(3).getGameSquare());

        System.out.print(board);
    }
}
