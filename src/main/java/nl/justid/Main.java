package nl.justid;

import nl.justid.ui.UserCliInput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Hello " + new UserCliInput().askForInput("What is your name? "));
    }
}