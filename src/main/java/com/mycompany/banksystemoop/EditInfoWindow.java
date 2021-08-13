package com.mycompany.banksystemoop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;

public class EditInfoWindow extends JFrame implements ActionListener,MouseListener {

    String[] maritalStatus = {"Single","Married","Divorced"};
    JLabel l1 = new JLabel();
    JTextField tf1 = new JTextField();
    JLabel l2 = new JLabel();
    JTextField tf2 = new JTextField();
    JLabel l3 = new JLabel();
    JLabel nat = new JLabel();
    JLabel l4 = new JLabel();
    JLabel accTypes = new JLabel();
    JLabel l5 = new JLabel();
    JTextField tf5 = new JTextField();
    JLabel l6 = new JLabel();
    JLabel natID = new JLabel();
    JLabel l7 = new JLabel();
    JTextField tf7 = new JTextField();
    JLabel l8 = new JLabel();
    JTextField tf8 = new JTextField();
    JLabel l9 = new JLabel();
    JTextField tf9 = new JTextField();
    JLabel l10 = new JLabel();
    JLabel tf10 = new JLabel();
    JLabel l11 = new JLabel();
    JTextField tf11 = new JTextField();
    JLabel l12 = new JLabel();
    JTextField tf12 = new JTextField();
    JLabel l13 = new JLabel();
    JComboBox cb2 = new JComboBox(maritalStatus);
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    JLabel ll = new JLabel();
    JButton editButn = new JButton("Save");
    JButton backButn = new JButton("Back");
    Color fontColor = new Color(0x7d7e83);
    Font textFont = new Font("Poppins",Font.BOLD,14);

    // the following constructor sets the style for the frame
    public EditInfoWindow(Client client) {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        this.setTitle("Edit Information");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(530,530);
        this.setUndecorated(true);
        this.setShape(new RoundRectangle2D.Double(0, 0, 530, 530, 50, 50));
        this.getContentPane().setBackground(new Color(0x30333e));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        p.setLayout(new GridLayout(13,2,0,5));
        p.setBackground(new Color(0x30333e));
        p2.setPreferredSize(new Dimension(0,50));
        p2.setBackground(new Color(0x30333e));
        p2.setLayout(new FlowLayout());
        p3.setPreferredSize(new Dimension(50,0));
        p3.setBackground(new Color(0x30333e));
        p4.setPreferredSize(new Dimension(50,0));
        p4.setBackground(new Color(0x30333e));
        p5.setLayout(new BorderLayout());
        p5.setBackground(new Color(0x30333e));


        //buttons style
        editButn.setFocusable(false);
        editButn.addActionListener(this);
        editButn.addMouseListener(this);
        editButn.setForeground(new Color(0xECEFF1));
        editButn.setPreferredSize(new Dimension(70,25));
        editButn.setBackground(new Color(0x9a95f1));
        backButn.setBackground(new Color(0x9a95f1));
        backButn.setForeground(new Color(0xECEFF1));
        backButn.setPreferredSize(new Dimension(70,25));
        backButn.setFocusable(false);
        backButn.addActionListener(this);
        backButn.addMouseListener(this);

        //setting data panel
        l1.setText("First Name: ");
        l1.setFont(textFont);
        l1.setForeground(new Color(0xffffff));
        tf1.setText(client.getFirstName());
        tf1.setBackground(new Color(0x30333e));
        tf1.setFont(textFont);
        tf1.setForeground(new Color(0x7d7e83));
        tf1.setCaretColor(new Color(0xffffff));

        l2.setText("Last Name: ");
        l2.setFont(textFont);
        l2.setForeground(new Color(0xffffff));
        tf2.setText(client.getLastName());
        tf2.setBackground(new Color(0x30333e));
        tf2.setFont(textFont);
        tf2.setForeground(new Color(0x7d7e83));
        tf2.setCaretColor(new Color(0xffffff));

        l3.setText("Nationality: ");
        l3.setFont(textFont);
        l3.setForeground(new Color(0xffffff));
        nat.setText(client.getNationality());
        nat.setBackground(new Color(0x30333e));
        nat.setFont(textFont);
        nat.setForeground(new Color(0x7d7e83));

        l4.setText("Account Type: ");
        l4.setFont(textFont);
        l4.setForeground(new Color(0xffffff));
        accTypes.setText(client.getAccountType());
        accTypes.setBackground(new Color(0x30333e));
        accTypes.setFont(textFont);
        accTypes.setForeground(new Color(0x7d7e83));
        accTypes.setEnabled(false);

        l5.setText("User Name: ");
        l5.setFont(textFont);
        l5.setForeground(new Color(0xffffff));
        tf5.setText(client.getUserName());
        tf5.setBackground(new Color(0x30333e));
        tf5.setFont(textFont);
        tf5.setForeground(new Color(0x7d7e83));
        tf5.setCaretColor(new Color(0xffffff));

        l6.setText("National ID: ");
        l6.setFont(textFont);
        l6.setForeground(new Color(0xffffff));
        natID.setText(client.getNationalID());
        natID.setBackground(new Color(0x30333e));
        natID.setFont(textFont);
        natID.setForeground(new Color(0x7d7e83));

        l7.setText("Address: ");
        l7.setFont(textFont);
        l7.setForeground(new Color(0xffffff));
        tf7.setText(client.getAddress());
        tf7.setBackground(new Color(0x30333e));
        tf7.setFont(textFont);
        tf7.setForeground(new Color(0x7d7e83));
        tf7.setCaretColor(new Color(0xffffff));

        l8.setText("Job: ");
        l8.setFont(textFont);
        l8.setForeground(new Color(0xffffff));
        tf8.setText(client.getJob());
        tf8.setBackground(new Color(0x30333e));
        tf8.setFont(textFont);
        tf8.setForeground(new Color(0x7d7e83));
        tf8.setCaretColor(new Color(0xffffff));

        l9.setText("Postal Code: ");
        l9.setFont(textFont);
        l9.setForeground(new Color(0xffffff));
        tf9.setText(client.getPostalCode());
        tf9.setBackground(new Color(0x30333e));
        tf9.setFont(textFont);
        tf9.setForeground(new Color(0x7d7e83));
        tf9.setCaretColor(new Color(0xffffff));

        long accNo = client.getAccountNumber();
        l10.setText("Account Number: ");
        l10.setFont(textFont);
        l10.setForeground(new Color(0xffffff));
        tf10.setText(Long.toString(accNo));
        tf10.setBackground(new Color(0x30333e));
        tf10.setFont(textFont);
        tf10.setForeground(new Color(0x7d7e83));

        l11.setText("PIN: ");
        l11.setFont(textFont);
        l11.setForeground(new Color(0xffffff));
        tf11.setText(client.getPin());
        tf11.setBackground(new Color(0x30333e));
        tf11.setFont(textFont);
        tf11.setForeground(new Color(0x7d7e83));
        tf11.setCaretColor(new Color(0xffffff));

        l12.setText("Phone Number: ");
        l12.setFont(textFont);
        l12.setForeground(new Color(0xffffff));
        tf12.setText(client.getPhoneNumber());
        tf12.setBackground(new Color(0x30333e));
        tf12.setFont(textFont);
        tf12.setForeground(new Color(0x7d7e83));
        tf12.setCaretColor(new Color(0xffffff));

        l13.setText("Marital Status: ");
        l13.setFont(textFont);
        l13.setForeground(new Color(0xffffff));
        cb2.setBackground(new Color(0x30333e));
        cb2.setFont(textFont);
        cb2.setForeground(new Color(0x7d7e83));

        ll.setText("+20");
        ll.setFont(textFont);
        ll.setForeground(new Color(0xffffff));

        p5.add(ll,BorderLayout.WEST);
        p5.add(tf12,BorderLayout.CENTER);

        //adding data to panel
        p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(tf2);
        p.add(l3);
        p.add(nat);
        p.add(l4);
        p.add(accTypes);
        p.add(l5);
        p.add(tf5);
        p.add(l6);
        p.add(natID);
        p.add(l7);
        p.add(tf7);
        p.add(l8);
        p.add(tf8);
        p.add(l9);
        p.add(tf9);
        p.add(l10);
        p.add(tf10);
        p.add(l11);
        p.add(tf11);
        p.add(l12);
        p.add(p5);
        p.add(l13);
        p.add(cb2);

        //adding buttons to south panel
        p2.add(backButn);
        p2.add(editButn);

        //adding panels to the frame
        this.add(p,BorderLayout.CENTER);
        this.add(p2,BorderLayout.SOUTH);
        this.add(p3,BorderLayout.WEST);
        this.add(p4,BorderLayout.EAST);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // close the frame if Back button is clicked
        if (e.getSource() == backButn) {
            this.dispose();
        }

        // Perform the Edit Info
        else if (e.getSource() == editButn) {
            // Checking if the Client if VIP or not
            if(!SignInPage.isVIP){


                boolean typoError = false;
                String fName;
                String lName;
                String accType;
                String username;
                String address;
                String job;
                String postalCode;
                String pin;
                String phNum;
                String martStatus;

                fName = tf1.getText();          // get Edited First Name

                // Checking first name
                if (!DataValidator.CheckName(fName)) {
                    typoError = true;
                }

                lName = tf2.getText();           // get Edited Last Name

                // Checking last name
                if (!DataValidator.CheckName(lName)) {
                    typoError = true;
                }

                    accType = (String)accTypes.getText();       // get Edited Account type
                    username = tf5.getText();                   // get Edited username
                    address = tf7.getText();                    // get Edited Address
                    job = tf8.getText();                        // get Edited Job
                    postalCode =tf9.getText();                  // get Edited Postal Code

                // Checking Postal Code
                if (!DataValidator.CheckPostalCode(postalCode)) {
                    typoError = true;
                }

                pin = tf11.getText();                           // get Edited Pin

                // Checking pin
                if (!DataValidator.CheckPin(pin)) {
                    typoError = true;
                }

                    phNum = tf12.getText();                 // get Edited Phone Number

                // Checking phone number
                if (!DataValidator.CheckPhoneNumber(phNum)) {
                    typoError = true;
                }

                    martStatus = (String)cb2.getSelectedItem();   // get Edited Martial Status

                // Check if there is typo errors in the edited info
                if (typoError)
                    JOptionPane.showMessageDialog(null,"Invalid Information Format", "Input Error", JOptionPane.ERROR_MESSAGE);

                if (!typoError){

                SignInPage.currentNormalClient.setFirstName(fName);
                SignInPage.currentNormalClient.setLastName(lName);
                SignInPage.currentNormalClient.setAccountType(accType);
                SignInPage.currentNormalClient.setUserName(username);
                SignInPage.currentNormalClient.setAddress(address);
                SignInPage.currentNormalClient.setJob(job);
                SignInPage.currentNormalClient.setPostalCode(postalCode);
                SignInPage.currentNormalClient.setPin(pin);
                SignInPage.currentNormalClient.setPhoneNumber(phNum);
                SignInPage.currentNormalClient.setMaritalStatus(martStatus);

                JOptionPane.showMessageDialog(null,"Your information has been saved successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

                HomePageWindow.FirstName.setText(SignInPage.currentNormalClient.getFirstName());
                HomePageWindow.secondName.setText(SignInPage.currentNormalClient.getLastName());
                HomePageWindow.userName1.setText(SignInPage.currentNormalClient.getUserName());
                HomePageWindow.accountType.setText(SignInPage.currentNormalClient.getAccountType());
                HomePageWindow.nationality.setText(SignInPage.currentNormalClient.getNationality());
                HomePageWindow.nationalId.setText(SignInPage.currentNormalClient.getNationalID());
                HomePageWindow.address.setText(SignInPage.currentNormalClient.getAddress());
                HomePageWindow.job.setText(SignInPage.currentNormalClient.getJob());
                HomePageWindow.postalCode.setText(SignInPage.currentNormalClient.getPostalCode());
                HomePageWindow.pinGet.setText(SignInPage.currentNormalClient.getPin());
                HomePageWindow.phoneNumber.setText(SignInPage.currentNormalClient.getPhoneNumber());
                HomePageWindow.martialStatus.setText(SignInPage.currentNormalClient.getMaritalStatus());
                HomePageWindow.welcomeMessage.setText("Welcome Back, " + SignInPage.currentNormalClient.getFirstName() +" ! ");
                HomePageWindow.userName.setText(SignInPage.currentNormalClient.getFirstName() + " " + SignInPage.currentNormalClient.getLastName() + "  " );

            }
            }

            // Checking if the Client if VIP or not
            if(SignInPage.isVIP){

                boolean typoError = false;
                String fName;
                String lName;
                String accType;
                String username;
                String address;
                String job;
                String postalCode;
                String pin;
                String phNum;
                String martStatus;

                fName = tf1.getText();                      // get Edited First Name

                // Checking first name
                if (!DataValidator.CheckName(fName)) {
                    typoError = true;
                }
                lName = tf2.getText();                      // get Edited Last Name

                // Checking last name
                if (!DataValidator.CheckName(lName)) {
                    typoError = true;
                }

                accType = (String)accTypes.getText();       // get Edited Account type
                username = tf5.getText();                   // get Edited username
                address = tf7.getText();                    // get Edited Address
                job = tf8.getText();                        // get Edited Job
                postalCode =tf9.getText();                  // get Edited Postal Code

                // Checking Postal Code
                if (!DataValidator.CheckPostalCode(postalCode)) {
                    typoError = true;
                }

                pin = tf11.getText();                       // get Edited Pin

                // Checking pin
                if (!DataValidator.CheckPin(pin)) {
                    typoError = true;
                }

                phNum = tf12.getText();                     // get Edited phone number

                // Checking phone number
                if (!DataValidator.CheckPhoneNumber(phNum)) {
                    typoError = true;
                }

                martStatus = (String)cb2.getSelectedItem();     // get Edited Martial Status

                // Check if there is typo errors in the edited info
                if (typoError)
                    JOptionPane.showMessageDialog(null,"Invalid Information Format", "Input Error", JOptionPane.ERROR_MESSAGE);

                if (!typoError){
                SignInPage.currentVIPClient.setFirstName(fName);
                SignInPage.currentVIPClient.setLastName(lName);
                SignInPage.currentVIPClient.setAccountType(accType);
                SignInPage.currentVIPClient.setUserName(username);
                SignInPage.currentVIPClient.setAddress(address);
                SignInPage.currentVIPClient.setJob(job);
                SignInPage.currentVIPClient.setPostalCode(postalCode);
                SignInPage.currentVIPClient.setPin(pin);
                SignInPage.currentVIPClient.setPhoneNumber(phNum);
                SignInPage.currentVIPClient.setMaritalStatus(martStatus);
                JOptionPane.showMessageDialog(null,"Your information has been saved successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

                HomePageWindow.FirstName1.setText(SignInPage.currentVIPClient.getFirstName());
                HomePageWindow.secondName1.setText(SignInPage.currentVIPClient.getLastName());
                HomePageWindow.userName2.setText(SignInPage.currentVIPClient.getUserName());
                HomePageWindow.accountType1.setText(SignInPage.currentVIPClient.getAccountType());
                HomePageWindow.nationality1.setText(SignInPage.currentVIPClient.getNationality());
                HomePageWindow.nationalId1.setText(SignInPage.currentVIPClient.getNationalID());
                HomePageWindow.address1.setText(SignInPage.currentVIPClient.getAddress());
                HomePageWindow.job1.setText(SignInPage.currentVIPClient.getJob());
                HomePageWindow.postalCode1.setText(SignInPage.currentVIPClient.getPostalCode());
                HomePageWindow.pinGet1.setText(SignInPage.currentVIPClient.getPin());
                HomePageWindow.phoneNumber1.setText(SignInPage.currentVIPClient.getPhoneNumber());
                HomePageWindow.martialStatus1.setText(SignInPage.currentVIPClient.getMaritalStatus());
                HomePageWindow.welcomeMessage.setText("Welcome Back, " + SignInPage.currentVIPClient.getFirstName() +" ! ");
                HomePageWindow.userName.setText(SignInPage.currentVIPClient.getFirstName() + " " + SignInPage.currentVIPClient.getLastName() + "  " );
                }
            }

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    /*
     The mouseEntered & MouseExited methods are responsible for the button hover
     */

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == editButn) {
            editButn.setForeground(new Color(0x212121));
        }
        else if (e.getSource() == backButn) {
            backButn.setForeground(new Color(0x212121));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == editButn) {
            editButn.setForeground(new Color(0xECEFF1));
        }
        else if (e.getSource() == backButn) {
            backButn.setForeground(new Color(0xECEFF1));
        }

    }

}

