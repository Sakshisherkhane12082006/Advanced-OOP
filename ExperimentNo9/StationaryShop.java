package ExperimentNo9;

import javax.swing.*;
import java.awt.event.*;

public class StationaryShop extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1;
    JButton order;

    StationaryShop() {

        setTitle("Stationary Shop System");
        setSize(400, 300);
        setLayout(null);

        l1 = new JLabel("Quantity for Notebook");
        l1.setBounds(50, 50, 200, 30);

        t1 = new JTextField();
        t1.setBounds(220, 50, 100, 30);

        order = new JButton("Order");
        order.setBounds(120, 120, 120, 40);

        l2 = new JLabel("");
        l2.setBounds(120, 180, 200, 30);

        order.addActionListener(this);

        add(l1);
        add(t1);
        add(order);
        add(l2);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        int qty = Integer.parseInt(t1.getText());

        int total = qty * 50;

        l2.setText("Total : " + total);

        JOptionPane.showMessageDialog(this,
                "Successfully Ordered");
    }

    public static void main(String[] args) {
        new StationaryShop();
    }
}