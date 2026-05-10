package ExperimentNo12;

import javax.swing.*;
import java.awt.event.*;

public class StopWatch extends JFrame implements Runnable, ActionListener {

    JLabel l;

    JButton start, stop, reset;

    Thread t;

    int sec = 0;

    boolean running = false;

    StopWatch() {

        setTitle("StopWatch");

        setSize(400, 300);

        setLayout(null);

        l = new JLabel("0");

        l.setBounds(170, 50, 100, 40);

        start = new JButton("Start");

        stop = new JButton("Stop");

        reset = new JButton("Reset");

        start.setBounds(40, 150, 80, 40);

        stop.setBounds(140, 150, 80, 40);

        reset.setBounds(240, 150, 80, 40);

        add(l);

        add(start);

        add(stop);

        add(reset);

        start.addActionListener(this);

        stop.addActionListener(this);

        reset.addActionListener(this);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run() {

        while (running) {

            sec++;

            l.setText("" + sec);

            try {

                Thread.sleep(1000);

            } catch (Exception e) {
            }
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == start) {

            running = true;

            t = new Thread(this);

            t.start();
        }

        if (e.getSource() == stop) {

            running = false;
        }

        if (e.getSource() == reset) {

            running = false;

            sec = 0;

            l.setText("0");
        }
    }

    public static void main(String[] args) {

        new StopWatch();
    }
}
