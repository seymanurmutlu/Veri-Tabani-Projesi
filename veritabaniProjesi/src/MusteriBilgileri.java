public class MusteriBilgileri {
    private int MID;
    private String musteriAd;
    private String mahalle;
    private String cadde;
    private String sehir;

    public MusteriBilgileri(int MID, String musteriAd,String mahalle,String cadde,String sehir) {
        this.MID = MID;
        this.musteriAd = musteriAd;
        this.mahalle=mahalle;
        this.cadde=cadde;
        this.sehir=sehir;
    }

    public int getMID() {
        return MID;
    }

    public void setMID(int MID) {
        this.MID = MID;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }
    
    
    
}
