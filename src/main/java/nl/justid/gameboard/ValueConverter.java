package nl.justid.gameboard;

import java.util.ArrayList;
import java.util.List;

public class ValueConverter {
    private static final List<Character> ABC_INDEXES = new ArrayList<>();

    static {
        ABC_INDEXES.add('a');
        ABC_INDEXES.add('b');
        ABC_INDEXES.add('c');
    }

    static int abcToIntIndex(char abc){
        return ABC_INDEXES.indexOf(abc);
    }
}
