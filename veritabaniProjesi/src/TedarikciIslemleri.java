
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TedarikciIslemleri {

    /*bu class tedarikciBilgileri ve tedarikciTalepleri uzerinden islem yaparak
    (gosterme,ekleme,guncelleme,vs) ekranlarda gostemeye yarar*/
    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public TedarikciIslemleri() {
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
    
     public ArrayList<TedarikEdilenUrunBilgileri> tedarikEdilenUrunBilgileriniGetir()
    {
        ArrayList<TedarikEdilenUrunBilgileri> cikti=new ArrayList<TedarikEdilenUrunBilgileri>();
        
        try {
            statement=con.createStatement();
            String sorgu="SELECT * FROM tedarikedilenurunbilgileri"; //tedarikedilenurunbilgileri tablosunu goruntuleyen sorgu
            ResultSet rs=statement.executeQuery(sorgu); //sorgunun sonucu ResultSet turundeki rs de tutulur
            
            while(rs.next())
            {
                int FID=rs.getInt("FID");
                String uretilenHammadde=rs.getString("uretilenHammadde");
                int hammaddeMiktari=rs.getInt("hammaddeMiktari");
                String urtTarih=rs.getString("urtTarih");
                int rafOmru=rs.getInt("rafOmru");
                int satisFiyati=rs.getInt("satisFiyati");
                
                cikti.add(new TedarikEdilenUrunBilgileri(FID,uretilenHammadde,hammaddeMiktari,urtTarih,rafOmru,satisFiyati));
            }
            
            return cikti;
            
            
        } catch (SQLException ex) {
            return null;
        }
    }
    
    
    
        public ArrayList<TedarikciBilgileri> tedarikciBilgileriniGetir() {
        ArrayList<TedarikciBilgileri> cikti = new ArrayList<TedarikciBilgileri>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM tedarikcibilgiler"; //tablodaki tum bilgileri goruntelemek istiyorum
            ResultSet rs = statement.executeQuery(sorgu); //sorgunun sonucu rs'de tutulur

            while (rs.next()) {
                int FID = rs.getInt("FID");
                String firmaAdi = rs.getString("firmaAdi");
                String ulke = rs.getString("ulke");
                String sehir = rs.getString("sehir");
                
                cikti.add(new TedarikciBilgileri(FID, firmaAdi, ulke,sehir)); //arraylistin icerisini dolduruyoruz
            }
            return cikti;
        } catch (SQLException ex) {
            return null;
        }

    }
        
        public void tedarikciBilgileriEkle(String firmaAdi,String ulke,String sehir)
        {
            String sorgu="INSERT INTO tedarikcibilgiler (firmaAdi,ulke,sehir) VALUES (?,?,?)";
            
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, firmaAdi);
            preparedStatement.setString(2, ulke);
            preparedStatement.setString(3, sehir);
            
            preparedStatement.executeUpdate();
         } catch (SQLException ex) {
        }
           }

    public void tedarikciBilgileriGuncelle(String firmaAdi,String ulke,String sehir,int FID)
    {
        String sorgu="Update tedarikcibilgiler set firmaAdi=?, ulke=?, sehir=? where FID=?";
        
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, firmaAdi);
            preparedStatement.setString(2, ulke);
            preparedStatement.setString(3, sehir);
            preparedStatement.setInt(4, FID);
            
            preparedStatement.executeUpdate();
        
        } catch (SQLException ex) {
        }
        
    }

    public void tedarikEdilenUrunleriEkle(int FID,String uretilenHammadde,int hammaddeMiktari,String urtTarih,int rafOmru,int satisFiyati)
    {
        String sorgu="INSERT INTO tedarikedilenurunbilgileri (FID,uretilenHammadde,hammaddeMiktari,urtTarih,rafOmru,satisFiyati) VALUES(?,?,?,?,?,?)";
        
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setInt(1, FID);
            preparedStatement.setString(2, uretilenHammadde);
            preparedStatement.setInt(3, hammaddeMiktari);
            preparedStatement.setString(4, urtTarih);
            preparedStatement.setInt(5, rafOmru);
            preparedStatement.setInt(6, satisFiyati);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("tedarik edilen urun bilgileri ekle sorgusunda hata var"); //silinecek
        }
    }

    public void tedarikEdilenUrunleriGuncelle(int FID,String uretilenHammadde,int hammaddeMiktari,String urtTarih,int rafOmru,int satisFiyati)
    {
        String sorgu="Update tedarikedilenurunbilgileri set uretilenHammadde=?, hammaddeMiktari=?, rafOmru=?, satisFiyati=? WHERE FID=? AND urtTarih=?";
   
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1,uretilenHammadde);
            preparedStatement.setInt(2, hammaddeMiktari);
            preparedStatement.setInt(3, rafOmru);
            preparedStatement.setInt(4, satisFiyati);
            preparedStatement.setInt(5, FID);
            preparedStatement.setString(6, urtTarih);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Tedarik edilen urun bilgileri guncellemesinde sorun var");
        }
    
    }
    
      public void tedarikciStokGuncelle(int FID, String uretilenHammadde, int hammaddeMiktari,int satisFiyati ){
        String sorgu ="Update tedarikedilenurunbilgileri set hammaddeMiktari=? where FID=? AND satisFiyati=? AND uretilenHammadde=?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, hammaddeMiktari);
            preparedStatement.setInt(2, FID);
            preparedStatement.setInt(3, satisFiyati);
            preparedStatement.setString(4, uretilenHammadde);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(TedarikciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  /*  public String tedarikEdilenUrunUrtTarihBul(int FID,String uretilenHammadde,int hammaddeMiktari,float satisFiyati){
        String sorgu = "SELECT urtTarih FROM tedarikedileninurunbilgileri WHERE FID=?, uretilenHammadde=?, hammaddeMiktari=?,satisFiyati=?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, FID);
            preparedStatement.setString(2, uretilenHammadde); 
            preparedStatement.setInt(3, hammaddeMiktari);
            preparedStatement.setFloat(4, satisFiyati);
            ResultSet rs = statement.executeQuery(sorgu);
            
            String urtTarih = rs.getString("urtTarih");
            return urtTarih;
        } catch (SQLException ex) {
            Logger.getLogger(TedarikciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public int tedarikEdilenUrunRafOmruBul(int FID,String uretilenHammadde,int hammaddeMiktari,float satisFiyati){
        String sorgu = "SELECT rafOmru FROM tedarikedileninurunbilgileri WHERE FID=?, uretilenHammadde=?, hammaddeMiktari=?,satisFiyati=?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, FID);
            preparedStatement.setString(2, uretilenHammadde); 
            preparedStatement.setInt(3, hammaddeMiktari);
            preparedStatement.setFloat(4, satisFiyati);
            ResultSet rs = statement.executeQuery(sorgu);
            
            int rafOmru = rs.getInt("rafOmru");
            return rafOmru;
        } catch (SQLException ex) {
            Logger.getLogger(TedarikciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }*/
    
    public ArrayList<TedarikciBilgileri> firmaAdiBul (int FID){
   
        String sorgu = "SELECT * FROM tedarikcibilgiler WHERE FID = ?";
        ////tek bir satir getirdigi icin olmuyor
        
        ArrayList<TedarikciBilgileri> firmalar = new ArrayList<TedarikciBilgileri>();
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, FID);
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                String firma = rs.getString("FID");
                String firmaAdi = rs.getString("firmaAdi");
                String ulke = rs.getString("ulke");
                String sehir = rs.getString("sehir");
                
                firmalar.add(new TedarikciBilgileri(FID,firmaAdi,ulke,sehir));
            }
            return firmalar;
        } catch (SQLException ex) {
            Logger.getLogger(TedarikciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
        public void ureticiAlimEkle(String firmaAdi, String satinAlinan, float alisMaliyeti, int alinanMaddeMiktari, int stokSayisi) {
        String sorgu = "INSERT INTO ureticialis (String firmaAdi, String satinAlinan, int alisMaliyeti, int alinanMaddeMiktari,int stokSayisi) VALUES (?,?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, firmaAdi);
            preparedStatement.setString(2, satinAlinan);
            preparedStatement.setFloat(3, alisMaliyeti);
            preparedStatement.setInt(4, alinanMaddeMiktari);
            preparedStatement.setInt(5, stokSayisi);
        } catch (SQLException ex) {
            Logger.getLogger(UreticiIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
    
    

}
