package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Runnable GUITask = new Runnable()
        {
            @Override
            public void run() {
                MakeGUI();
            }
        };

        SwingUtilities.invokeLater(GUITask);

    }
    private  static void MakeGUI()
    {
        JFrame frame = new JFrame("Hello World GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 400));


        JLabel label = new JLabel("Hi I am GUI.");
        //pack method ensures that the GUI does not appear ugly
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
