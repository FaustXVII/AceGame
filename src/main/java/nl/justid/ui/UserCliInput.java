package nl.justid.ui;

import java.io.InputStreamReader;
import java.util.Scanner;

public class UserCliInput implements CliInput{

    public String askForInput(final String message) {
        System.out.println(message);

        return new Scanner(new InputStreamReader(System.in)).nextLine();
    }
}
