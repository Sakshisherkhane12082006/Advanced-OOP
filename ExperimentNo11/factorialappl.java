package ExperimentNo11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class factorialappl extends Applet implements ActionListener {

    Label l1, l2;

    TextField t1, t2;

    Button b1;

    public void init() {

        l1 = new Label("Enter Number");

        t1 = new TextField(20);

        b1 = new Button("Find Factorial");

        l2 = new Label("Result");

        t2 = new TextField(20);

        add(l1);
        add(t1);
        add(b1);
        add(l2);
        add(t2);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        int n = Integer.parseInt(t1.getText());

        int fact = 1;

        for(int i=1;i<=n;i++) {

            fact = fact * i;
        }

        t2.setText("" + fact);
    }
}
