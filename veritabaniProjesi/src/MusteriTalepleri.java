public class MusteriTalepleri {
    private int talepSirasi;
    private int MID;
    private String talepEdilenUrun;
    private int talepSayisi;
    public int urunID;
    
    public MusteriTalepleri(int talepSirasi,int MID, String talepEdilenUrun,int talepSayisi) {
        this.talepSirasi = talepSirasi;
        this.MID = MID;
        this.talepEdilenUrun = talepEdilenUrun;
        this.talepSayisi=talepSayisi;
    }

    public int getTalepSirasi() {
        return talepSirasi;
    }

    public void setTalepSirasi(int talepSirasi) {
        this.talepSirasi = talepSirasi;
    }

    public int getMID() {
        return MID;
    }

    public void setMID(int MID) {
        this.MID = MID;
    }

    public String getTalepEdilenUrun() {
        return talepEdilenUrun;
    }

    public void setTalepEdilenUrun(String talepEdilenUrun) {
        this.talepEdilenUrun = talepEdilenUrun;
    }

    public int getTalepSayisi() {
        return talepSayisi;
    }

    public void setTalepSayisi(int talepSayisi) {
        this.talepSayisi = talepSayisi;
    }

    public int getUrunID() {
        return urunID;
    }

    public void setUrunID(int urunID) {
        this.urunID = urunID;
    }
    
    
}
