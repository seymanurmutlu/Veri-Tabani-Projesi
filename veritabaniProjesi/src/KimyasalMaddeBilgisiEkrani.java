
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class KimyasalMaddeBilgisiEkrani extends javax.swing.JDialog {

    DefaultTableModel model;
    MusteriIslemleri islemler=new MusteriIslemleri();
    
    public KimyasalMaddeBilgisiEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel) kimyasalMaddeTablosu.getModel();
        kimyasalMaddeBilgisiGoruntule();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aramaCubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        kimyasalMaddeTablosu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        urunIdAlani = new javax.swing.JTextField();
        kimyasalBilesenAlani = new javax.swing.JTextField();
        gerekenMiktarAlani = new javax.swing.JTextField();
        ekleButonu = new javax.swing.JButton();
        mesajAlani = new javax.swing.JLabel();
        geriGelButonu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        kimyasalAdAlani = new javax.swing.JTextField();
        kimyasalAdEkle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 20, 0, 0));

        jLabel1.setText("Ara ");

        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        kimyasalMaddeTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "urunID", "kimyasalBilesen", "gerekenMiktar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(kimyasalMaddeTablosu);
        if (kimyasalMaddeTablosu.getColumnModel().getColumnCount() > 0) {
            kimyasalMaddeTablosu.getColumnModel().getColumn(0).setResizable(false);
            kimyasalMaddeTablosu.getColumnModel().getColumn(1).setResizable(false);
            kimyasalMaddeTablosu.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("Urun ID :");

        jLabel3.setText("Kimyasal Bilesen :");

        jLabel4.setText("Gereken Miktar :");

        ekleButonu.setText("Ekle");
        ekleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButonuActionPerformed(evt);
            }
        });

        mesajAlani.setForeground(new java.awt.Color(204, 0, 0));

        geriGelButonu.setText("< Geri");
        geriGelButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriGelButonuActionPerformed(evt);
            }
        });

        jLabel5.setText("Kimyasal Adi :");

        kimyasalAdEkle.setText("Kimyasal Adi Ekle");
        kimyasalAdEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kimyasalAdEkleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel6.setText("Kimyasal Madde Bilgisi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajAlani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(geriGelButonu))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(28, 28, 28)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(74, 74, 74))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(urunIdAlani)
                                    .addComponent(kimyasalBilesenAlani)
                                    .addComponent(gerekenMiktarAlani)
                                    .addComponent(kimyasalAdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ekleButonu)
                                    .addComponent(kimyasalAdEkle))))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urunIdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ekleButonu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(kimyasalBilesenAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(gerekenMiktarAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kimyasalAdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kimyasalAdEkle))
                .addGap(18, 18, 18)
                .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(geriGelButonu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void kimyasalMaddeBilgisiGoruntule()
    {
        model.setRowCount(0); // her defasinda tabloyu bosaltir
        ArrayList<KimyasalMaddeBilgisi> kimyasalMaddeBilgileri=new ArrayList<KimyasalMaddeBilgisi>();
        kimyasalMaddeBilgileri=islemler.kimyasalMaddeBilgisiniGetir();
        
        if(kimyasalMaddeBilgileri != null)
        {
            for(KimyasalMaddeBilgisi madde : kimyasalMaddeBilgileri)
            {
                Object[] eklenecek={madde.getUrunID(),madde.getKimyasalBilesen(),madde.getGerekenMiktar()};
                model.addRow(eklenecek);
            }
        }
    }
    
    private void ekleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButonuActionPerformed
       
        int urunID=Integer.valueOf(urunIdAlani.getText());
        String kimyasalBilesen=kimyasalBilesenAlani.getText();
        int gerekenMiktar=Integer.valueOf(gerekenMiktarAlani.getText());
        
        islemler.kimyasalMaddeBilgisiEkle(urunID, kimyasalBilesen, gerekenMiktar);
        kimyasalMaddeBilgisiGoruntule();
        mesajAlani.setText("Yeni kimyasal madde bilgi basari ile eklendi.");
    }//GEN-LAST:event_ekleButonuActionPerformed

    public void aramaYap(String arama)
    {
        TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(model);
        kimyasalMaddeTablosu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(arama)); //dinamik bir sekilde aramak icin yapilir
    }
    
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        String arama=aramaCubugu.getText();
        aramaYap(arama);
    }//GEN-LAST:event_aramaCubuguKeyReleased

    private void geriGelButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriGelButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        yonlendirmeEkrani yonlendirmeEkran = new yonlendirmeEkrani(girisEkran, true);

        setVisible(false);
        yonlendirmeEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_geriGelButonuActionPerformed

    private void kimyasalAdEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kimyasalAdEkleActionPerformed
       
        String kimyasalAdi=kimyasalAdAlani.getText();
        islemler.kimyasalMaddeAdiEkle(kimyasalAdi);
    }//GEN-LAST:event_kimyasalAdEkleActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KimyasalMaddeBilgisiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KimyasalMaddeBilgisiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KimyasalMaddeBilgisiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KimyasalMaddeBilgisiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KimyasalMaddeBilgisiEkrani dialog = new KimyasalMaddeBilgisiEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ekleButonu;
    private javax.swing.JTextField gerekenMiktarAlani;
    private javax.swing.JButton geriGelButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kimyasalAdAlani;
    private javax.swing.JButton kimyasalAdEkle;
    private javax.swing.JTextField kimyasalBilesenAlani;
    private javax.swing.JTable kimyasalMaddeTablosu;
    private javax.swing.JLabel mesajAlani;
    private javax.swing.JTextField urunIdAlani;
    // End of variables declaration//GEN-END:variables
}
