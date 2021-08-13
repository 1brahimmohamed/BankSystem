package com.mycompany.banksystemoop;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Ibrahim
 */
public class WelcomePage extends JFrame {


    public WelcomePage() {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        initComponents();
        this.setBackground(new Color(0,0,0,0)); //make the background of the JFrame transparent
        this.setVisible(true); // make the frame visible
        initLoadingBar(); // loading bar initializer
    }
    
    
    // Bar the indicates the loading procces

   private void initLoadingBar(){
            try {
                for(int i=0 ; i<50; i++){
                    Thread.sleep(100);
                    this.loadingBar.setValue(i);
            }
                new SignInPage();
                this.dispose();
            } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
   }
    
    
    private void initComponents() {

        // Frame Components

        welcomePanel = new JPanel();
        loadingBar = new JProgressBar();
        backgroundImage = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);        // Closes the program on close
        setBackground(null);
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        welcomePanel.setFocusable(false);
        welcomePanel.setOpaque(false);
        welcomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingBar.setMaximum(35);
        welcomePanel.add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 360, 10));

        backgroundImage.setIcon(new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\WelcomeSmallerround.png")); // Background Image
        backgroundImage.setText("");
        welcomePanel.add(backgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 390));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(welcomePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(welcomePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private JLabel backgroundImage;
    private JProgressBar loadingBar;
    private JPanel welcomePanel;


}
