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
    private List<BoardRow> rows = new ArrayList<>();
    {
        rows.add(new BoardRow());
        rows.add(new BoardRow());
        rows.add(new BoardRow());
    }

    public BoardRow getRow(char row){
        return rows.get(abcToIntIndex(row));
    }
}
