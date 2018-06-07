package game;

public class Square {
    
    private boolean ship;
    private boolean covered;
    
    public Square(boolean isCovered) {
        ship = false;
        covered = isCovered;
    }
    
    public void addShip() {
        ship = true;
    }
    
    public boolean isCovered() {
        return covered;
    }
    
    public boolean isShip() {
        return ship;
    }
    
    public void uncover() {
        covered = false;
    }
    
}
