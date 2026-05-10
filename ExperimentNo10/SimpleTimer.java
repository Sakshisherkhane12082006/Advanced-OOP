package ExperimentNo10;

import javax.swing.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame implements ActionListener {

    JLabel l;

    JButton start, stop;

    Timer t;

    int count = 0;

    SimpleTimer() {

        setTitle("Simple Timer");

        setSize(400,300);

        setLayout(null);

        l = new JLabel("0");

        l.setBounds(170,50,100,30);

        start = new JButton("Start");

        stop = new JButton("Stop");

        start.setBounds(80,150,100,40);

        stop.setBounds(200,150,100,40);

        add(l);

        add(start);

        add(stop);

        start.addActionListener(this);

        stop.addActionListener(this);

        t = new Timer(1000,new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                count++;

                l.setText("" + count);
            }
        });

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==start) {

            t.start();
        }

        if(e.getSource()==stop) {

            t.stop();
        }
    }

    public static void main(String[] args) {

        new SimpleTimer();
    }
}
