public class UreticiBilgileri {
    private int FID;
    private String firmaAdi;
    private String sehir;

    public UreticiBilgileri(int FID, String firmaAdi, String sehir) {
        this.FID = FID;
        this.firmaAdi = firmaAdi;
        this.sehir = sehir;
    }

    public int getFID() {
        return FID;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
    
}
