package nl.justid.gameboard;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private final List<BoardColumn> columns = new ArrayList<>();
    {
        columns.add(new BoardColumn());
        columns.add(new BoardColumn());
        columns.add(new BoardColumn());
    }

    public BoardColumn getColumn(int index) {
        return columns.get(offsetCorrection(index));
    }

    private int offsetCorrection(final int i){
        return i -1;
    }
}
