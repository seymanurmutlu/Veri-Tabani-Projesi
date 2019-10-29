
public class yonlendirmeEkrani extends javax.swing.JDialog {

    public yonlendirmeEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tedarikciBilgileriButonu = new javax.swing.JButton();
        tedarikEdilenUrunBilgileriButonu = new javax.swing.JButton();
        musteriBilgileriButonu = new javax.swing.JButton();
        musteriTalepleriButonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ureticiBilgileriButonu = new javax.swing.JButton();
        ureticiAlisButonu = new javax.swing.JButton();
        ureticiUretimButonu = new javax.swing.JButton();
        ureticiSatisTablosu = new javax.swing.JButton();
        kimyasalMaddeBilgileriButonu = new javax.swing.JButton();
        sehirlerArasiMesafeButonu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tarihAlani = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        hammaddeSatinAlmaButonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(425, 120, 0, 0));

        tedarikciBilgileriButonu.setText("Tedarikci Bilgileri ");
        tedarikciBilgileriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tedarikciBilgileriButonuActionPerformed(evt);
            }
        });

        tedarikEdilenUrunBilgileriButonu.setText("Tedarik Edilen Urun Bilgileri");
        tedarikEdilenUrunBilgileriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tedarikEdilenUrunBilgileriButonuActionPerformed(evt);
            }
        });

        musteriBilgileriButonu.setText("Musteri Bilgileri");
        musteriBilgileriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriBilgileriButonuActionPerformed(evt);
            }
        });

        musteriTalepleriButonu.setText("Musteri Talepleri");
        musteriTalepleriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriTalepleriButonuActionPerformed(evt);
            }
        });

        jLabel1.setText("Goruntulemek ve degisiklik yapmak istediginiz tabloyu seciniz.");

        ureticiBilgileriButonu.setText("Uretici Bilgileri");
        ureticiBilgileriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ureticiBilgileriButonuActionPerformed(evt);
            }
        });

        ureticiAlisButonu.setText("Ureticinin Alim Tablosu");
        ureticiAlisButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ureticiAlisButonuActionPerformed(evt);
            }
        });

        ureticiUretimButonu.setText("Uretici Uretim Tablosu");
        ureticiUretimButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ureticiUretimButonuActionPerformed(evt);
            }
        });

        ureticiSatisTablosu.setText("Uretici Satis Tablosu");
        ureticiSatisTablosu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ureticiSatisTablosuActionPerformed(evt);
            }
        });

        kimyasalMaddeBilgileriButonu.setText("Kimyasal Madde Bilgileri");
        kimyasalMaddeBilgileriButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kimyasalMaddeBilgileriButonuActionPerformed(evt);
            }
        });

        sehirlerArasiMesafeButonu.setText("Sehirler Arasi Mesafeler");
        sehirlerArasiMesafeButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sehirlerArasiMesafeButonuActionPerformed(evt);
            }
        });

        jLabel3.setText("Tarih : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel4.setText("Islemleri yapmadan once tarih belirtiniz.");

        tarihAlani.setForeground(new java.awt.Color(204, 204, 204));
        tarihAlani.setText("GGAAYYYY");
        tarihAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarihAlaniActionPerformed(evt);
            }
        });

        jButton1.setText("Kaydet");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hammaddeSatinAlmaButonu.setText("Hammadde Satin Alma Ekrani");
        hammaddeSatinAlmaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hammaddeSatinAlmaButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(12, 12, 12)
                            .addComponent(tarihAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(hammaddeSatinAlmaButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sehirlerArasiMesafeButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kimyasalMaddeBilgileriButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ureticiSatisTablosu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ureticiAlisButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ureticiUretimButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(musteriBilgileriButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(musteriTalepleriButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tedarikciBilgileriButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tedarikEdilenUrunBilgileriButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ureticiBilgileriButonu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tarihAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sehirlerArasiMesafeButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kimyasalMaddeBilgileriButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ureticiBilgileriButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ureticiSatisTablosu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ureticiAlisButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ureticiUretimButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musteriBilgileriButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musteriTalepleriButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tedarikciBilgileriButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tedarikEdilenUrunBilgileriButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hammaddeSatinAlmaButonu)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void musteriBilgileriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriBilgileriButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        MusteriBilgileriEkrani musteriBilgileriEkrani = new MusteriBilgileriEkrani(girisEkran, true);

        setVisible(false);
        musteriBilgileriEkrani.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_musteriBilgileriButonuActionPerformed

    private void musteriTalepleriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriTalepleriButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        MusteriTalepleriEkrani musteriTalepleriEkrani = new MusteriTalepleriEkrani(girisEkran, true);

        setVisible(false);
        musteriTalepleriEkrani.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_musteriTalepleriButonuActionPerformed

    private void tedarikciBilgileriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tedarikciBilgileriButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        TedarikciBilgileriEkrani tedarikciBilgileriEkran = new TedarikciBilgileriEkrani(girisEkran, true);

        setVisible(false);
        tedarikciBilgileriEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_tedarikciBilgileriButonuActionPerformed

    private void tedarikEdilenUrunBilgileriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tedarikEdilenUrunBilgileriButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        TedarikEdilenUrunBilgileriEkrani tedarikEdilenUrunBilgileriEkran = new TedarikEdilenUrunBilgileriEkrani(girisEkran, true);

        setVisible(false);
        tedarikEdilenUrunBilgileriEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_tedarikEdilenUrunBilgileriButonuActionPerformed

    private void ureticiBilgileriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureticiBilgileriButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        UreticiBilgileriEkrani ureticiBilgileriEkran = new UreticiBilgileriEkrani(girisEkran, true);

        setVisible(false);
        ureticiBilgileriEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_ureticiBilgileriButonuActionPerformed

    private void ureticiAlisButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureticiAlisButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        UreticiAlimEkrani ureticiAlimEkran = new UreticiAlimEkrani(girisEkran, true);

        setVisible(false);
        ureticiAlimEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_ureticiAlisButonuActionPerformed

    private void ureticiUretimButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureticiUretimButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        UreticiUretilenEkrani ureticiUretilenEkran = new UreticiUretilenEkrani(girisEkran, true);

        setVisible(false);
        ureticiUretilenEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_ureticiUretimButonuActionPerformed

    private void ureticiSatisTablosuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureticiSatisTablosuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        UreticiSatisEkrani ureticiSatisEkran = new UreticiSatisEkrani(girisEkran, true);

        setVisible(false);
        ureticiSatisEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_ureticiSatisTablosuActionPerformed

    private void kimyasalMaddeBilgileriButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kimyasalMaddeBilgileriButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        KimyasalMaddeBilgisiEkrani kimyasalMaddeBilgisiEkran = new KimyasalMaddeBilgisiEkrani(girisEkran, true);

        setVisible(false);
        kimyasalMaddeBilgisiEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_kimyasalMaddeBilgileriButonuActionPerformed

    private void sehirlerArasiMesafeButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sehirlerArasiMesafeButonuActionPerformed
        
       GirisEkrani girisEkran = new GirisEkrani();
        SehirlerArasiMesafeEkrani sehirlerArasiMesafeEkran = new SehirlerArasiMesafeEkrani(girisEkran, true);

        setVisible(false);
        sehirlerArasiMesafeEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_sehirlerArasiMesafeButonuActionPerformed

    private void tarihAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarihAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarihAlaniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hammaddeSatinAlmaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hammaddeSatinAlmaButonuActionPerformed
        
        GirisEkrani girisEkran = new GirisEkrani();
        hammaddeSatinAlmaEkrani hammaddeSatinAlmaEkran = new hammaddeSatinAlmaEkrani(girisEkran, true);

        setVisible(false);
        hammaddeSatinAlmaEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_hammaddeSatinAlmaButonuActionPerformed

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
            java.util.logging.Logger.getLogger(yonlendirmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yonlendirmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yonlendirmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yonlendirmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                yonlendirmeEkrani dialog = new yonlendirmeEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hammaddeSatinAlmaButonu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton kimyasalMaddeBilgileriButonu;
    private javax.swing.JButton musteriBilgileriButonu;
    private javax.swing.JButton musteriTalepleriButonu;
    private javax.swing.JButton sehirlerArasiMesafeButonu;
    private javax.swing.JTextField tarihAlani;
    private javax.swing.JButton tedarikEdilenUrunBilgileriButonu;
    private javax.swing.JButton tedarikciBilgileriButonu;
    private javax.swing.JButton ureticiAlisButonu;
    private javax.swing.JButton ureticiBilgileriButonu;
    private javax.swing.JButton ureticiSatisTablosu;
    private javax.swing.JButton ureticiUretimButonu;
    // End of variables declaration//GEN-END:variables
}
