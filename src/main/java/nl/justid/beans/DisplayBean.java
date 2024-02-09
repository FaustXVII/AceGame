package nl.justid.beans;

import nl.justid.events.GameBoardUpdate.*;
import nl.justid.gameboard.BoardRow;
import nl.justid.gameboard.GameBoard;

class DisplayBean implements GameBoardUpdateListener {

    DisplayBean(){
        GameBoardUpdateHandler.subscribe(this);
    }

    @Override
    public void onGameBoardUpdateEvent() {
        draw();
    }

    public void draw(){
        BoardRow rowA = GameBoard.getRow('a');
        BoardRow rowB = GameBoard.getRow('b');
        BoardRow rowC = GameBoard.getRow('c');

        String board = String.format(
                """
                  1   2   3
                a %s | %s | %s
                 ---|---|---
                b %s | %s | %s
                 ---|---|---
                c %s | %s | %s
                """,
                rowA.getColumn(1).getGameSquare(), rowA.getColumn(2).getGameSquare(), rowA.getColumn(3).getGameSquare(),
                rowB.getColumn(1).getGameSquare(), rowB.getColumn(2).getGameSquare(), rowB.getColumn(3).getGameSquare(),
                rowC.getColumn(1).getGameSquare(), rowC.getColumn(2).getGameSquare(), rowC.getColumn(3).getGameSquare());

        System.out.print(board);
    }
}



// GameColumn -> GameBoardUpdate Handler <-> GameBoardUpdateListener <- DisplayBean
// GameColumn -> Event Magic <- DisplayBean
// GameColumn -> DisplayBean.draw()

// low coupling - high cohesion





//          main
//        /  |  \
//       A   B   C
//      /\
//     1  2
//       /\
//  Gamma , iDelta

// public class 2{
// private delta;
//  2(cDelta factory){
//      this.delta = fact.createDelta
//
// }
//
// }


// class A
/// 2(new Delta)

// A (new Delta)

// Factory implements cDelta, cGamma, cOmage
// fact.createDelta()
// fact.createGamma()
// fact.createOmega()
