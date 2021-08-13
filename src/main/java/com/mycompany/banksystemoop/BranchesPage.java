package com.mycompany.banksystemoop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
/**
 *
 * @author Aya Sameh
 */
public class BranchesPage extends JFrame implements ActionListener{

            JFrame frame =new JFrame();             // Creates new frame
            JPanel panel = new JPanel();            // Creates new Panel
            JLabel backgroundImg = new JLabel();
            JLabel titleText = new JLabel("Our Branches");
            ImageIcon frameBackground = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\branchesBAckGround.png");

            // Main Text in the Frame
            JLabel bodyText =new JLabel("<html> <b>Giza branches:</b> <br> 343 Housary Sq. - 6th October <br> Area 33 - Shieik Zayed <br> 255 Lebnan St. - Agouza <br/>" +
                                              "122 Gam3et El Dewal St. - El Mohandessin <br>" +
                                              "<br><b>Cairo branches:</b> <br> 189 Ramses Sq. -  Downtown <br> El Teseen St. - New Cairo <br> 50 Abbas El Akkad St. - Nasr City <br> EL Bahr St. - Sheraton <br>" +
                                              "<br><b>Alexandria branches:</b> <br> 144 Sea St. <br> 999 Smouha Sq. - Somouha "+
                                              "<br><br> For more details visit Google Maps " );
                    JButton backbutton = new JButton("Back");
                    Color butnColor = new Color(0x8795ce);

            // the following constructor sets the style for the frame
            public BranchesPage() {
                ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
                this.setIconImage(fIcon.getImage());
                            titleText.setFont(new Font ("Poppins",Font.BOLD, 17)); // Ttile font
                            titleText.setBounds(30,10, 250, 100);   //Title Postion
                            titleText.setHorizontalAlignment(JLabel.LEFT);
                            titleText.setVerticalTextPosition(JLabel.CENTER);
                            titleText.setHorizontalTextPosition(JLabel.CENTER);
                            bodyText.setBounds(75,35, 500, 500);
                            bodyText.setHorizontalAlignment(JLabel.LEFT);
                            bodyText.setVerticalTextPosition(JLabel.CENTER );
                            bodyText.setHorizontalTextPosition(JLabel.LEFT);
                            bodyText.setVisible(true);
                            bodyText.setBackground(Color.black);
                            bodyText.setFont(new Font ("Poppins",Font.PLAIN, 15));
                            backbutton.setBounds(250, 510, 100, 60);
                            backbutton.setFocusable(false);
                            backbutton.setForeground(new Color(0xffffff));
                            backbutton.setBackground(butnColor);
                            backbutton.addActionListener(this);
                            panel.setSize(600,600);
                            panel.setLayout(null);
                            backgroundImg.setSize(600,600);
                            backgroundImg.setIcon(frameBackground);

                            this.add(panel);
                            this.setSize(600, 600);
                            this.setResizable(true);
                            this.setBackground(Color.white);
                            this.setLayout(null);
                            this.setTitle("our branches");
                            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                            this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
                            this.setUndecorated(true);
                            this.setVisible(true);
                            this.setShape(new RoundRectangle2D.Double(0, 0, 600, 600, 50, 50)); //// make round corners
                            panel.add(titleText);
                            panel.add(backbutton);
                            panel.add(bodyText);
                            panel.add(backgroundImg);

                    }

            @Override
            public void actionPerformed(ActionEvent ae) {
                    if (ae.getSource()==backbutton) {
                        this.dispose();
                        }
                    }

           }
