package Swing;

import javax.swing.*;
import java.awt.*;


public class textArea {

        public static void main(String[] args) {
            JFrame jFrame =new JFrame();
            jFrame.setTitle("This is normal frame");
            jFrame.setLayout(null);
            jFrame.setSize(400,400);
            jFrame.setVisible(true);
            JTextArea jTextArea=new JTextArea();
            jTextArea.setBounds(40,40,250,250);
            jTextArea.setBackground(Color.BLACK);
            jTextArea.setForeground(Color.green);
            jFrame.add(jTextArea);

        }

    }




