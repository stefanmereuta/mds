package proiectmds;

import game.Board;
import static java.lang.Math.random;

public class GameManager {
    int size;
    Board myBoard, opponentBoard;

    GameManager() {
        size = 10;
        
        myBoard = new Board(size, false);
    }
    
    void startGame() {
        boolean myTurn = random() >= 0.5;
        
        while (true) {
            if (myTurn) {
                //eventManager.getClick();
            }
            
            while (!myTurn) {
                //wait
            }
        }
    }
    
    /*GameManager(int size) {
        this.size = size;
        
        board = new Board(size, false);
    }*/
    
    void start() {
        
    }
}
