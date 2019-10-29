
public class SehirlerArasiMesafe {
    
    private int sehirSirasi;
    private String sehirler;
    private int mesafe;

    public SehirlerArasiMesafe(int sehirSirasi,String sehirler, int mesafe) {
        this.sehirler = sehirler;
        this.mesafe = mesafe;
        this.sehirSirasi=sehirSirasi;
    }

    public String getSehirler() {
        return sehirler;
    }

    public int getMesafe() {
        return mesafe;
    }

    public void setSehirler(String sehirler) {
        this.sehirler = sehirler;
    }

    public void setMesafe(int mesafe) {
        this.mesafe = mesafe;
    }

    public int getSehirSirasi() {
        return sehirSirasi;
    }

    public void setSehirSirasi(int sehirSirasi) {
        this.sehirSirasi = sehirSirasi;
    }
    
}
