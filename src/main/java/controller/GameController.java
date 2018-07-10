package controller;

import model.GameModel;
import view.GameView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {

    private GameModel model;
    private GameView view;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        model.getPlayer().addObserver(view.getMineralsPanel());
        model.getPlayer().addObserver(view.getGasPanel());
        EventHandler resourceHandler = new EventHandler();

        view.getMineralsPanel().getMineralsButton().addActionListener(resourceHandler);
        view.getGasPanel().getGasButton().addActionListener(resourceHandler);
    }

    private class EventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == view.getMineralsPanel().getMineralsButton()) {
                model.getPlayer().incrementPlayerMinerals();
                System.out.print(model.getPlayer().getMinerals());
            }
            else if(e.getSource() == view.getGasPanel().getGasButton()) {
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
