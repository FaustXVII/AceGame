package nl.justid.events.WinConditionUpdate;

import java.util.ArrayList;
import java.util.List;

public class WinConditionEventHandler {
    private WinConditionEventHandler(){}

    private static final List<WinnerEventListener> WINNER_LISTENERS = new ArrayList<>();
    private static final List<DrawEventListener> DRAW_LISTENERS = new ArrayList<>();
    private static final List<ContinueEventListener> CONTINUE_LISTENERS = new ArrayList<>();

    public static void subscribeWinner(final WinnerEventListener subscriber){
        WINNER_LISTENERS.add(subscriber);
    }

    public static void subscribeDraw(final DrawEventListener subscriber){
        DRAW_LISTENERS.add(subscriber);
    }

    public static void subscribeContinue(final ContinueEventListener subscriber){
        CONTINUE_LISTENERS.add(subscriber);
    }

    public static void updateDraw(){
        DRAW_LISTENERS.forEach(sub -> sub.onDrawEvent());
    }

    public static void updateWinner(){
        WINNER_LISTENERS.forEach(sub -> sub.onWinnerEvent());
    }

    public static void updateContinue(){
        CONTINUE_LISTENERS.forEach(sub -> sub.onContinueEvent());
    }

    public static void unSubscribeAll(){
        WINNER_LISTENERS.clear();
        DRAW_LISTENERS.clear();
        CONTINUE_LISTENERS.clear();
    }
}
