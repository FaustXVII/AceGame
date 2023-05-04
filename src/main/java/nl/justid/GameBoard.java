package nl.justid;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {
    private final List<String[]> gameBoard = new ArrayList<>();
    private final List<String > abc = List.of("a", "b", "c");

    public GameBoard(){
        gameBoard.add(new String[]{"", "", ""});
        gameBoard.add(new String[]{"", "", ""});
        gameBoard.add(new String[]{"", "", ""});
    }

    public void set(final String row, final int column, final String gamePeace) {
        gameBoard.get(abc.indexOf(row))[column-1] = gamePeace;
    }

    public String get(final String row, final int column){
        return gameBoard.get(abc.indexOf(row))[column-1];
    }


}
