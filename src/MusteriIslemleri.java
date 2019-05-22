
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MusteriIslemleri {

    /*bu class musteriBilgileri ve musteriTalepleri uzerinden islem yaparak
    (gosterme,ekleme,guncelleme,vs) ekranlarda gostemeye yarar*/

    
    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public MusteriIslemleri() {
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

    public ArrayList<MusteriBilgileri> musterileriGetir() {
        ArrayList<MusteriBilgileri> cikti = new ArrayList<MusteriBilgileri>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM musteribilgiler"; //tablodaki tum bilgileri goruntelemek istiyorum
            ResultSet rs = statement.executeQuery(sorgu); //sorgunun sonucu rs'de tutulur

            while (rs.next()) {
                int MID = rs.getInt("MID");
                String musteriAd = rs.getString("musteriAd");
                String mahalle=rs.getString("mahalle");
                String cadde=rs.getString("cadde");
                String sehir=rs.getString("sehir");

                cikti.add(new MusteriBilgileri(MID, musteriAd,mahalle,cadde,sehir)); //arraylistin icerisini dolduruyoruz
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(MusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public ArrayList<KimyasalMaddeBilgisi> kimyasalMaddeBilgisiniGetir()
    {
        ArrayList<KimyasalMaddeBilgisi> cikti=new ArrayList<KimyasalMaddeBilgisi>();
        
        try {
            statement=con.createStatement();
            String sorgu="SELECT * FROM kimyasalmadde"; //kimyasalmadde tablosundaki tum bilgileri goruntelemek istiyorum
            ResultSet rs=statement.executeQuery(sorgu);
            
            while(rs.next())
            {
                int urunID=rs.getInt("urunID");
                String kimyasalBilesen=rs.getString("kimyasalBilesen");
                int gerekenMiktar=rs.getInt("gerekenMiktar");
                cikti.add(new KimyasalMaddeBilgisi(urunID,kimyasalBilesen,gerekenMiktar)); //arraylistin icerisini kimyasal madde bilgisi nesnesiyle dolduruyoruz
            }
            return cikti;
            
        } catch (SQLException ex) {
            System.out.println("Kimyasal Madde Bilgisi Sorgusunda Hata Var"); //silinecek
            return null;
        }
    }
    
    
    public ArrayList<MusteriTalepleri> musteriTalepleriniGetir() {
        ArrayList<MusteriTalepleri> cikti = new ArrayList<MusteriTalepleri>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM musteritalep";
            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int talepSirasi = rs.getInt("talepSirasi");
                int MID = rs.getInt("MID");
                String talepEdilenUrun = rs.getString("talepEdilenUrun");
                int talepSayisi=rs.getInt("talepSayisi");

                cikti.add(new MusteriTalepleri(talepSirasi ,MID, talepEdilenUrun,talepSayisi)); //arraylistin icerisini dolduruyoruz
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(MusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
    
    public void musteriTalebiEkle(int MID, String talepEdilenUrun,int talepSayisi) {

        String sorgu = "INSERT INTO musteritalep (MID,talepEdilenUrun,talepSayisi) VALUES (?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, MID);
            preparedStatement.setString(2, talepEdilenUrun);
            preparedStatement.setInt(3, talepSayisi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void kimyasalMaddeBilgisiEkle(int urunID,String kimyasalBilesen,int gerekenMiktar)
    {
        String sorgu="INSERT INTO kimyasalmadde (urunID,kimyasalBilesen,gerekenMiktar) VALUES (?,?,?)";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setInt(1, urunID);
            preparedStatement.setString(2,kimyasalBilesen);
            preparedStatement.setInt(3,gerekenMiktar);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Kimyasal Madde Bilgisi Ekleme Sorgusunda Hata Bulunmaktadir");
        }
    }
    
    public void kimyasalMaddeAdiEkle(String kimyasalAdi)
    {
        String sorgu="INSERT INTO kimyasalmaddeadlari (kimyasalAdi) VALUES (?)";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, kimyasalAdi);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Kimyasal Maddi Adi Ekle Sorgusunda Hata Bulunmaktadir.");
        }
    }
    public void musteriEkle(String musteriAd, String mahalle,String cadde,String sehir) {

        String sorgu = "INSERT INTO musteribilgiler (musteriAd,mahalle,cadde,sehir) VALUES (?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, musteriAd);
            preparedStatement.setString(2, mahalle);
            preparedStatement.setString(3, cadde);
            preparedStatement.setString(4, sehir);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void musteriBilgiGuncelle(int id, String yeniMusteriAd, String mahalle,String cadde,String sehir) {
        String sorgu = "Update musteribilgiler set musteriAd = ? , mahalle=? , cadde=? , sehir=? where MID = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, yeniMusteriAd);
            preparedStatement.setString(2, mahalle);
            preparedStatement.setString(3, cadde);
            preparedStatement.setString(4, sehir);
            
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(MusteriIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
