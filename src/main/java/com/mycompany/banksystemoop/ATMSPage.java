/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banksystemoop;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

/**
 *
 * @author Ibrahim X Aya Sameh
 */

public class ATMSPage extends JFrame implements ActionListener {

                JPanel panel = new JPanel();  // Creates new Panel
                JLabel titleText = new JLabel("ATMs near your location"); // Creates main title in the page

                // Main Text in the Frame
                JLabel bodyText =new JLabel("<html> Street 54 - El Morshedy Mall<br/>" +
                                            "Cityscape Mall - Neverland costume<br/>" +
                                            "8 Al Batea- Moazi Llmehwar Al Markazi<br/>");
                JButton backbutton = new JButton("Back");
                JLabel backgroundImg = new JLabel();
                ImageIcon frameBackground = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\atmBAckGround.png");
                Color butnColor = new Color(0x8795ce);

                // the following constructor sets the style for the frame
                public ATMSPage() {
                    ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
                    this.setIconImage(fIcon.getImage());
                titleText.setFont(new Font ("Poppins",Font.BOLD, 17)); // Ttile font 
                titleText.setBounds(30,30, 250, 100);   //Title Postion 
                titleText.setHorizontalAlignment(JLabel.LEFT);
                titleText.setVerticalTextPosition(JLabel.CENTER);
                titleText.setHorizontalTextPosition(JLabel.CENTER);
                backbutton.setBounds(250, 500, 100, 60);
                backbutton.setFocusable(false);
                backbutton.setForeground(new Color(0xffffff));
                backbutton.setBackground(butnColor);
                backbutton.addActionListener(this);
                bodyText.setBounds(35,75, 500, 500);
                bodyText.setHorizontalAlignment(JLabel.LEFT);
                bodyText.setVerticalTextPosition(JLabel.TOP );
                bodyText.setHorizontalTextPosition(JLabel.LEFT);
                bodyText.setFont(new Font ("Poppins",Font.PLAIN, 20));
                panel.setSize(600,600);
                panel.setLayout(null);
                backgroundImg.setSize(600,600);
                backgroundImg.setIcon(frameBackground);
                this.add(panel);
                this.setSize(600,600);
                this.setResizable(true);
                this.setBackground(Color.white);
                this.setLayout(null);
                this.setTitle("ATM loactions");
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
                this.setUndecorated(true);
                this.setVisible(true);
                this.setShape(new RoundRectangle2D.Double(0, 0, 600, 600, 50, 50)); // make round corners
                panel.add(backgroundImg);
                panel.add(bodyText);
                panel.add(titleText);
                panel.add(backbutton);
                panel.add(backgroundImg);
    
    }

    @Override
    public void actionPerformed  (ActionEvent ae) {
        if (ae.getSource()==backbutton) {
            this.dispose();
            }
}
}