package nl.justid.events.GameBoardUpdate;

import java.util.ArrayList;
import java.util.List;

public class GameBoardUpdateHandler {
    private GameBoardUpdateHandler(){}

    private static final List<GameBoardUpdateListener> LISTENERS = new ArrayList<>();

    public static void subscribe(final GameBoardUpdateListener subscriber){
        LISTENERS.add(subscriber);
    }

    public static void update(){
        LISTENERS.forEach(sub -> sub.onGameBoardUpdateEvent());
    }
}
