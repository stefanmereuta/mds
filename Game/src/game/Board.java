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
    
}
