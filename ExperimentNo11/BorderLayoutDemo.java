
package ExperimentNo11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo extends JFrame implements ActionListener {

    JTextField t1, t2;
    JButton b1, b2, b3;

    BorderLayoutDemo() {

        setTitle("Border Layout");
        setSize(400, 300);

        setLayout(new BorderLayout());

        t1 = new JTextField();

        t2 = new JTextField();

        b1 = new JButton("Binary");
        b2 = new JButton("Octal");
        b3 = new JButton("Hex");

        add(new JLabel("Enter Number"), BorderLayout.NORTH);
        add(t1, BorderLayout.CENTER);

        JPanel p = new JPanel();

        p.add(b1);
        p.add(b2);
        p.add(b3);

        add(p, BorderLayout.SOUTH);

        add(t2, BorderLayout.EAST);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        int n = Integer.parseInt(t1.getText());

        if (e.getSource() == b1) {
            t2.setText(Integer.toBinaryString(n));
        }

        if (e.getSource() == b2) {
            t2.setText(Integer.toOctalString(n));
        }

        if (e.getSource() == b3) {
            t2.setText(Integer.toHexString(n));
        }
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}