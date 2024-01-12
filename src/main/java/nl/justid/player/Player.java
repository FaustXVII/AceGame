package nl.justid.player;

public enum Player {
    PLAYER_1("Player 1", "X", 1),
    PLAYER_2("Player 2", "O", 2);

    private final String name;
    private final String symbol;
    private final int number;

    Player(final String name, final String symbol, final int number){
        this.name = name;
        this.symbol = symbol;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }
}
