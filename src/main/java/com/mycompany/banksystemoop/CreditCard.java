package com.mycompany.banksystemoop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class CreditCard extends JFrame implements ActionListener, MouseListener {
    JButton withdrawBtn = new JButton("Credit Out");  // Credit out Button
    JButton creditINBtn = new JButton("Credit In");   // Credit In Button
    JButton close = new JButton("Close");             // Close Button
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JTextField tf1 = new JTextField();                      // input field
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l6 = new JLabel();
    JLabel l7 = new JLabel();
    JLabel debitTxt = new JLabel();
    JLabel debit = new JLabel();
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    Font textFont = new Font("Poppins",Font.BOLD,14);
    public static LocalDate creditCardWithdrawDateNormal;
    public static LocalDate inDebitDateNormal;
    public static LocalDate creditCardWithdrawDateVIP;
    public static LocalDate inDebitDateVIP;
    public static boolean debitPaidNormal;
    public static boolean debitPaidVIP;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");      // view the date of today in the panel
    LocalDateTime now = LocalDateTime.now();

    // Constructor for Normal clients
    public CreditCard(Normal NormalClient) {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        this.setTitle("CreditCard");
        this.setUndecorated(true);
        this.setSize(500,200);
        this.setShape(new RoundRectangle2D.Double(0, 0, 500, 200, 50, 20));
        this.getContentPane().setBackground(new Color(0x30333e));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        p.setLayout(new GridLayout(5,2,0,5));
        p.setBackground(new Color(0x30333e));
        p2.setPreferredSize(new Dimension(0,50));
        p2.setBackground(new Color(0x30333e));
        p2.setLayout(new FlowLayout());
        p3.setPreferredSize(new Dimension(50,0));
        p3.setBackground(new Color(0x30333e));
        p4.setPreferredSize(new Dimension(50,0));
        p4.setBackground(new Color(0x30333e));
        p5.setBackground(new Color(0x30333e));
        p5.setPreferredSize(new Dimension(0,10));

        l1.setText("Amount: ");
        l1.setFont(textFont);
        l1.setForeground(new Color(0xffffff));

        tf1.setBackground(new Color(0x30333e));
        tf1.setFont(textFont);
        tf1.setForeground(new Color(0x7d7e83));
        tf1.setCaretColor(new Color(0xffffff));

        l2.setText("Date: ");
        l2.setFont(textFont);
        l2.setForeground(new Color(0xffffff));


        l3.setText(dtf.format(now));
        l3.setFont(textFont);
        l3.setForeground(new Color(0x7d7e83));

        l4.setText("Balance: ");
        l4.setFont(textFont);
        l4.setForeground(new Color(0xffffff));

        l5.setText(NormalClient.getBalance()+" USD");
        l5.setFont(textFont);
        l5.setForeground(new Color(0x7d7e83));

        l6.setText("Account Number: ");
        l6.setFont(textFont);
        l6.setForeground(new Color(0xffffff));

        long accNo = NormalClient.getAccountNumber();
        l7.setText(Long.toString(accNo));
        l7.setFont(textFont);
        l7.setForeground(new Color(0x7d7e83));

        debitTxt.setText("In debit? : ");
        debitTxt.setFont(textFont);
        debitTxt.setForeground(new Color(0xffffff));

        debit.setFont(textFont);
        debit.setForeground(new Color(0x7d7e83));
        boolean status = NormalClient.isInDebitStatus();
        debit.setText(Boolean.toString(status));


        withdrawBtn.setFocusable(false);
        withdrawBtn.addActionListener(this);
        withdrawBtn.addMouseListener(this);
        withdrawBtn.setForeground(new Color(0xECEFF1));
        withdrawBtn.setPreferredSize(new Dimension(100,25));
        withdrawBtn.setBackground(new Color(0x9a95f1));

        creditINBtn.setFocusable(false);
        creditINBtn.addActionListener(this);
        creditINBtn.addMouseListener(this);
        creditINBtn.setForeground(new Color(0xECEFF1));
        creditINBtn.setPreferredSize(new Dimension(100,25));
        creditINBtn.setBackground(new Color(0x9a95f1));

        close.setFocusable(false);
        close.addActionListener(this);
        close.addMouseListener(this);
        close.setForeground(new Color(0xECEFF1));
        close.setPreferredSize(new Dimension(100,25));
        close.setBackground(new Color(0x9a95f1));
        close.setFocusable(false);

        p.add(l6);
        p.add(l7);
        p.add(l4);
        p.add(l5);
        p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(l3);
        p.add(debitTxt);
        p.add(debit);

        p2.add(withdrawBtn);
        p2.add(close);
        p2.add(creditINBtn);

        this.add(p,BorderLayout.CENTER);
        this.add(p2,BorderLayout.SOUTH);
        this.add(p3,BorderLayout.WEST);
        this.add(p4,BorderLayout.EAST);
        this.add(p5,BorderLayout.NORTH);

        //	this.pack();
        this.setVisible(true);
    }

    // Constructor for VIP clients
    public CreditCard(VIP VIPClient) {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        this.setTitle("CreditCard");
        this.setUndecorated(true);
        this.setSize(500,200);
        this.setShape(new RoundRectangle2D.Double(0, 0, 500, 200, 50, 20));
        this.getContentPane().setBackground(new Color(0x30333e));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        p.setLayout(new GridLayout(5,2,0,5));
        p.setBackground(new Color(0x30333e));
        p2.setPreferredSize(new Dimension(0,50));
        p2.setBackground(new Color(0x30333e));
        p2.setLayout(new FlowLayout());
        p3.setPreferredSize(new Dimension(50,0));
        p3.setBackground(new Color(0x30333e));
        p4.setPreferredSize(new Dimension(50,0));
        p4.setBackground(new Color(0x30333e));
        p5.setBackground(new Color(0x30333e));
        p5.setPreferredSize(new Dimension(0,10));

        l1.setText("Amount: ");
        l1.setFont(textFont);
        l1.setForeground(new Color(0xffffff));

        tf1.setBackground(new Color(0x30333e));
        tf1.setFont(textFont);
        tf1.setForeground(new Color(0x7d7e83));
        tf1.setCaretColor(new Color(0xffffff));

        l2.setText("Date: ");
        l2.setFont(textFont);
        l2.setForeground(new Color(0xffffff));


        l3.setText(dtf.format(now));
        l3.setFont(textFont);
        l3.setForeground(new Color(0x7d7e83));

        l4.setText("Balance: ");
        l4.setFont(textFont);
        l4.setForeground(new Color(0xffffff));

        l5.setText(VIPClient.getBalance()+" USD");
        l5.setFont(textFont);
        l5.setForeground(new Color(0x7d7e83));

        l6.setText("Account Number: ");
        l6.setFont(textFont);
        l6.setForeground(new Color(0xffffff));

        long accNo = VIPClient.getAccountNumber();
        l7.setText(Long.toString(accNo));
        l7.setFont(textFont);
        l7.setForeground(new Color(0x7d7e83));

        debitTxt.setText("In debit? : ");
        debitTxt.setFont(textFont);
        debitTxt.setForeground(new Color(0xffffff));

        debit.setFont(textFont);
        debit.setForeground(new Color(0x7d7e83));
        boolean status = VIPClient.isInDebitStatus();
        debit.setText(Boolean.toString(status));


        withdrawBtn.setFocusable(false);
        withdrawBtn.addActionListener(this);
        withdrawBtn.addMouseListener(this);
        withdrawBtn.setForeground(new Color(0xECEFF1));
        withdrawBtn.setPreferredSize(new Dimension(100,25));
        withdrawBtn.setBackground(new Color(0x9a95f1));

        creditINBtn.setFocusable(false);
        creditINBtn.addActionListener(this);
        creditINBtn.addMouseListener(this);
        creditINBtn.setForeground(new Color(0xECEFF1));
        creditINBtn.setPreferredSize(new Dimension(100,25));
        creditINBtn.setBackground(new Color(0x9a95f1));

        close.setFocusable(false);
        close.addActionListener(this);
        close.addMouseListener(this);
        close.setForeground(new Color(0xECEFF1));
        close.setPreferredSize(new Dimension(100,25));
        close.setBackground(new Color(0x9a95f1));
        close.setFocusable(false);

        p.add(l6);
        p.add(l7);
        p.add(l4);
        p.add(l5);
        p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(l3);
        p.add(debitTxt);
        p.add(debit);

        p2.add(withdrawBtn);
        p2.add(close);
        p2.add(creditINBtn);

        this.add(p,BorderLayout.CENTER);
        this.add(p2,BorderLayout.SOUTH);
        this.add(p3,BorderLayout.WEST);
        this.add(p4,BorderLayout.EAST);
        this.add(p5,BorderLayout.NORTH);

        //	this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // The following check id the Credit out button is clicked
        if (e.getSource() == withdrawBtn) {

            // Checking if the Client if VIP or not
            if(!SignInPage.isVIP){
                this.CreditWithdraw();
                // After the transaction takes place the following updates the Balance, Withdraw and credit limit in home page
                HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentNormalClient.getBalance());
                HomePageWindow.InfoBlockText.setText(" $" + SignInPage.currentNormalClient.getLastWithdraw());
                HomePageWindow.creditLimitTxt.setText("<html>Credit Limit: <br>" + SignInPage.currentNormalClient.getCreditLimit() + "</html>");
                HomePageWindow.creditTakenTxt.setText("<html>Credit Taken: <br>" + SignInPage.currentNormalClient.getCreditTaken() + "</html>");
            }

            // Checking if the Client if VIP or not
            if(SignInPage.isVIP){

                this.CreditWithdraw();

                // After the transaction takes place the following updates the Balance, Withdraw and credit limit in home page
                HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentVIPClient.getBalance());
                HomePageWindow.InfoBlockText.setText(" $" + SignInPage.currentVIPClient.getLastWithdraw());
                HomePageWindow.creditLimitTxt.setText("<html>Credit Limit: <br>" + SignInPage.currentVIPClient.getCreditLimit() + "</html>");
                HomePageWindow.creditTakenTxt.setText("<html>Credit Taken: <br>" + SignInPage.currentVIPClient.getCreditTaken() + "</html>");

            }
        }

        // The following check id the Credit In button is clicked
        if (e.getSource() == creditINBtn){

            // Checking if the Client if VIP or not
            if(!SignInPage.isVIP){
                this.CreditReturn();

                // After the transaction takes place the following updates the Balance, Withdraw and credit limit in home page
                HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentNormalClient.getBalance());
                HomePageWindow.InfoBlockText.setText(" $" + SignInPage.currentNormalClient.getLastWithdraw());
                HomePageWindow.creditTakenTxt.setText("<html>Credit Taken: <br>" + SignInPage.currentNormalClient.getCreditTaken() + "</html>");
            }

            // Checking if the Client if VIP or not
            if(SignInPage.isVIP){

                this.CreditReturn();

                // After the transaction takes place the following updates the Balance, Withdraw and credit limit in home page
                HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentVIPClient.getBalance());
                HomePageWindow.InfoBlockText.setText(" $" + SignInPage.currentVIPClient.getLastWithdraw());
                HomePageWindow.creditTakenTxt.setText("<html>Credit Taken: <br>" + SignInPage.currentVIPClient.getCreditTaken() + "</html>");

            }
        }

        else if (e.getSource() == close) {
            this.dispose();                 // closes the frame
        }

    }

    // Main Credit Out Method
    public void CreditWithdraw(){


        double money = -1;

        // getting the Credit Out Amount from from user
        try {
            money = Double.parseDouble(tf1.getText());
        }
        catch (Exception x){

        }

        if(!SignInPage.isVIP){
            if(money > 0 && SignInPage.currentNormalClient.getCreditLimit() >= money
                    && ((SignInPage.currentNormalClient.getCreditTaken() + money)<= SignInPage.currentNormalClient.getCreditLimit())
                        && money>=0)
            {
                SignInPage.currentNormalClient.setCreditTaken(SignInPage.currentNormalClient.getCreditTaken() + money);
                SignInPage.currentNormalClient.setLastWithdraw(money);
                l5.setText(SignInPage.currentNormalClient.getBalance()+" USD");
                creditCardWithdrawDateNormal = LocalDate.now();
                inDebitDateNormal = creditCardWithdrawDateNormal.plusMonths(2);
                JOptionPane.showMessageDialog(null,"Transaction Complete \nPlease pay you Credit Card before " + inDebitDateNormal, "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (money > 0 && SignInPage.currentNormalClient.getCreditLimit() <= money
                    || ((SignInPage.currentNormalClient.getCreditTaken() + money) >= SignInPage.currentNormalClient.getCreditLimit())
                            && money>=0)
            {
                JOptionPane.showMessageDialog(this,"You Cannot Exceed your credit limit", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);

            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid Number.", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if(SignInPage.isVIP){
            if(money > 0 && SignInPage.currentVIPClient.getCreditLimit() >= money
                    && ((SignInPage.currentVIPClient.getCreditTaken() + money)<= SignInPage.currentVIPClient.getCreditLimit())
                        && money>=0)
            {
                SignInPage.currentVIPClient.setCreditTaken(SignInPage.currentVIPClient.getCreditTaken() + money);
                SignInPage.currentVIPClient.setLastWithdraw(money);
                l5.setText(SignInPage.currentVIPClient.getBalance()+" USD");
                creditCardWithdrawDateVIP = LocalDate.now();
                inDebitDateVIP = creditCardWithdrawDateVIP.plusMonths(3);
                JOptionPane.showMessageDialog(null,"Transaction Complete \nPlease pay you Credit Card before " +  inDebitDateVIP, "Successful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (money > 0 && SignInPage.currentVIPClient.getCreditLimit() <= money && money>=0)
            {
                JOptionPane.showMessageDialog(this,"You Cannot Exceed your credit limit", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);

            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid Number.", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    // Main Credit In Method
    public void CreditReturn(){

        // Getting the Credit in Amount from user
        double money = -1;

        try {
            money = Double.parseDouble(tf1.getText());
        }
        catch (Exception x){

        }

        if(!SignInPage.isVIP){
            if( money > 0 && money <= SignInPage.currentNormalClient.getCreditTaken() && money <= SignInPage.currentNormalClient.getBalance()){
                SignInPage.currentNormalClient.setBalance(SignInPage.currentNormalClient.getBalance() - money);
                SignInPage.currentNormalClient.setCreditTaken(SignInPage.currentNormalClient.getCreditTaken() - money);
                SignInPage.currentNormalClient.setLastWithdraw(money);
                l5.setText(SignInPage.currentNormalClient.getBalance()+" USD");
                JOptionPane.showMessageDialog(null,"Your transaction has been done successfully", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);

            }
            else if(money > 0 && money > SignInPage.currentNormalClient.getCreditTaken() ){
                JOptionPane.showMessageDialog(null,"Input is more than the credit taken", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (money > 0 && money > SignInPage.currentNormalClient.getBalance()){
                JOptionPane.showMessageDialog(null,"Your balance is less than the required amount", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid Number.", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }

            if (SignInPage.currentNormalClient.getCreditTaken() == 0)
                debitPaidNormal = true;
        }

        if(SignInPage.isVIP){
            if(money > 0 && money <= SignInPage.currentVIPClient.getCreditTaken() && money <= SignInPage.currentVIPClient.getBalance() ){
                SignInPage.currentVIPClient.setBalance(SignInPage.currentVIPClient.getBalance() - money);
                SignInPage.currentVIPClient.setCreditTaken(SignInPage.currentVIPClient.getCreditTaken() - money);
                SignInPage.currentVIPClient.setLastWithdraw(money);

                l5.setText(SignInPage.currentVIPClient.getBalance()+" USD");
                JOptionPane.showMessageDialog(null,"Your transaction has been done successfully", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);

            }
            else if(money > 0 && money > SignInPage.currentVIPClient.getCreditTaken() ){
                JOptionPane.showMessageDialog(null,"Input is more than the credit taken", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }

            else if(money > 0 && money > SignInPage.currentVIPClient.getBalance()){
                JOptionPane.showMessageDialog(null,"Your balance is less than the required amount", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }

            else {
                JOptionPane.showMessageDialog(null,"Invalid Number.", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }

            if (SignInPage.currentVIPClient.getCreditTaken() == 0)
                debitPaidVIP = true;
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

        if (e.getSource() == withdrawBtn) {
            withdrawBtn.setForeground(new Color(0x212121));
        }
        else if (e.getSource() == close) {
            close.setForeground(new Color(0x212121));
        }
        else if (e.getSource() == creditINBtn) {
            creditINBtn.setForeground(new Color(0x212121));
        }


    }

    @Override
    public void mouseExited(MouseEvent e) {

        if (e.getSource() == withdrawBtn) {
            withdrawBtn.setForeground(new Color(0xECEFF1));
        }
        else if (e.getSource() == close) {
            close.setForeground(new Color(0xECEFF1));
        }
        else if (e.getSource() == creditINBtn) {
            creditINBtn.setForeground(new Color(0xECEFF1));
        }

    }

}
