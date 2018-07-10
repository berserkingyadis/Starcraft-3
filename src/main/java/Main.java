import controller.GameController;
import model.GameModel;
import view.GameFrame;
import view.GasPanel;
import view.MineralsPanel;
import view.GameView;

public class Main {
    public static void main(String[] args) {
        GameModel model = new GameModel();

        GameFrame frame = new GameFrame();

        MineralsPanel mineralsPanel = new MineralsPanel(frame);
        GasPanel gasPanel = new GasPanel(frame);

        GameView view = new GameView(frame, mineralsPanel, gasPanel);
        GameController controller = new GameController(model, view);
        System.out.print(model.getPlayer().getMinerals());
        System.out.println(model.getPlayer().getGas());
        frame.add(mineralsPanel);
        frame.add(gasPanel);
        frame.setVisible(true);
    }
}