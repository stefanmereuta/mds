package ui;

import game.Board;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

enum Mode {
    MENU, GAME;
}

public class GamePanel extends JPanel {
    
    Mode mode;
    
    static int LEFT_MARGIN = 50;
    static int TOP_MARGIN = 50;
    static int BOARD_SPACING = 50;
    static int COLS = 10;
    static int ROWS = 10;
    static int SQ_SIZE = 40;
    
    static int MY_X_OFFSET = LEFT_MARGIN;
    static int MY_Y_OFFSET = TOP_MARGIN;
    static int OPPONENT_X_OFFSET = LEFT_MARGIN + COLS * SQ_SIZE + BOARD_SPACING;
    static int OPPONENT_Y_OFFSET = TOP_MARGIN;
    
    Board myBoard, opponentBoard;
    
    GamePanel(Board mb, Board ob) {
        super();
        
        mode = Mode.MENU;
        
        myBoard = mb;
        opponentBoard = ob;
        
        setBackground(Color.white);
        
        setSize(1600, 900);
        
        setVisible(true);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);
        
        if (mode == Mode.MENU) {
            
            
            
        } else {
            for (int row = 0; row < ROWS; ++row) {
               for (int col = 0; col < COLS; ++col) {
                   if (myBoard.getSquare(row, col).isCovered()) {
                       g.setColor(Color.GRAY);
                   } else if (myBoard.getSquare(row, col).isShip()) {
                       g.setColor(Color.RED);
                   } else {
                       g.setColor(Color.WHITE);
                   }

                   g.fillRect(LEFT_MARGIN + SQ_SIZE * row, 
                           TOP_MARGIN + SQ_SIZE * col, SQ_SIZE, SQ_SIZE);
               }
            }

            for (int row = 0; row < ROWS; ++row) {
               for (int col = 0; col < COLS; ++col) {
                   if (opponentBoard.getSquare(row, col).isCovered()) {
                       g.setColor(Color.GRAY);
                   } else if (opponentBoard.getSquare(row, col).isShip()) {
                       g.setColor(Color.RED);
                   } else {
                       g.setColor(Color.WHITE);
                   }

                   g.fillRect(OPPONENT_X_OFFSET + SQ_SIZE * row, 
                           TOP_MARGIN + SQ_SIZE * col, SQ_SIZE, SQ_SIZE);
               }
            }

            g.setColor(Color.BLACK);

            for (int i = 0; i <= ROWS; ++i) {
                g.drawLine(LEFT_MARGIN, TOP_MARGIN + i * SQ_SIZE, 
                        LEFT_MARGIN + COLS * SQ_SIZE, TOP_MARGIN + i * SQ_SIZE);
            }

            for (int i = 0; i <= COLS; ++i) {
                g.drawLine(LEFT_MARGIN + i * SQ_SIZE, TOP_MARGIN, 
                        LEFT_MARGIN + i * SQ_SIZE, TOP_MARGIN + ROWS * SQ_SIZE);
            }

            for (int i = 0; i <= ROWS; ++i) {
                g.drawLine(OPPONENT_X_OFFSET, TOP_MARGIN + i * SQ_SIZE, 
                        OPPONENT_X_OFFSET + COLS * SQ_SIZE, TOP_MARGIN + i * SQ_SIZE);
            }

            for (int i = 0; i <= COLS; ++i) {
                g.drawLine(OPPONENT_X_OFFSET + i * SQ_SIZE, TOP_MARGIN, 
                        OPPONENT_X_OFFSET + i * SQ_SIZE, TOP_MARGIN + ROWS * SQ_SIZE);
            }
             /*for (int col = 1; col < COLS; ++col) {
                g.fillRoundRect(CELL_SIZE * col - GRID_WIDHT_HALF, 0,
                      GRID_WIDTH, CANVAS_HEIGHT-1, GRID_WIDTH, GRID_WIDTH);
             }

             // Draw the Seeds of all the cells if they are not empty
             // Use Graphics2D which allows us to set the pen's stroke
             Graphics2D g2d = (Graphics2D)g;
             g2d.setStroke(new BasicStroke(SYMBOL_STROKE_WIDTH, BasicStroke.CAP_ROUND,
                   BasicStroke.JOIN_ROUND));  // Graphics2D only
             for (int row = 0; row < ROWS; ++row) {
                for (int col = 0; col < COLS; ++col) {
                   int x1 = col * CELL_SIZE + CELL_PADDING;
                   int y1 = row * CELL_SIZE + CELL_PADDING;
                   if (board[row][col] == Seed.CROSS) {
                      g2d.setColor(Color.RED);
                      int x2 = (col + 1) * CELL_SIZE - CELL_PADDING;
                      int y2 = (row + 1) * CELL_SIZE - CELL_PADDING;
                      g2d.drawLine(x1, y1, x2, y2);
                      g2d.drawLine(x2, y1, x1, y2);
                   } else if (board[row][col] == Seed.NOUGHT) {
                      g2d.setColor(Color.BLUE);
                      g2d.drawOval(x1, y1, SYMBOL_SIZE, SYMBOL_SIZE);
                   }
                }
             }

             // Print status-bar message
             if (currentState == GameState.PLAYING) {
                statusBar.setForeground(Color.BLACK);
                if (currentPlayer == Seed.CROSS) {
                   statusBar.setText("X's Turn");
                } else {
                   statusBar.setText("O's Turn");
                }
             } else if (currentState == GameState.DRAW) {
                statusBar.setForeground(Color.RED);
                statusBar.setText("It's a Draw! Click to play again.");
             } else if (currentState == GameState.CROSS_WON) {
                statusBar.setForeground(Color.RED);
                statusBar.setText("'X' Won! Click to play again.");
             } else if (currentState == GameState.NOUGHT_WON) {
                statusBar.setForeground(Color.RED);
                statusBar.setText("'O' Won! Click to play again.");
             }*/
        }
    }
    
    public void startMenu() {
        mode = Mode.MENU;
    }
    
    public void startGame() {
        mode = Mode.GAME;
    }
    
}
