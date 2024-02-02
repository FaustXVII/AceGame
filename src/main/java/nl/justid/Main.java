package nl.justid;

import nl.justid.beans.BeanInitializer;

public class Main {
    public static void main(String[] args) {
        BeanInitializer.init();
        new Game().start();
    }
}