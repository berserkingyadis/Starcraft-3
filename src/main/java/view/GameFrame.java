package view;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class GameFrame extends JFrame implements Observer {

    private final String DEFAULT_TITLE = "Starcraft editor";
    private final int DEFAULT_WIDTH = 850;
    private final int DEFAULT_HEIGHT = 800;

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;

    public GameFrame() {
        this.setTitle(DEFAULT_TITLE);
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        this.setJMenuBar(menuBar);
    }

    @Override
    public void update(Observable observed, Object messsage) {

    }
}
