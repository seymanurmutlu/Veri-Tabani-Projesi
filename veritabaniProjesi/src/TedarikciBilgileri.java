public class TedarikciBilgileri {
    private int FID;
    private String firmaAd;
    private String ulke;
    private String sehir;

    public TedarikciBilgileri(int FID, String firmaAd, String ulke, String sehir) {
        this.FID = FID;
        this.firmaAd = firmaAd;
        this.ulke = ulke;
        this.sehir = sehir;
    }

    public int getFID() {
        return FID;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }

    public String getFirmaAd() {
        return firmaAd;
    }

    public void setFirmaAd(String firmaAd) {
        this.firmaAd = firmaAd;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

}
