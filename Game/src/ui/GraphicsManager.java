package ui;

import game.Board;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import proiectmds.GameManager;

public class GraphicsManager extends JFrame implements ActionListener {
    
    JPanel menuPanel;
    GamePanel panel;
    GameManager gameManager;
    JTextField ipField;
    JLabel label;
    
    public GraphicsManager(GameManager gm) {
        super();
        
        gameManager = gm;
        
        setSize(1600, 900);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void startMenu() {
        menuPanel = new JPanel();
        menuPanel.setSize(1600, 900);
        menuPanel.setBackground(Color.WHITE);
        
        add(menuPanel);
        
        label = new JLabel("Input IP address");
        menuPanel.add(label);
        label.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        
        ipField = new JTextField();
        ipField.addActionListener(this);
        ipField.setSize(300, 30);
        menuPanel.add(ipField);
        ipField.setVisible(true);
        
        menuPanel.setVisible(true);
        
        //panel.startMenu();
    }
    
    public void startGame() {
        panel = new GamePanel(gameManager.getMyBoard(), gameManager.getOpponentBoard());
        getContentPane().add(panel);
        
        panel.startGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            gameManager.connect(ipField.getText());
        } catch (IOException ex) {
            label.setText("Cannot connect, try again");
        }
    }
}
