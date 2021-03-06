import javax.swing.*;
import java.io.IOException;

import Panels.Components.InventoryPanel;
import Panels.Components.allPlayersSideComp;
import Panels.GameBoard;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import Calculator.*;

public class Frame extends JFrame {

    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;

    public Frame() throws IOException {

        setSize(WIDTH, HEIGHT);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        setResizable(false);
        this.getContentPane().add(new MainMenu(this));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);


/*
        //instantiate the buttons
        BackButton = new JButton("Back");
        BackButton.setBounds(0, 0, 100, 50);
        BackButton.setVisible(true);
        add(BackButton);//add the button to the frame
        BackButton.addActionListener(e -> {
                    try {
                        new MainMenu();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        );
*/
    }

    public void addGameBoard() {
        this.getContentPane().removeAll();
        this.getContentPane().add(new GameBoard());
        this.getContentPane().repaint();
        this.getContentPane().revalidate();
    }

}