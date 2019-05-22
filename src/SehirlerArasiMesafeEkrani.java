
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class SehirlerArasiMesafeEkrani extends javax.swing.JDialog {

    DefaultTableModel model;
    UreticiIslemleri islemler=new UreticiIslemleri();
    
    
    public SehirlerArasiMesafeEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel)sehirlerArasiMesafeTablosu.getModel();
        sehirlerArasiMesafeGoruntule();
    }

    
    public void sehirlerArasiMesafeGoruntule()
    {
        model.setRowCount(0); //her defasinda tabloyu bosaltir
        ArrayList<SehirlerArasiMesafe> mesafeler=new ArrayList<SehirlerArasiMesafe>();
        mesafeler=islemler.sehirlerArasiMesafeleriGetir();
        
        if(mesafeler != null)
        {
            for(SehirlerArasiMesafe mesafe : mesafeler)
            {
                Object[]eklenecek={mesafe.getSehirSirasi(),mesafe.getSehirler(),mesafe.getMesafe()};
                model.addRow(eklenecek);
            }
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aramaCubugu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        sehirlerArasiMesafeTablosu = new javax.swing.JTable();
        geriGelButonu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sehirAlani = new javax.swing.JTextField();
        mesafeAlani = new javax.swing.JTextField();
        ekleButonu = new javax.swing.JButton();
        mesajAlani = new javax.swing.JLabel();
        guncelleButonu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 50, 0, 0));

        jLabel1.setText("Ara ");

        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        sehirlerArasiMesafeTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "sehirSirasi", "sehirler", "mesafe"
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
        sehirlerArasiMesafeTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sehirlerArasiMesafeTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sehirlerArasiMesafeTablosu);
        if (sehirlerArasiMesafeTablosu.getColumnModel().getColumnCount() > 0) {
            sehirlerArasiMesafeTablosu.getColumnModel().getColumn(0).setResizable(false);
            sehirlerArasiMesafeTablosu.getColumnModel().getColumn(1).setResizable(false);
            sehirlerArasiMesafeTablosu.getColumnModel().getColumn(2).setResizable(false);
        }

        geriGelButonu.setText("< Geri");
        geriGelButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriGelButonuActionPerformed(evt);
            }
        });

        jLabel2.setText("Sehir Adi :");

        jLabel3.setText("Mesafe Degeri :");

        ekleButonu.setText("Ekle");
        ekleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButonuActionPerformed(evt);
            }
        });

        mesajAlani.setForeground(new java.awt.Color(204, 0, 0));

        guncelleButonu.setText("Guncelle");
        guncelleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButonuActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel4.setText("Sehirler Arasi Mesafe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(geriGelButonu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(mesafeAlani))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(50, 50, 50)
                                        .addComponent(sehirAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ekleButonu)
                                    .addComponent(guncelleButonu)))
                            .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(166, 166, 166))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sehirAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekleButonu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(mesafeAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(guncelleButonu))
                .addGap(18, 18, 18)
                .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(geriGelButonu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButonuActionPerformed
        String sehirler=sehirAlani.getText();
        int mesafe=Integer.valueOf(mesafeAlani.getText());
        
        islemler.sehirlerArasiMesafeEkle(sehirler, mesafe);
        sehirlerArasiMesafeGoruntule();
        mesajAlani.setText("Yeni sehir ve mesafe basari ile eklendi.");
    }//GEN-LAST:event_ekleButonuActionPerformed

    private void geriGelButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriGelButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        yonlendirmeEkrani yonlendirmeEkran = new yonlendirmeEkrani(girisEkran, true);

        setVisible(false);
        yonlendirmeEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_geriGelButonuActionPerformed

    public void aramaYap(String arama)
    {
        TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(model);
        sehirlerArasiMesafeTablosu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(arama)); //dinamik bir sekilde aramak icin yapilir
    }
    
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        String arama=aramaCubugu.getText();
        aramaYap(arama);
    }//GEN-LAST:event_aramaCubuguKeyReleased

    private void guncelleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButonuActionPerformed
        
        String sehirler = sehirAlani.getText();
        int mesafe = Integer.valueOf(mesafeAlani.getText());

        int selectedRow = sehirlerArasiMesafeTablosu.getSelectedRow();
        
        if(selectedRow == -1){
            
            if(model.getRowCount() == 0){
                mesajAlani.setText("Sehirler Arasi Mesafe Tablosu Suan Bos");
            }else{
                mesajAlani.setText("Lutfen Guncellemek Istediginiz Sehri Secin.");
            }
        }else{
            int sehirSirasi = (int)model.getValueAt(selectedRow, 0);
            islemler.sehirlerArasiMesafeGuncelle(sehirSirasi,sehirler,mesafe);
            sehirlerArasiMesafeGoruntule();
            mesajAlani.setText("Sectiginiz Sehir Basari ile Guncellendi.");
        }
    }//GEN-LAST:event_guncelleButonuActionPerformed

    private void sehirlerArasiMesafeTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sehirlerArasiMesafeTablosuMouseClicked
        /*basilan satir secilsin ve guncelleme yapilsin.*/
        int selectedRow = sehirlerArasiMesafeTablosu.getSelectedRow();
        
        sehirAlani.setText(model.getValueAt(selectedRow, 1).toString());
        mesafeAlani.setText(model.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_sehirlerArasiMesafeTablosuMouseClicked

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SehirlerArasiMesafeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SehirlerArasiMesafeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SehirlerArasiMesafeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SehirlerArasiMesafeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SehirlerArasiMesafeEkrani dialog = new SehirlerArasiMesafeEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton geriGelButonu;
    private javax.swing.JButton guncelleButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mesafeAlani;
    private javax.swing.JLabel mesajAlani;
    private javax.swing.JTextField sehirAlani;
    private javax.swing.JTable sehirlerArasiMesafeTablosu;
    // End of variables declaration//GEN-END:variables
}
