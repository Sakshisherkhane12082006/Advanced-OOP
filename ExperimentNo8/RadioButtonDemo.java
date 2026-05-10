package ExperimentNo8;

import javax.swing.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    JRadioButton male, female;
    JButton submit;
    JLabel result;
    ButtonGroup bg;

    RadioButtonDemo() {

        setTitle("Gender Selection");
        setSize(400, 250);
        setLayout(null);

        male = new JRadioButton("Male");
        male.setBounds(100, 50, 100, 30);

        female = new JRadioButton("Female");
        female.setBounds(200, 50, 100, 30);

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        submit = new JButton("Submit");
        submit.setBounds(130, 100, 120, 30);

        result = new JLabel();
        result.setBounds(100, 150, 200, 30);

        submit.addActionListener(this);

        add(male);
        add(female);
        add(submit);
        add(result);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if (male.isSelected()) {
            result.setText("Selected Gender: Male");
        }

        else if (female.isSelected()) {
            result.setText("Selected Gender: Female");
        }
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
