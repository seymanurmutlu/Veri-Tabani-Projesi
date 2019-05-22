
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class UreticiBilgileriEkrani extends javax.swing.JDialog {

    DefaultTableModel model;
    UreticiIslemleri islemler = new UreticiIslemleri();

    public UreticiBilgileriEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) ureticiBilgileriTablosu.getModel();
        ureticiBilgileriGoruntule();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geriGelButonu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ureticiBilgileriTablosu = new javax.swing.JTable();
        firmaAdiAlani = new javax.swing.JTextField();
        sehirAlani = new javax.swing.JTextField();
        aramaCubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mesajAlani = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        eklemeButonu = new javax.swing.JButton();
        guncelleButonu = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(375, 80, 0, 0));

        geriGelButonu.setText("< Geri");
        geriGelButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriGelButonuActionPerformed(evt);
            }
        });

        ureticiBilgileriTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FID", "firmaAdi", "sehir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ureticiBilgileriTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ureticiBilgileriTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ureticiBilgileriTablosu);
        if (ureticiBilgileriTablosu.getColumnModel().getColumnCount() > 0) {
            ureticiBilgileriTablosu.getColumnModel().getColumn(0).setResizable(false);
            ureticiBilgileriTablosu.getColumnModel().getColumn(1).setResizable(false);
            ureticiBilgileriTablosu.getColumnModel().getColumn(2).setResizable(false);
        }

        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        jLabel2.setText("firmaAdi : ");

        jLabel3.setText("sehir : ");

        mesajAlani.setForeground(new java.awt.Color(204, 0, 0));

        jLabel1.setText("Ara");

        eklemeButonu.setText("Ekle");
        eklemeButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eklemeButonuActionPerformed(evt);
            }
        });

        guncelleButonu.setText("Guncelle");
        guncelleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButonuActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel4.setText("Uretici Bilgileri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(geriGelButonu))
                    .addComponent(jSeparator2)
                    .addComponent(mesajAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firmaAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sehirAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(guncelleButonu)
                                    .addComponent(eklemeButonu))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aramaCubugu)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firmaAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eklemeButonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sehirAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(guncelleButonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(geriGelButonu))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void ureticiBilgileriGoruntule() {
        model.setRowCount(0); //her defasinda tabloyu bosaltir.
        ArrayList<UreticiBilgileri> ureticiBilgi = new ArrayList<UreticiBilgileri>();
        ureticiBilgi = islemler.ureticiBilgileriGetir();

        if (ureticiBilgi != null) {
            for (UreticiBilgileri bilgi : ureticiBilgi) {
                Object[] eklenecek = {bilgi.getFID(), bilgi.getFirmaAdi(), bilgi.getSehir()};

                model.addRow(eklenecek);
            }
        }
    }

    public void ureticiAlimlariniGoruntule() {
        model.setRowCount(0); //her defasinda tabloyu bosaltir.
        ArrayList<UreticiAlim> ureticiAlim = new ArrayList<UreticiAlim>();
        ureticiAlim = islemler.ureticiAlimlariniGetir();

        if (ureticiAlim != null) {
            for (UreticiAlim alim : ureticiAlim) {
                Object[] eklenecek = {alim.getSatinAlmaSirasi(), alim.getFirmaAdi(), alim.getSatinAlinan(), alim.getAlisMaliyeti(), alim.getAlinanMaddeMiktari()};

                model.addRow(eklenecek);
            }
        }
    }

    public void ureticiUretilenleriniGoruntule() {
        model.setRowCount(0); //her defasinda tabloyu bosaltir.
        ArrayList<UreticiUretilen> ureticiUretilen = new ArrayList<UreticiUretilen>();
        ureticiUretilen = islemler.ureticiUretilenleriniGetir();

        if (ureticiUretilen != null) {
            for (UreticiUretilen uretilen : ureticiUretilen) {
                Object[] eklenecek = {uretilen.getUrunID(),uretilen.getKimyasalAdi(),uretilen.getUretimTarihi(),uretilen.getRafOmru(),uretilen.getStok()};

                model.addRow(eklenecek);
            }
        }
    }


    private void geriGelButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriGelButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        yonlendirmeEkrani yonlendirmeEkran = new yonlendirmeEkrani(girisEkran, true);

        setVisible(false);
        yonlendirmeEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_geriGelButonuActionPerformed

    private void eklemeButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eklemeButonuActionPerformed
        
        String firmaAdi = firmaAdiAlani.getText();
        String sehir = sehirAlani.getText();

        islemler.ureticiEkle(firmaAdi, sehir);
        ureticiBilgileriGoruntule();
        mesajAlani.setText("Yeni kullanici basari ile eklendi.");
    }//GEN-LAST:event_eklemeButonuActionPerformed

    private void guncelleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButonuActionPerformed
        
        String firmaAdi = firmaAdiAlani.getText();
        String sehir = sehirAlani.getText();

        int selectedRow = ureticiBilgileriTablosu.getSelectedRow();

        if (selectedRow == -1) {

            if (model.getRowCount() == 0) {
                mesajAlani.setText("Uretici Bilgileri Tablosu Suan Bos");
            } else {
                mesajAlani.setText("Lutfen Guncellenemek Istediginiz Ureticiyi Secin.");
            }
        } else {
            int id = (int) model.getValueAt(selectedRow, 0);
            islemler.ureticiGuncelle(id, firmaAdi, sehir);
            ureticiBilgileriGoruntule();
            mesajAlani.setText("Uretici Bilgisi Basari ile Guncellendi.");
        }
        
    }//GEN-LAST:event_guncelleButonuActionPerformed

    private void ureticiBilgileriTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ureticiBilgileriTablosuMouseClicked
       
        int selectedRow = ureticiBilgileriTablosu.getSelectedRow();

        firmaAdiAlani.setText(model.getValueAt(selectedRow, 1).toString());
        sehirAlani.setText(model.getValueAt(selectedRow, 2).toString());
        
    }//GEN-LAST:event_ureticiBilgileriTablosuMouseClicked

    public void aramaYap(String arama)
    {
        TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(model);
        ureticiBilgileriTablosu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(arama)); //dinamik bir sekilde aramak icin yapilir
    }
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        
        String arama=aramaCubugu.getText();
        aramaYap(arama);
    }//GEN-LAST:event_aramaCubuguKeyReleased

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
            java.util.logging.Logger.getLogger(UreticiBilgileriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UreticiBilgileriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UreticiBilgileriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UreticiBilgileriEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UreticiBilgileriEkrani dialog = new UreticiBilgileriEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField aramaCubugu;
    private javax.swing.JButton eklemeButonu;
    private javax.swing.JTextField firmaAdiAlani;
    private javax.swing.JButton geriGelButonu;
    private javax.swing.JButton guncelleButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel mesajAlani;
    private javax.swing.JTextField sehirAlani;
    private javax.swing.JTable ureticiBilgileriTablosu;
    // End of variables declaration//GEN-END:variables
}
