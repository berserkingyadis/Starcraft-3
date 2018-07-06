package view;

public class GameView {
    private GameFrame frame;
    private GamePanel panel;

    public GameView(GameFrame frame, GamePanel panel) {
        this.frame = frame;
        this.panel = panel;
    }

    public GameFrame getFrame() {
        return this.frame;
    }

    public GamePanel getPanel() {
        return this.panel;
    }
}
