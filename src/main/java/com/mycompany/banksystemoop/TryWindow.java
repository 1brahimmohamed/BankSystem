/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.banksystemoop;

import javax.swing.ImageIcon;

/**
 *
 * @author Ibrahim
 */
public class TryWindow extends javax.swing.JFrame {

    /**
     * Creates new form TryWIndow
     */
    public TryWindow(String S) {
        initComponents();
        this.tryTextLbable.setText(S);
        this.setVisible(true);
    }
    
    public TryWindow(boolean Passrest) {
        initComponents();
        this.setVisible(true);
        if (Passrest == true){
        this.tryTextLbable.setText("");
        passret.setIcon(new javax.swing.ImageIcon("BankSystemOOP\\src\\main\\java\\com\\mycompany\\banksystemoop\\Stocks\\passrest.png")); // NOI18N
        }
        
    }


    private void initComponents() {

        tryTextLbable = new javax.swing.JLabel();
        passret = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tryTextLbable.setFont(new java.awt.Font("Poppins", 2, 36)); // NOI18N
        tryTextLbable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tryTextLbable.setText("Helllo this is a a trial window");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tryTextLbable, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addComponent(passret, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tryTextLbable, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passret, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    private javax.swing.JLabel passret;
    private javax.swing.JLabel tryTextLbable;
}
