import model.GameModel;
import view.GameFrame;
import view.GamePanel;

public class Main {
    public static void main(String[] args) {
        GameModel model = new GameModel();
        GameFrame frame = new GameFrame(model);
        GamePanel panel = new GamePanel(frame, model);
        frame.add(panel);
        frame.setVisible(true);
    }
}