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

public class MoneyTransfer extends JFrame implements ActionListener,MouseListener {

    JButton transfer = new JButton("Transfer");
    JButton close = new JButton("Close");
    JLabel amountTxt = new JLabel();
    JLabel dateTxt = new JLabel();
    JLabel l3 = new JLabel();
    JTextField tf1 = new JTextField();
    JTextField l1 = new JTextField();
    JTextField transToAcc = new JTextField();
    ButtonGroup group = new ButtonGroup();
    JLabel balanceTxt = new JLabel();
    JLabel balance = new JLabel();
    JLabel dfdf = new JLabel();
    JLabel transFromAccText = new JLabel();
    JLabel transFromAcc = new JLabel();
    JLabel transToAccText = new JLabel();
    JLabel l10 = new JLabel();
    JPanel p = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    Font textFont = new Font("Poppins",Font.BOLD,14);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime now = LocalDateTime.now();

    public MoneyTransfer(Normal normalClient) {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        this.setTitle("Money Transactions");
        this.setUndecorated(true);
        this.setSize(500,250);
        this.setShape(new RoundRectangle2D.Double(0, 0, 500, 250, 50, 20));
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
        p5.setPreferredSize(new Dimension(0,30));
        p5.setLayout(new FlowLayout());

        amountTxt.setText("Amount: ");
        amountTxt.setFont(textFont);
        amountTxt.setForeground(new Color(0xffffff));

        tf1.setBackground(new Color(0x30333e));
        tf1.setFont(textFont);
        tf1.setForeground(new Color(0x7d7e83));
        tf1.setCaretColor(new Color(0xffffff));

        dateTxt.setText("Date: ");
        dateTxt.setFont(textFont);
        dateTxt.setForeground(new Color(0xffffff));


        l3.setText(dtf.format(now));
        l3.setFont(textFont);
        l3.setForeground(new Color(0x7d7e83));

        balanceTxt.setText("Balance: ");
        balanceTxt.setFont(textFont);
        balanceTxt.setForeground(new Color(0xffffff));

        balance.setText(normalClient.getBalance()+" USD");
        balance.setFont(textFont);
        balance.setForeground(new Color(0x7d7e83));

        dfdf.setText("Transfer funds from: ");
        dfdf.setFont(textFont);
        dfdf.setForeground(new Color(0xffffff));


        l1.setBackground(new Color(0x30333e));
        l1.setFont(textFont);
        l1.setText("Enter account number");
        l1.setForeground(new Color(0x7d7e83));
        l1.setCaretColor(new Color(0xffffff));

        transFromAccText.setText("Account Number: ");
        transFromAccText.setFont(textFont);
        transFromAccText.setForeground(new Color(0xffffff));

        transFromAcc.setText(normalClient.getAccountNumber()+"");
        transFromAcc.setFont(textFont);
        transFromAcc.setForeground(new Color(0x7d7e83));

        transToAccText.setText("Transfer funds to: ");
        transToAccText.setFont(textFont);
        transToAccText.setForeground(new Color(0xffffff));

        transToAcc.setBackground(new Color(0x30333e));
        transToAcc.setFont(textFont);
        transToAcc.setText("Enter Account Number");
        transToAcc.setForeground(new Color(0x7d7e83));
        transToAcc.setCaretColor(new Color(0xffffff));

        transfer.setFocusable(false);
        transfer.addActionListener(this);
        transfer.addMouseListener(this);
        transfer.setForeground(new Color(0xECEFF1));
        transfer.setPreferredSize(new Dimension(100,25));
        transfer.setBackground(new Color(0x9a95f1));

        close.setFocusable(false);
        close.addActionListener(this);
        close.addMouseListener(this);
        close.setForeground(new Color(0xECEFF1));
        close.setPreferredSize(new Dimension(100,25));
        close.setBackground(new Color(0x9a95f1));


        p.add(transFromAccText);
        p.add(transFromAcc);
        p.add(transToAccText);
        p.add(transToAcc);
        p.add(balanceTxt);
        p.add(balance);
        p.add(amountTxt);
        p.add(tf1);
        p.add(dateTxt);
        p.add(l3);

        p2.add(transfer);
        p2.add(close);

        this.add(p,BorderLayout.CENTER);
        this.add(p2,BorderLayout.SOUTH);
        this.add(p3,BorderLayout.WEST);
        this.add(p4,BorderLayout.EAST);
        this.add(p5,BorderLayout.NORTH);

        this.setVisible(true);
    }
    public MoneyTransfer(VIP vipCLient) {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        this.setTitle("Money Transactions");
        this.setUndecorated(true);
        this.setSize(500,250);
        this.setShape(new RoundRectangle2D.Double(0, 0, 500, 250, 50, 20));
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
        p5.setPreferredSize(new Dimension(0,30));
        p5.setLayout(new FlowLayout());

        amountTxt.setText("Amount: ");
        amountTxt.setFont(textFont);
        amountTxt.setForeground(new Color(0xffffff));

        tf1.setBackground(new Color(0x30333e));
        tf1.setFont(textFont);
        tf1.setForeground(new Color(0x7d7e83));
        tf1.setCaretColor(new Color(0xffffff));

        dateTxt.setText("Date: ");
        dateTxt.setFont(textFont);
        dateTxt.setForeground(new Color(0xffffff));


        l3.setText(dtf.format(now));
        l3.setFont(textFont);
        l3.setForeground(new Color(0x7d7e83));

        balanceTxt.setText("Balance: ");
        balanceTxt.setFont(textFont);
        balanceTxt.setForeground(new Color(0xffffff));

        balance.setText(vipCLient.getBalance()+" USD");
        balance.setFont(textFont);
        balance.setForeground(new Color(0x7d7e83));

        dfdf.setText("Transfer funds from: ");
        dfdf.setFont(textFont);
        dfdf.setForeground(new Color(0xffffff));


        l1.setBackground(new Color(0x30333e));
        l1.setFont(textFont);
        l1.setText("Enter account number");
        l1.setForeground(new Color(0x7d7e83));
        l1.setCaretColor(new Color(0xffffff));

        transFromAccText.setText("Account Number: ");
        transFromAccText.setFont(textFont);
        transFromAccText.setForeground(new Color(0xffffff));

        transFromAcc.setText(vipCLient.getAccountNumber()+"");
        transFromAcc.setFont(textFont);
        transFromAcc.setForeground(new Color(0x7d7e83));

        transToAccText.setText("Transfer funds to: ");
        transToAccText.setFont(textFont);
        transToAccText.setForeground(new Color(0xffffff));

        transToAcc.setBackground(new Color(0x30333e));
        transToAcc.setFont(textFont);
        transToAcc.setText("Enter Account Number");
        transToAcc.setForeground(new Color(0x7d7e83));
        transToAcc.setCaretColor(new Color(0xffffff));

        transfer.setFocusable(false);
        transfer.addActionListener(this);
        transfer.addMouseListener(this);
        transfer.setForeground(new Color(0xECEFF1));
        transfer.setPreferredSize(new Dimension(100,25));
        transfer.setBackground(new Color(0x9a95f1));

        close.setFocusable(false);
        close.addActionListener(this);
        close.addMouseListener(this);
        close.setForeground(new Color(0xECEFF1));
        close.setPreferredSize(new Dimension(100,25));
        close.setBackground(new Color(0x9a95f1));


        p.add(transFromAccText);
        p.add(transFromAcc);
        p.add(transToAccText);
        p.add(transToAcc);
        p.add(balanceTxt);
        p.add(balance);
        p.add(amountTxt);
        p.add(tf1);
        p.add(dateTxt);
        p.add(l3);

        p2.add(transfer);
        p2.add(close);

        this.add(p,BorderLayout.CENTER);
        this.add(p2,BorderLayout.SOUTH);
        this.add(p3,BorderLayout.WEST);
        this.add(p4,BorderLayout.EAST);
        this.add(p5,BorderLayout.NORTH);

        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == transfer) {
            double money = -1;
            try{
                money = Double.parseDouble(tf1.getText());
            } catch (Exception x){

            }

            boolean flag = false;
            if(!SignInPage.isVIP){

                for (int i = 0 ; i < Normal.NormalClients.size() ;i++){

                    if (transToAcc.getText().equals(Normal.NormalClients.get(i).getAccountNumber()+"")){

                        this.transfer();
                        Normal.NormalClients.get(i).setBalance(Normal.NormalClients.get(i).getBalance() + money);
                        balance.setText(SignInPage.currentNormalClient.getBalance()+" USD");
                        HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentNormalClient.getBalance());
                        flag = false;
                        break;

                    }

                    else if (transToAcc.getText().equals(VIP.VIPClients.get(i).getAccountNumber()+"")) {
                        this.transfer();
                        VIP.VIPClients.get(i).setBalance(VIP.VIPClients.get(i).getBalance() + money);
                        balance.setText(SignInPage.currentNormalClient.getBalance()+" USD");
                        HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentNormalClient.getBalance());
                        flag = false;
                        break;
                    }
                    else{
                        flag = true;
                    }

                }
                if(flag){
                    JOptionPane.showMessageDialog(null,"Wrong Account Number", "Account Number Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            if(SignInPage.isVIP){

                for (int i = 0 ; i < Normal.NormalClients.size() ;i++) {
                    if (transToAcc.getText().equals(Normal.NormalClients.get(i).getAccountNumber() + "")) {

                        this.transfer();
                        Normal.NormalClients.get(i).setBalance(Normal.NormalClients.get(i).getBalance() + money);
                        balance.setText(SignInPage.currentVIPClient.getBalance() + " USD");
                        HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentVIPClient.getBalance());
                        flag = false;
                        break;

                    } else if (transToAcc.getText().equals(VIP.VIPClients.get(i).getAccountNumber() + "")) {
                        this.transfer();
                        VIP.VIPClients.get(i).setBalance(VIP.VIPClients.get(i).getBalance() + money);
                        balance.setText(SignInPage.currentVIPClient.getBalance() + " USD");
                        HomePageWindow.TransferBlockText.setText(" $" + SignInPage.currentVIPClient.getBalance());
                        flag = false;
                        break;
                    } else {
                        flag = true;
                    }
                }
                if (flag){
                    JOptionPane.showMessageDialog(null,"Wrong Account Number", "Account Number Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        else if (e.getSource() == close){
            this.dispose();
        }

    }
    public void transfer (){

        double money = -1;
        try {
            money = Double.parseDouble(tf1.getText());
        }

        catch (Exception x){
        }

        if(!SignInPage.isVIP){
            if(SignInPage.currentNormalClient.getBalance() >= money && money >=0)
            {
                SignInPage.currentNormalClient.setBalance(SignInPage.currentNormalClient.getBalance() - money);
                JOptionPane.showMessageDialog(null,"Your transaction has been done successfully", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
            }

            else if (SignInPage.currentNormalClient.getBalance() <= money && money>=0){
                JOptionPane.showMessageDialog(null,"Your balance is less than the input amount", "Money not sufficient", JOptionPane.ERROR_MESSAGE);

            }
            else
                JOptionPane.showMessageDialog(null,"Invalid Number.", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
        }

        if(SignInPage.isVIP){

            double remain = SignInPage.currentVIPClient.getBalance() - money;

            if(SignInPage.currentVIPClient.getBalance() >= money && money>=0)
            {
                if(remain >= 50000){
                SignInPage.currentVIPClient.setBalance(SignInPage.currentVIPClient.getBalance() - money);
                JOptionPane.showMessageDialog(null,"Your transaction has been done successfully", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Your Balance Cannot be under 50K", "Re Enter Your Amount", JOptionPane.ERROR_MESSAGE);
                }
            }

            else if (SignInPage.currentVIPClient.getBalance() <= money && money>=0){
                JOptionPane.showMessageDialog(null,"Your balance is less than the input amount", "Money not sufficient", JOptionPane.ERROR_MESSAGE);

            }
            else
                JOptionPane.showMessageDialog(null,"Invalid Number.", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
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
        if (e.getSource() == transfer) {
            transfer.setForeground(new Color(0x212121));
        }

        if (e.getSource() == close) {
            close.setForeground(new Color(0x212121));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == transfer) {
            transfer.setForeground(new Color(0xECEFF1));
        }

        if (e.getSource() == close) {
            close.setForeground(new Color(0xECEFF1));
        }

    }

}
