package controller;

import model.GameModel;
import view.GameView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {

    private GameModel model;
    private GameView view;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        model.getPlayer().addObserver(view.getResourcePanel());
        EventHandler resourceHandler = new EventHandler();

        view.getResourcePanel().getIncrementMineralsButton().addActionListener(resourceHandler);
        view.getResourcePanel().getIncrementGasButton().addActionListener(resourceHandler);
    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == view.getResourcePanel().getIncrementMineralsButton()) {
                model.getPlayer().incrementPlayerMinerals();
                System.out.print(model.getPlayer().getMinerals());
            }
            else if(e.getSource() == view.getResourcePanel().getIncrementGasButton()) {
                model.getPlayer().incrementPlayerGas();
                System.out.print(model.getPlayer().getGas());
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
