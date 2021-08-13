package com.mycompany.banksystemoop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;

/**
 *
 * @author Aya SamehXIbrahim
 */

public class CallUsPage extends JFrame implements ActionListener {

            JFrame frame =new JFrame();         // Creates new frame
            JPanel panel = new JPanel();        // Creates new Panel
            JLabel backgroundImg = new JLabel();
            JLabel titleText = new JLabel("Get in touch with us");
            ImageIcon frameBackground = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\contactBAckGround.png");

            // Main Text in the Frame
            JLabel contactInfoLabel =new JLabel("<html> <b> Our hotline: </b> 19019 <br/>"
                                                + "<b> Email: </b> info@BankBME.org <br/> "
                                                + "<b> Fax: </b> 2154845184 <br>" 
                                                + "<b> Website: </b> www.bmebank.org ");
            JButton backbutton = new JButton("Back");
            Color butnColor = new Color(0x8795ce);

    // the following constructor sets the style for the frame
    public CallUsPage() {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
            titleText.setFont(new Font ("Poppins",Font.BOLD, 17)); // Ttile font 
            titleText.setBounds(30,30, 250, 100);   //Title Postion 
            titleText.setHorizontalAlignment(JLabel.LEFT);
            titleText.setVerticalTextPosition(JLabel.CENTER);
            titleText.setHorizontalTextPosition(JLabel.CENTER);
            contactInfoLabel.setBounds(-10,50, 500, 500);
            contactInfoLabel.setHorizontalAlignment(JLabel.CENTER);
            contactInfoLabel.setVerticalTextPosition(JLabel.CENTER);
            contactInfoLabel.setHorizontalTextPosition(JLabel.CENTER);
            contactInfoLabel.setVisible(true);
            contactInfoLabel.setBackground(Color.black);
            contactInfoLabel.setFont(new Font ("Poppins",Font.PLAIN, 20));
            backbutton.setBounds(250, 500, 100, 60);
            backbutton.setFocusable(false);
            backbutton.setForeground(new Color(0xffffff));
            backbutton.setBackground(butnColor);
            backbutton.addActionListener(this);
            panel.setSize(600,600);
            panel.setLayout(null);
            backgroundImg.setSize(600,600); // backgrpund label size
            backgroundImg.setIcon(frameBackground); // bcakground image 
            this.setTitle("Customer service");
            this.setSize(600,600);
            this.setResizable(true);
            this.setBackground(Color.white);
            this.setLayout(null);
            this.add(panel);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            this.setUndecorated(true);
            this.setVisible(true);
            this.setShape(new RoundRectangle2D.Double(0, 0, 600, 600, 50, 50)); //// make round corners
            panel.add(backgroundImg);
            panel.add(contactInfoLabel);
            panel.add(backbutton);
            panel.add(backgroundImg);
              
         }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==backbutton) {
            this.dispose();
            }
    }
}
    
