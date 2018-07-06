package view;

import model.game.Game;

import java.lang.Object;
import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class GamePanel extends JPanel implements Observer {

    private GameFrame frame;
    private Game game;

    public GamePanel(GameFrame frame, Game game) {
        this.frame = frame;
        this.game = game;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
    }

    @Override
    public void update(Observable observed, Object message) {
        repaint();
    }
}
