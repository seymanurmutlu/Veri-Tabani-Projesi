public class UreticiUretilen {

    private int urunID;
    private String kimyasalAdi;
    private String uretimTarihi;
    private int rafOmru;
    private int stok;

    public UreticiUretilen(int urunID, String kimyasalAdi, String uretimTarihi, int rafOmru, int stok) {
        this.urunID = urunID;
        this.kimyasalAdi = kimyasalAdi;
        this.uretimTarihi = uretimTarihi;
        this.rafOmru = rafOmru;
        this.stok = stok;
    }


    public int getUrunID() {
        return urunID;
    }

    public void setUrunID(int urunID) {
        this.urunID = urunID;
    }

    public String getKimyasalAdi() {
        return kimyasalAdi;
    }

    public void setKimyasalAdi(String kimyasalAdi) {
        this.kimyasalAdi = kimyasalAdi;
    }

    
    public String getUretimTarihi() {
        return uretimTarihi;
    }

    public void setUretimTarihi(String uretimTarihi) {
        this.uretimTarihi = uretimTarihi;
    }

    public int getRafOmru() {
        return rafOmru;
    }

    public void setRafOmru(int rafOmru) {
        this.rafOmru = rafOmru;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

}