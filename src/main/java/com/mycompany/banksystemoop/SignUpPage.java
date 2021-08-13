package com.mycompany.banksystemoop;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Ibrahim
 */
public class SignUpPage extends JFrame {


    public SignUpPage() {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        initComponents();
        this.setBackground(new Color(0,0,0,0)); //make the background of the JFrame transparent
        ContainerPanel.getVerticalScrollBar().setBackground(new Color(48,51,62));
        ContainerPanel.getVerticalScrollBar().setForeground(new Color(31,30,44));
        ContainerPanel.getVerticalScrollBar().setBorder(null);

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                   UIManager.setLookAndFeel(info.getClassName());
                   break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) { 
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        this.setVisible(true); // make the frame visible
    }

    private void initComponents() {

        mianPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        rightPanelText3 = new javax.swing.JLabel();
        rightPanelBtn = new javax.swing.JLabel();
        rightPanelText2 = new javax.swing.JLabel();
        rightPanelText1 = new javax.swing.JLabel();
        rightPanelLogo = new javax.swing.JLabel();
        rightPanelBckgrd = new javax.swing.JLabel();
        LeftPanel = new javax.swing.JPanel();
        submitPanel = new javax.swing.JPanel();
        leftPanelText5 = new javax.swing.JLabel();
        BtnSignUp = new javax.swing.JLabel();
        policyCheckBox = new javax.swing.JCheckBox();
        ContainerPanel = new javax.swing.JScrollPane();
        leftInPanel = new javax.swing.JPanel();
        ReseInfo = new javax.swing.JPanel();
        resInfoTitle = new javax.swing.JLabel();
        addressTxtField = new javax.swing.JTextField();
        cityTxtField = new javax.swing.JTextField();
        salaryTxtField = new javax.swing.JTextField();
        postalCodeTxtField = new javax.swing.JTextField();
        PersonalInfo = new javax.swing.JPanel();
        lNameTxtField = new javax.swing.JTextField();
        fNameTxtField = new javax.swing.JTextField();
        natTxtField = new javax.swing.JTextField();
        natIDTxtField = new javax.swing.JTextField();
        jobTxtField = new javax.swing.JTextField();
        dateTxtField = new javax.swing.JTextField();
        personalInfoTitle = new javax.swing.JLabel();
        phNumTxtField = new javax.swing.JTextField();
        martialSComboBox = new javax.swing.JComboBox<>();
        AccountInfo = new javax.swing.JPanel();
        passwordTxtField = new javax.swing.JTextField();
        usernameTxtField = new javax.swing.JTextField();
        pinTxtField = new javax.swing.JTextField();
        accInfoTitle = new javax.swing.JLabel();
        accTypeComboBox = new javax.swing.JComboBox<>();
        rightPanelText4 = new javax.swing.JLabel();
        rightPanelBckGrd = new javax.swing.JLabel();
        warringMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mianPanel.setOpaque(false);
        mianPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightPanel.setOpaque(false);
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightPanelText3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        rightPanelText3.setForeground(new java.awt.Color(255, 255, 255));
        rightPanelText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rightPanelText3.setText("Sign in");
        rightPanelText3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightPanelText3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rightPanelText3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rightPanelText3MouseExited(evt);
            }
        });
        rightPanel.add(rightPanelText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 180, 50));

        rightPanelBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Login\\SignUpBtn.png")); // NOI18N
        rightPanel.add(rightPanelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 180, 50));

        rightPanelText2.setFont(new java.awt.Font("Poppins", 1, 13)); // NOI18N
        rightPanelText2.setForeground(new java.awt.Color(31, 33, 40));
        rightPanelText2.setText("Already have an account?");
        rightPanel.add(rightPanelText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 190, -1));

        rightPanelText1.setBackground(new java.awt.Color(31, 33, 40));
        rightPanelText1.setFont(new java.awt.Font("Poppins", 0, 33)); // NOI18N
        rightPanelText1.setForeground(new java.awt.Color(31, 33, 40));
        rightPanelText1.setText("<html>From <b>Biomedical Engineers</b><br>\n to <b>Biomedical Engineers</b>\n</html>");
        rightPanel.add(rightPanelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 300, 200));

        rightPanelLogo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Login\\Logo.png")); // NOI18N
        rightPanel.add(rightPanelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 110, 60));

        rightPanelBckgrd.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Signup\\leftPanel.png")); // NOI18N
        rightPanel.add(rightPanelBckgrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 0, 410, 720));

        mianPanel.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 450, 720));

        LeftPanel.setOpaque(false);
        LeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitPanel.setOpaque(false);
        submitPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanelText5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        leftPanelText5.setForeground(new java.awt.Color(255, 255, 255));
        leftPanelText5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leftPanelText5.setText("Sign up");
        leftPanelText5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftPanelText5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leftPanelText5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leftPanelText5MouseExited(evt);
            }
        });
        submitPanel.add(leftPanelText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 150, 50));

        BtnSignUp.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Signup\\SignInBtn.png")); // NOI18N
        submitPanel.add(BtnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 160, 50));

        policyCheckBox.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        policyCheckBox.setForeground(new java.awt.Color(127, 149, 235));
        policyCheckBox.setText("by signing up you agree to our terms of service and privacy policy");
        policyCheckBox.setBorder(null);
        policyCheckBox.setFocusable(false);
        policyCheckBox.setContentAreaFilled(false);
        policyCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
        policyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        submitPanel.add(policyCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, -1));

        LeftPanel.add(submitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 510, 110));

        ContainerPanel.setBackground(new java.awt.Color(31, 33, 40));
        ContainerPanel.setBorder(null);
        ContainerPanel.setForeground(new java.awt.Color(31, 33, 40));
        ContainerPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ContainerPanel.setToolTipText("");
        ContainerPanel.setFocusable(false);
        ContainerPanel.setOpaque(false);

        leftInPanel.setBackground(new java.awt.Color(31, 33, 40));
        leftInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReseInfo.setOpaque(false);
        ReseInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resInfoTitle.setBackground(new java.awt.Color(48, 51, 62));
        resInfoTitle.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        resInfoTitle.setForeground(new java.awt.Color(255, 255, 255));
        resInfoTitle.setText("More Info");
        ReseInfo.add(resInfoTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        addressTxtField.setBackground(new java.awt.Color(48, 51, 62));
        addressTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        addressTxtField.setForeground(new java.awt.Color(255, 255, 255));
        addressTxtField.setText("Address");
        addressTxtField.setBorder(null);
        ReseInfo.add(addressTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 40));

        cityTxtField.setBackground(new java.awt.Color(48, 51, 62));
        cityTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cityTxtField.setForeground(new java.awt.Color(255, 255, 255));
        cityTxtField.setText("City");
        cityTxtField.setBorder(null);
        ReseInfo.add(cityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 220, 40));

        salaryTxtField.setBackground(new java.awt.Color(48, 51, 62));
        salaryTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        salaryTxtField.setForeground(new java.awt.Color(255, 255, 255));
        salaryTxtField.setText("Salary");
        salaryTxtField.setBorder(null);
        ReseInfo.add(salaryTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 40));

        postalCodeTxtField.setBackground(new java.awt.Color(48, 51, 62));
        postalCodeTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        postalCodeTxtField.setForeground(new java.awt.Color(255, 255, 255));
        postalCodeTxtField.setText("Postal Code");
        postalCodeTxtField.setBorder(null);
        ReseInfo.add(postalCodeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 220, 40));

        leftInPanel.add(ReseInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 610, 150));

        PersonalInfo.setOpaque(false);
        PersonalInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lNameTxtField.setBackground(new java.awt.Color(48, 51, 62));
        lNameTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        lNameTxtField.setForeground(new java.awt.Color(255, 255, 255));
        lNameTxtField.setText("SName");
        lNameTxtField.setBorder(null);
        PersonalInfo.add(lNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 220, 40));

        fNameTxtField.setBackground(new java.awt.Color(48, 51, 62));
        fNameTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        fNameTxtField.setForeground(new java.awt.Color(255, 255, 255));
        fNameTxtField.setText("Fname");
        fNameTxtField.setBorder(null);
        PersonalInfo.add(fNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 40));

        natTxtField.setBackground(new java.awt.Color(48, 51, 62));
        natTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        natTxtField.setForeground(new java.awt.Color(255, 255, 255));
        natTxtField.setText("Nationality");
        natTxtField.setBorder(null);
        PersonalInfo.add(natTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 40));

        natIDTxtField.setBackground(new java.awt.Color(48, 51, 62));
        natIDTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        natIDTxtField.setForeground(new java.awt.Color(255, 255, 255));
        natIDTxtField.setText("Nat ID");
        natIDTxtField.setBorder(null);
        PersonalInfo.add(natIDTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 220, 40));

        jobTxtField.setBackground(new java.awt.Color(48, 51, 62));
        jobTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jobTxtField.setForeground(new java.awt.Color(255, 255, 255));
        jobTxtField.setText("Job");
        jobTxtField.setBorder(null);
        PersonalInfo.add(jobTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 220, 40));

        dateTxtField.setBackground(new java.awt.Color(48, 51, 62));
        dateTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        dateTxtField.setForeground(new java.awt.Color(255, 255, 255));
        dateTxtField.setText("Date of birth");
        dateTxtField.setBorder(null);
        PersonalInfo.add(dateTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 220, 40));

        personalInfoTitle.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        personalInfoTitle.setForeground(new java.awt.Color(255, 255, 255));
        personalInfoTitle.setText("Personal Info");
        PersonalInfo.add(personalInfoTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        phNumTxtField.setBackground(new java.awt.Color(48, 51, 62));
        phNumTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        phNumTxtField.setForeground(new java.awt.Color(255, 255, 255));
        phNumTxtField.setText("Phone Number");
        phNumTxtField.setBorder(null);
        PersonalInfo.add(phNumTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 220, 40));

        martialSComboBox.setBackground(new java.awt.Color(48, 51, 62));
        martialSComboBox.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        martialSComboBox.setForeground(new java.awt.Color(255, 255, 255));
        martialSComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matrial Status", "Single", "Married", "Divorced" }));
        martialSComboBox.setBorder(null);
        PersonalInfo.add(martialSComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 220, 40));

        leftInPanel.add(PersonalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 610, 280));

        warringMessage.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        warringMessage.setForeground(new java.awt.Color(255, 102, 102));
        warringMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warringMessage.setText("");
        LeftPanel.add(warringMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, 450, -1));

        AccountInfo.setForeground(new java.awt.Color(255, 255, 255));
        AccountInfo.setOpaque(false);
        AccountInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordTxtField.setBackground(new java.awt.Color(48, 51, 62));
        passwordTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        passwordTxtField.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxtField.setText("Password");
        passwordTxtField.setBorder(null);
        AccountInfo.add(passwordTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 220, 40));

        usernameTxtField.setBackground(new java.awt.Color(48, 51, 62));
        usernameTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        usernameTxtField.setForeground(new java.awt.Color(255, 255, 255));
        usernameTxtField.setText("UserName");
        usernameTxtField.setBorder(null);
        AccountInfo.add(usernameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, 40));

        pinTxtField.setBackground(new java.awt.Color(48, 51, 62));
        pinTxtField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        pinTxtField.setForeground(new java.awt.Color(255, 255, 255));
        pinTxtField.setText("Pin");
        pinTxtField.setBorder(null);
        AccountInfo.add(pinTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, 40));

        accInfoTitle.setBackground(new java.awt.Color(48, 51, 62));
        accInfoTitle.setFont(new java.awt.Font("Poppins", 1, 15)); // NOI18N
        accInfoTitle.setForeground(new java.awt.Color(255, 255, 255));
        accInfoTitle.setText("Account Info");
        AccountInfo.add(accInfoTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        accTypeComboBox.setBackground(new java.awt.Color(48, 51, 62));
        accTypeComboBox.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        accTypeComboBox.setForeground(new java.awt.Color(255, 255, 255));
        accTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Account Type", "Saving Account", "Checking Account", "CD Account", "Money Market Account" }));
        accTypeComboBox.setBorder(null);
        AccountInfo.add(accTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 220, 40));

        leftInPanel.add(AccountInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 610, 150));

        ContainerPanel.setViewportView(leftInPanel);

        LeftPanel.add(ContainerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 610, 460));

        rightPanelText4.setBackground(new java.awt.Color(31, 33, 40));
        rightPanelText4.setFont(new java.awt.Font("Poppins", 1, 29)); // NOI18N
        rightPanelText4.setForeground(new java.awt.Color(255, 255, 255));
        rightPanelText4.setText("Create your account");
        LeftPanel.add(rightPanelText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 320, 40));

        rightPanelBckGrd.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Signup\\main panel.png")); // NOI18N
        rightPanelBckGrd.setText("jLabel2");
        LeftPanel.add(rightPanelBckGrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        mianPanel.add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    /*
    * Button Actions
    * */

    private void rightPanelText3MouseEntered(java.awt.event.MouseEvent evt) {
        rightPanelText3.setForeground(new Color(150,149,241));
    }

    private void rightPanelText3MouseExited(java.awt.event.MouseEvent evt) {
        rightPanelText3.setForeground(Color.WHITE);
    }

    private void rightPanelText3MouseClicked(java.awt.event.MouseEvent evt) {
        new SignInPage();
        this.dispose();
    }

    private void leftPanelText5MouseClicked(java.awt.event.MouseEvent evt) {
        signUP();
    }

    private void leftPanelText5MouseEntered(java.awt.event.MouseEvent evt) {
        leftPanelText5.setForeground(new Color(31,33,40));
    }

    private void leftPanelText5MouseExited(java.awt.event.MouseEvent evt) {
        leftPanelText5.setForeground(Color.WHITE);
    }

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public void signUP() {

        boolean heAccepted = policyCheckBox.isSelected();    // the policy acceptance
        boolean typoErrorFname = false;
        boolean typoErrorLname = false;
        boolean typoErrorPin = false;
        boolean typoErrorPhNum = false;
        boolean typoErrorNatID = false;
        boolean typoErrorPostalCode = false;

        String firstName = null;
        String accountType= null;
        String lastName= null;
        String username= null;
        String password= null;
        String pin= null;
        String birthDate= null;
        String phoneNumber= null;
        String nationality= null;
        String natID= null;
        String job= null;
        String address= null;
        String postalCode= null;
        String maritalStatus= null;
        double salary= 0;
        try {
            // first name
            firstName = fNameTxtField.getText();
            // Checking first name
            if (!DataValidator.CheckName(firstName)) {
                typoErrorFname = true;
            }

            // last name
            lastName = lNameTxtField.getText();
            if (!DataValidator.CheckName(lastName)) {
                typoErrorLname = true;
            }

            // username
            username = usernameTxtField.getText();

            // password
            password = passwordTxtField.getText();

            // pin
             pin = pinTxtField.getText();
            if (!DataValidator.CheckPin(pin)) {
                typoErrorPin = true;
            }

            // birthdate
             birthDate = dateTxtField.getText();
//            while (repeat){
//                try {
//                    System.out.println("Enter your Birthday as following dd-mm-yyyy: ");
//                    date = input.next();
//                    birthDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
//                    repeat = false;
//                }
//                catch (Exception e){
//                    System.out.println("Erorr, Please Enter your the date again");
//                }
//            }
            // Phone Number
            phoneNumber = phNumTxtField.getText();
            if (!DataValidator.CheckPhoneNumber(phoneNumber)) {
                typoErrorPhNum = true;
            }

            // Nationality
             nationality = natTxtField.getText();

            // nationality ID
             natID = natIDTxtField.getText();
            if (!DataValidator.CheckNationalID(natID)) {
                typoErrorNatID = true;
            }

            // Job
            job = jobTxtField.getText();

            // Address
             address = addressTxtField.getText();

            // postal code
             postalCode = postalCodeTxtField.getText();
            if (!DataValidator.CheckPostalCode(postalCode)) {
                typoErrorPostalCode = true;
            }

            // Martial Status
            maritalStatus = martialSComboBox.getSelectedItem().toString();

            // Account Type
            accountType = accTypeComboBox.getSelectedItem().toString();

            // salary
            salary = Double.parseDouble(salaryTxtField.getText());
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Please Enter Valid Data" , "Data incorrect", JOptionPane.INFORMATION_MESSAGE);
        }

        Normal NormalCLient = new Normal(firstName,lastName,username,password,pin,accountType,birthDate,nationality,natID,address,job,postalCode,salary,phoneNumber,maritalStatus);
        NormalCLient.setAccountType(accountType);
        Normal.NormalClients.add(NormalCLient);
        SignInPage.currentNormalClient = NormalCLient;

        if (heAccepted && !typoErrorFname && !typoErrorLname && !typoErrorPhNum && !typoErrorNatID && !typoErrorPin && !typoErrorPostalCode ) {
            new HomePageWindow();
            this.dispose();
        }
        else if (typoErrorFname || firstName.equals("Fname"))
            warringMessage.setText("Your name can only contain letters, please re-enter your First Name");

        else if (typoErrorLname || lastName.equals("SName") )
            warringMessage.setText("Your name can only contain letters, please re-enter your Last Name");

        else if (typoErrorNatID || natID.equals("Nat ID"))
            warringMessage.setText("Your ID can contain only numbers and must be  of 14 digits ,please re-enter your ID");

        else if (typoErrorPhNum || phoneNumber.equals("Phone Number"))
            warringMessage.setText("Your Phone Number can contain only numbers and must be  of 11 digits ,please re-enter your Phone number");

        else if (typoErrorPin || pin.equals("Pin"))
            warringMessage.setText("Your Pin can contain only numbers and must be 4 digits ,please re-enter your Pin");

        else if (typoErrorPostalCode || postalCode.equals("Postal Code"))
            warringMessage.setText("Your Postal can contain only numbers and must be of 5 digits ,please re-enter your Postal Code");

        else if (!heAccepted)
            warringMessage.setText("Please accept our policy");

    }


    
    


    private javax.swing.JPanel AccountInfo;
    private javax.swing.JLabel BtnSignUp;
    private javax.swing.JScrollPane ContainerPanel;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel PersonalInfo;
    private javax.swing.JPanel ReseInfo;
    private javax.swing.JCheckBox policyCheckBox;
    private javax.swing.JComboBox<String> accTypeComboBox;
    private javax.swing.JComboBox<String> martialSComboBox;
    private javax.swing.JLabel personalInfoTitle;
    private javax.swing.JLabel accInfoTitle;
    private javax.swing.JLabel resInfoTitle;
    private javax.swing.JTextField lNameTxtField;
    private javax.swing.JTextField pinTxtField;
    private javax.swing.JTextField phNumTxtField;
    private javax.swing.JTextField cityTxtField;
    private javax.swing.JTextField addressTxtField;
    private javax.swing.JTextField salaryTxtField;
    private javax.swing.JTextField postalCodeTxtField;
    private javax.swing.JTextField fNameTxtField;
    private javax.swing.JTextField natTxtField;
    private javax.swing.JTextField natIDTxtField;
    private javax.swing.JTextField jobTxtField;
    private javax.swing.JTextField dateTxtField;
    private javax.swing.JTextField passwordTxtField;
    private javax.swing.JTextField usernameTxtField;
    private javax.swing.JPanel leftInPanel;
    private javax.swing.JLabel leftPanelText5;
    private javax.swing.JPanel mianPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel rightPanelBckGrd;
    private javax.swing.JLabel rightPanelBckgrd;
    private javax.swing.JLabel rightPanelBtn;
    private javax.swing.JLabel rightPanelLogo;
    private javax.swing.JLabel rightPanelText1;
    private javax.swing.JLabel rightPanelText2;
    private javax.swing.JLabel rightPanelText3;
    private javax.swing.JLabel rightPanelText4;
    private javax.swing.JPanel submitPanel;
    private javax.swing.JLabel warringMessage;
}
