package nl.justid.ui;

import nl.justid.player.CurrentPlayerHolder;
import nl.justid.player.Player;

import java.util.Scanner;

public class PlayerCommandlineInput implements PlayerInput{
    private final Scanner scanner =  new Scanner(System.in);

    public PlayerChoice input(){
        return input(null);
    }

    @Override
    public PlayerChoice input(final String message) {
        final char row;
        final int column;
        final Player player = CurrentPlayerHolder.getCurrentPlayer();

        String messageMove = message != null ? message: ", make a move!";

        System.out.println(player.getName() + messageMove);

        System.out.print("select a row: ");
        row = scanner.next().charAt(0);// Max 1

        System.out.print("select a column: ");
        column = scanner.nextInt();

        return new PlayerChoice(player, row, column);
    }
}