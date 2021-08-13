package com.mycompany.banksystemoop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MoneyTransaction extends JFrame implements ActionListener, MouseListener {

    JButton deposit = new JButton("Deposit");
    JButton withdraw = new JButton("Withdraw");
    JButton close = new JButton("Close");
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JTextField tf1 = new JTextField();
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l6 = new JLabel();
    JLabel l7 = new JLabel();
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    Font textFont = new Font("Poppins",Font.BOLD,14);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime now = LocalDateTime.now();

    public MoneyTransaction(Normal normalClient) {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        this.setTitle("Money Transactions");
        this.setUndecorated(true);
        this.setSize(500,200);
        this.setShape(new RoundRectangle2D.Double(0, 0, 500, 200, 50, 20));
        this.getContentPane().setBackground(new Color(0x30333e));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        p.setLayout(new GridLayout(4,2,0,5));
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

        l5.setText(normalClient.getBalance()+" USD");
        l5.setFont(textFont);
        l5.setForeground(new Color(0x7d7e83));

        l6.setText("Account Number: ");
        l6.setFont(textFont);
        l6.setForeground(new Color(0xffffff));

        long accNo = normalClient.getAccountNumber();
        l7.setText(Long.toString(accNo));
        l7.setFont(textFont);
        l7.setForeground(new Color(0x7d7e83));

        deposit.setFocusable(false);
        deposit.addActionListener(this);
        deposit.addMouseListener(this);
        deposit.setForeground(new Color(0xECEFF1));
        deposit.setPreferredSize(new Dimension(100,25));
        deposit.setBackground(new Color(0x9a95f1));
        withdraw.setFocusable(false);
        withdraw.addActionListener(this);
        withdraw.addMouseListener(this);
        withdraw.setForeground(new Color(0xECEFF1));
        withdraw.setPreferredSize(new Dimension(100,25));
        withdraw.setBackground(new Color(0x9a95f1));
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

        p2.add(withdraw);
        p2.add(deposit);
        p2.add(close);

        this.add(p,BorderLayout.CENTER);
        this.add(p2,BorderLayout.SOUTH);
        this.add(p3,BorderLayout.WEST);
        this.add(p4,BorderLayout.EAST);
        this.add(p5,BorderLayout.NORTH);

        //	this.pack();
        this.setVisible(true);
    }
    public MoneyTransaction(VIP VIPClient) {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        this.setTitle("Money Transactions");
        this.setUndecorated(true);
        this.setSize(500,200);
        this.setShape(new RoundRectangle2D.Double(0, 0, 500, 200, 50, 20));
        this.getContentPane().setBackground(new Color(0x30333e));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

        p.setLayout(new GridLayout(4,2,0,5));
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

        deposit.setFocusable(false);
        deposit.addActionListener(this);
        deposit.addMouseListener(this);
        deposit.setForeground(new Color(0xECEFF1));
        deposit.setPreferredSize(new Dimension(100,25));
        deposit.setBackground(new Color(0x9a95f1));
        withdraw.setFocusable(false);
        withdraw.addActionListener(this);
        withdraw.addMouseListener(this);
        withdraw.setForeground(new Color(0xECEFF1));
        withdraw.setPreferredSize(new Dimension(100,25));
        withdraw.setBackground(new Color(0x9a95f1));
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

        p2.add(withdraw);
        p2.add(deposit);
        p2.add(close);

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
        if (e.getSource() == deposit) {
            if(!SignInPage.isVIP){
                this.deposit();
                HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentNormalClient.getBalance());
                HomePageWindow.DepositBlockText.setText(" $" + SignInPage.currentNormalClient.getLastDeposit());
            }

            if(SignInPage.isVIP){
                this.deposit();
                HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentVIPClient.getBalance());
                HomePageWindow.DepositBlockText.setText(" $" + SignInPage.currentVIPClient.getLastDeposit());
            }

        }
        else if (e.getSource() == withdraw) {
            if(!SignInPage.isVIP){
                this.withdraw();
                HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentNormalClient.getBalance());
                HomePageWindow.InfoBlockText.setText(" $" + SignInPage.currentNormalClient.getLastWithdraw());
            }

            if(SignInPage.isVIP){
                this.withdraw();
                HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentVIPClient.getBalance());
                HomePageWindow.InfoBlockText.setText(" $" + SignInPage.currentVIPClient.getLastWithdraw());
            }

        }
        else if (e.getSource() == close) {
            this.dispose();
        }

    }
    public void deposit(){

        double amount = -1;

        try {
            amount = Double.parseDouble(tf1.getText());
        }
        catch (Exception e){

        }

        if(!SignInPage.isVIP){
            if(amount>=100 && amount > 0){
                SignInPage.currentNormalClient.setBalance(SignInPage.currentNormalClient.getBalance()+amount);
                l5.setText(SignInPage.currentNormalClient.getBalance()+" USD");
                SignInPage.currentNormalClient.setLastDeposit(amount);
                JOptionPane.showMessageDialog(null,"Your transaction has been done successfully", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);

            }
            else if(amount <100 && amount > 0){
                JOptionPane.showMessageDialog(null,"Minimum deposit allowed is 100 EGP.", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }

            else {
                JOptionPane.showMessageDialog(null,"Invalid Number.", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if(SignInPage.isVIP){
            if(amount>=100 && amount > 0){
                SignInPage.currentVIPClient.setBalance(SignInPage.currentVIPClient.getBalance()+amount);
                l5.setText(SignInPage.currentVIPClient.getBalance()+" USD");
                SignInPage.currentVIPClient.setLastDeposit(amount);
                JOptionPane.showMessageDialog(null,"Your transaction has been done successfully", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);

            }
            else if(amount <100 && amount > 0){
                JOptionPane.showMessageDialog(null,"Minimum deposit allowed is 100 EGP.", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }

            else {
                JOptionPane.showMessageDialog(null,"Invalid Number.", "unsuccessful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }
    public void withdraw (){

        double money = -1;

        try {
            money = Double.parseDouble(tf1.getText());
        }
        catch (Exception x){

        }
        if(!SignInPage.isVIP){
            if(SignInPage.currentNormalClient.getBalance() >= money && money>=0)
            {
                SignInPage.currentNormalClient.setBalance(SignInPage.currentNormalClient.getBalance() - money);
                l5.setText(SignInPage.currentNormalClient.getBalance()+" USD");
                SignInPage.currentNormalClient.setLastWithdraw(money);
                JOptionPane.showMessageDialog(null,"Your transaction has been done successfully", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(SignInPage.currentNormalClient.getBalance() < money) {
                JOptionPane.showMessageDialog(null,"Your balance is less than the required amount.", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid Number.", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if(SignInPage.isVIP){
            double remain = SignInPage.currentVIPClient.getBalance() - money;
            int choice = 1;

                if(SignInPage.currentVIPClient.getBalance() >= money && money>=0)
                {
                    if (remain >= 50000){
                    SignInPage.currentVIPClient.setBalance(SignInPage.currentVIPClient.getBalance() - money);
                    l5.setText(SignInPage.currentVIPClient.getBalance()+" USD");
                    SignInPage.currentVIPClient.setLastWithdraw(money);
                    JOptionPane.showMessageDialog(null,"Your transaction has been done successfully", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        choice = JOptionPane.showConfirmDialog(null,"Your Balance Cannot be under 50K \nYou want to take them from credit?", "Re Enter Your Amount", JOptionPane.YES_NO_OPTION);
                            if (choice == 0){
                                new CreditCard(SignInPage.currentVIPClient);
                                this.dispose();
                            }
                }
                }
                else if(SignInPage.currentVIPClient.getBalance() < money) {
                    JOptionPane.showMessageDialog(null,"Your balance is less than the required amount.", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Invalid Number.", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
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

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == deposit) {
            deposit.setForeground(new Color(0x212121));
        }
        else if (e.getSource() == withdraw) {
            withdraw.setForeground(new Color(0x212121));
        }
        else if (e.getSource() == close) {
            close.setForeground(new Color(0x212121));
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == deposit) {
            deposit.setForeground(new Color(0xECEFF1));
        }
        else if (e.getSource() == withdraw) {
            withdraw.setForeground(new Color(0xECEFF1));
        }
        else if (e.getSource() == close) {
            close.setForeground(new Color(0xECEFF1));
        }
    }

}

