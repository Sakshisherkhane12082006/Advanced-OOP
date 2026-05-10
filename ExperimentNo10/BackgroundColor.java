package ExperimentNo10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundColor extends JFrame implements ActionListener {

    JComboBox cb;

    BackgroundColor() {

        setTitle("Background Color");

        setSize(400,300);

        setLayout(new FlowLayout());

        String colors[] = {"Red","Green","Blue","Yellow"};

        cb = new JComboBox(colors);

        add(cb);

        cb.addActionListener(this);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String s = (String)cb.getSelectedItem();

        if(s.equals("Red")) {

            getContentPane().setBackground(Color.RED);
        }

        if(s.equals("Green")) {

            getContentPane().setBackground(Color.GREEN);
        }

        if(s.equals("Blue")) {

            getContentPane().setBackground(Color.BLUE);
        }

        if(s.equals("Yellow")) {

            getContentPane().setBackground(Color.YELLOW);
        }
    }

    public static void main(String[] args) {

        new BackgroundColor();
    }
}