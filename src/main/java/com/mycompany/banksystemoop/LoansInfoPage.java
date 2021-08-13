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

 public class LoansInfoPage extends JFrame implements ActionListener{
            JFrame frame =new JFrame(); // main frame
            JPanel panel = new JPanel(); // panel to contain the components
            JLabel titleText = new JLabel("Loan Types");
            JLabel bckGround = new JLabel(); // bckground Image
            JLabel bodyText =new JLabel("<html> <b>Personal Loan:</b> <br>Get the most out of your finance with a personal"+ 
                                        "loan that can be expanded with an optional top-up loan a few months later"+
                                        "<br><br> <b>Auto Loan:</b> <br/> The drive of your dreams is within reach with auto loan." +
                                        "Select from a range of loan variants to find the most suitable one."+
                                        "<br><br> <b>Housing Loan:</b><br>  NBD’s range of housing loans puts" +
                                        "dream homes within easy reach and offers various payment methods.<br><br>"+
                                        "<b>Education Loan:</b> <br/> Finance education needs with an education loan that covers multiple ranges and tenor.");
            JButton backbutton = new JButton("Back");
            Color butnColor = new Color(0x8795ce);
            ImageIcon frameBackground = new ImageIcon("D:\\My PC\\Projects\\Java\\Bank System OOP\\BankSystemOOP\\src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\LoansInfoBAckGround.png");
    public LoansInfoPage()  {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
            titleText.setFont(new Font ("Poppins",Font.BOLD, 17)); // Ttile font 
            titleText.setBounds(30,30, 100, 100);   //Title Postion 
            titleText.setHorizontalAlignment(JLabel.LEFT);
            titleText.setVerticalTextPosition(JLabel.CENTER);
            titleText.setHorizontalTextPosition(JLabel.CENTER);
            bodyText.setBounds(50,50, 500, 500);   //iformation label positon
            bodyText.setHorizontalAlignment(JLabel.LEFT);
            bodyText.setVerticalTextPosition(JLabel.CENTER);
            bodyText.setHorizontalTextPosition(JLabel.CENTER);
            bodyText.setFont(new Font ("Poppins",Font.PLAIN, 15));
            backbutton.setBounds(250, 500, 100, 60);
            backbutton.setFocusable(false);
            backbutton.setForeground(new Color(0xffffff));
            backbutton.setBackground(butnColor);
            backbutton.addActionListener(this);
            panel.setSize(600,600); // size of the panel
            panel.setLayout(null);
            bckGround.setSize(600,600); // background size
            bckGround.setIcon(frameBackground); // background image
            
            this.setSize(600,600);  //frame of loans info
            this.setResizable(true);
            this.setBackground(Color.white);
            this.setLayout(null);
            this.setTitle("loans information");
            this.add(panel);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
            this.setUndecorated(true);
            this.setVisible(true);
            this.setShape(new RoundRectangle2D.Double(0, 0, 600, 600, 50, 50)); // make round corners
            panel.add(bodyText);
            panel.add(titleText);
            panel.add(backbutton);
            panel.add(bckGround);
    }
    @Override
         public void actionPerformed(ActionEvent ae) {
            if (ae.getSource()==backbutton) {
                this.dispose();
                }
    }
    }
