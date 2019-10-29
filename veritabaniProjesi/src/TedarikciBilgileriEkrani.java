
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class TedarikciBilgileriEkrani extends javax.swing.JDialog {
    DefaultTableModel model;
    TedarikciIslemleri islemler = new TedarikciIslemleri();
    
    
    
    public TedarikciBilgileriEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel)tedarikciBilgileriTablosu.getModel();
        tedarikciBilgileriGoruntule();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geriGelButonu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tedarikciBilgileriTablosu = new javax.swing.JTable();
        aramaCubugu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firmaAdiAlani = new javax.swing.JTextField();
        ulkeAlani = new javax.swing.JTextField();
        sehirAlani = new javax.swing.JTextField();
        tedarikciEklemeButonu = new javax.swing.JButton();
        tedarikciGuncellemeButonu = new javax.swing.JButton();
        mesajAlani = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(350, 50, 0, 0));

        geriGelButonu.setText("< Geri");
        geriGelButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriGelButonuActionPerformed(evt);
            }
        });

        tedarikciBilgileriTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FID", "firmaAdi", "ulke", "sehir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tedarikciBilgileriTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tedarikciBilgileriTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tedarikciBilgileriTablosu);
        if (tedarikciBilgileriTablosu.getColumnModel().getColumnCount() > 0) {
            tedarikciBilgileriTablosu.getColumnModel().getColumn(0).setResizable(false);
            tedarikciBilgileriTablosu.getColumnModel().getColumn(1).setResizable(false);
            tedarikciBilgileriTablosu.getColumnModel().getColumn(2).setResizable(false);
            tedarikciBilgileriTablosu.getColumnModel().getColumn(3).setResizable(false);
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

        jLabel2.setText("Firma Adi :");

        jLabel3.setText("Ulke :");

        jLabel4.setText("Sehir :");

        tedarikciEklemeButonu.setText("Ekle");
        tedarikciEklemeButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tedarikciEklemeButonuActionPerformed(evt);
            }
        });

        tedarikciGuncellemeButonu.setText("Guncelle");
        tedarikciGuncellemeButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tedarikciGuncellemeButonuActionPerformed(evt);
            }
        });

        mesajAlani.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel5.setText("Tedarikci Bilgileri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(firmaAdiAlani)
                                        .addComponent(ulkeAlani)
                                        .addComponent(sehirAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tedarikciEklemeButonu)
                                        .addComponent(tedarikciGuncellemeButonu))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(geriGelButonu, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firmaAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tedarikciEklemeButonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ulkeAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tedarikciGuncellemeButonu)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sehirAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geriGelButonu)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public void tedarikciBilgileriGoruntule() {
        model.setRowCount(0); //her defasinda tabloyu bosaltir.
        ArrayList<TedarikciBilgileri> tedarikciBilgi = new ArrayList<TedarikciBilgileri>();
        tedarikciBilgi = islemler.tedarikciBilgileriniGetir();

        if (tedarikciBilgi != null) {
            for (TedarikciBilgileri bilgi : tedarikciBilgi) {
                Object[] eklenecek = {bilgi.getFID(), bilgi.getFirmaAd(),bilgi.getUlke(),bilgi.getSehir()};

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

    private void aramaCubuguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aramaCubuguActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aramaCubuguActionPerformed

    private void tedarikciEklemeButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tedarikciEklemeButonuActionPerformed
        
        String firmaAdi=firmaAdiAlani.getText();
        String ulke=ulkeAlani.getText();
        String sehir=sehirAlani.getText();
        
        islemler.tedarikciBilgileriEkle(firmaAdi, ulke, sehir);
        tedarikciBilgileriGoruntule();
        mesajAlani.setText("Yeni tedarikci basari ile eklendi.");
        
    }//GEN-LAST:event_tedarikciEklemeButonuActionPerformed

    private void tedarikciGuncellemeButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tedarikciGuncellemeButonuActionPerformed
        
        String firmaAdi=firmaAdiAlani.getText();
        String ulke=ulkeAlani.getText();
        String sehir=sehirAlani.getText();
        
        int selectedRow=tedarikciBilgileriTablosu.getSelectedRow();
        
        if(selectedRow == -1){
            
            if(model.getRowCount() == 0){
                mesajAlani.setText("Tedarikci Bilgileri Tablosu Suan Bos");
            }else{
                mesajAlani.setText("Lutfen Guncellenemek Istediginiz Tedarikciyi Secin.");
            }
                
    }//GEN-LAST:event_tedarikciGuncellemeButonuActionPerformed
        else{
            int FID = (int)model.getValueAt(selectedRow, 0);
            islemler.tedarikciBilgileriGuncelle(firmaAdi, ulke, sehir,FID);
            tedarikciBilgileriGoruntule();
            mesajAlani.setText((selectedRow+1)+". Tedarikci basari ile guncellendi.");
        }
       
    
    
    
    }
    public void aramaYap(String arama)
    {
        TableRowSorter<DefaultTableModel> tr=new  TableRowSorter<DefaultTableModel>(model);
        tedarikciBilgileriTablosu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(arama)); //dinamik bir sekilde aramak icin yapilir
    }
    
    
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased
        
        String arama=aramaCubugu.getText();
        aramaYap(arama);
    }//GEN-LAST:event_aramaCubuguKeyReleased

    private void tedarikciBilgileriTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tedarikciBilgileriTablosuMouseClicked
        int selectedRow=tedarikciBilgileriTablosu.getSelectedRow();
        
        firmaAdiAlani.setText(model.getValueAt(selectedRow,1).toString());
        ulkeAlani.setText(model.getValueAt(selectedRow,2).toString());
        sehirAlani.setText(model.getValueAt(selectedRow,3).toString());
    }//GEN-LAST:event_tedarikciBilgileriTablosuMouseClicked

    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TedarikciBilgileriEkrani dialog = new TedarikciBilgileriEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField firmaAdiAlani;
    private javax.swing.JButton geriGelButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mesajAlani;
    private javax.swing.JTextField sehirAlani;
    private javax.swing.JTable tedarikciBilgileriTablosu;
    private javax.swing.JButton tedarikciEklemeButonu;
    private javax.swing.JButton tedarikciGuncellemeButonu;
    private javax.swing.JTextField ulkeAlani;
    // End of variables declaration//GEN-END:variables
}
