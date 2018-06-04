package game;

public class Square {
    
    private boolean ship;
    private boolean covered;
    
    public Square(boolean isCovered) {
        ship = false;
        covered = isCovered;
    }
    
    void addShip() {
        ship = true;
    }
    
    boolean isCovered() {
        return covered;
    }
    
    boolean isShip() {
        return ship;
    }
    
    void uncover() {
        covered = false;
    }
    
}
