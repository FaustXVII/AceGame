package nl.justid.gameboard;

import java.util.ArrayList;
import java.util.List;

import static nl.justid.gameboard.ValueConverter.abcToIntIndex;

// Map the user input to a 3 by 3 game board
//  1   2   3
//a x |   | o
// ---|---|---
//b   | x | x
// ---|---|---
//c   |   | o

public class GameBoard {
    private GameBoard(){}

    private static final List<BoardRow> rows = new ArrayList<>();

    static {
        rows.add(new BoardRow());
        rows.add(new BoardRow());
        rows.add(new BoardRow());
    }

    public static BoardRow getRow(char row){
        return rows.get(abcToIntIndex(row));
    }
}
