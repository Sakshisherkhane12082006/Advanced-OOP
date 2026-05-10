package ExperimentNo10;

import javax.swing.*;
import java.awt.event.*;

public class TextCounter extends JFrame implements KeyListener {

    JTextArea ta;

    JLabel l;

    TextCounter() {

        setTitle("Text Counter");

        setSize(400,300);

        setLayout(null);

        ta = new JTextArea();

        ta.setBounds(50,50,300,120);

        l = new JLabel();

        l.setBounds(50,200,300,30);

        ta.addKeyListener(this);

        add(ta);

        add(l);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void keyReleased(KeyEvent e) {

        String text = ta.getText();

        int chars = text.length();

        String words[] = text.trim().split("\\s+");

        int wc = text.trim().isEmpty() ? 0 : words.length;

        l.setText("Characters : " + chars + " Words : " + wc);
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {

        new TextCounter();
    }
}
