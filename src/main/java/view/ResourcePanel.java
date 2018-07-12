package view;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class ResourcePanel extends JPanel implements Observer {

    private JFrame frame;

    private JButton incrementGasButton;
    private JLabel gasLabel;
    private JLabel gasLabelValue;

    private JButton incrementMineralsButton;
    private JLabel mineralsLabel;
    private JLabel mineralsLabelValue;

    public ResourcePanel(JFrame frame) {
        this.frame = frame;

        mineralsLabel = new JLabel("Minerals:");
        mineralsLabelValue = new JLabel(String.valueOf(0));
        incrementMineralsButton = new JButton("++Minerals");

        add(mineralsLabel);
        add(mineralsLabelValue);
        add(incrementMineralsButton);


        gasLabel = new JLabel("Gas:");
        gasLabelValue = new JLabel(String.valueOf(0));
        incrementGasButton = new JButton("++Gas");

        add(gasLabel);
        add(gasLabelValue);
        add(incrementGasButton);
    }


    @Override
    public void update(Observable obs, Object o) {
        String temp = o.toString();
        if(temp.contains("minerals")) {
            temp = temp.replace("minerals", "");
            mineralsLabelValue.setText("" + temp);
        }
        else if (temp.contains("gas")) {
            temp = temp.replace("gas", "");
            gasLabelValue.setText("" + temp);
        }
    }

    public JFrame getFrame() {
        return this.frame;
    }

    public JButton getIncrementMineralsButton() {
        return this.incrementMineralsButton;
    }

    public JLabel getMineralsLabel() {
        return this.mineralsLabel;
    }

    public JLabel getMineralsLabelValue() {
        return this.mineralsLabelValue;
    }

    public JButton getIncrementGasButton() {
        return this.incrementGasButton;
    }

    public JLabel getGasLabel() {
        return this.gasLabel;
    }

    public JLabel getGasLabelValue() {
        return this.gasLabelValue;
    }
}