package proiectmds;

import game.Board;
import java.io.IOException;
import static java.lang.Math.random;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.GraphicsManager;

class ServerWait implements Runnable {
    Socket s;
    ServerSocket ss;
    
    ServerWait(ServerSocket ss) {
        this.ss = ss;
    }
    
    @Override
    public void run() {
        try {
            s = ss.accept();
        } catch (IOException ex) {
            // nimic lol
        }
    }
    
}

public class GameManager {
    ServerSocket serverSocket;
    Socket socket;
    ServerWait serverWait;
    
    int size;
    Board myBoard, opponentBoard;
    GraphicsManager g;

    GameManager() {
        size = 10;
        myBoard = new Board(size, false);
        opponentBoard = new Board(size, true);
        
        g = new GraphicsManager(this);
        
        /*g.startMenu();
        
        try {
            serverSocket = new ServerSocket(9890);
        } catch (IOException ex) {
            //
        }
        
        serverWait = new ServerWait(serverSocket);
        serverWait.run();
        
        while (true) {
            if (serverWait.s != null) {
                socket = serverWait.s;
                
                break;
            }
        }*/
        
        g.startGame();
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
    
    void start() {
    }
    
    public Board getMyBoard() {
        return myBoard;
    }
    
    public Board getOpponentBoard() {
        return opponentBoard;
    }
    
    public void connect(String ip) throws IOException {
        socket = new Socket(ip, 9890);
    }
}
