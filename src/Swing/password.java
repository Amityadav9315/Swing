package Swing;

import javax.swing.*;

public class password {
    public static void main(String[] args) {


        JFrame jFrame =new JFrame();
        jFrame.setTitle("This is normal frame");
        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);


        JLabel jLabel=new JLabel("Password ");
        jLabel.setBounds(40,10,100,20);
        JPasswordField jPasswordField=new JPasswordField();
        jPasswordField.setBounds(150,10,100,20);
        jFrame.add(jPasswordField);
        jFrame.add(jLabel);

    }
}
