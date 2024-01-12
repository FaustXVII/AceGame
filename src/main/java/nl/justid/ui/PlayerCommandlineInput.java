package nl.justid.ui;

import java.util.Scanner;

public class PlayerCommandlineInput implements PlayerInput{
    private final Scanner scanner =  new Scanner(System.in);

    @Override
    public PlayerChoice input() {
        final int playerId;
        final char row;
        final int column;

        System.out.println("Player 1, make a move!");
        playerId = 1;

        System.out.print("select a row: ");
        row = scanner.next().charAt(0);// Max 1

        System.out.print("select a column: ");
        column = scanner.nextInt();

        return new PlayerChoice(playerId, row, column);
    }
}
