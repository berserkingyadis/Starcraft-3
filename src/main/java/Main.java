import controller.GameController;
import model.GameModel;
import view.*;

public class Main {
    public static void main(String[] args) {
        GameModel model = new GameModel();

        GameFrame frame = new GameFrame();

        ResourcePanel resourcePanel = new ResourcePanel(frame);

        GameView view = new GameView(frame, resourcePanel);
        GameController controller = new GameController(model, view);
        System.out.print(model.getPlayer().getMinerals());
        System.out.println(model.getPlayer().getGas());
        frame.add(resourcePanel);
        frame.setVisible(true);
    }
}