package nl.justid.player;

public class CurrentPlayerHolder {
    private CurrentPlayerHolder(){}

    private static Player currentPlayer = Player.PLAYER_2;

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void switchPlayer() {
        switch (currentPlayer){
            case PLAYER_1 : currentPlayer = Player.PLAYER_2;
                break;
            case PLAYER_2 : currentPlayer = Player.PLAYER_1;
                break;
        }
    }
}
