package com.mycompany.banksystemoop;

import java.awt.*;
import javax.swing.*;


public class SignInPage extends JFrame {

    public static Normal currentNormalClient;
    public static VIP currentVIPClient;
    public static boolean isVIP;


    public SignInPage() {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        initComponents();
        this.setBackground(new Color(0,0,0,0)); //make the background of the JFrame transparent
        this.setVisible(true); // make the frame visible
    }

    private void initComponents() {

        MainPanel = new JPanel();
        rightPanel = new JPanel();
        rightPanelCloseBtnText = new JLabel();
        rightPanelForgot = new JLabel();
        rightPanelSignInBtnText = new JLabel();
        rightPanelSignInText = new JLabel();
        rightPanelTextF3 = new JTextField();
        jPasswordField1 = new JPasswordField();
        rightPanelSignInBtn = new JLabel();
        rightPanelCloseBtn = new JLabel();
        rightPanelTextF1 = new JTextField();
        LeftPanel = new JPanel();
        LeftPanelLogo = new JLabel();
        LeftPanelTextSignUp = new JLabel();
        LeftPanelSignUpBtn = new JLabel();
        LeftPanelTextNew = new JLabel();
        LeftPanelTextWelcome = new JLabel();
        LeftPanelBckGrd = new JLabel();
        MainPanelBackGrd = new JLabel();
        accTypeComboBox = new JComboBox<>();
        warringMessage = new JLabel();



        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel.setOpaque(false);
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightPanel.setOpaque(false);
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightPanelCloseBtnText.setFont(new Font("Poppins", 1, 18));
        rightPanelCloseBtnText.setForeground(new Color(255, 255, 255));
        rightPanelCloseBtnText.setHorizontalAlignment(SwingConstants.CENTER);
        rightPanelCloseBtnText.setText("Close");                                                               // Close Button Text
        rightPanelCloseBtnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightPanelCloseBtnTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rightPanelCloseBtnTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rightPanelCloseBtnTextMouseExited(evt);
            }
        });
        rightPanel.add(rightPanelCloseBtnText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 150, 50));

        rightPanelForgot.setFont(new Font("Poppins", 1, 13)); // NOI18N
        rightPanelForgot.setForeground(new Color(255, 255, 255));
        rightPanelForgot.setHorizontalAlignment(SwingConstants.CENTER);
        rightPanelForgot.setText("<html>\n<body>\n<u>Forgot your password?</u>\n</body>\n<html>");              // Forgot your pass Text
        rightPanelForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightPanelForgotMouseClicked(evt);
            }
        });
        rightPanel.add(rightPanelForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 160, -1));

        rightPanelSignInBtnText.setFont(new Font("Poppins", 1, 18)); // NOI18N
        rightPanelSignInBtnText.setForeground(new Color(255, 255, 255));
        rightPanelSignInBtnText.setHorizontalAlignment(SwingConstants.CENTER);
        rightPanelSignInBtnText.setText("Sign in");                                                               // Sign in Button Text
        rightPanelSignInBtnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightPanelSignInBtnTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rightPanelSignInBtnTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rightPanelSignInBtnTextMouseExited(evt);
            }
        });
        rightPanel.add(rightPanelSignInBtnText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 150, 50));

        rightPanelSignInText.setFont(new Font("Poppins", 1, 29)); // NOI18N
        rightPanelSignInText.setForeground(new Color(255, 255, 255));
        rightPanelSignInText.setText("Sign in to your account");                                                   // Title Text
        rightPanel.add(rightPanelSignInText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        accTypeComboBox.setBackground(new Color(31, 33, 40));
        accTypeComboBox.setFont(new Font("Poppins SemiBold", 0, 12)); // NOI18N
        accTypeComboBox.setForeground(new Color(255, 255, 255));
        accTypeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Normal Account", "VIP Account" }));         // Combo Box Choice
        accTypeComboBox.setBorder(null);

        rightPanel.add(accTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 350, 50));

        jPasswordField1.setBackground(new Color(48, 51, 62));
        jPasswordField1.setForeground(new Color(255, 255, 255));
        jPasswordField1.setHorizontalAlignment(JTextField.LEFT);
        jPasswordField1.setText("jPasswordField1");                                                                 // Password Text
        jPasswordField1.setBorder(null);
        rightPanel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 350, 50));

        rightPanelSignInBtn.setIcon(new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Login\\SignInBtn.png")); // Sign in button photo
        rightPanel.add(rightPanelSignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 160, 50));

        rightPanelCloseBtn.setIcon(new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Login\\close btn.png"));    // Close Button photo
        rightPanel.add(rightPanelCloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 160, 50));

        rightPanelTextF1.setBackground(new java.awt.Color(48, 51, 62));
        rightPanelTextF1.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        rightPanelTextF1.setForeground(new java.awt.Color(255, 255, 255));
        rightPanelTextF1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rightPanelTextF1.setText("Username");
        rightPanelTextF1.setBorder(null);
        rightPanel.add(rightPanelTextF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 350, 50));

        MainPanel.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 530, 470));

        LeftPanel.setOpaque(false);
        LeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftPanelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Login\\Logo.png")); // NOI18N
        LeftPanel.add(LeftPanelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 130, 60));

        LeftPanelTextSignUp.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        LeftPanelTextSignUp.setForeground(new java.awt.Color(255, 255, 255));
        LeftPanelTextSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LeftPanelTextSignUp.setText("Sign Up");
        LeftPanelTextSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeftPanelTextSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LeftPanelTextSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LeftPanelTextSignUpMouseExited(evt);
            }
        });
        LeftPanel.add(LeftPanelTextSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 318, 170, 50));

        LeftPanelSignUpBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Login\\SignUpBtn.png")); // NOI18N
        LeftPanel.add(LeftPanelSignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 180, 60));

        LeftPanelTextNew.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        LeftPanelTextNew.setForeground(new java.awt.Color(31, 33, 40));
        LeftPanelTextNew.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LeftPanelTextNew.setText("<html>\n<head>\n<style>\np {text-align: center;}\n</style>\n</head>\n<body>\n<p>New to Bank of Bank of Biomedical Engineers?</p>\n</body>\n<html>");
        LeftPanel.add(LeftPanelTextNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 270, -1));

        LeftPanelTextWelcome.setFont(new java.awt.Font("Poppins", 1, 33)); // NOI18N
        LeftPanelTextWelcome.setForeground(new java.awt.Color(31, 33, 40));
        LeftPanelTextWelcome.setText("Welocme back!");
        LeftPanel.add(LeftPanelTextWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        LeftPanelBckGrd.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Login\\Left P.png")); // NOI18N
        LeftPanel.add(LeftPanelBckGrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        MainPanel.add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        MainPanelBackGrd.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Login\\Main P.png")); // NOI18N
        MainPanelBackGrd.setText("jLabel1");
        MainPanel.add(MainPanelBackGrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        warringMessage.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        warringMessage.setForeground(new java.awt.Color(255, 102, 102));
        warringMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warringMessage.setText("");
        rightPanel.add(warringMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 326, 350, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    /*
     The mouseEntered & MouseExited methods are responsible for the button hover
     */

    private void LeftPanelTextSignUpMouseEntered(java.awt.event.MouseEvent evt) {
        LeftPanelTextSignUp.setForeground(new Color(156,149,243));
    }
    private void LeftPanelTextSignUpMouseExited(java.awt.event.MouseEvent evt) {
        LeftPanelTextSignUp.setForeground(Color.WHITE);
    }
    private void rightPanelSignInBtnTextMouseEntered(java.awt.event.MouseEvent evt) {
        rightPanelSignInBtnText.setForeground(new Color(31,33,40));
    }
    private void rightPanelSignInBtnTextMouseExited(java.awt.event.MouseEvent evt) {
        rightPanelSignInBtnText.setForeground(Color.WHITE);
    }
    private void rightPanelCloseBtnTextMouseEntered(java.awt.event.MouseEvent evt) {
        rightPanelCloseBtnText.setForeground(new Color(31,33,40));
    }
    private void rightPanelCloseBtnTextMouseExited(java.awt.event.MouseEvent evt) {
        rightPanelCloseBtnText.setForeground(Color.WHITE);
    }

    /*
     the mouse Clicked methods responsible for actions when buttons are clicked
    */
    private void rightPanelSignInBtnTextMouseClicked(java.awt.event.MouseEvent evt) {
        signIN();
    }

    private void rightPanelCloseBtnTextMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void rightPanelForgotMouseClicked(java.awt.event.MouseEvent evt) {
       new TryWindow("please contact the bank");
    }

    private void LeftPanelTextSignUpMouseClicked(java.awt.event.MouseEvent evt) {


        new SignUpPage();
        this.dispose();
    }

    // the sign in method
    public void signIN() {
        String username = rightPanelTextF1.getText();
        char[] passwordChar = jPasswordField1.getPassword();
        String password = new String(passwordChar);
        int accType = accTypeComboBox.getSelectedIndex();

        boolean signedIn=false;

        if (accType==0)
        {
            // Check the Username and the password for normal client

            for (int i = 0 ; i < Normal.NormalClients.size();i++){
                if (username.equals(Normal.NormalClients.get(i).getUserName())&&password.equals(Normal.NormalClients.get(i).getPassword())){

                    signedIn=true;
                    currentNormalClient = Normal.NormalClients.get(i);
                    isVIP = false;
                    new HomePageWindow();
                    this.dispose();
                }
            }
        }
        else if (accType==1)
        {
            // Check the Username and the password for VIP client

            for (int i = 0 ; i < VIP.VIPClients.size();i++){
                if (username.equals(VIP.VIPClients.get(i).getUserName())&&password.equals(VIP.VIPClients.get(i).getPassword())){

                    signedIn=true;
                    currentVIPClient = VIP.VIPClients.get(i);
                    isVIP = true;
                    new HomePageWindow();
                    this.dispose();
                }
            }
        }
        else
        {
            warringMessage.setText("input not valid, please try again.");
        }

        if (!signedIn)
        {
            warringMessage.setText("username or password not correct, try again.");
        }
    }

    private JPanel LeftPanel;
    private JLabel LeftPanelBckGrd;
    private JLabel LeftPanelLogo;
    private JLabel LeftPanelSignUpBtn;
    private JLabel LeftPanelTextNew;
    private JLabel LeftPanelTextSignUp;
    private JLabel LeftPanelTextWelcome;
    private JPanel MainPanel;
    private JLabel MainPanelBackGrd;
    private JPasswordField jPasswordField1;
    private JPanel rightPanel;
    private JLabel rightPanelCloseBtn;
    private JLabel rightPanelCloseBtnText;
    private JLabel rightPanelForgot;
    private JLabel rightPanelSignInBtn;
    private JLabel rightPanelSignInBtnText;
    private JLabel rightPanelSignInText;
    private JTextField rightPanelTextF1;
    private JTextField rightPanelTextF3;
    private JComboBox<String> accTypeComboBox;
    private JLabel warringMessage;

}
