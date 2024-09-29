package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wordcount {

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
            JButton jButton=new JButton("Word count");
            jButton.setBounds(150,310,150,30);
            JLabel jLabel=new JLabel(" ");
            jLabel.setBounds(40,10,250,20);

            jFrame.add(jButton);
            jFrame.add(jLabel);

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String text= jTextArea.getText();
                    String word[]=text.split(" ");
                    jLabel.setText("total char"+text.length()+"Total word"+word.length);
                }
            });

            jFrame.add(jTextArea);

        }

    }






