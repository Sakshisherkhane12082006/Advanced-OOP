
package ExperimentNo11;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {

    JCheckBox c1, c2, c3;

    FlowLayoutDemo() {

        setTitle("FlowLayout Demo");

        setSize(400, 200);

        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("Python");
        c3 = new JCheckBox("C++");

        add(c1);
        add(c2);
        add(c3);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new FlowLayoutDemo();
    }
}