import java.util.ArrayList;
import javax.swing.*;



public class LoginGUI extends javax.swing.JFrame {

    public LoginGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        panel1 = new java.awt.Panel();
        label3 = new java.awt.Label();
        label2 = new java.awt.Label();
        label7 = new java.awt.Label();
        admin_name = new java.awt.TextField();
        admin_psswrd = new java.awt.TextField();
        entry_button_admin = new java.awt.Button();
        panel3 = new java.awt.Panel();
        label5 = new java.awt.Label();
        button_search_ticket = new java.awt.Button();
        label1 = new java.awt.Label();
        panel2 = new java.awt.Panel();
        label4 = new java.awt.Label();
        label6 = new java.awt.Label();
        label9 = new java.awt.Label();
        cmpny_psswrd = new java.awt.TextField();
        cmpny_name = new java.awt.TextField();
        entry_button_cmpny = new java.awt.Button();
        reg_button_cmpny = new java.awt.Button();
        reg_cmpny_name = new java.awt.TextField();
        reg_cmpny_psswrd = new java.awt.TextField();
        label8 = new java.awt.Label();
        label10 = new java.awt.Label();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TuBilet Anasayfa");

        label3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        label3.setText("Admin Girişi");

        label2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        label2.setText("Kullanıcı Adı: ");

        label7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        label7.setText("Şifre: ");

        admin_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_name_get(evt);
            }
        });

        admin_psswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_psswrd_get(evt);
            }
        });

        entry_button_admin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        entry_button_admin.setLabel("GİRİŞ");
        entry_button_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entry_button_adminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(admin_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(admin_psswrd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entry_button_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                .addGap(48, 48, 48)))))
                .addGap(30, 30, 30))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admin_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admin_psswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entry_button_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label7.getAccessibleContext().setAccessibleName("");

        panel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        label5.setText("Müşteri Girişi");

        button_search_ticket.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        button_search_ticket.setLabel("BİLET ARA");
        button_search_ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_search_ticketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_search_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(button_search_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        label1.setText("TuBilet ' e Hoşgeldiniz ");

        label4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        label4.setText("Firma Girişi");

        label6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        label6.setText("Kullanıcı Adı: ");

        label9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        label9.setText("Şifre: ");

        cmpny_psswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpny_psswrd_get(evt);
            }
        });

        cmpny_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpny_name_get(evt);
            }
        });

        entry_button_cmpny.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        entry_button_cmpny.setLabel("GİRİŞ");
        entry_button_cmpny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entry_button_cmpnyActionPerformed(evt);
            }
        });

        reg_button_cmpny.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        reg_button_cmpny.setLabel("KAYIT OL");
        reg_button_cmpny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_button_cmpnyActionPerformed(evt);
            }
        });

        reg_cmpny_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_cmpny_nameActionPerformed(evt);
            }
        });

        reg_cmpny_psswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_cmpny_psswrdActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        label8.setText("Şifre: ");

        label10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        label10.setText("Kullanıcı Adı: ");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmpny_psswrd, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(cmpny_name, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(entry_button_cmpny, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg_button_cmpny, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reg_cmpny_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reg_cmpny_psswrd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpny_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpny_psswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entry_button_cmpny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg_cmpny_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg_cmpny_psswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reg_button_cmpny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin_name_get(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_name_get
        // TODO add your handling code here: String unameAdmin = admin_name.getText();
    }//GEN-LAST:event_admin_name_get

    private void admin_psswrd_get(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_psswrd_get
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_psswrd_get

    private void cmpny_psswrd_get(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpny_psswrd_get
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpny_psswrd_get

    private void cmpny_name_get(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpny_name_get
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpny_name_get

    private void entry_button_cmpnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entry_button_cmpnyActionPerformed
   
        Company firma_uyesi = new Company(cmpny_name.getText(),cmpny_psswrd.getText());
        
        if (Company.uye_ad.contains(cmpny_name.getText()) && Company.sifre.contains(cmpny_psswrd.getText()))
        {
            int index_ad = firma_uyesi.indexOfElement(Company.uye_ad, cmpny_name.getText());
            int index_sifre = firma_uyesi.indexOfElement(Company.sifre, cmpny_psswrd.getText());              
            if (index_ad == index_sifre && index_ad != -1)
            {
                CompanyGUI next = new CompanyGUI();
                JOptionPane.showMessageDialog(this, "Basariyla giris yapildi.", "Basarili", JOptionPane.INFORMATION_MESSAGE);
                next.setVisible(true);
            }
            
        }
        else
        {
             JOptionPane.showMessageDialog(this, "Kullanici adi veya sifre hatali!", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        cmpny_name.setText("");
        cmpny_psswrd.setText("");
        
    }//GEN-LAST:event_entry_button_cmpnyActionPerformed

    private void reg_button_cmpnyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_button_cmpnyActionPerformed
        
        if(!reg_cmpny_name.getText().isEmpty() && !reg_cmpny_psswrd.getText().isEmpty())
        {
            Company.uye_ad.add(reg_cmpny_name.getText());
            Company.sifre.add(reg_cmpny_psswrd.getText());
            JOptionPane.showMessageDialog(this, "Yeni kullanici basariyla olusturuldu", "Basarili", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Lutfen tum alanlari doldurun", "Hata", JOptionPane.ERROR_MESSAGE);
        }
        reg_cmpny_name.setText("");
        reg_cmpny_psswrd.setText("");
     
    }//GEN-LAST:event_reg_button_cmpnyActionPerformed

    private void entry_button_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entry_button_adminActionPerformed
        
       
        Admin compare_a = new Admin(admin_name.getText(), admin_psswrd.getText());
        

        while(true)
        {
           if (compare_a.login(admin_name.getText(), admin_psswrd.getText())) {
               
            AdminGUI login = new AdminGUI();
            login.setVisible(true);
            // setVisible(false);
            break;
        
        } 
             else {
        JOptionPane.showMessageDialog(this, "Hatalı giriş! Lütfen doğru kullanıcı adı ve şifreyi girin.", "Hata", JOptionPane.ERROR_MESSAGE);
        break;
    } 
           
        }
    
        
    }//GEN-LAST:event_entry_button_adminActionPerformed

    private void reg_cmpny_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_cmpny_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_cmpny_nameActionPerformed

    private void reg_cmpny_psswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_cmpny_psswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_cmpny_psswrdActionPerformed

    private void button_search_ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_search_ticketActionPerformed
        CustomerGUI kullanici =  new CustomerGUI();
        kullanici.setVisible(true);
        
    }//GEN-LAST:event_button_search_ticketActionPerformed

  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField admin_name;
    private java.awt.TextField admin_psswrd;
    private java.awt.Button button_search_ticket;
    private java.awt.TextField cmpny_name;
    private java.awt.TextField cmpny_psswrd;
    private java.awt.Button entry_button_admin;
    private java.awt.Button entry_button_cmpny;
    private javax.swing.JFrame jFrame1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Button reg_button_cmpny;
    private java.awt.TextField reg_cmpny_name;
    private java.awt.TextField reg_cmpny_psswrd;
    // End of variables declaration//GEN-END:variables

    
    
}
