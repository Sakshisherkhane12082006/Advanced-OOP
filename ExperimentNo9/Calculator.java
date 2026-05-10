package ExperimentNo9;

import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    JButton add, sub, mul, div, equal, clear;

    double num1, num2, result;
    char op;

    Calculator() {

        setTitle("Calculator");
        setSize(400, 500);
        setLayout(null);

        tf = new JTextField();
        tf.setBounds(30, 30, 320, 40);
        add(tf);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        equal = new JButton("=");
        clear = new JButton("C");

        JButton buttons[] = {
                b1, b2, b3,
                b4, b5, b6,
                b7, b8, b9,
                b0, add, sub,
                mul, div, equal,
                clear
        };

        int x = 30, y = 100;

        for (JButton b : buttons) {

            b.setBounds(x, y, 60, 40);
            add(b);
            b.addActionListener(this);

            x += 80;

            if (x > 270) {
                x = 30;
                y += 60;
            }
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b0) tf.setText(tf.getText() + "0");
        if (e.getSource() == b1) tf.setText(tf.getText() + "1");
        if (e.getSource() == b2) tf.setText(tf.getText() + "2");
        if (e.getSource() == b3) tf.setText(tf.getText() + "3");
        if (e.getSource() == b4) tf.setText(tf.getText() + "4");
        if (e.getSource() == b5) tf.setText(tf.getText() + "5");
        if (e.getSource() == b6) tf.setText(tf.getText() + "6");
        if (e.getSource() == b7) tf.setText(tf.getText() + "7");
        if (e.getSource() == b8) tf.setText(tf.getText() + "8");
        if (e.getSource() == b9) tf.setText(tf.getText() + "9");

        if (e.getSource() == add) {
            num1 = Double.parseDouble(tf.getText());
            op = '+';
            tf.setText("");
        }

        if (e.getSource() == sub) {
            num1 = Double.parseDouble(tf.getText());
            op = '-';
            tf.setText("");
        }

        if (e.getSource() == mul) {
            num1 = Double.parseDouble(tf.getText());
            op = '*';
            tf.setText("");
        }

        if (e.getSource() == div) {
            num1 = Double.parseDouble(tf.getText());
            op = '/';
            tf.setText("");
        }

        if (e.getSource() == equal) {

            num2 = Double.parseDouble(tf.getText());

            switch (op) {

                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;
            }

            tf.setText("" + result);
        }

        if (e.getSource() == clear) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}