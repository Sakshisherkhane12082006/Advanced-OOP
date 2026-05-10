package ExperimentNo11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo extends JFrame implements ActionListener {

    JButton b[] = new JButton[6];

    GridLayoutDemo() {

        setTitle("GridLayout Demo");

        setSize(400, 300);

        setLayout(new GridLayout(2,3));

        for(int i=0;i<6;i++) {

            b[i] = new JButton("" + (i+1));

            add(b[i]);

            b[i].addActionListener(this);
        }

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        JButton clicked = (JButton)e.getSource();

        String temp = b[0].getText();

        b[0].setText(clicked.getText());

        clicked.setText(temp);
    }

    public static void main(String[] args) {

        new GridLayoutDemo();
    }
}