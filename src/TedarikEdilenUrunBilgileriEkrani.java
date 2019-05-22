
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class TedarikEdilenUrunBilgileriEkrani extends javax.swing.JDialog {

     DefaultTableModel model;
     TedarikciIslemleri islemler = new TedarikciIslemleri();
         
     public TedarikEdilenUrunBilgileriEkrani(){
     }
    
    public TedarikEdilenUrunBilgileriEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        model = (DefaultTableModel) tedarikEdilenUrunBilgileriTablosu.getModel();
        tedarikEdilenUrunBilgileriGoruntule();
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        geriGelButonu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tedarikEdilenUrunBilgileriTablosu = new javax.swing.JTable();
        aramaCubugu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FIDAlani = new javax.swing.JTextField();
        uretilenHammaddeAlani = new javax.swing.JTextField();
        hammaddeMiktariAlani = new javax.swing.JTextField();
        uretimTarihiAlani = new javax.swing.JTextField();
        rafOmruAlani = new javax.swing.JTextField();
        satisFiyatiAlani = new javax.swing.JTextField();
        tedarikEklemeButonu = new javax.swing.JButton();
        guncelleButonu = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        mesajAlani = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(280, 20, 0, 0));

        geriGelButonu.setText("< Geri");
        geriGelButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriGelButonuActionPerformed(evt);
            }
        });

        tedarikEdilenUrunBilgileriTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FID", "uretilenHammadde", "hammaddeMiktari", "urtTarih", "rafOmru", "satisFiyati"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        tedarikEdilenUrunBilgileriTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tedarikEdilenUrunBilgileriTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tedarikEdilenUrunBilgileriTablosu);
        if (tedarikEdilenUrunBilgileriTablosu.getColumnModel().getColumnCount() > 0) {
            tedarikEdilenUrunBilgileriTablosu.getColumnModel().getColumn(0).setResizable(false);
            tedarikEdilenUrunBilgileriTablosu.getColumnModel().getColumn(1).setResizable(false);
            tedarikEdilenUrunBilgileriTablosu.getColumnModel().getColumn(2).setResizable(false);
            tedarikEdilenUrunBilgileriTablosu.getColumnModel().getColumn(3).setResizable(false);
            tedarikEdilenUrunBilgileriTablosu.getColumnModel().getColumn(4).setResizable(false);
            tedarikEdilenUrunBilgileriTablosu.getColumnModel().getColumn(5).setResizable(false);
        }

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

        jLabel1.setText("Ara ");

        jLabel2.setText("FID :");

        jLabel3.setText("Uretilen Hammadde :");

        jLabel4.setText("Hammadde Miktari :");

        jLabel5.setText("Uretim Tarihi :");

        jLabel6.setText("Raf Omru :");

        jLabel7.setText("Satis Fiyati :");

        FIDAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIDAlaniActionPerformed(evt);
            }
        });

        tedarikEklemeButonu.setText("Ekle");
        tedarikEklemeButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tedarikEklemeButonuActionPerformed(evt);
            }
        });

        guncelleButonu.setText("Guncelle");
        guncelleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButonuActionPerformed(evt);
            }
        });

        mesajAlani.setForeground(new java.awt.Color(204, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel8.setText("Tedarik Edilen Urun Bilgileri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7))
                                                .addGap(47, 47, 47))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(hammaddeMiktariAlani)
                                                .addComponent(rafOmruAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(satisFiyatiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(uretilenHammaddeAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(99, 99, 99)
                                        .addComponent(FIDAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(uretimTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tedarikEklemeButonu)
                                            .addComponent(guncelleButonu)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(geriGelButonu))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FIDAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tedarikEklemeButonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guncelleButonu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hammaddeMiktariAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uretimTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(uretilenHammaddeAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rafOmruAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(satisFiyatiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geriGelButonu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tedarikEdilenUrunBilgileriGoruntule()
    {
        model.setRowCount(0); //her defasinda tabloyu bosaltir.
        ArrayList<TedarikEdilenUrunBilgileri> tedarikEdilenUrunler=new ArrayList<TedarikEdilenUrunBilgileri>();
        
        tedarikEdilenUrunler=islemler.tedarikEdilenUrunBilgileriniGetir();
        
        if(tedarikEdilenUrunler != null){
            
            for(TedarikEdilenUrunBilgileri tedarikEdilenUrun : tedarikEdilenUrunler){
                
                Object[] ekle={tedarikEdilenUrun.getFID(),tedarikEdilenUrun.getUretilenHammadde(),tedarikEdilenUrun.getHammaddeMiktari(),tedarikEdilenUrun.getUrtTarih(),tedarikEdilenUrun.getRafOmru(),tedarikEdilenUrun.getSatisFiyati()};
                
                model.addRow(ekle);
                
            }
        }
        
    }
    
    private void geriGelButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriGelButonuActionPerformed
        GirisEkrani girisEkran = new GirisEkrani();
        yonlendirmeEkrani yonlendirmeEkran = new yonlendirmeEkrani(girisEkran, true);

        setVisible(false);
        yonlendirmeEkran.setVisible(true);
        System.exit(0);    }//GEN-LAST:event_geriGelButonuActionPerformed

    private void aramaCubuguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aramaCubuguActionPerformed
        
    }//GEN-LAST:event_aramaCubuguActionPerformed

     public void aramaYap(String arama)
    {
        TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(model);
        tedarikEdilenUrunBilgileriTablosu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(arama)); //dinamik bir sekilde aramak icin yapilir
    }
        
        
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        
        String arama=aramaCubugu.getText();
        aramaYap(arama);
    }//GEN-LAST:event_aramaCubuguKeyReleased

    private void FIDAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIDAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIDAlaniActionPerformed

    private void tedarikEklemeButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tedarikEklemeButonuActionPerformed
       
        int FID=Integer.valueOf(FIDAlani.getText());
        String uretilenHammadde=uretilenHammaddeAlani.getText();
        String urtTarih=uretimTarihiAlani.getText();
        int hammaddeMiktari=Integer.valueOf(hammaddeMiktariAlani.getText());
        int rafOmru=Integer.valueOf(rafOmruAlani.getText());
        int satisFiyati=Integer.valueOf(satisFiyatiAlani.getText());
        
        islemler.tedarikEdilenUrunleriEkle(FID, uretilenHammadde, hammaddeMiktari, urtTarih, rafOmru, satisFiyati);
        tedarikEdilenUrunBilgileriGoruntule();
        mesajAlani.setText("Tedarikci urunleri basari ile eklendi .");
    }//GEN-LAST:event_tedarikEklemeButonuActionPerformed

    private void guncelleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButonuActionPerformed
     
        String uretilenHammadde=uretilenHammaddeAlani.getText();
        int hammaddeMiktari=Integer.valueOf(hammaddeMiktariAlani.getText());
        int rafOmru=Integer.valueOf(rafOmruAlani.getText());
        int satisFiyati=Integer.valueOf(satisFiyatiAlani.getText());
        
        int selectedRow=tedarikEdilenUrunBilgileriTablosu.getSelectedRow();
        
        if (selectedRow == -1) {

            if (model.getRowCount() == 0) {
                mesajAlani.setText("Tedarik Edilen Urun Bilgileri Tablosu Suan Bos");
            } else {
                mesajAlani.setText("Lutfen Guncellenemek Istediginiz Tedarikci Bilgisini Secin.");
            }
        } else {
            int FID = (int) model.getValueAt(selectedRow, 0);
            String urtTarih=(String)model.getValueAt(selectedRow, 3);
            islemler.tedarikEdilenUrunleriGuncelle(FID, uretilenHammadde, hammaddeMiktari, urtTarih, rafOmru, satisFiyati);
            tedarikEdilenUrunBilgileriGoruntule();
            mesajAlani.setText("Tedarikci Urun Bilgisi Basari ile Guncellendi.");
        }
        
        
        
    }//GEN-LAST:event_guncelleButonuActionPerformed

    private void tedarikEdilenUrunBilgileriTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tedarikEdilenUrunBilgileriTablosuMouseClicked
        
        int selectedRow=tedarikEdilenUrunBilgileriTablosu.getSelectedRow();
        uretilenHammaddeAlani.setText(model.getValueAt(selectedRow, 1).toString());
        hammaddeMiktariAlani.setText(model.getValueAt(selectedRow, 2).toString());
        rafOmruAlani.setText(model.getValueAt(selectedRow, 4).toString());
        satisFiyatiAlani.setText(model.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_tedarikEdilenUrunBilgileriTablosuMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TedarikEdilenUrunBilgileriEkrani dialog = new TedarikEdilenUrunBilgileriEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField FIDAlani;
    private javax.swing.JTextField aramaCubugu;
    private javax.swing.JButton geriGelButonu;
    private javax.swing.JButton guncelleButonu;
    private javax.swing.JTextField hammaddeMiktariAlani;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mesajAlani;
    private javax.swing.JTextField rafOmruAlani;
    private javax.swing.JTextField satisFiyatiAlani;
    private javax.swing.JTable tedarikEdilenUrunBilgileriTablosu;
    private javax.swing.JButton tedarikEklemeButonu;
    private javax.swing.JTextField uretilenHammaddeAlani;
    private javax.swing.JTextField uretimTarihiAlani;
    // End of variables declaration//GEN-END:variables
}
