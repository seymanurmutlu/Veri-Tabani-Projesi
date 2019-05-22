

public class TedarikEdilenUrunBilgileri {
    
    private int FID;
    private String uretilenHammadde;
    private int hammaddeMiktari;
    private String urtTarih;
    private int rafOmru;
    private int satisFiyati;

    public TedarikEdilenUrunBilgileri(int FID, String uretilenHammadde, int hammaddeMiktari, String urtTarih, int rafOmru, int satisFiyati) {
        this.FID = FID;
        this.uretilenHammadde = uretilenHammadde;
        this.hammaddeMiktari = hammaddeMiktari;
        this.urtTarih = urtTarih;
        this.rafOmru = rafOmru;
        this.satisFiyati = satisFiyati;
    }

    
    public int getFID() {
        return FID;
    }

    
    public void setFID(int FID) {
        this.FID = FID;
    }

    
    public String getUretilenHammadde() {
        return uretilenHammadde;
    }

    
    public void setUretilenHammadde(String uretilenHammadde) {
        this.uretilenHammadde = uretilenHammadde;
    }

    
    public int getHammaddeMiktari() {
        return hammaddeMiktari;
    }

   
    public void setHammaddeMiktari(int hammaddeMiktari) {
        this.hammaddeMiktari = hammaddeMiktari;
    }

    
    public String getUrtTarih() {
        return urtTarih;
    }

    
    public void setUrtTarih(String urtTarih) {
        this.urtTarih = urtTarih;
    }

    
    public int getRafOmru() {
        return rafOmru;
    }

    
    public void setRafOmru(int rafOmru) {
        this.rafOmru = rafOmru;
    }

   
    public int getSatisFiyati() {
        return satisFiyati;
    }

    
    public void setSatisFiyati(int satisFiyati) {
        this.satisFiyati = satisFiyati;
    }
    
    
    
}
