package nl.justid.ui;

import nl.justid.player.Player;

import java.util.Scanner;

public class PlayerCommandlineInput implements PlayerInput{
    private final Scanner scanner =  new Scanner(System.in);

    @Override
    public PlayerChoice input(final Player player) {
        final char row;
        final int column;

        System.out.println(player.getName() + ", make a move!");

        System.out.print("select a row: ");
        row = scanner.next().charAt(0);// Max 1

        System.out.print("select a column: ");
        column = scanner.nextInt();

        return new PlayerChoice(player, row, column);
    }
}
