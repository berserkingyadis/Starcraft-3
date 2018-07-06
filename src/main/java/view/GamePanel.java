package view;

import model.GameModel;

import java.lang.Object;
import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class GamePanel extends JPanel implements Observer {

    private GameFrame frame;
    private GameModel model;

    public GamePanel(GameFrame frame, GameModel model) {
        this.frame = frame;
        this.model = model;
        this.paintResources();
    }

    private void paintResources() {
        JLabel minerals = new JLabel("Minerals:");
        JLabel mineralsValue = new JLabel(String.valueOf(model.getPlayer().getMinerals()));
        JLabel gas = new JLabel("Gas:");
        JLabel gasValue = new JLabel(String.valueOf(model.getPlayer().getGas()));

        this.add(minerals);
        this.add(mineralsValue);
        this.add(gas);
        this.add(gasValue);
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

    public GameFrame getFrame() {
        return this.frame;
    }

    public GameModel getModel() {
        return this.model;
    }
}
