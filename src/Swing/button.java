package Swing;

import javax.swing.*;

public class button {

        public static void main(String[] args) {
            JFrame jFrame =new JFrame();
            JButton jButton=new JButton("click me");
            jButton.setBounds(150,150,100,30);
            jFrame.add(jButton);
            jFrame.setTitle("This is normal frame");
            jFrame.setLayout(null);
            jFrame.setSize(400,400);
            jFrame.setVisible(true);

        }

    }


