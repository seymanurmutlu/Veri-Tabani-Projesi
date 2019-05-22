
public class UreticiSatis {
    
    private int satisSirasi;
    private int urunID;
    private int MID;
    private float iscilikMaliyeti;
    private float toplamMaliyet;
    private float satisFiyati;

    public UreticiSatis(int satisSirasi, int urunID,int MID, float iscilikMaliyeti, float toplamMaliyet, float satisFiyati) {
        this.satisSirasi = satisSirasi;
        this.urunID = urunID;
        this.MID=MID;
        this.iscilikMaliyeti = iscilikMaliyeti;
        this.toplamMaliyet = toplamMaliyet;
        this.satisFiyati = satisFiyati;
    }


    public int getSatisSirasi() {
        return satisSirasi;
    }

    public int getUrunID() {
        return urunID;
    }

    public int getMID() {
        return MID;
    }

    public float getIscilikMaliyeti() {
        return iscilikMaliyeti;
    }

    public float getToplamMaliyet() {
        return toplamMaliyet;
    }

    public float getSatisFiyati() {
        return satisFiyati;
    }

    
    public void setSatisSirasi(int satisSirasi) {
        this.satisSirasi = satisSirasi;
    }

    public void setUrunID(int urunID) {
        this.urunID = urunID;
    }

    public void setMID(int MID) {
        this.MID = MID;
    }

    public void setIscilikMaliyeti(float iscilikMaliyeti) {
        this.iscilikMaliyeti = iscilikMaliyeti;
    }

    public void setToplamMaliyet(float toplamMaliyet) {
        this.toplamMaliyet = toplamMaliyet;
    }

    public void setSatisFiyati(float satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

   
    
}
