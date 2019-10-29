
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class UreticiUretilenEkrani extends javax.swing.JDialog {

    DefaultTableModel model;
    UreticiIslemleri islemler = new UreticiIslemleri();
    ArrayList<ureticiUretilenEkleme> alinacaklar=new ArrayList<ureticiUretilenEkleme>();
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public UreticiUretilenEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel) ureticiUretilenTablosu.getModel();
        ureticiUretilenGoruntule();
    }

    @SuppressWarnings("unchecked")
    
    public void ureticiUretilenGoruntule()
    {
        model.setRowCount(0);// her defasinda tabloyu bosaltir
        ArrayList<UreticiUretilen> ureticiUretilenler=new ArrayList<UreticiUretilen>();
        ureticiUretilenler=islemler.ureticiUretilenleriniGetir();
        
        if(ureticiUretilenler != null)
        {
            for(UreticiUretilen uretici : ureticiUretilenler)
            {
                Object[] eklenecek={uretici.getUrunID(),uretici.getKimyasalAdi(),uretici.getUretimTarihi(),uretici.getRafOmru(),uretici.getStok()};
                model.addRow(eklenecek);
            }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ureticiUretilenTablosu = new javax.swing.JTable();
        geriGelButonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        aramaCubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        urunIDAlani = new javax.swing.JTextField();
        kimyasalAdiAlani = new javax.swing.JTextField();
        uretimTarihiAlani = new javax.swing.JTextField();
        rafOmruAlani = new javax.swing.JTextField();
        stokAlani = new javax.swing.JTextField();
        ureticiUretilenEkleButonu = new javax.swing.JButton();
        mesajAlani = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 85, 0, 0));

        ureticiUretilenTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "urunID", "kimyasalAdi", "uretimTarihi", "rafOmru", "stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ureticiUretilenTablosu);
        if (ureticiUretilenTablosu.getColumnModel().getColumnCount() > 0) {
            ureticiUretilenTablosu.getColumnModel().getColumn(0).setResizable(false);
            ureticiUretilenTablosu.getColumnModel().getColumn(1).setResizable(false);
            ureticiUretilenTablosu.getColumnModel().getColumn(2).setResizable(false);
            ureticiUretilenTablosu.getColumnModel().getColumn(3).setResizable(false);
            ureticiUretilenTablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        geriGelButonu.setText("< Geri");
        geriGelButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriGelButonuActionPerformed(evt);
            }
        });

        jLabel1.setText("Ara");

        aramaCubugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aramaCubuguActionPerformed(evt);
            }
        });
        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel2.setText("Uretici Uretilen");

        jLabel3.setText("UrunID :");

        jLabel4.setText("Kimyasal Adi :");

        jLabel5.setText("Uretim Tarihi :");

        jLabel6.setText("Raf Omru :");

        jLabel7.setText("Stok :");

        ureticiUretilenEkleButonu.setText("Ekle");
        ureticiUretilenEkleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ureticiUretilenEkleButonuActionPerformed(evt);
            }
        });

        mesajAlani.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mesajAlani.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(urunIDAlani)
                                    .addComponent(kimyasalAdiAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uretimTarihiAlani)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rafOmruAlani)
                                    .addComponent(stokAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addComponent(ureticiUretilenEkleButonu)
                                .addContainerGap(196, Short.MAX_VALUE))
                            .addComponent(mesajAlani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(798, 798, 798)
                                .addComponent(geriGelButonu))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aramaCubugu)))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(358, 358, 358))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(urunIDAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rafOmruAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ureticiUretilenEkleButonu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(kimyasalAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stokAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(uretimTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(mesajAlani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geriGelButonu)
                .addGap(14, 14, 14))
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

    private void aramaCubuguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aramaCubuguActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aramaCubuguActionPerformed

    public void aramaYap(String arama)
    {
        TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(model);
        ureticiUretilenTablosu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(arama)); //dinamik bir sekilde aramak icin yapilir
    }
    
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        
        String arama=aramaCubugu.getText();
        aramaYap(arama);
    }//GEN-LAST:event_aramaCubuguKeyReleased

    private void ureticiUretilenEkleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureticiUretilenEkleButonuActionPerformed
        int urunID=Integer.valueOf(urunIDAlani.getText());
        String kimyasalAdi=kimyasalAdiAlani.getText();
        String uretimTarihi=uretimTarihiAlani.getText();
        int rafOmru=Integer.valueOf(rafOmruAlani.getText());
        int stok=Integer.valueOf(stokAlani.getText());
        
         islemler.uretiUretilenEkle(urunID, kimyasalAdi, uretimTarihi, rafOmru, stok); //kullanicinin girdigi degerler tabloya eklenir
         ureticiUretilenGoruntule();  //ureticiuretilen tablosu goruntulenir
         alinacaklar=islemler.uretmekIcinGerekenleriGoster(urunID, stok,uretimTarihi);
        
        System.out.println("Kac tane bileseni var :"+alinacaklar.size());
        
        for (int i = 0; i < alinacaklar.size(); i++) {
         System.out.println("urun ID :" + alinacaklar.get(i).getUrunID());
         System.out.println("Kimyasal Bilesen : " + alinacaklar.get(i).getKimyasalBilesen());
         System.out.println("Satin Alinacak Miktar :" + alinacaklar.get(i).getSatinAlinacakMiktar());
         System.out.println("-----------------------");
         }
        
     /*   String sorgu="SELECT A1.satinAlinan FROM ureticiAlis A1 WHERE A1.satinAlinan=?";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            String varMi="";
            
            for (int i = 0; i < alinacaklar.size(); i++) {
                
                preparedStatement.setString(1,alinacaklar.get(i).getKimyasalBilesen());
                ResultSet rs=preparedStatement.executeQuery();
                
                  while(rs.next())
                  {
                      varMi=rs.getString("A1.satinAlinan");
                  }
                
                 if(varMi != "")
                {
                    System.out.println(alinacaklar.get(i).getKimyasalBilesen()+""+"stokta bulunmaktadir ..");
                }
           }
            
        } catch (SQLException ex) {
            System.out.println("Stokta alinacak urun mevcut mu sorgusunda hata bulunmaktadir ..");
        }*/
         mesajAlani.setText("Uretici Alis Tablosunu Kontrol ediniz ..");
         
         
        
        
    }//GEN-LAST:event_ureticiUretilenEkleButonuActionPerformed

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
            java.util.logging.Logger.getLogger(UreticiUretilenEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UreticiUretilenEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UreticiUretilenEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UreticiUretilenEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UreticiUretilenEkrani dialog = new UreticiUretilenEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kimyasalAdiAlani;
    private javax.swing.JLabel mesajAlani;
    private javax.swing.JTextField rafOmruAlani;
    private javax.swing.JTextField stokAlani;
    private javax.swing.JButton ureticiUretilenEkleButonu;
    private javax.swing.JTable ureticiUretilenTablosu;
    private javax.swing.JTextField uretimTarihiAlani;
    private javax.swing.JTextField urunIDAlani;
    // End of variables declaration//GEN-END:variables
}
