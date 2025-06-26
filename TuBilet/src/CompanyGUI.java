
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class CompanyGUI extends javax.swing.JFrame {

    DefaultListModel model = new DefaultListModel();
    DefaultListModel model2 = new DefaultListModel();
    
    public CompanyGUI() {
        initComponents();
        for(int i = 0; i < Trip.seferler.size() ; i++)
        {
           model.addElement(Trip.seferler.get(i)); 
        }
        
        list_sefer.setModel(model);
   //*******************************************************
      for(int k = 0; k < Vehicle.araclar.size() ; k++)
        {
           model2.addElement(Vehicle.araclar.get(k)); 
        }
        
        list_arac.setModel(model2);
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        add_trnsprt = new java.awt.Button();
        add_trip = new java.awt.Button();
        del_trip = new java.awt.Button();
        del_trnsprt = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_arac = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_sefer = new javax.swing.JList<>();
        ekle_sefer = new java.awt.TextField();
        ekle_arac = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Eklenecek aracı girin: ");

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Sefer ekleyin: ");

        add_trnsprt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        add_trnsprt.setLabel("EKLE");
        add_trnsprt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_trnsprtActionPerformed(evt);
            }
        });

        add_trip.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        add_trip.setLabel("EKLE");
        add_trip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_tripActionPerformed(evt);
            }
        });

        del_trip.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        del_trip.setLabel("SİL");
        del_trip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_tripActionPerformed(evt);
            }
        });

        del_trnsprt.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        del_trnsprt.setLabel("SİL");
        del_trnsprt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_trnsprtActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(list_arac);

        jScrollPane2.setViewportView(list_sefer);

        ekle_sefer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_seferActionPerformed(evt);
            }
        });

        ekle_arac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_aracActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 255, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_trip, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(del_trip, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ekle_sefer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                    .addComponent(add_trnsprt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addComponent(del_trnsprt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ekle_arac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_trnsprt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del_trnsprt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ekle_arac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_trip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del_trip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ekle_sefer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void del_trnsprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_trnsprtActionPerformed
        if (list_arac.getSelectedIndex() != -1 && model.getSize() != 0){
            Object sil = model2.getElementAt(list_arac.getSelectedIndex());
            model2.removeElement(sil);
            Vehicle.araclar.remove(sil);
        }
    }//GEN-LAST:event_del_trnsprtActionPerformed

    private void del_tripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_tripActionPerformed
        if (list_sefer.getSelectedIndex() != -1 && model.getSize() != 0){
            Object sil = model.getElementAt(list_sefer.getSelectedIndex());
            model.removeElement(sil);
            Trip.seferler.remove(sil);
        }
    }//GEN-LAST:event_del_tripActionPerformed

    private void add_tripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_tripActionPerformed
    
        if(ekle_sefer.getText() != null)
      {
          model.addElement(ekle_sefer.getText());
          Trip.seferler.add(ekle_sefer.getText());
      }
      
      else
      {
          JOptionPane.showMessageDialog(this, "geçerli bir sefer girin", "Hata", JOptionPane.ERROR_MESSAGE);
      }
    ekle_sefer.setText("");
    }//GEN-LAST:event_add_tripActionPerformed

    private void ekle_seferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_seferActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ekle_seferActionPerformed

    private void ekle_aracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_aracActionPerformed
        
    }//GEN-LAST:event_ekle_aracActionPerformed

    private void add_trnsprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_trnsprtActionPerformed
        if(ekle_arac.getText() != null)
      {
          model2.addElement(ekle_arac.getText());
          Vehicle.araclar.add(ekle_arac.getText());
      }
      
      else
      {
          JOptionPane.showMessageDialog(this, "geçerli bir arac girin", "Hata", JOptionPane.ERROR_MESSAGE);
      }
    ekle_arac.setText("");
    }//GEN-LAST:event_add_trnsprtActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button add_trip;
    private java.awt.Button add_trnsprt;
    private java.awt.Button del_trip;
    private java.awt.Button del_trnsprt;
    private java.awt.TextField ekle_arac;
    private java.awt.TextField ekle_sefer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JList<String> list_arac;
    private javax.swing.JList<String> list_sefer;
    // End of variables declaration//GEN-END:variables
}
