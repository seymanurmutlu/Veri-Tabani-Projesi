
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;

public class hammaddeSatinAlmaEkrani extends javax.swing.JDialog {

    UreticiIslemleri islemler = new UreticiIslemleri();
    TedarikciIslemleri tedarikciIslemler = new TedarikciIslemleri();

    public hammaddeSatinAlmaEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geriGelButonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hammaddeAdiAlani = new javax.swing.JTextField();
        istenilenMiktarAlani = new javax.swing.JTextField();
        mesajAlani = new javax.swing.JLabel();
        ekleButonu = new javax.swing.JButton();
        mesajAlani2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 150, 0, 0));

        geriGelButonu.setText("< Geri");
        geriGelButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriGelButonuActionPerformed(evt);
            }
        });

        jLabel1.setText("Hammadde Adi :");

        jLabel2.setText("Istenilen Miktar :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Hammadde Satin Alma Ekrani");

        mesajAlani.setForeground(new java.awt.Color(204, 0, 0));

        ekleButonu.setText("Ekle");
        ekleButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButonuActionPerformed(evt);
            }
        });

        mesajAlani2.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(istenilenMiktarAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(hammaddeAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ekleButonu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mesajAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(geriGelButonu)
                    .addComponent(mesajAlani2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hammaddeAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(istenilenMiktarAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ekleButonu))
                .addGap(33, 33, 33)
                .addComponent(mesajAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesajAlani2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(geriGelButonu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ekleButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButonuActionPerformed

        String hammaddeAdi = hammaddeAdiAlani.getText();
        int istenilenMiktar = Integer.valueOf(istenilenMiktarAlani.getText());
        //..  aranan hammaddeyi al, sorguyla tedarikcilerden aradiklarini getir
        /////arraylist
        //.. ulasim i al
        //.. toplammaliyet =  hammadde x miktar ++ ulasim
        //.. arrayliste sirayla ekle
        /////////////////////////////////////////////////// 
        //.. arraylist sirala en kucugu satirdaki tum bilgiler ile al 
        //.. aldigin satir bilgilerini ureticialis tablosuna ekle
        //ArrayList<hammaddeSatinAl> hammaddeler = new ArrayList<hammaddeSatinAl>();
    /*    ArrayList<hammaddeSatinAl> yurtDisindakiHammaddeler = new ArrayList<hammaddeSatinAl>();
         ArrayList<hammaddeSatinAl> yurtIcındekiHammaddeler = new ArrayList<hammaddeSatinAl>();

         yurtIcındekiHammaddeler = islemler.yurtIcındekiHammaddeSatinAlinabilecekleriGoster(hammaddeAdi, istenilenMiktar); //..cikti geldi
         yurtDisindakiHammaddeler = islemler.yurtDisindakiHammaddeSatinAlinabilecekleriGoster(hammaddeAdi, istenilenMiktar);
         System.out.println(islemler.yurtIcındekiCikti.size());
         for (int i = 0; i < yurtIcındekiHammaddeler.size(); i++) {
         System.out.println("FID :" + yurtIcındekiHammaddeler.get(i).getFID());
         System.out.println("Hammadde Miktari : " + yurtIcındekiHammaddeler.get(i).getHammaddeMiktari());
         System.out.println("Satis Fiyati :" + yurtIcındekiHammaddeler.get(i).getSatisFiyati());
         System.out.println("Maliyet :" + yurtIcındekiHammaddeler.get(i).getMaliyet());
         System.out.println("-----------------------");
         }
         //...
         System.out.println("****************************");
         System.out.println(islemler.yurtDisindakiCikti.size());
         for (int i = 0; i < islemler.yurtDisindakiCikti.size(); i++) {
         System.out.println("Yurt Disindaki FID :" + islemler.yurtDisindakiCikti.get(i).getFID());
         System.out.println("Yurt Disindaki Hammadde Miktari : " + islemler.yurtDisindakiCikti.get(i).getHammaddeMiktari());
         System.out.println("Yurt Disindaki Satis Fiyati :" + islemler.yurtDisindakiCikti.get(i).getSatisFiyati());
         System.out.println("Yurt Disindaki Maliyet :" + islemler.yurtDisindakiCikti.get(i).getMaliyet());
         System.out.println("-----------------------");
         }**/
        ArrayList<hammaddeSatinAl> hammaddeler = new ArrayList<hammaddeSatinAl>(); 
        hammaddeler = hammaddeleriBirlestir(hammaddeAdi, istenilenMiktar);
        System.out.println(hammaddeler.size());
        for (int i = 0; i < hammaddeler.size(); i++) {
            System.out.println("FID :" +hammaddeler.get(i).getFID());
            System.out.println("Hammadde Miktari : " + hammaddeler.get(i).getHammaddeMiktari());
            System.out.println("Satis Fiyati :" + hammaddeler.get(i).getSatisFiyati());
            System.out.println("Maliyet :" + hammaddeler.get(i).getMaliyet());
            System.out.println("-----------------------");
        }
        mesajAlani.setText("Hammadde Alimi Basari ile Gerceklemistir.");
        mesajAlani2.setText("Uretici Alis Tablosunu Kontrol Ediniz ...");
        
                int alinanMiktar;
        alinanMiktar = istenilenMiktar;
        //String urtTarih = tedarikciIslemler.tedarikEdilenUrunUrtTarihBul(hammaddeler.get(0).getFID(), hammaddeAdi, hammaddeler.get(0).getHammaddeMiktari(), hammaddeler.get(0).getSatisFiyati());
        //int rafOmru = tedarikciIslemler.tedarikEdilenUrunRafOmruBul(hammaddeler.get(0).getFID(), hammaddeAdi, hammaddeler.get(0).getHammaddeMiktari(), hammaddeler.get(0).getSatisFiyati());
        ArrayList<TedarikciBilgileri> firmalar = tedarikciIslemler.firmaAdiBul(hammaddeler.get(0).getFID());
        String firmaAdi = firmalar.get(0).getFirmaAd();
        while (istenilenMiktar != 0) {
            if (hammaddeler.get(0).getHammaddeMiktari() >= istenilenMiktar) {
                tedarikciIslemler.tedarikciStokGuncelle(hammaddeler.get(0).getFID(), hammaddeAdi, hammaddeler.get(0).getHammaddeMiktari() - istenilenMiktar, hammaddeler.get(0).getSatisFiyati());
         //       islemler.ureticiAlimEkle(firmalar.get(0).getFirmaAd(), hammaddeAdi, hammaddeler.get(0).getMaliyet(), alinanMiktar, alinanMiktar);
                istenilenMiktar = 0;
            } else {
                tedarikciIslemler.tedarikciStokGuncelle(hammaddeler.get(0).getFID(), hammaddeAdi, 0,  hammaddeler.get(0).getSatisFiyati());
                istenilenMiktar = istenilenMiktar - hammaddeler.get(0).getHammaddeMiktari();
           //     islemler.ureticiAlimEkle(firmalar.get(0).getFirmaAd(), hammaddeAdi, hammaddeler.get(0).getMaliyet(), hammaddeler.get(0).getHammaddeMiktari(), hammaddeler.get(0).getHammaddeMiktari());
                hammaddeler.remove(0);
            }
        }
    }//GEN-LAST:event_ekleButonuActionPerformed

    public ArrayList<hammaddeSatinAl> hammaddeleriBirlestir(String hammaddeAdi, int istenilenMiktar) {
        ArrayList<hammaddeSatinAl> list = new ArrayList<hammaddeSatinAl>();
        list = islemler.yurtIcindekiHammaddeSatinAlinabilecekleriGoster(hammaddeAdi, istenilenMiktar);
        list.addAll(islemler.yurtDisindakiHammaddeSatinAlinabilecekleriGoster(hammaddeAdi, istenilenMiktar));
        return list;
    }


    private void geriGelButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriGelButonuActionPerformed

        GirisEkrani girisEkran = new GirisEkrani();
        yonlendirmeEkrani yonlendirmeEkran = new yonlendirmeEkrani(girisEkran, true);

        setVisible(false);
        yonlendirmeEkran.setVisible(true);
        System.exit(0);
    }//GEN-LAST:event_geriGelButonuActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hammaddeSatinAlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hammaddeSatinAlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hammaddeSatinAlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hammaddeSatinAlmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                hammaddeSatinAlmaEkrani dialog = new hammaddeSatinAlmaEkrani(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton ekleButonu;
    private javax.swing.JButton geriGelButonu;
    private javax.swing.JTextField hammaddeAdiAlani;
    private javax.swing.JTextField istenilenMiktarAlani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mesajAlani;
    private javax.swing.JLabel mesajAlani2;
    // End of variables declaration//GEN-END:variables
}
