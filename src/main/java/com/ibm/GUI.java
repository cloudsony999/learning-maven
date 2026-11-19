package com.ibm;
import java.awt.event.*;
import javax.swing.*;

public class GUI {

    static void main() {

        JFrame f=new JFrame("Gemini AI");
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        JButton b=new JButton("Click Here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String q=JOptionPane.showInputDialog("enter question ","type here");
                String response=Talk.askQuestion(q);
                tf.setText(response);
            }
        });
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}