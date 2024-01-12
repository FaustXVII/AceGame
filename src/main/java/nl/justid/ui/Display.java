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
                rowA.getColumn(1).getPlayer(), rowA.getColumn(2).getPlayer(), rowA.getColumn(3).getPlayer(),
                rowB.getColumn(1).getPlayer(), rowB.getColumn(2).getPlayer(), rowB.getColumn(3).getPlayer(),
                rowC.getColumn(1).getPlayer(), rowC.getColumn(2).getPlayer(), rowC.getColumn(3).getPlayer());

        System.out.print(board);
    }
}
