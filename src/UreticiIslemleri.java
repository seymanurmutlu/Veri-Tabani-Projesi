
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UreticiIslemleri {

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private PreparedStatement preparedStatement2 = null;
    public int karOrani;
    public int kargoMaliyeti;
    public ArrayList<hammaddeSatinAl> yurtDisindakiCikti = new ArrayList<hammaddeSatinAl>();
    public ArrayList<hammaddeSatinAl> cikti = new ArrayList<hammaddeSatinAl>();

    public int getKarOrani() {
        return karOrani;
    }

    public void setKarOrani(int karOrani) {
        this.karOrani = karOrani;
    }

    public int getKargoMaliyeti() {
        return kargoMaliyeti;
    }

    public void setKargoMaliyeti(int kargoMaliyeti) {
        this.kargoMaliyeti = kargoMaliyeti;
    }

    public UreticiIslemleri() {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi + "?useUnicode=true&characterEncoding=utf8";

        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }

        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Bağlantı Başarılı...");

        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
    }

    public boolean girisYap(String kullanici_adi, String parola) {

        String sorgu = "Select * From adminler where username = ? and password = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);

            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(UreticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ArrayList<UreticiBilgileri> ureticiBilgileriGetir() {
        ArrayList<UreticiBilgileri> cikti = new ArrayList<UreticiBilgileri>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM ureticibilgi";
            ResultSet rs = statement.executeQuery(sorgu); //sorgunun sonucu rs'de tutulur
            while (rs.next()) {
                int FID = rs.getInt("FID");
                String firmaAdi = rs.getString("firmaAdi");
                String sehir = rs.getString("sehir");

                cikti.add(new UreticiBilgileri(FID, firmaAdi, sehir));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(UreticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<UreticiSatis> ureticiSatislariniGetir() {
        ArrayList<UreticiSatis> cikti = new ArrayList<UreticiSatis>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM ureticisatis";
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int satisSirasi = rs.getInt("satisSirasi");
                int urunID = rs.getInt("urunID");
                int MID = rs.getInt("MID");
                int iscilikMaliyeti = rs.getInt("iscilikMaliyeti");
                int toplamMaliyet = rs.getInt("toplamMaliyet");
                int satisFiyati = rs.getInt("satisFiyati");

                cikti.add(new UreticiSatis(satisSirasi, urunID, MID, iscilikMaliyeti, toplamMaliyet, satisFiyati));
            }
            return cikti;

        } catch (SQLException ex) {
            System.out.println("uretici satislarini getir metodunda sorun var"); //silinecek
            return null;
        }

    }

    public ArrayList<SehirlerArasiMesafe> sehirlerArasiMesafeleriGetir() {
        ArrayList<SehirlerArasiMesafe> cikti = new ArrayList<SehirlerArasiMesafe>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM sehirlerarasimesafe";
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int sehirSirasi = rs.getInt("sehirSirasi");
                String sehirler = rs.getString("sehirler");
                int mesafe = rs.getInt("mesafe");
                cikti.add(new SehirlerArasiMesafe(sehirSirasi, sehirler, mesafe));
            }
            return cikti;

        } catch (SQLException ex) {
            System.out.println("Sehirler arasi mesafeleri getir sorgusu hatalidir");
            return null;
        }

    }

    public ArrayList<UreticiAlim> ureticiAlimlariniGetir() {
        ArrayList<UreticiAlim> cikti = new ArrayList<UreticiAlim>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM ureticialis";
            ResultSet rs = statement.executeQuery(sorgu); //sorgunun sonucu rs'de tutulur
            while (rs.next()) {
                int satinAlmaSirasi = rs.getInt("satinAlmaSirasi");
                String firmaAdi = rs.getString("firmaAdi");
                String satinAlinan = rs.getString("satinAlinan");
                int alisMaliyeti = rs.getInt("alisMaliyeti");
                int alinanMaddeMiktari = rs.getInt("alinanMaddeMiktari");
                int stokSayisi = rs.getInt("stokSayisi");

                cikti.add(new UreticiAlim(satinAlmaSirasi, firmaAdi, satinAlinan, alisMaliyeti, alinanMaddeMiktari, stokSayisi));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(UreticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<UreticiUretilen> ureticiUretilenleriniGetir() {
        ArrayList<UreticiUretilen> cikti = new ArrayList<UreticiUretilen>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM ureticiuretilen";
            ResultSet rs = statement.executeQuery(sorgu); //sorgunun sonucu rs'de tutulur
            while (rs.next()) {
                int urunID = rs.getInt("urunID");
                String kimyasalAdi = rs.getString("kimyasalAdi");
                String uretimTarihi = rs.getString("uretimTarihi");
                int rafOmru = rs.getInt("rafOmru");
                int stok = rs.getInt("stok");

                cikti.add(new UreticiUretilen(urunID, kimyasalAdi, uretimTarihi, rafOmru, stok));
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(UreticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void sehirlerArasiMesafeEkle(String sehirler, int mesafe) {
        String sorgu = "INSERT INTO sehirlerarasimesafe (sehirler,mesafe) VALUES(?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, sehirler);
            preparedStatement.setInt(2, mesafe);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Sehirler arasi mesafe ekleme sorgusunda hata vardir");
        }
    }

    public void ureticiEkle(String firmaAdi, String sehir) {

        String sorgu = "INSERT INTO ureticibilgi (firmaAdi,sehir) VALUES (?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, firmaAdi);
            preparedStatement.setString(2, sehir);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UreticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ureticiGuncelle(int id, String yeniFirmaAd, String yeniSehir) {
        String sorgu = "Update ureticibilgi set firmaAdi = ? , sehir = ? where FID = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, yeniFirmaAd);
            preparedStatement.setString(2, yeniSehir);

            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UreticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sehirlerArasiMesafeGuncelle(int sehirSirasi, String sehirler, int mesafe) {
        String sorgu = "UPDATE sehirlerarasimesafe set sehirler=?, mesafe=? where sehirSirasi=?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, sehirler);
            preparedStatement.setInt(2, mesafe);
            preparedStatement.setInt(3, sehirSirasi);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Sehirler arasi mesafe guncelleme sorgusunda hata bulunmaktadir");
        }

    }

    public ArrayList<hammaddeSatinAl> hammaddeSatinAlinabilecekleriGoster(String hammaddeAdi, int istenilenMiktar) {
        String sorgu = "SELECT T1.FID, T1.hammaddeMiktari ,T1.satisFiyati, ((T1.satisFiyati*?)+F1.mesafe*0.5) AS toplamMaliyet FROM tedarikedilenurunbilgileri T1, tedarikcibilgiler B1, sehirlerarasimesafe F1 WHERE T1.FID=B1.FID AND B1.sehir=F1.sehirler AND T1.uretilenHammadde = ? AND B1.ulke = 'Turkiye' ORDER BY ((T1.satisFiyati*?)+F1.mesafe*0.5)";
         try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, istenilenMiktar);
            preparedStatement.setString(2, hammaddeAdi);
            preparedStatement.setInt(3, istenilenMiktar);
             ResultSet rs = preparedStatement.executeQuery();
             
              while (rs.next()) {
                int FID = rs.getInt("T1.FID");
                int hammaddeMiktari = rs.getInt("T1.hammaddeMiktari");
                int satisFiyati = rs.getInt("T1.satisFiyati");
                float maliyet = rs.getFloat("toplamMaliyet");
                
                cikti.add(new hammaddeSatinAl(FID, hammaddeMiktari ,satisFiyati, maliyet));
                
            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(UreticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Hammadde sorgusunda hata var.");
            return null;
        }
    }
    
    public ArrayList<hammaddeSatinAl> yurtDisindakiHammaddeSatinAlinabilecekleriGoster(String hammaddeAdi, int istenilenMiktar) {
        String yurtDisindakiSorgu="SELECT T1.FID,T1.hammaddeMiktari , T1.satisFiyati, ((T1.satisFiyati*?)+F1.mesafe*1.0) AS toplamMaliyet FROM tedarikedilenurunbilgileri T1, tedarikcibilgiler B1, sehirlerarasimesafe F1 WHERE T1.FID=B1.FID AND B1.sehir=F1.sehirler AND T1.uretilenHammadde = ? AND B1.ulke <> 'Turkiye' ORDER BY ((T1.satisFiyati*?)+F1.mesafe*1.0)";
         

        try {
            preparedStatement=con.prepareStatement(yurtDisindakiSorgu);
            preparedStatement.setInt(1, istenilenMiktar);
            preparedStatement.setString(2, hammaddeAdi);
            preparedStatement.setInt(3, istenilenMiktar);
            
            ResultSet rs = preparedStatement.executeQuery();
              while (rs.next()) {
                int FID = rs.getInt("T1.FID");
                int hammaddeMiktari = rs.getInt("T1.hammaddeMiktari");
                int satisFiyati = rs.getInt("T1.satisFiyati");
                float maliyet = rs.getFloat("toplamMaliyet");
                
                yurtDisindakiCikti.add(new hammaddeSatinAl(FID, hammaddeMiktari , satisFiyati, maliyet));
                
            }
            return yurtDisindakiCikti;

        } catch (SQLException ex) {
            Logger.getLogger(UreticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Yurt Disindaki Hammadde sorgusunda hata var.");
            return null;
        }
    }

    /*SILINEBILIR*/
    public void satinAlinanHammaddeEkle(String hammaddeAdi, int istenilenMiktar) {
        /*bu fonksiyon hammaddesatinalma tablosuna talebi ekler.*/
        String sorgu = "INSERT INTO hammaddesatinalma (hammaddeAdi,istenilenMiktar) VALUES (?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, hammaddeAdi);
            preparedStatement.setInt(2, istenilenMiktar);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Satin Alinan Hammadde Ekle Sorgusunda Hata Bulunmaktadir");
        }

    }

}
