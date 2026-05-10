package ExperimentNo10;

import javax.swing.*;
import java.awt.event.*;

public class MouseCoordinates extends JFrame implements MouseMotionListener {

    JLabel l;

    MouseCoordinates() {

        setTitle("Mouse Coordinates");

        setSize(400,300);

        setLayout(null);

        l = new JLabel();

        l.setBounds(100,100,200,30);

        add(l);

        addMouseMotionListener(this);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseMoved(MouseEvent e) {

        l.setText("X = " + e.getX() + " Y = " + e.getY());
    }

    public void mouseDragged(MouseEvent e) {
    }

    public static void main(String[] args) {

        new MouseCoordinates();
    }
}
