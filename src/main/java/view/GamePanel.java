package view;

import model.GameModel;

import java.lang.Object;
import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class GamePanel extends JPanel implements Observer {

    private GameFrame frame;

    public GamePanel(GameFrame frame) {
        this.frame = frame;
        // paintResources is called on by something in the controller.
        this.paintResources(0, 0);
    }

    public void paintResources(int minerals, int gas) {
        JLabel mineralsLabel = new JLabel("Minerals:");
        JLabel mineralsValue = new JLabel(String.valueOf(minerals));
        JLabel gasLabel = new JLabel("Gas:");
        JLabel gasValue = new JLabel(String.valueOf(gas));
        this.add(mineralsLabel);
        this.add(mineralsValue);
        this.add(gasLabel);
        this.add(gasValue);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
    }

    @Override
    public void update(Observable observed, Object message) {
        System.out.println("updated");
        repaint();
    }

    public GameFrame getFrame() {
        return this.frame;
    }
}
