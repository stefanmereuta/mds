package game;

import java.util.ArrayList;
import java.util.List;

public class Board {
    
    int size;
    
    List<List<Square>> board;
    
    public Board(int size, boolean covered) {
        this.size = size;
        
        board = new ArrayList<>();
        
        for (int i = 0; i < size; ++i) {
            board.add(new ArrayList<>());
        }
        
        for (List row : board) {
            for (int i = 0; i < size; ++i) {
                row.add(new Square(covered));
            }
        }
    }
    
    public Square getSquare(int r, int c) {
        return board.get(r).get(c);
    }
    
    public boolean canPlaceShip(Ship ship, int x, int y) {
        return x >= 0 && y >= 0 && ship.getHeight() + y < size && ship.getWidth() + x < size;
    }
    
    public void placeShip(Ship ship, int x, int y) {
        if (canPlaceShip(ship, x, y)) {
            for (int i = 0; i < ship.getHeight(); ++i) {
                for (int j = 0; j < ship.getWidth(); ++j) {
                    board.get(i + y).get(j + x).addShip();
                }
            }
        }
    }
    
}
