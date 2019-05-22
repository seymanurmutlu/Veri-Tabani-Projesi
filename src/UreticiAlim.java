public class UreticiAlim {
    private int satinAlmaSirasi;
    private String firmaAdi;
    private String satinAlinan;
    private int alisMaliyeti;
    private int alinanMaddeMiktari;
    private int stokSayisi;

    public UreticiAlim(int satinAlmaSirasi, String firmaAdi, String satinAlinan, int alisMaliyeti, int alinanMaddeMiktari,int stokSayisi) {
        this.satinAlmaSirasi = satinAlmaSirasi;
        this.firmaAdi = firmaAdi;
        this.satinAlinan = satinAlinan;
        this.alisMaliyeti = alisMaliyeti;
        this.alinanMaddeMiktari = alinanMaddeMiktari;
        this.stokSayisi=stokSayisi;
        
    }

    public int getSatinAlmaSirasi() {
        return satinAlmaSirasi;
    }

    public void setSatinAlmaSirasi(int satinAlmaSirasi) {
        this.satinAlmaSirasi = satinAlmaSirasi;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getSatinAlinan() {
        return satinAlinan;
    }

    public void setSatinAlinan(String satinAlinan) {
        this.satinAlinan = satinAlinan;
    }

    public int getAlisMaliyeti() {
        return alisMaliyeti;
    }

    public void setAlisMaliyeti(int alisMaliyeti) {
        this.alisMaliyeti = alisMaliyeti;
    }

    public int getAlinanMaddeMiktari() {
        return alinanMaddeMiktari;
    }

    public void setAlinanMaddeMiktari(int alinanMaddeMiktari) {
        this.alinanMaddeMiktari = alinanMaddeMiktari;
    }

    public int getStokSayisi() {
        return stokSayisi;
    }

    public void setStokSayisi(int stokSayisi) {
        this.stokSayisi = stokSayisi;
    }

    
}
