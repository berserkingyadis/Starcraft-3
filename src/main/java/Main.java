import controller.GameController;
import model.GameModel;
import view.ConsoleView;
import view.GameFrame;
import view.GamePanel;
import view.GameView;

public class Main {
    public static void main(String[] args) {
        GameModel model = new GameModel();
        GameFrame frame = new GameFrame();
        GamePanel panel = new GamePanel(frame, model);
        GameView view = new GameView(frame, panel);
        GameController controller = new GameController(model, view);
        model.getPlayer().addObserver(view.getPanel());
        System.out.print(model.getPlayer().getMinerals());
        frame.add(panel);
        frame.setVisible(true);
    }
}