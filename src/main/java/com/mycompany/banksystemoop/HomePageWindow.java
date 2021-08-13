package com.mycompany.banksystemoop;
import java.awt.Color;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

/**
 *
 * @author Ibrahim
 */
public class HomePageWindow extends JFrame {

    ImageIcon BtnHoverd = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\btnBckHover.png");
    ImageIcon atmHovered = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\ATMHov.png");
    ImageIcon BtnUnHoverd = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\btnHover.png");
    ImageIcon CallUsHoverd = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\CallusUnhovers.png");
    ImageIcon BalanceHovered = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\BalanceSheetHoverd.png");
    ImageIcon BalanceUnHovered = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\BalanceSheet.png");
    ImageIcon BranchesUnHovered = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\branchesUnHoverd.png");
    ImageIcon DepositUnHovered = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\DepositSheet.png");
    ImageIcon BranchesHovered = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\branchesHoverd.png");
    ImageIcon DepositHovered = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\DepositSheetHoverd.png");
    ImageIcon LoanUnHovered = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\loans.png");
    ImageIcon atmUnHovered = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\ATMunHov.png");
    ImageIcon LoanHovered = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\loanshovered.png");
    ImageIcon CallHoverd = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Callushovers.png");


    int mousePX; // x postion of the mouse when pressed
    int mousePY; // y postion of the mouse when pressed

    public HomePageWindow() {
        initComponents();
        if(!SignInPage.isVIP)
            CheckDebitNormal();
        if(SignInPage.isVIP)
            CheckDebitVIP();
        this.setBackground(new Color(0,0,0,0)); //make the background of the JFrame transparent
        this.setVisible(true); // make the frame visible

        // the following hide all the panels and show only homepage
        plankPanel.hide();
        HomePanel.show();
        ContactPanel.hide();
        LoansPanel.hide();
        InfoVIPWindowPage.hide();
        InfoNoramlWindowPage.hide();
        messagesPanel.hide();
        notificationsPanel.hide();
    }

    private void CheckDebitNormal(){
        if (CreditCard.inDebitDateNormal == null)
            SignInPage.currentNormalClient.setInDebitStatus(SignInPage.currentNormalClient.isInDebitStatus());

        else {
            if (LocalDate.now().isAfter(CreditCard.inDebitDateNormal)){
                if(CreditCard.debitPaidNormal)
                    SignInPage.currentNormalClient.setInDebitStatus(false);

                if(!CreditCard.debitPaidNormal)
                    SignInPage.currentNormalClient.setInDebitStatus(true);
            }
            else
                SignInPage.currentNormalClient.setInDebitStatus(false);

        }
    }
    private void CheckDebitVIP(){
        if (CreditCard.inDebitDateVIP == null)
            SignInPage.currentVIPClient.setInDebitStatus(SignInPage.currentVIPClient.isInDebitStatus());

        else {
            if (LocalDate.now().isAfter(CreditCard.inDebitDateVIP)){
                if(CreditCard.debitPaidVIP)
                    SignInPage.currentVIPClient.setInDebitStatus(false);

                if(!CreditCard.debitPaidVIP)
                    SignInPage.currentVIPClient.setInDebitStatus(true);
            }
            else
                SignInPage.currentVIPClient.setInDebitStatus(false);

        }
    }

    private void initComponents() {
        ImageIcon fIcon = new ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\icon_1.png");
        this.setIconImage(fIcon.getImage());
        homeMainPanel = new javax.swing.JPanel();
        BarPanel = new javax.swing.JPanel();
        miniButton1 = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        upperBar = new javax.swing.JLabel();
        topPanel = new javax.swing.JPanel();
        homeLogo = new javax.swing.JLabel();
        topPanelLogOut = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        logOutIcon = new javax.swing.JLabel();
        userPicture = new javax.swing.JLabel();
        welcomeMessage = new javax.swing.JLabel();
        topPanelBckGrnd = new javax.swing.JLabel();
        topPanelLogOut1 = new javax.swing.JLabel();
        ctrlPanel = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        MenuOffers = new javax.swing.JPanel();
        MenuOffersIcon = new javax.swing.JLabel();
        MenuOffersText = new javax.swing.JLabel();
        MenuOffersBtn = new javax.swing.JLabel();
        MenuHome = new javax.swing.JPanel();
        MenuHomeIcon = new javax.swing.JLabel();
        MenuHomeText = new javax.swing.JLabel();
        MenuHomeBtn = new javax.swing.JLabel();
        MenuLable = new javax.swing.JLabel();
        Account = new javax.swing.JPanel();
        AccountLable = new javax.swing.JLabel();
        AccountMyProfile = new javax.swing.JPanel();
        AccountMyProfileIcon = new javax.swing.JLabel();
        AccountMyProfileText = new javax.swing.JLabel();
        AccountMyProfileBtn = new javax.swing.JLabel();
        AccountMessaegs = new javax.swing.JPanel();
        AccountMessaegeIcon = new javax.swing.JLabel();
        AccountMessaegsText = new javax.swing.JLabel();
        AccountMessagesBtn = new javax.swing.JLabel();
        AccountNotifciactions = new javax.swing.JPanel();
        AccountNotifciactionsIcon = new javax.swing.JLabel();
        AccountNotifciactionsText = new javax.swing.JLabel();
        AccountNotifciactionsBtn = new javax.swing.JLabel();
        AccountLogOut = new javax.swing.JPanel();
        AccountLogOutIcon = new javax.swing.JLabel();
        AccountLogOutText = new javax.swing.JLabel();
        AccountLogOutBtn = new javax.swing.JLabel();
        ctrlPanelBckGrnd = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        Dashborad = new javax.swing.JPanel();
        DashboradLable1 = new javax.swing.JLabel();
        TransferBlock = new javax.swing.JPanel();
        TransferBlockText = new javax.swing.JLabel();
        TransferBlockBtn = new javax.swing.JLabel();
        CreditCardBlock = new javax.swing.JPanel();
        InfoBlockText = new javax.swing.JLabel();
        InfoBlockBtn = new javax.swing.JLabel();
        DepositBlock = new javax.swing.JPanel();
        DepositBlockText = new javax.swing.JLabel();
        DepositBlockBtn = new javax.swing.JLabel();
        Services = new javax.swing.JPanel();
        ServiceLable = new javax.swing.JLabel();
        LoansBlock = new javax.swing.JPanel();
        LoanClacBtn = new javax.swing.JLabel();
        SupportBlock = new javax.swing.JPanel();
        SupportBlockBtn = new javax.swing.JLabel();
        LatestActivity = new javax.swing.JPanel();
        LatestActivitySeeMoreText = new javax.swing.JLabel();
        LatestActivtyLable = new javax.swing.JLabel();
        LatestActivitySeeMoreBtn = new javax.swing.JLabel();
        mainPanelBckGrnd = new javax.swing.JLabel();
        LoansPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LoanCalcBtn = new javax.swing.JLabel();
        LoanInfoBtn1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ContactPanel = new javax.swing.JPanel();
        atmBtn = new javax.swing.JLabel();
        branchesBtn = new javax.swing.JLabel();
        CallUsBtn = new javax.swing.JLabel();
        ControlBckGrd = new javax.swing.JLabel();
        notificationsPanel = new javax.swing.JPanel();
        AccountNotificationsText = new javax.swing.JLabel();
        offersPanel = new javax.swing.JPanel();
        offersPhoto = new javax.swing.JLabel();
        messagesPanel = new javax.swing.JPanel();
        AccountMessagesText = new javax.swing.JLabel();
        InfoNoramlWindowPage = new javax.swing.JPanel();
        InfoPanel = new javax.swing.JPanel();
        FirstName = new javax.swing.JLabel();
        firstNameText = new javax.swing.JLabel();
        secondName = new javax.swing.JLabel();
        secondNameText = new javax.swing.JLabel();
        nationalityText = new javax.swing.JLabel();
        nationality = new javax.swing.JLabel();
        accountTypeText = new javax.swing.JLabel();
        accountType = new javax.swing.JLabel();
        userNameText = new javax.swing.JLabel();
        userName1 = new javax.swing.JLabel();
        nationalIdText = new javax.swing.JLabel();
        nationalId = new javax.swing.JLabel();
        addressText = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jobText = new javax.swing.JLabel();
        job = new javax.swing.JLabel();
        postalCodeText = new javax.swing.JLabel();
        postalCode = new javax.swing.JLabel();
        accountNumberText = new javax.swing.JLabel();
        accountNumber = new javax.swing.JLabel();
        pinText = new javax.swing.JLabel();
        pinGet = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        martialStatusText = new javax.swing.JLabel();
        martialStatus = new javax.swing.JLabel();
        DecoPanel = new javax.swing.JPanel();
        backBtnText = new javax.swing.JLabel();
        editBtnText = new javax.swing.JLabel();
        infoIcon = new javax.swing.JLabel();
        normalAcc = new javax.swing.JLabel();
        editBtn = new javax.swing.JLabel();
        BackBtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InfoVIPWindowPage = new javax.swing.JPanel();
        InfoPanel1 = new javax.swing.JPanel();
        FirstName1 = new javax.swing.JLabel();
        firstNameText1 = new javax.swing.JLabel();
        secondName1 = new javax.swing.JLabel();
        secondNameText1 = new javax.swing.JLabel();
        nationalityText1 = new javax.swing.JLabel();
        nationality1 = new javax.swing.JLabel();
        accountTypeText1 = new javax.swing.JLabel();
        accountType1 = new javax.swing.JLabel();
        userNameText1 = new javax.swing.JLabel();
        userName2 = new javax.swing.JLabel();
        nationalIdText1 = new javax.swing.JLabel();
        nationalId1 = new javax.swing.JLabel();
        addressText1 = new javax.swing.JLabel();
        address1 = new javax.swing.JLabel();
        jobText1 = new javax.swing.JLabel();
        job1 = new javax.swing.JLabel();
        postalCodeText1 = new javax.swing.JLabel();
        postalCode1 = new javax.swing.JLabel();
        accountNumberText1 = new javax.swing.JLabel();
        accountNumber1 = new javax.swing.JLabel();
        pinText1 = new javax.swing.JLabel();
        pinGet1 = new javax.swing.JLabel();
        phoneNumberText1 = new javax.swing.JLabel();
        phoneNumber1 = new javax.swing.JLabel();
        martialStatusText1 = new javax.swing.JLabel();
        martialStatus1 = new javax.swing.JLabel();
        DecoPanel1 = new javax.swing.JPanel();
        backBtnText1 = new javax.swing.JLabel();
        editBtnText1 = new javax.swing.JLabel();
        infoIcon1 = new javax.swing.JLabel();
        normalAcc1 = new javax.swing.JLabel();
        editBtn1 = new javax.swing.JLabel();
        BackBtn1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        plankPanel = new javax.swing.JPanel();
        plankPanelBckgrd = new javax.swing.JLabel();
        creditLimitTxt = new javax.swing.JLabel();
        creditTakenTxt = new javax.swing.JLabel();
        requestLoanBtn = new javax.swing.JButton();
        loanRequesrStatText = new  JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(null);
        setUndecorated(true);

        homeMainPanel.setOpaque(false);
        homeMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarPanel.setOpaque(false);
        BarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miniButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miniButton1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Layer 14.png"));
        miniButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniButton1MouseClicked(evt);
            }
        });
        BarPanel.add(miniButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 30, 40));

        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Layer 13.png"));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        BarPanel.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 30, 40));

        upperBar.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\bar.png"));
        upperBar.setText("jLabel2");
        upperBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                upperBarMouseDragged(evt);
            }
        });
        upperBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                upperBarMousePressed(evt);
            }
        });
        BarPanel.add(upperBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 1190, 40));

        homeMainPanel.add(BarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 30));

        topPanel.setOpaque(false);
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeLogo.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Home logo.png")); // NOI18N
        topPanel.add(homeLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 60));

        topPanelLogOut.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        topPanelLogOut.setForeground(new java.awt.Color(125, 126, 131));
        topPanelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topPanelLogOut.setText("Log Out");
        topPanelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topPanelLogOutMouseClicked(evt);
            }
        });
        topPanel.add(topPanelLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 60, 40));

        userName.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        userName.setForeground(new java.awt.Color(125, 126, 131));
        userName.setHorizontalAlignment(SwingConstants.RIGHT);

        if(!SignInPage.isVIP)
            userName.setText(SignInPage.currentNormalClient.getFirstName() + " " + SignInPage.currentNormalClient.getLastName() + "  " ); // The right top Text


        if(SignInPage.isVIP)
            userName.setText(SignInPage.currentVIPClient.getFirstName() + " " + SignInPage.currentVIPClient.getLastName() + "  " ); // The right top Text


        userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameMouseClicked(evt);
            }
        });
        topPanel.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(932, 50, 190, 60));

        logOutIcon.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\log out icon.png")); // NOI18N
        topPanel.add(logOutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, 30, 40));

        if(!SignInPage.isVIP)
            userPicture.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\User icon.png")); // NOI18N

        if(SignInPage.isVIP)
            userPicture.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\User icon vip.png")); // NOI18N

        userPicture.setText("");
        userPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userPictureMouseClicked(evt);
            }
        });
        topPanel.add(userPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 50, 50, 60));

        welcomeMessage.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        welcomeMessage.setForeground(new java.awt.Color(125, 126, 131));

        if(!SignInPage.isVIP)
            welcomeMessage.setText("Welcome Back, " + SignInPage.currentNormalClient.getFirstName() +" ! "); // The welcome text

        if(SignInPage.isVIP)
            welcomeMessage.setText("Welcome Back, " + SignInPage.currentVIPClient.getFirstName() +" ! "); // The welcome text


        topPanel.add(welcomeMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, 40));

        topPanelBckGrnd.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\top.png")); // NOI18N
        topPanelBckGrnd.setText("");
        topPanel.add(topPanelBckGrnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 140));

        topPanelLogOut1.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        topPanelLogOut1.setForeground(new java.awt.Color(125, 126, 131));
        topPanelLogOut1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        topPanelLogOut1.setText("Log out");
        topPanel.add(topPanelLogOut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, -1, 60));

        homeMainPanel.add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 140));

        ctrlPanel.setOpaque(false);
        ctrlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setOpaque(false);
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuOffers.setOpaque(false);
        MenuOffers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuOffersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuOffersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuOffersMouseExited(evt);
            }
        });
        MenuOffers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuOffersIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuOffersIcon.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Offer Icon.png")); // NOI18N
        MenuOffers.add(MenuOffersIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 50));

        MenuOffersText.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        MenuOffersText.setForeground(new java.awt.Color(125, 126, 131));
        MenuOffersText.setText("Offers");
        MenuOffers.add(MenuOffersText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -10, 60, 70));

        MenuOffersBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\BtnHoverBck.png")); // NOI18N
        MenuOffers.add(MenuOffersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        Menu.add(MenuOffers, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 100, 170, 50));

        MenuHome.setOpaque(false);
        MenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuHomeMouseExited(evt);
            }
        });
        MenuHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuHomeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuHomeIcon.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Home Icon.png")); // NOI18N
        MenuHome.add(MenuHomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 50));

        MenuHomeText.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        MenuHomeText.setForeground(new java.awt.Color(125, 126, 131));
        MenuHomeText.setText("Home");
        MenuHome.add(MenuHomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -10, 60, 70));

        MenuHomeBtn.setIcon(new javax.swing.ImageIcon("BankSystemOOP\\src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\BtnHoverBck.png")); // NOI18N
        MenuHomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHomeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuHomeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuHomeBtnMouseExited(evt);
            }
        });
        MenuHome.add(MenuHomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        Menu.add(MenuHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, 170, 50));

        MenuLable.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        MenuLable.setForeground(new java.awt.Color(125, 126, 131));
        MenuLable.setText("Menu");
        Menu.add(MenuLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, -1, -1, 30));

        ctrlPanel.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, -1, -1));

        Account.setOpaque(false);
        Account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccountLable.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        AccountLable.setForeground(new java.awt.Color(125, 126, 131));
        AccountLable.setText("Account");
        Account.add(AccountLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 6, -1, -1));

        AccountMyProfile.setOpaque(false);
        AccountMyProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountMyProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccountMyProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccountMyProfileMouseExited(evt);
            }
        });
        AccountMyProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccountMyProfileIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountMyProfileIcon.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\prof icon.png")); // NOI18N
        AccountMyProfile.add(AccountMyProfileIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 0, 40, 50));

        AccountMyProfileText.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        AccountMyProfileText.setForeground(new java.awt.Color(125, 126, 131));
        AccountMyProfileText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountMyProfileText.setText("My Profile");
        AccountMyProfile.add(AccountMyProfileText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -10, 80, 70));

        AccountMyProfileBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\BtnHoverBck.png")); // NOI18N
        AccountMyProfile.add(AccountMyProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        Account.add(AccountMyProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, 170, 50));

        AccountMessaegs.setOpaque(false);
        AccountMessaegs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountMessaegsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccountMessaegsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccountMessaegsMouseExited(evt);
            }
        });
        AccountMessaegs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccountMessaegeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountMessaegeIcon.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\mess icon.png")); // NOI18N
        AccountMessaegs.add(AccountMessaegeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 0, 40, 50));

        AccountMessaegsText.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        AccountMessaegsText.setForeground(new java.awt.Color(125, 126, 131));
        AccountMessaegsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountMessaegsText.setText("Messages");
        AccountMessaegs.add(AccountMessaegsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -10, 100, 70));

        AccountMessagesBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\BtnHoverBck.png")); // NOI18N
        AccountMessaegs.add(AccountMessagesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        Account.add(AccountMessaegs, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 100, 170, 50));

        AccountNotifciactions.setOpaque(false);
        AccountNotifciactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountNotifciactionsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccountNotifciactionsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccountNotifciactionsMouseExited(evt);
            }
        });
        AccountNotifciactions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccountNotifciactionsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountNotifciactionsIcon.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\notifcation icon.png")); // NOI18N
        AccountNotifciactions.add(AccountNotifciactionsIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 0, 40, 50));

        AccountNotifciactionsText.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        AccountNotifciactionsText.setForeground(new java.awt.Color(125, 126, 131));
        AccountNotifciactionsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountNotifciactionsText.setText("Notifications");
        AccountNotifciactions.add(AccountNotifciactionsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -10, 120, 70));

        AccountNotifciactionsBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\BtnHoverBck.png")); // NOI18N
        AccountNotifciactions.add(AccountNotifciactionsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        Account.add(AccountNotifciactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, 170, 50));

        AccountLogOut.setOpaque(false);
        AccountLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccountLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccountLogOutMouseExited(evt);
            }
        });
        AccountLogOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccountLogOutIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountLogOutIcon.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Log out icon.png")); // NOI18N
        AccountLogOut.add(AccountLogOutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 0, 40, 50));

        AccountLogOutText.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        AccountLogOutText.setForeground(new java.awt.Color(125, 126, 131));
        AccountLogOutText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountLogOutText.setText("Log Out");
        AccountLogOut.add(AccountLogOutText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -10, 80, 70));

        AccountLogOutBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\BtnHoverBck.png")); // NOI18N
        AccountLogOut.add(AccountLogOutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        Account.add(AccountLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 200, 170, 50));

        ctrlPanel.add(Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 190, 450));

        ctrlPanelBckGrnd.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Left.png")); // NOI18N
        ctrlPanel.add(ctrlPanelBckGrnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 230, 910));

        homeMainPanel.add(ctrlPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 900));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePanel.setOpaque(false);
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashborad.setOpaque(false);
        Dashborad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DashboradLable1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        DashboradLable1.setForeground(new java.awt.Color(125, 126, 131));
        DashboradLable1.setText("Dashborad");
        Dashborad.add(DashboradLable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, -7, 110, 40));

        TransferBlock.setOpaque(false);
        TransferBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransferBlockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransferBlockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TransferBlockMouseExited(evt);
            }
        });
        TransferBlock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransferBlockText.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        TransferBlockText.setForeground(new java.awt.Color(125, 126, 131));

        if(!SignInPage.isVIP)
            TransferBlockText.setText(" $" + SignInPage.currentNormalClient.getBalance());


        if(SignInPage.isVIP)
            TransferBlockText.setText(" $" + SignInPage.currentVIPClient.getBalance());

        TransferBlock.add(TransferBlockText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, 30));

        TransferBlockBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\BalanceSheet.png")); // NOI18N
        TransferBlock.add(TransferBlockBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 240));

        Dashborad.add(TransferBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, 350, 270));

        CreditCardBlock.setOpaque(false);
        CreditCardBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreditCardBlockMouseClicked(evt);
            }
        });
        CreditCardBlock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InfoBlockText.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        InfoBlockText.setForeground(new java.awt.Color(31, 33, 40));

        if(!SignInPage.isVIP)
            InfoBlockText.setText(" $" + SignInPage.currentNormalClient.getLastWithdraw());


        if(SignInPage.isVIP)
            InfoBlockText.setText(" $" + SignInPage.currentVIPClient.getLastWithdraw());

        CreditCardBlock.add(InfoBlockText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, 30));

        InfoBlockBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\CreditCardSheet.png")); // NOI18N
        CreditCardBlock.add(InfoBlockBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 240));

        Dashborad.add(CreditCardBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 350, 270));

        DepositBlock.setOpaque(false);
        DepositBlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBlockMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DepositBlockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DepositBlockMouseExited(evt);
            }
        });
        DepositBlock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DepositBlockText.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        DepositBlockText.setForeground(new java.awt.Color(125, 126, 131));

        if(!SignInPage.isVIP)
            DepositBlockText.setText(" $" + SignInPage.currentNormalClient.getLastDeposit()); // last desposit text setter


        if(SignInPage.isVIP)
            DepositBlockText.setText(" $" + SignInPage.currentVIPClient.getLastDeposit()); // last desposit text setter

        DepositBlock.add(DepositBlockText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 130, 30));

        DepositBlockBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\DepositSheet.png")); // NOI18N
        DepositBlock.add(DepositBlockBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 240));
        Dashborad.add(DepositBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 340, 270));
        HomePanel.add(Dashborad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 960, 280));

        Services.setOpaque(false);
        Services.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ServiceLable.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        ServiceLable.setForeground(new java.awt.Color(125, 126, 131));
        ServiceLable.setText("Services");
        Services.add(ServiceLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, -7, 110, 40));

        LoansBlock.setOpaque(false);
        LoansBlock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoanClacBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\loans.png")); // NOI18N
        LoanClacBtn.setText("jLabel1");
        LoanClacBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoanClacBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoanClacBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoanClacBtnMouseExited(evt);
            }
        });
        LoansBlock.add(LoanClacBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 280, 240));
        Services.add(LoansBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 200));
        SupportBlock.setOpaque(false);
        SupportBlock.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SupportBlockBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\SupportSheet.png")); // NOI18N
        SupportBlockBtn.setText("jLabel1");
        SupportBlockBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupportBlockBtnMouseClicked(evt);
            }
        });
        SupportBlock.add(SupportBlockBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 280, 240));

        Services.add(SupportBlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 290, 200));

        HomePanel.add(Services, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 560, 340));

        LatestActivity.setOpaque(false);
        LatestActivity.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LatestActivitySeeMoreText.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        LatestActivitySeeMoreText.setForeground(new java.awt.Color(255, 255, 255));
        LatestActivitySeeMoreText.setText("See More");
        LatestActivity.add(LatestActivitySeeMoreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 70, 20));

        LatestActivtyLable.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        LatestActivtyLable.setForeground(new java.awt.Color(125, 126, 131));
        LatestActivtyLable.setText("Latest Activity");
        LatestActivity.add(LatestActivtyLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 40));

        LatestActivitySeeMoreBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\seeMore btn.png")); // NOI18N
        LatestActivitySeeMoreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LatestActivitySeeMoreBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LatestActivitySeeMoreBtnMouseExited(evt);
            }
        });
        LatestActivity.add(LatestActivitySeeMoreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 120, 40));

        HomePanel.add(LatestActivity, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 410, 450));

        creditLimitTxt.setFont(new java.awt.Font("Poppins SemiBold", 0, 21)); // NOI18N
        creditLimitTxt.setForeground(new Color(0x9195ef));

        if(!SignInPage.isVIP)
            creditLimitTxt.setText("<html>Credit Limit: <br>" + SignInPage.currentNormalClient.getCreditLimit() + "</html>");

        if(SignInPage.isVIP)
            creditLimitTxt.setText("<html>Credit Limit: <br>" + SignInPage.currentVIPClient.getCreditLimit() + "</html>");

        HomePanel.add(creditLimitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 200, -1));

        creditTakenTxt.setFont(new java.awt.Font("Poppins SemiBold", 0, 21)); // NOI18N

        if(!SignInPage.isVIP){
            creditTakenTxt.setText("<html>Credit Taken: <br>" + SignInPage.currentNormalClient.getCreditTaken() + "</html>");
        }

        if(SignInPage.isVIP){
            creditTakenTxt.setText("<html>Credit Taken: <br>" + SignInPage.currentVIPClient.getCreditTaken() + "</html>");
        }

        creditTakenTxt.setForeground(new Color(0x9195ef));
        HomePanel.add(creditTakenTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 250, -1));

        mainPanelBckGrnd.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\main.png")); // NOI18N
        HomePanel.add(mainPanelBckGrnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 910));

        mainPanel.add(HomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 910));

        LoansPanel.setOpaque(false);
        LoansPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestLoanBtn.setBackground(new java.awt.Color(36, 38, 45));
        requestLoanBtn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        requestLoanBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestLoanBtn.setText("Request Loan");
        requestLoanBtn.setFocusable(false);
        requestLoanBtn.setBorder(null);
        requestLoanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestLoanBtnActionPerformed(evt);
            }
        });
        LoansPanel.add(requestLoanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 730, 250, 40));

        loanRequesrStatText.setBackground(new java.awt.Color(36, 38, 45));
        loanRequesrStatText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        loanRequesrStatText.setForeground(new java.awt.Color(255, 255, 255));
        loanRequesrStatText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        // loan request VIP Normal
        if(!SignInPage.isVIP){
            if (SignInPage.currentNormalClient.isLoanRequest())
                loanRequesrStatText.setText("<html> Loan Request : ."  + "<span style=\"color:green;\"> Requested </span> </html>");
            if (!SignInPage.currentNormalClient.isLoanRequest())
                loanRequesrStatText.setText("Loan Request: No request");
        }
        // loan request VIP
        if(SignInPage.isVIP){
            if (SignInPage.currentVIPClient.isLoanRequest())
                loanRequesrStatText.setText("<html> Loan Request : ."  + "<span style=\"color:green;\"> Requested </span> </html>");
            if (!SignInPage.currentVIPClient.isLoanRequest())
                loanRequesrStatText.setText("Loan Request: No request");
        }

        loanRequesrStatText.setOpaque(true);
        LoansPanel.add(loanRequesrStatText, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 730, 250, 40));


        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Loans");
        LoansPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 160, 60));

        LoanCalcBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Laon Clc btn.png")); // NOI18N
        LoanCalcBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoanCalcBtnMouseClicked(evt);
            }
        });
        LoansPanel.add(LoanCalcBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 330, 250));

        LoanInfoBtn1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\Loan info btn.png")); // NOI18N
        LoanInfoBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoanInfoBtn1MouseClicked(evt);
            }
        });
        LoansPanel.add(LoanInfoBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 340, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\leftpaneFUll.png")); // NOI18N
        jLabel1.setText("jLabel1");
        LoansPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 910));

        mainPanel.add(LoansPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 910));

        ContactPanel.setOpaque(false);
        ContactPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atmBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\ATMunHov.png")); // NOI18N
        atmBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atmBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atmBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atmBtnMouseExited(evt);
            }
        });
        ContactPanel.add(atmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 660, 860, 200));

        branchesBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\branchesUnHoverd.png")); // NOI18N
        branchesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branchesBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                branchesBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                branchesBtnMouseExited(evt);
            }
        });
        ContactPanel.add(branchesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 860, 200));

        CallUsBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\CallusUnhovers.png")); // NOI18N
        CallUsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CallUsBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CallUsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CallUsBtnMouseExited(evt);
            }
        });
        ContactPanel.add(CallUsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 860, 210));

        ControlBckGrd.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\leftpaneFUll.png")); // NOI18N
        ControlBckGrd.setText("jLabel3");
        ContactPanel.add(ControlBckGrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 910));

        mainPanel.add(ContactPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 910));

        notificationsPanel.setOpaque(false);
        notificationsPanel.setLayout(null);

        AccountNotificationsText.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        AccountNotificationsText.setForeground(new java.awt.Color(255, 255, 255));
        AccountNotificationsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountNotificationsText.setText("Currently you have no notifications ...");
        notificationsPanel.add(AccountNotificationsText);
        AccountNotificationsText.setBounds(0, 0, 970, 690);

        mainPanel.add(notificationsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 970, 690));

        offersPanel.setOpaque(false);
        offersPanel.setLayout(null);

        offersPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        offersPhoto.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\OFFERS.png")); // NOI18N
        offersPanel.add(offersPhoto);
        offersPhoto.setBounds(0, 0, 970, 690);

        mainPanel.add(offersPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 970, 690));

        messagesPanel.setOpaque(false);
        messagesPanel.setLayout(null);

        AccountMessagesText.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        AccountMessagesText.setForeground(new java.awt.Color(255, 255, 255));
        AccountMessagesText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccountMessagesText.setText("Currently you have no messages ...");
        messagesPanel.add(AccountMessagesText);
        AccountMessagesText.setBounds(0, 0, 970, 690);

        mainPanel.add(messagesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 970, 690));

        InfoNoramlWindowPage.setOpaque(false);
        InfoNoramlWindowPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InfoPanel.setOpaque(false);
        InfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstName.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        FirstName.setForeground(new java.awt.Color(125, 126, 131));

        if(!SignInPage.isVIP)
            FirstName.setText(SignInPage.currentNormalClient.getFirstName());


        if(SignInPage.isVIP)
            FirstName.setText(SignInPage.currentVIPClient.getFirstName());


        InfoPanel.add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, -1));

        firstNameText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        firstNameText.setForeground(new java.awt.Color(255, 255, 255));
        firstNameText.setText("First Name:");
        InfoPanel.add(firstNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, -1));

        secondName.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        secondName.setForeground(new java.awt.Color(125, 126, 131));

        if(!SignInPage.isVIP)
            secondName.setText(SignInPage.currentNormalClient.getLastName());


        if(SignInPage.isVIP)
            secondName.setText(SignInPage.currentVIPClient.getLastName());


        InfoPanel.add(secondName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 130, -1));

        secondNameText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        secondNameText.setForeground(new java.awt.Color(255, 255, 255));
        secondNameText.setText("Second Name:");
        InfoPanel.add(secondNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, -1));

        nationalityText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        nationalityText.setForeground(new java.awt.Color(255, 255, 255));
        nationalityText.setText("Nationality:");
        InfoPanel.add(nationalityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, -1));

        nationality.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        nationality.setForeground(new java.awt.Color(125, 126, 131));

        if(!SignInPage.isVIP)
            nationality.setText(SignInPage.currentNormalClient.getNationality());

        if(SignInPage.isVIP)
            nationality.setText(SignInPage.currentVIPClient.getNationality());



        InfoPanel.add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 130, -1));

        accountTypeText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        accountTypeText.setForeground(new java.awt.Color(255, 255, 255));
        accountTypeText.setText("Account Type:");
        InfoPanel.add(accountTypeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, -1));

        accountType.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        accountType.setForeground(new java.awt.Color(125, 126, 131));

        if(!SignInPage.isVIP)
            accountType.setText(SignInPage.currentNormalClient.getAccountType());


        if(SignInPage.isVIP)
            accountType.setText(SignInPage.currentVIPClient.getAccountType());

        InfoPanel.add(accountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 100, -1));

        userNameText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        userNameText.setForeground(new java.awt.Color(255, 255, 255));
        userNameText.setText("Username:");
        InfoPanel.add(userNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, -1));

        userName1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        userName1.setForeground(new java.awt.Color(125, 126, 131));

        if(!SignInPage.isVIP)
            userName1.setText(SignInPage.currentNormalClient.getUserName());

        if(SignInPage.isVIP)
            userName1.setText(SignInPage.currentVIPClient.getUserName());


        InfoPanel.add(userName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 100, -1));

        nationalIdText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        nationalIdText.setForeground(new java.awt.Color(255, 255, 255));
        nationalIdText.setText("National ID:");
        InfoPanel.add(nationalIdText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, -1));

        nationalId.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        nationalId.setForeground(new java.awt.Color(125, 126, 131));


        if(!SignInPage.isVIP)
            nationalId.setText(SignInPage.currentNormalClient.getNationalID());

        if(SignInPage.isVIP)
            nationalId.setText(SignInPage.currentVIPClient.getNationalID());

        InfoPanel.add(nationalId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 140, -1));

        addressText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        addressText.setForeground(new java.awt.Color(255, 255, 255));
        addressText.setText("Address:");
        InfoPanel.add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, -1));

        address.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(125, 126, 131));


        if(!SignInPage.isVIP)
            address.setText(SignInPage.currentNormalClient.getAddress());

        if(SignInPage.isVIP)
            address.setText(SignInPage.currentVIPClient.getAddress());

        InfoPanel.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 120, -1));

        jobText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jobText.setForeground(new java.awt.Color(255, 255, 255));
        jobText.setText("Job:");
        InfoPanel.add(jobText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, -1));

        job.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        job.setForeground(new java.awt.Color(125, 126, 131));


        if(!SignInPage.isVIP)
            job.setText(SignInPage.currentNormalClient.getJob());

        if(SignInPage.isVIP)
            job.setText(SignInPage.currentVIPClient.getJob());

        InfoPanel.add(job, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 120, -1));

        postalCodeText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        postalCodeText.setForeground(new java.awt.Color(255, 255, 255));
        postalCodeText.setText("Postal Code:");
        InfoPanel.add(postalCodeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 110, -1));

        postalCode.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        postalCode.setForeground(new java.awt.Color(125, 126, 131));


        if(!SignInPage.isVIP)
            postalCode.setText(SignInPage.currentNormalClient.getPostalCode());


        if(SignInPage.isVIP)
            postalCode.setText(SignInPage.currentVIPClient.getPostalCode());

        InfoPanel.add(postalCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 120, -1));

        accountNumberText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        accountNumberText.setForeground(new java.awt.Color(255, 255, 255));
        accountNumberText.setText("Account Number:");
        InfoPanel.add(accountNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 140, -1));

        accountNumber.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        accountNumber.setForeground(new java.awt.Color(125, 126, 131));


        if(!SignInPage.isVIP)
            accountNumber.setText(SignInPage.currentNormalClient.getAccountNumber()+"");

        if(SignInPage.isVIP)
            accountNumber.setText(SignInPage.currentVIPClient.getAccountNumber()+"");

        InfoPanel.add(accountNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 120, -1));

        pinText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        pinText.setForeground(new java.awt.Color(255, 255, 255));
        pinText.setText("Pin:");
        InfoPanel.add(pinText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 140, -1));

        pinGet.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        pinGet.setForeground(new java.awt.Color(125, 126, 131));


        if(!SignInPage.isVIP)
            pinGet.setText(SignInPage.currentNormalClient.getPin());


        if(SignInPage.isVIP)
            pinGet.setText(SignInPage.currentVIPClient.getPin());

        InfoPanel.add(pinGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 120, -1));

        phoneNumberText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        phoneNumberText.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberText.setText("Phone Number:");
        InfoPanel.add(phoneNumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 140, -1));

        phoneNumber.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(125, 126, 131));


        if(!SignInPage.isVIP)
            phoneNumber.setText(SignInPage.currentNormalClient.getPhoneNumber());


        if(SignInPage.isVIP)
            phoneNumber.setText(SignInPage.currentVIPClient.getPhoneNumber());

        InfoPanel.add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 120, -1));

        martialStatusText.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        martialStatusText.setForeground(new java.awt.Color(255, 255, 255));
        martialStatusText.setText("Martial Status:");
        InfoPanel.add(martialStatusText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 140, -1));

        martialStatus.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        martialStatus.setForeground(new java.awt.Color(125, 126, 131));


        if(!SignInPage.isVIP)
            martialStatus.setText(SignInPage.currentNormalClient.getMaritalStatus());

        if(SignInPage.isVIP)
            martialStatus.setText(SignInPage.currentVIPClient.getMaritalStatus());

        InfoPanel.add(martialStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 120, -1));

        InfoNoramlWindowPage.add(InfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 510, 720));

        DecoPanel.setOpaque(false);
        DecoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtnText.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        backBtnText.setForeground(new java.awt.Color(255, 255, 255));
        backBtnText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backBtnText.setText("Back");
        backBtnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBtnTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBtnTextMouseExited(evt);
            }
        });
        DecoPanel.add(backBtnText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 448, 230, 30));

        editBtnText.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        editBtnText.setForeground(new java.awt.Color(255, 255, 255));
        editBtnText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editBtnText.setText("Edit Info");
        editBtnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editBtnTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editBtnTextMouseExited(evt);
            }
        });
        DecoPanel.add(editBtnText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 368, 230, 30));

        infoIcon.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\NoramlIcon.png")); // NOI18N
        DecoPanel.add(infoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 220, 230));

        normalAcc.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        normalAcc.setForeground(new java.awt.Color(255, 255, 255));
        normalAcc.setText("Normal Account");
        DecoPanel.add(normalAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        editBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\NroamlBTN.png")); // NOI18N
        DecoPanel.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 300, 90));

        BackBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\NroamlBTN.png")); // NOI18N
        DecoPanel.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 300, 90));

        InfoNoramlWindowPage.add(DecoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 710));

        jLabel3.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\frameNull.png")); // NOI18N
        InfoNoramlWindowPage.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 740));

        mainPanel.add(InfoNoramlWindowPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        InfoVIPWindowPage.setOpaque(false);
        InfoVIPWindowPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InfoPanel1.setOpaque(false);
        InfoPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstName1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        FirstName1.setForeground(new java.awt.Color(125, 126, 131));
        if (!SignInPage.isVIP)
            FirstName1.setText(SignInPage.currentNormalClient.getFirstName());

        if (SignInPage.isVIP)
            FirstName1.setText(SignInPage.currentVIPClient.getFirstName());

        InfoPanel1.add(FirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 130, -1));

        firstNameText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        firstNameText1.setForeground(new java.awt.Color(255, 255, 255));
        firstNameText1.setText("First Name:");
        InfoPanel1.add(firstNameText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, -1));

        secondName1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        secondName1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            secondName1.setText(SignInPage.currentNormalClient.getLastName());
        if (SignInPage.isVIP)
            secondName1.setText(SignInPage.currentVIPClient.getLastName());

        InfoPanel1.add(secondName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 130, -1));

        secondNameText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        secondNameText1.setForeground(new java.awt.Color(255, 255, 255));
        secondNameText1.setText("Second Name:");
        InfoPanel1.add(secondNameText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, -1));

        nationalityText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        nationalityText1.setForeground(new java.awt.Color(255, 255, 255));
        nationalityText1.setText("Nationality:");
        InfoPanel1.add(nationalityText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, -1));

        nationality1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        nationality1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            nationality1.setText(SignInPage.currentNormalClient.getNationality());

        if (SignInPage.isVIP)
            nationality1.setText(SignInPage.currentVIPClient.getNationality());

        InfoPanel1.add(nationality1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 130, -1));

        accountTypeText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        accountTypeText1.setForeground(new java.awt.Color(255, 255, 255));
        accountTypeText1.setText("Account Type:");
        InfoPanel1.add(accountTypeText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 110, -1));

        accountType1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        accountType1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            accountType1.setText(SignInPage.currentNormalClient.getAccountType());
        if (SignInPage.isVIP)
            accountType1.setText(SignInPage.currentVIPClient.getAccountType());

        InfoPanel1.add(accountType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 100, -1));

        userNameText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        userNameText1.setForeground(new java.awt.Color(255, 255, 255));
        userNameText1.setText("Username:");
        InfoPanel1.add(userNameText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 110, -1));

        userName2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        userName2.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            userName2.setText(SignInPage.currentNormalClient.getUserName());
        if (SignInPage.isVIP)
            userName2.setText(SignInPage.currentVIPClient.getUserName());

        InfoPanel1.add(userName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 100, -1));

        nationalIdText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        nationalIdText1.setForeground(new java.awt.Color(255, 255, 255));
        nationalIdText1.setText("National ID:");
        InfoPanel1.add(nationalIdText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, -1));

        nationalId1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        nationalId1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            nationalId1.setText(SignInPage.currentNormalClient.getNationalID());

        if (SignInPage.isVIP)
            nationalId1.setText(SignInPage.currentVIPClient.getNationalID());

        InfoPanel1.add(nationalId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 140, -1));

        addressText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        addressText1.setForeground(new java.awt.Color(255, 255, 255));
        addressText1.setText("Address:");
        InfoPanel1.add(addressText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, -1));

        address1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        address1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            address1.setText(SignInPage.currentNormalClient.getAddress());

        if (SignInPage.isVIP)
            address1.setText(SignInPage.currentVIPClient.getAddress());

        InfoPanel1.add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 120, -1));

        jobText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jobText1.setForeground(new java.awt.Color(255, 255, 255));
        jobText1.setText("Job:");
        InfoPanel1.add(jobText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, -1));

        job1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        job1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            job1.setText(SignInPage.currentNormalClient.getJob());
        if (SignInPage.isVIP)
            job1.setText(SignInPage.currentVIPClient.getJob());

        InfoPanel1.add(job1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 120, -1));

        postalCodeText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        postalCodeText1.setForeground(new java.awt.Color(255, 255, 255));
        postalCodeText1.setText("Postal Code:");
        InfoPanel1.add(postalCodeText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 110, -1));

        postalCode1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        postalCode1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            postalCode1.setText(SignInPage.currentNormalClient.getPostalCode());
        if (SignInPage.isVIP)
            postalCode1.setText(SignInPage.currentVIPClient.getPostalCode());

        InfoPanel1.add(postalCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 120, -1));

        accountNumberText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        accountNumberText1.setForeground(new java.awt.Color(255, 255, 255));
        accountNumberText1.setText("Account Number:");
        InfoPanel1.add(accountNumberText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 140, -1));

        accountNumber1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        accountNumber1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            accountNumber1.setText(Long.toString(SignInPage.currentNormalClient.getAccountNumber()));

        if (SignInPage.isVIP)
            accountNumber1.setText(Long.toString(SignInPage.currentVIPClient.getAccountNumber()));

        InfoPanel1.add(accountNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, 120, -1));

        pinText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        pinText1.setForeground(new java.awt.Color(255, 255, 255));
        pinText1.setText("Pin:");
        InfoPanel1.add(pinText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 140, -1));

        pinGet1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        pinGet1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            pinGet1.setText(SignInPage.currentNormalClient.getPin());
        if (SignInPage.isVIP)
            pinGet1.setText(SignInPage.currentVIPClient.getPin());

        InfoPanel1.add(pinGet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 120, -1));

        phoneNumberText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        phoneNumberText1.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberText1.setText("Phone Number:");
        InfoPanel1.add(phoneNumberText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 140, -1));

        phoneNumber1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        phoneNumber1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            phoneNumber1.setText(SignInPage.currentNormalClient.getPhoneNumber());
        if (SignInPage.isVIP)
            phoneNumber1.setText(SignInPage.currentVIPClient.getPhoneNumber());

        InfoPanel1.add(phoneNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 570, 120, -1));

        martialStatusText1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        martialStatusText1.setForeground(new java.awt.Color(255, 255, 255));
        martialStatusText1.setText("Martial Status:");
        InfoPanel1.add(martialStatusText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 140, -1));

        martialStatus1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        martialStatus1.setForeground(new java.awt.Color(125, 126, 131));

        if (!SignInPage.isVIP)
            martialStatus1.setText(SignInPage.currentNormalClient.getMaritalStatus());

        if (SignInPage.isVIP)
            martialStatus1.setText(SignInPage.currentVIPClient.getMaritalStatus());

        InfoPanel1.add(martialStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 120, -1));

        InfoVIPWindowPage.add(InfoPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 510, 720));

        DecoPanel1.setOpaque(false);
        DecoPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtnText1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        backBtnText1.setForeground(new java.awt.Color(31, 33, 40));
        backBtnText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backBtnText1.setText("Back");
        backBtnText1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnText1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBtnText1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBtnText1MouseExited(evt);
            }

        });
        DecoPanel1.add(backBtnText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 448, 230, 30));

        editBtnText1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        editBtnText1.setForeground(new java.awt.Color(31, 33, 40));
        editBtnText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editBtnText1.setText("Edit Info");
        editBtnText1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnText1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editBtnText1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editBtnText1MouseExited(evt);
            }
        });
        DecoPanel1.add(editBtnText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 368, 230, 30));

        infoIcon1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\GOLDICON.png")); // NOI18N
        DecoPanel1.add(infoIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 220, 230));

        normalAcc1.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        normalAcc1.setForeground(new java.awt.Color(255, 255, 255));
        normalAcc1.setText("VIP Account");
        normalAcc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DecoPanel1.add(normalAcc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        editBtn1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\GOLDBTN.png")); // NOI18N
        DecoPanel1.add(editBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 300, 90));

        BackBtn1.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\GOLDBTN.png")); // NOI18N
        DecoPanel1.add(BackBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 300, 90));

        InfoVIPWindowPage.add(DecoPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 710));

        jLabel4.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\frameNull.png")); // NOI18N
        InfoVIPWindowPage.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 740));

        mainPanel.add(InfoVIPWindowPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        plankPanel.setOpaque(false);
        plankPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plankPanelBckgrd.setIcon(new javax.swing.ImageIcon("src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\leftpaneFUll.png")); // NOI18N
        plankPanelBckgrd.setText("jLabel3");
        plankPanel.add(plankPanelBckgrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 910));

        mainPanel.add(plankPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 910));

        homeMainPanel.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 910));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }



    private void editBtnText1MouseClicked(MouseEvent evt) {
        new EditInfoWindow(SignInPage.currentVIPClient);
    }

    private void backBtnText1MouseClicked(MouseEvent evt) {
        HomeReturn();
    }

    private void requestLoanBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int confirmLoanReq = JOptionPane.showConfirmDialog(this,"Are you sure you want to request a loan?", "Confrim your Choice",JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirmLoanReq == 0) {

                if(!SignInPage.isVIP){
                    if (SignInPage.currentNormalClient.getCreditTaken() == SignInPage.currentNormalClient.getCreditLimit())
                        JOptionPane.showMessageDialog(this, "You Cannot Request a Loan", "Credit Limit Exceeded", JOptionPane.ERROR_MESSAGE);
                    else if (SignInPage.currentNormalClient.getLoanRequest())
                        JOptionPane.showMessageDialog(this, "You Cannot Request a Loan", "You Already Requested", JOptionPane.ERROR_MESSAGE);

                    else{
                    SignInPage.currentNormalClient.setLoanRequest(true);
                    loanRequesrStatText.setText("<html> Loan Request : ."  + "<span style=\"color:green;\"> Requested </span> </html>");
                    JOptionPane.showMessageDialog(this, "Loan Requested", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
                }
                }

                if(SignInPage.isVIP){
                    if (SignInPage.currentVIPClient.getCreditTaken() == SignInPage.currentVIPClient.getCreditLimit())
                        JOptionPane.showMessageDialog(this, "You Cannot Request a Loan", "Credit Limit Exceeded", JOptionPane.ERROR_MESSAGE);
                    else if (SignInPage.currentVIPClient.getLoanRequest())
                        JOptionPane.showMessageDialog(this, "You Cannot Request a Loan", "You Already Requested", JOptionPane.ERROR_MESSAGE);

                    else{
                        SignInPage.currentVIPClient.setLoanRequest(true);
                        loanRequesrStatText.setText("<html> Loan Request : ."  + "<span style=\"color:green;\"> Requested </span> </html>");
                        JOptionPane.showMessageDialog(this, "Loan Requested", "successful Transaction", JOptionPane.INFORMATION_MESSAGE);
                    }
                }

            }
    }

    // the next method closes the prorgram when red is clicked
    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        int a=JOptionPane.showConfirmDialog(this,"Are you sure yo want to close the program?");
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
          }
    }

// the next method minmize the prorgram when yellow is clicked
    private void miniButton1MouseClicked(java.awt.event.MouseEvent evt) {
       this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniButton1MouseClicked

    // the next two methods implemnets draging to the undecorated window
    private void upperBarMouseDragged(java.awt.event.MouseEvent evt) {
       int CordX = evt.getXOnScreen();
       int CordY = evt.getYOnScreen();

       this.setLocation(CordX - mousePX ,CordY - mousePY);

    }
    private void upperBarMousePressed(java.awt.event.MouseEvent evt) {
        mousePX = evt.getX();
        mousePY = evt.getY();

    }

    // next methods are resposible for button hovering
    private void MenuOffersMouseEntered(java.awt.event.MouseEvent evt) {
        MenuOffersBtn.setIcon(BtnUnHoverd);
        MenuOffersText.setForeground(Color.WHITE);
    }
    private void MenuOffersMouseExited(java.awt.event.MouseEvent evt) {
        MenuOffersBtn.setIcon(BtnHoverd);
        MenuOffersText.setForeground(new Color(125,126,131));
    }
    private void MenuHomeMouseEntered(java.awt.event.MouseEvent evt) {
        MenuHomeBtn.setIcon(BtnUnHoverd);
        MenuHomeText.setForeground(Color.WHITE);
    }
    private void MenuHomeMouseExited(java.awt.event.MouseEvent evt) {
        MenuHomeBtn.setIcon(BtnHoverd);
        MenuHomeText.setForeground(new Color(125,126,131));
    }
    private void AccountMessaegsMouseEntered(java.awt.event.MouseEvent evt) {
        AccountMessagesBtn.setIcon(BtnUnHoverd);
        AccountMessaegsText.setForeground(Color.WHITE);
    }
    private void AccountMessaegsMouseExited(java.awt.event.MouseEvent evt) {
        AccountMessagesBtn.setIcon(BtnHoverd);
        AccountMessaegsText.setForeground(new Color(125,126,131));
    }
    private void AccountMyProfileMouseEntered(java.awt.event.MouseEvent evt) {
        AccountMyProfileBtn.setIcon(BtnUnHoverd);
        AccountMyProfileText.setForeground(Color.WHITE);
    }
    private void AccountMyProfileMouseExited(java.awt.event.MouseEvent evt) {
        AccountMyProfileBtn.setIcon(BtnHoverd);
        AccountMyProfileText.setForeground(new Color(125,126,131));
    }
    private void AccountNotifciactionsMouseEntered(java.awt.event.MouseEvent evt) {
        AccountNotifciactionsBtn.setIcon(BtnUnHoverd);
        AccountNotifciactionsText.setForeground(Color.WHITE);
    }
    private void AccountNotifciactionsMouseExited(java.awt.event.MouseEvent evt) {
        AccountNotifciactionsBtn.setIcon(BtnHoverd);
        AccountNotifciactionsText.setForeground(new Color(125,126,131));
    }
    private void AccountLogOutMouseEntered(java.awt.event.MouseEvent evt) {
        AccountLogOutBtn.setIcon(BtnUnHoverd);
        AccountLogOutText.setForeground(Color.WHITE);
    }
    private void AccountLogOutMouseExited(java.awt.event.MouseEvent evt) {
        AccountLogOutBtn.setIcon(BtnHoverd);
        AccountLogOutText.setForeground(new Color(125,126,131));
    }
    private void TransferBlockMouseEntered(java.awt.event.MouseEvent evt) {
        TransferBlockBtn.setIcon(BalanceHovered);
        TransferBlockText.setForeground(new Color(131,149,226));
    }
    private void TransferBlockMouseExited(java.awt.event.MouseEvent evt) {
        TransferBlockBtn.setIcon(BalanceUnHovered);
        TransferBlockText.setForeground(new Color(125,126,131));
    }
    private void DepositBlockMouseEntered(java.awt.event.MouseEvent evt) {
        DepositBlockBtn.setIcon(DepositHovered);
        DepositBlockText.setForeground(new Color(131,149,226));
    }
    private void DepositBlockMouseExited(java.awt.event.MouseEvent evt) {
        DepositBlockBtn.setIcon(DepositUnHovered);
        DepositBlockText.setForeground(new Color(125,126,131));
    }
    private void LoanClacBtnMouseEntered(java.awt.event.MouseEvent evt) {
        LoanClacBtn.setIcon(LoanHovered);

    }
    private void LoanClacBtnMouseExited(java.awt.event.MouseEvent evt) {
        LoanClacBtn.setIcon(LoanUnHovered);
    }
    private void LatestActivitySeeMoreBtnMouseEntered(java.awt.event.MouseEvent evt) {
        LatestActivitySeeMoreText.setForeground(new Color(131,149,226));
    }
    private void LatestActivitySeeMoreBtnMouseExited(java.awt.event.MouseEvent evt) {
        LatestActivitySeeMoreText.setForeground(Color.WHITE);
    }

    // hiding and showing panels when buttons are clicked
    private void LoanClacBtnMouseClicked(java.awt.event.MouseEvent evt) {
        GoToLoans();

    }
    private void MenuHomeBtnMouseClicked(java.awt.event.MouseEvent evt) {
        HomeReturn();
    }

    // more buttons hovering
    private void MenuHomeBtnMouseEntered(java.awt.event.MouseEvent evt) {
        MenuHomeBtn.setIcon(BtnUnHoverd);
    }
    private void MenuHomeBtnMouseExited(java.awt.event.MouseEvent evt) {
        MenuHomeBtn.setIcon(BtnHoverd);
    }

    // actions when buttons are clicked
    private void LoanInfoBtn1MouseClicked(java.awt.event.MouseEvent evt) {
        new LoansInfoPage();
    }
    private void LoanCalcBtnMouseClicked(java.awt.event.MouseEvent evt) {
        new LoanCalcPage();
    }

    // more buttons hovering
    private void CallUsBtnMouseEntered(java.awt.event.MouseEvent evt) {
        CallUsBtn.setIcon(CallHoverd);
    }
    private void CallUsBtnMouseExited(java.awt.event.MouseEvent evt) {
        CallUsBtn.setIcon(CallUsHoverd);
    }
    private void branchesBtnMouseEntered(java.awt.event.MouseEvent evt) {
        branchesBtn.setIcon(BranchesHovered);
    }
    private void branchesBtnMouseExited(java.awt.event.MouseEvent evt) {
        branchesBtn.setIcon(BranchesUnHovered);
    }
    private void atmBtnMouseEntered(java.awt.event.MouseEvent evt) {
        atmBtn.setIcon(atmHovered);
    }
    private void atmBtnMouseExited(java.awt.event.MouseEvent evt) {
        atmBtn.setIcon(atmUnHovered);
    }

    // actions when buttons are clicked
    private void CallUsBtnMouseClicked(java.awt.event.MouseEvent evt) {
        if (ContactPanel.isDisplayable())
                new CallUsPage();
    }
    private void branchesBtnMouseClicked(java.awt.event.MouseEvent evt) {
       if (ContactPanel.isDisplayable())
                new BranchesPage();
    }
    private void atmBtnMouseClicked(java.awt.event.MouseEvent evt) {
        if (ContactPanel.isDisplayable())
                new ATMSPage();
    }
    private void SupportBlockBtnMouseClicked(java.awt.event.MouseEvent evt) {
        GoToSupport();
    }
    private void AccountMyProfileMouseClicked(java.awt.event.MouseEvent evt) {
        GoToInfo();
    }
    private void CreditCardBlockMouseClicked(java.awt.event.MouseEvent evt) {
        if(!SignInPage.isVIP){
        new CreditCard(SignInPage.currentNormalClient);
        }

        if(SignInPage.isVIP){
        new CreditCard(SignInPage.currentVIPClient);
        }
    }
    private void userPictureMouseClicked(java.awt.event.MouseEvent evt) {
        GoToInfo();
    }
    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {
        GoToInfo();
    }

    // more buttons hovering
    private void backBtnTextMouseEntered(java.awt.event.MouseEvent evt) {
        backBtnText.setForeground(Color.BLACK);
    }
    private void backBtnTextMouseExited(java.awt.event.MouseEvent evt) {
        backBtnText.setForeground(Color.WHITE);
    }
    private void editBtnTextMouseEntered(java.awt.event.MouseEvent evt) {
        editBtnText.setForeground(Color.BLACK);
    }
    private void editBtnTextMouseExited(java.awt.event.MouseEvent evt) {
        editBtnText.setForeground(Color.WHITE);
    }
    private void backBtnText1MouseEntered(java.awt.event.MouseEvent evt) {
        backBtnText.setForeground(Color.WHITE);
    }
    private void backBtnText1MouseExited(java.awt.event.MouseEvent evt) {
        backBtnText.setForeground(Color.BLACK);
    }
    private void editBtnText1MouseEntered(java.awt.event.MouseEvent evt) {
        editBtnText.setForeground(Color.WHITE);
    }
    private void editBtnText1MouseExited(java.awt.event.MouseEvent evt) {
        editBtnText.setForeground(Color.BLACK);
    }
    private void backBtnTextMouseClicked(java.awt.event.MouseEvent evt) {
        HomeReturn();
    }
    private void AccountMessaegsMouseClicked(java.awt.event.MouseEvent evt) {
        GoToMessages();
    }
    private void AccountNotifciactionsMouseClicked(java.awt.event.MouseEvent evt) {
       GoTonNotifications();
    }
    private void TransferBlockMouseClicked(java.awt.event.MouseEvent evt) {
        if(!SignInPage.isVIP){
            new MoneyTransfer(SignInPage.currentNormalClient);
        }

        if(SignInPage.isVIP){
            new MoneyTransfer(SignInPage.currentVIPClient);
        }
    }
    private void DepositBlockMouseClicked(java.awt.event.MouseEvent evt) {
        if(!SignInPage.isVIP)
            new MoneyTransaction(SignInPage.currentNormalClient);

        if(SignInPage.isVIP)
            new MoneyTransaction(SignInPage.currentVIPClient);
    }

    // signout
    private void topPanelLogOutMouseClicked(java.awt.event.MouseEvent evt) {
        int a=JOptionPane.showConfirmDialog(this,"Are you sure you want to logout?");
        if(a==JOptionPane.YES_OPTION){
            new SignInPage();
            this.dispose();
          }
    }
    private void AccountLogOutMouseClicked(java.awt.event.MouseEvent evt) {
        int a=JOptionPane.showConfirmDialog(this,"Are you sure you want to logout?");
        if(a==JOptionPane.YES_OPTION){
            new SignInPage();
            this.dispose();
        }
    }

    private void MenuOffersMouseClicked(java.awt.event.MouseEvent evt) {
        GoToOffers();
    }

    private void editBtnTextMouseClicked(java.awt.event.MouseEvent evt) {
        new EditInfoWindow(SignInPage.currentNormalClient);
    }

    private void editBtn1TextMouseClicked(java.awt.event.MouseEvent evt) {
        new EditInfoWindow(SignInPage.currentVIPClient);
    }

    private void BackBtn1TxtMouseClicked(java.awt.event.MouseEvent evt) {
        HomeReturn();
    }

    // method that show the home page by hiding all the other panels
    private void HomeReturn(){
        plankPanel.hide();
        HomePanel.show();
        ContactPanel.hide();
        LoansPanel.hide();
        InfoVIPWindowPage.hide();
        InfoNoramlWindowPage.hide();
        messagesPanel.hide();
        notificationsPanel.hide();
        offersPanel.hide();
    }

    // method that show the info by hiding all the other panels
     private void GoToInfo(){
         // put if here to go to normal or VIP
        plankPanel.show();
        HomePanel.hide();
        ContactPanel.hide();
        LoansPanel.hide();
         if(!SignInPage.isVIP){
             InfoVIPWindowPage.hide();
             InfoNoramlWindowPage.show();
         }

         if(SignInPage.isVIP){
             InfoVIPWindowPage.show();
             InfoNoramlWindowPage.hide();
         }
        messagesPanel.hide();
        notificationsPanel.hide();
        offersPanel.hide();
    }

     // method that show the messgeas by hiding all the other panels
     private void GoToMessages(){
        plankPanel.show();
        HomePanel.hide();
        ContactPanel.hide();
        LoansPanel.hide();
        InfoVIPWindowPage.hide();
        InfoNoramlWindowPage.hide();
        messagesPanel.show();
        notificationsPanel.hide();
        offersPanel.hide();
    }

     // method that show the notifications by hiding all the other panels
     private void GoTonNotifications(){
        plankPanel.show();
        HomePanel.hide();
        ContactPanel.hide();
        LoansPanel.hide();
        InfoVIPWindowPage.hide();
        InfoNoramlWindowPage.hide();
        messagesPanel.hide();
        notificationsPanel.show();
        offersPanel.hide();
    }

     // method that show the offers by hiding all the other panels
     private void GoToOffers(){
        plankPanel.show();
        HomePanel.hide();
        ContactPanel.hide();
        LoansPanel.hide();
        InfoVIPWindowPage.hide();
        InfoNoramlWindowPage.hide();
        messagesPanel.hide();
        notificationsPanel.hide();
        offersPanel.show();
    }

     private void GoToLoans(){
        plankPanel.hide();
        HomePanel.hide();
        ContactPanel.hide();
        LoansPanel.show();
        InfoVIPWindowPage.hide();
        InfoNoramlWindowPage.hide();
        messagesPanel.hide();
        notificationsPanel.hide();
        offersPanel.hide();
    }

     private void GoToSupport(){
        plankPanel.hide();
        HomePanel.hide();
        ContactPanel.show();
        LoansPanel.hide();
        InfoVIPWindowPage.hide();
        InfoNoramlWindowPage.hide();
        messagesPanel.hide();
        notificationsPanel.hide();
        offersPanel.hide();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Account;
    private javax.swing.JLabel AccountLable;
    private javax.swing.JPanel AccountLogOut;
    private javax.swing.JLabel AccountLogOutBtn;
    private javax.swing.JLabel AccountLogOutIcon;
    private javax.swing.JLabel AccountLogOutText;
    private javax.swing.JLabel AccountMessaegeIcon;
    private javax.swing.JPanel AccountMessaegs;
    private javax.swing.JLabel AccountMessaegsText;
    private javax.swing.JLabel AccountMessagesBtn;
    private javax.swing.JLabel AccountMessagesText;
    private javax.swing.JPanel AccountMyProfile;
    private javax.swing.JLabel AccountMyProfileBtn;
    private javax.swing.JLabel AccountMyProfileIcon;
    private javax.swing.JLabel AccountMyProfileText;
    private javax.swing.JPanel AccountNotifciactions;
    private javax.swing.JLabel AccountNotifciactionsBtn;
    private javax.swing.JLabel AccountNotifciactionsIcon;
    private javax.swing.JLabel AccountNotifciactionsText;
    private javax.swing.JLabel AccountNotificationsText;
    private javax.swing.JLabel BackBtn;
    private javax.swing.JLabel BackBtn1;
    private javax.swing.JPanel BarPanel;
    private javax.swing.JLabel CallUsBtn;
    private javax.swing.JPanel ContactPanel;
    private javax.swing.JLabel ControlBckGrd;
    private javax.swing.JPanel CreditCardBlock;
    private javax.swing.JPanel Dashborad;
    private javax.swing.JLabel DashboradLable1;
    private javax.swing.JPanel DecoPanel;
    private javax.swing.JPanel DecoPanel1;
    private javax.swing.JPanel DepositBlock;
    private javax.swing.JLabel DepositBlockBtn;
    protected static javax.swing.JLabel DepositBlockText;
    protected static javax.swing.JLabel FirstName;
    protected static javax.swing.JLabel FirstName1;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel InfoBlockBtn;
    protected static javax.swing.JLabel InfoBlockText;
    private javax.swing.JPanel InfoNoramlWindowPage;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JPanel InfoPanel1;
    private javax.swing.JPanel InfoVIPWindowPage;
    private javax.swing.JPanel LatestActivity;
    private javax.swing.JLabel LatestActivitySeeMoreBtn;
    private javax.swing.JLabel LatestActivitySeeMoreText;
    private javax.swing.JLabel LatestActivtyLable;
    private javax.swing.JLabel LoanCalcBtn;
    private javax.swing.JLabel LoanClacBtn;
    private javax.swing.JLabel LoanInfoBtn1;
    private javax.swing.JPanel LoansBlock;
    private javax.swing.JPanel LoansPanel;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuHome;
    private javax.swing.JLabel MenuHomeBtn;
    private javax.swing.JLabel MenuHomeIcon;
    private javax.swing.JLabel MenuHomeText;
    private javax.swing.JLabel MenuLable;
    private javax.swing.JPanel MenuOffers;
    private javax.swing.JLabel MenuOffersBtn;
    private javax.swing.JLabel MenuOffersIcon;
    private javax.swing.JLabel MenuOffersText;
    private javax.swing.JLabel ServiceLable;
    private javax.swing.JPanel Services;
    private javax.swing.JPanel SupportBlock;
    private javax.swing.JLabel SupportBlockBtn;
    private javax.swing.JPanel TransferBlock;
    private javax.swing.JLabel TransferBlockBtn;
    protected static javax.swing.JLabel TransferBlockText;
    protected static javax.swing.JLabel accountNumber;
    protected javax.swing.JLabel accountNumber1;
    private javax.swing.JLabel accountNumberText;
    private javax.swing.JLabel accountNumberText1;
    protected static javax.swing.JLabel accountType;
    protected static javax.swing.JLabel accountType1;
    private javax.swing.JLabel accountTypeText;
    private javax.swing.JLabel accountTypeText1;
    protected static javax.swing.JLabel address;
    protected static javax.swing.JLabel address1;
    private javax.swing.JLabel addressText;
    private javax.swing.JLabel addressText1;
    private javax.swing.JLabel atmBtn;
    private javax.swing.JLabel backBtnText;
    private javax.swing.JLabel backBtnText1;
    private javax.swing.JLabel branchesBtn;
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel ctrlPanel;
    private javax.swing.JLabel ctrlPanelBckGrnd;
    private javax.swing.JLabel editBtn;
    private javax.swing.JLabel editBtn1;
    private javax.swing.JLabel editBtnText;
    private javax.swing.JLabel editBtnText1;
    private javax.swing.JLabel firstNameText;
    private javax.swing.JLabel firstNameText1;
    private javax.swing.JLabel homeLogo;
    private javax.swing.JPanel homeMainPanel;
    private javax.swing.JLabel infoIcon;
    private javax.swing.JLabel infoIcon1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    protected static javax.swing.JLabel job;
    protected static javax.swing.JLabel job1;
    private javax.swing.JLabel jobText;
    private javax.swing.JLabel jobText1;
    private javax.swing.JLabel logOutIcon;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mainPanelBckGrnd;
    protected static javax.swing.JLabel martialStatus;
    protected static javax.swing.JLabel martialStatus1;
    private javax.swing.JLabel martialStatusText;
    private javax.swing.JLabel martialStatusText1;
    private javax.swing.JPanel messagesPanel;
    private javax.swing.JLabel miniButton1;
    protected static javax.swing.JLabel nationalId;
    protected static javax.swing.JLabel nationalId1;
    private javax.swing.JLabel nationalIdText;
    private javax.swing.JLabel nationalIdText1;
    protected static javax.swing.JLabel nationality;
    protected static javax.swing.JLabel nationality1;
    private javax.swing.JLabel nationalityText;
    private javax.swing.JLabel nationalityText1;
    private javax.swing.JLabel normalAcc;
    private javax.swing.JLabel normalAcc1;
    private javax.swing.JPanel notificationsPanel;
    private javax.swing.JPanel offersPanel;
    private javax.swing.JLabel offersPhoto;
    protected static javax.swing.JLabel phoneNumber;
    protected static javax.swing.JLabel phoneNumber1;
    private javax.swing.JLabel phoneNumberText;
    private javax.swing.JLabel phoneNumberText1;
    protected static javax.swing.JLabel pinGet;
    protected static javax.swing.JLabel pinGet1;
    private javax.swing.JLabel pinText;
    private javax.swing.JLabel pinText1;
    private javax.swing.JPanel plankPanel;
    private javax.swing.JLabel plankPanelBckgrd;
    protected static javax.swing.JLabel postalCode;
    protected static javax.swing.JLabel postalCode1;
    private javax.swing.JLabel postalCodeText;
    private javax.swing.JLabel postalCodeText1;
    protected static javax.swing.JLabel secondName;
    protected static javax.swing.JLabel secondName1;
    private javax.swing.JLabel secondNameText;
    private javax.swing.JLabel secondNameText1;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel topPanelBckGrnd;
    private javax.swing.JLabel topPanelLogOut;
    private javax.swing.JLabel topPanelLogOut1;
    private javax.swing.JLabel upperBar;
    protected static javax.swing.JLabel userName;
    protected static javax.swing.JLabel userName1;
    protected static javax.swing.JLabel userName2;
    protected javax.swing.JLabel userNameText;
    protected javax.swing.JLabel userNameText1;
    protected javax.swing.JLabel userPicture;
    protected static javax.swing.JLabel welcomeMessage;
    protected static javax.swing.JLabel creditLimitTxt;
    protected static javax.swing.JLabel creditTakenTxt;
    private javax.swing.JButton requestLoanBtn;
    protected  JLabel loanRequesrStatText;
    // End of variables declaration//GEN-END:variables
}
