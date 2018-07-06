package controller;

import model.GameModel;
import view.ConsoleView;
import view.GameView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {

    private GameModel model;
    private GameView view;
    private JButton incrementMinerals;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;

        EventHandler handler = new EventHandler();

        incrementMinerals = new JButton("Increment minerals");
        view.getPanel().add(incrementMinerals);
        incrementMinerals.addActionListener(handler);
    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == incrementMinerals) {
                model.getPlayer().incrementPlayerMinerals();
                System.out.print(model.getPlayer().getMinerals());
            }
        }
    }

    public GameModel getModel() {
        return this.model;
    }

    public GameView getView() {
        return this.view;
    }

}
