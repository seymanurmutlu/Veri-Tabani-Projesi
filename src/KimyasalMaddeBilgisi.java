
public class KimyasalMaddeBilgisi {
    
    private int urunID;
    private String kimyasalBilesen;
    private int gerekenMiktar;
    

    public KimyasalMaddeBilgisi(int urunID, String kimyasalBilesen, int gerekenMiktar) {
        this.urunID = urunID;
        this.kimyasalBilesen = kimyasalBilesen;
        this.gerekenMiktar = gerekenMiktar;
    }

    public int getUrunID() {
        return urunID;
    }

    public String getKimyasalBilesen() {
        return kimyasalBilesen;
    }

    public int getGerekenMiktar() {
        return gerekenMiktar;
    }

    public void setUrunID(int urunID) {
        this.urunID = urunID;
    }

    public void setKimyasalBilesen(String kimyasalBilesen) {
        this.kimyasalBilesen = kimyasalBilesen;
    }

    public void setGerekenMiktar(int gerekenMiktar) {
        this.gerekenMiktar = gerekenMiktar;
    }
    
    
    
}
