package view;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class GameFrame extends JFrame implements Observer {

    private final String DEFAULT_TITLE = "Starcraft editor";
    private final int DEFAULT_WIDTH = 850;
    private final int DEFAULT_HEIGHT = 800;

    public GameFrame() {
        this.setTitle(DEFAULT_TITLE);
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void update(Observable observed, Object messsage) {

    }
}
