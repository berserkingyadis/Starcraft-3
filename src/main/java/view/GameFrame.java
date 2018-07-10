package view;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Class which handles the creation and elements of the JFrame.
 */
public class GameFrame extends JFrame implements Observer {

    public GameFrame() {
        final String DEFAULT_TITLE = "Starcraft editor";
        final int DEFAULT_WIDTH = 850;
        final int DEFAULT_HEIGHT = 800;

        this.setTitle(DEFAULT_TITLE);
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.getContentPane().setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
    }

    @Override
    public void update(Observable observed, Object messsage) {

    }
}
