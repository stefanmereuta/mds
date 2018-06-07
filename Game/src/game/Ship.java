package game;

public abstract class Ship {
    
    private int height;
    private int width;
    //private boolean horizontal;
    
    Ship(int h, int w) {
        height = h;
        width = w;
        //horizontal = true;
    }
    
    public void rotate() {
        int tmp = height;
        height = width;
        width = tmp;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
}
