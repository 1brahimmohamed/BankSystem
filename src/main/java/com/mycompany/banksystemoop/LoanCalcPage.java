package com.mycompany.banksystemoop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

/**
 *
 * @author Aya Sameh X Ibrahim
 */

public class LoanCalcPage extends JFrame implements ActionListener{
    
            JFrame frame =new JFrame();
            JButton backbutton = new JButton("Back");
            JLabel label2 =new JLabel("here's the loan calculator");
            JPanel panel = new JPanel();
            JLabel bckGround = new JLabel();
            Color butnColor = new Color(0x8795ce);
            ImageIcon frameBackground = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\LoansClcBAckGround.png");

        // the following constructor sets the style for the frame
        public LoanCalcPage() {
            ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
            this.setIconImage(fIcon.getImage());
                label2.setBounds(20,20, 500, 500);
                label2.setFont(new Font ("Poppins",Font.PLAIN, 20));
                backbutton.setBounds(250, 500, 100, 60);
                backbutton.setFocusable(false);
                backbutton.setForeground(new Color(0xffffff));
                backbutton.setBackground(butnColor);
                backbutton.addActionListener(this);
                panel.setSize(600,600);
                panel.setLayout(null);
                bckGround.setSize(600,600); // backgrpund label size
                bckGround.setIcon(frameBackground); // bcakground image


                this.setSize(600,600);
                this.setResizable(true);
                this.setBackground(Color.white);
                this.setLayout(null);
                this.add(panel);
                this.setTitle("Loans calculator");
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
                this.setUndecorated(true);
                this.setVisible(true);
                this.setShape(new RoundRectangle2D.Double(0, 0, 600, 600, 50, 50)); //// make round corners
                panel.add(label2);
                panel.add(backbutton);
                panel.add(bckGround);
                  }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

            // CLose the Frame if Back is Pressed
            if (ae.getSource()==backbutton) {
                this.dispose();
                }
    }
}