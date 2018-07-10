package view;

import java.util.Observable;
import java.util.Observer;

public class GameView implements Observer {
    private GameFrame frame;

    private MineralsPanel mineralsPanel;
    private GasPanel gasPanel;

    public GameView(GameFrame frame, MineralsPanel mineralsPanel, GasPanel gasPanel) {
        this.frame = frame;
        this.mineralsPanel = mineralsPanel;
        this.gasPanel = gasPanel;
    }

    public GameFrame getFrame() {
        return this.frame;
    }

    public MineralsPanel getMineralsPanel() {
        return this.mineralsPanel;
    }

    public GasPanel getGasPanel() {
        return this.gasPanel;
    }

    @Override
    public void update(Observable observed, Object message) {
        System.out.println("updated in view!");
    }

}
