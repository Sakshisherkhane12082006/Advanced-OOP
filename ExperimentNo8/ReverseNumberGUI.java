package ExperimentNo8;

import javax.swing.*;
import java.awt.event.*;

public class ReverseNumberGUI extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1, t2;
    JButton b;

    ReverseNumberGUI() {

        setTitle("Reverse Number");
        setSize(400, 200);
        setLayout(null);

        l1 = new JLabel("Enter Number:");
        l1.setBounds(50, 30, 100, 30);

        t1 = new JTextField();
        t1.setBounds(170, 30, 150, 30);

        b = new JButton("Reverse");
        b.setBounds(120, 80, 120, 30);

        l2 = new JLabel("Result:");
        l2.setBounds(50, 130, 100, 30);

        t2 = new JTextField();
        t2.setBounds(170, 130, 150, 30);

        b.addActionListener(this);

        add(l1);
        add(t1);
        add(b);
        add(l2);
        add(t2);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        int num = Integer.parseInt(t1.getText());
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        t2.setText(String.valueOf(rev));
    }

    public static void main(String[] args) {
        new ReverseNumberGUI();
    }
}