package view;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class GasPanel extends JPanel implements Observer {

    private JFrame frame;
    private JButton incrementGasButton;
    private JLabel gasLabel;
    private JLabel gasLabelValue;

    public GasPanel(JFrame frame) {
        this.frame = frame;

        gasLabel = new JLabel("Gas:");
        gasLabelValue = new JLabel(String.valueOf(0));
        incrementGasButton = new JButton("++Gas");

        add(gasLabel);
        add(gasLabelValue);
        add(incrementGasButton);
    }

    public JButton getGasButton() {
        return this.incrementGasButton;
    }

    @Override
    public void update(Observable observable, Object o) {
        String temp = o.toString();
        if(temp.contains("gas")) {
            temp = temp.replace("gas", "");
            gasLabelValue.setText("" + temp);
        }
    }

    public JFrame getFrame() {
        return this.frame;
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
