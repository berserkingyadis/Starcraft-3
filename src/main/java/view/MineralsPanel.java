package view;

import java.lang.Object;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class MineralsPanel extends JPanel implements Observer {

    private ArrayList<JLabel> labelList = new ArrayList<JLabel>();

    private GameFrame frame;
    private JLabel mineralsValueLabel;
    private JButton incrementMineralsButton;

    public MineralsPanel(GameFrame frame) {
        this.frame = frame;
        JLabel mineralsLabel = new JLabel("Minerals:");
        mineralsValueLabel = new JLabel(String.valueOf(0));

        this.add(mineralsLabel);
        this.add(mineralsValueLabel);

        incrementMineralsButton = new JButton("++Minerals");
        add(incrementMineralsButton);
    }

    public JButton getMineralsButton() {
        return this.incrementMineralsButton;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
    }

    @Override
    public void update(Observable observable, Object o) {
        String temp = o.toString();
        if(temp.contains("minerals")) {
            temp = temp.replace("minerals", "");
            mineralsValueLabel.setText("" + temp);
        }
    }

    public JLabel getMineralsValue() {
        return this.mineralsValueLabel;
    }

    public GameFrame getFrame() {
        return this.frame;
    }
}
