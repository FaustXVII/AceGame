package nl.justid.utils;

public class Strings {
    public static final String WHITE_SPACE = " ";


    private Strings(){};

    public static boolean notEquals(final String s1, final String s2){
        return !s1.equals(s2);
    }

    public static boolean notWhiteSpace(final String s1){
        return notEquals(s1, WHITE_SPACE);
    }
}
