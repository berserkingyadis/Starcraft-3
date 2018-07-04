import model.game.Game;
import view.GameFrame;
import view.GamePanel;

public class Main {
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        GamePanel panel = new GamePanel();
        Game game = new Game();
        frame.add(panel);
        frame.setVisible(false);
        game.run();
    }
}