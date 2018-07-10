package view;

public class GameView {
    private GameFrame frame;

    private ResourcePanel resourcePanel;

    public GameView(GameFrame frame, ResourcePanel resourcePanel) {
        this.frame = frame;
        this.resourcePanel = resourcePanel;
    }

    public GameFrame getFrame() {
        return this.frame;
    }

    public ResourcePanel getResourcePanel() {
        return this.resourcePanel;
    }

}
