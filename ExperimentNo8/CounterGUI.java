package ExperimentNo8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI extends JFrame implements ActionListener {

    JLabel label;
    JButton up, down, reset;
    int count = 0;

    CounterGUI() {

        setTitle("Counter");
        setSize(400, 200);
        setLayout(new FlowLayout());

        label = new JLabel("Counter : 0");
        label.setFont(new Font("Arial", Font.BOLD, 20));

        up = new JButton("Count Up");
        down = new JButton("Count Down");
        reset = new JButton("Reset");

        up.addActionListener(this);
        down.addActionListener(this);
        reset.addActionListener(this);

        add(label);
        add(up);
        add(down);
        add(reset);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == up) {
            count++;
        }

        if (e.getSource() == down) {
            count--;
        }

        if (e.getSource() == reset) {
            count = 0;
        }

        label.setText("Counter : " + count);
    }

    public static void main(String[] args) {
        new CounterGUI();
    }
}
