
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class UreticiSatisEkrani extends javax.swing.JDialog {

    DefaultTableModel model;
    UreticiIslemleri islemler = new UreticiIslemleri();
    public int karOrani;
    UreticiSatis satis = new UreticiSatis(0, 0, 0, 0, 0, 0);

    public UreticiSatisEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) ureticiSatisTablosu.getModel();
        ureticiSatislariniGoruntule();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        aramaCubugu = new javax.swing.JTextField();
        geriGelButonu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        ureticiSatisTablosu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        karOraniAlani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(340, 100, 0, 0));

        jLabel1.setText("Ara");

        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        geriGelButonu.setText("< Geri");
        geriGelButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriGelButonuActionPerformed(evt);
            }
        });

        ureticiSatisTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "satisSirasi", "urunID", "MID", "iscilikMaliyeti", "toplamMaliyet", "satisFiyati"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ureticiSatisTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ureticiSatisTablosuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ureticiSatisTablosu);
        if (ureticiSatisTablosu.getColumnModel().getColumnCount() > 0) {
            ureticiSatisTablosu.getColumnModel().getColumn(0).setResizable(false);
            ureticiSatisTablosu.getColumnModel().getColumn(1).setResizable(false);
            ureticiSatisTablosu.getColumnModel().getColumn(2).setResizable(false);
            ureticiSatisTablosu.getColumnModel().getColumn(3).setResizable(false);
            ureticiSatisTablosu.getColumnModel().getColumn(4).setResizable(false);
            ureticiSatisTablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel2.setText("Kar Orani :");

        karOraniAlani.setForeground(new java.awt.Color(204, 51, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel3.setText("Uretici Satis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(276, 276, 276))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(565, 565, 565)
                        .addComponent(geriGelButonu))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(karOraniAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(karOraniAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geriGelButonu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriGelButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriGelButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        yonlendirmeEkrani yonlendirmeEkran = new yonlendirmeEkrani(girisEkran, true);

        setVisible(false);
        yonlendirmeEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_geriGelButonuActionPerformed

    public void aramaYap(String arama) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        ureticiSatisTablosu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(arama)); //dinamik bir sekilde aramak icin yapilir
    }
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        String arama = aramaCubugu.getText();
        aramaYap(arama);
    }//GEN-LAST:event_aramaCubuguKeyReleased

    private void ureticiSatisTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ureticiSatisTablosuMouseClicked
        int selectedRow = ureticiSatisTablosu.getSelectedRow();
        satis.setToplamMaliyet(Float.valueOf(model.getValueAt(selectedRow, 4).toString()));
        satis.setSatisFiyati(Float.valueOf(model.getValueAt(selectedRow, 5).toString()));
        float karOrani = ((satis.getSatisFiyati() - satis.getToplamMaliyet()) * 100) / satis.getToplamMaliyet();
        karOraniAlani.setText("%" + Float.toString(karOrani));
    }//GEN-LAST:event_ureticiSatisTablosuMouseClicked

    public void ureticiSatislariniGoruntule() {
        model.setRowCount(0); // her defasinda tabloyu bosaltir
        ArrayList<UreticiSatis> ureticiSatislar = new ArrayList<UreticiSatis>();
        ureticiSatislar = islemler.ureticiSatislariniGetir();

        if (ureticiSatislar != null) {
            for (UreticiSatis uretici : ureticiSatislar) {
                Object[] eklenecek = {uretici.getSatisSirasi(), uretici.getUrunID(), uretici.getMID(), uretici.getIscilikMaliyeti(), uretici.getToplamMaliyet(), uretici.getSatisFiyati()};
                model.addRow(eklenecek);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(UreticiSatisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UreticiSatisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UreticiSatisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UreticiSatisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UreticiSatisEkrani dialog = new UreticiSatisEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton geriGelButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField karOraniAlani;
    private javax.swing.JTable ureticiSatisTablosu;
    // End of variables declaration//GEN-END:variables
}
