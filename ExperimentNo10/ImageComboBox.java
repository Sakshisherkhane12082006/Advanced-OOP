package ExperimentNo10;

import javax.swing.*;
import java.awt.event.*;

public class ImageComboBox extends JFrame implements ItemListener {

    JComboBox cb;

    JLabel l;

    ImageIcon i1, i2, i3;

    ImageComboBox() {

        setTitle("Image ComboBox");

        setSize(400,400);

        setLayout(null);

        String images[] = {"Image1","Image2","Image3"};

        cb = new JComboBox(images);

        cb.setBounds(100,50,150,30);

        l = new JLabel();

        l.setBounds(100,120,200,200);

        i1 = new ImageIcon("img1.jpg");
        i2 = new ImageIcon("img2.jpg");
        i3 = new ImageIcon("img3.jpg");

        cb.addItemListener(this);

        add(cb);

        add(l);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {

        String s = (String)cb.getSelectedItem();

        if(s.equals("Image1")) {

            l.setIcon(i1);
        }

        if(s.equals("Image2")) {

            l.setIcon(i2);
        }

        if(s.equals("Image3")) {

            l.setIcon(i3);
        }
    }

    public static void main(String[] args) {

        new ImageComboBox();
    }
}
