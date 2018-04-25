
package com.zetcode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class StormRun extends JFrame {

    public StormRun() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(()  {
            StormRun ex = new StormRun();
            ex.setVisible(true);
        });
    }
}
