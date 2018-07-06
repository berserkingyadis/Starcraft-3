import model.GameModel;
import model.game.Game;
import view.GameFrame;
import view.GamePanel;

public class Main {
    public static void main(String[] args) {
        GameModel gm;
        Game game = new Game();
        GameFrame frame = new GameFrame();
        GamePanel panel = new GamePanel(frame, game);
        frame.add(panel);
        frame.setVisible(true);
        game.run();
    }
}