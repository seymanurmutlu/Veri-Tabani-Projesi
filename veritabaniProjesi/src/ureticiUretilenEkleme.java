
public class ureticiUretilenEkleme {
    
    
    private int urunID;
    private String kimyasalBilesen;
    private int satinAlinacakMiktar;

    public ureticiUretilenEkleme(int urunID, String kimyasalBilesen, int satinAlinacakMiktar) {
        this.urunID = urunID;
        this.kimyasalBilesen = kimyasalBilesen;
        this.satinAlinacakMiktar = satinAlinacakMiktar;
    }

    public int getUrunID() {
        return urunID;
    }

    public void setUrunID(int urunID) {
        this.urunID = urunID;
    }

    public String getKimyasalBilesen() {
        return kimyasalBilesen;
    }

    public void setKimyasalBilesen(String kimyasalBilesen) {
        this.kimyasalBilesen = kimyasalBilesen;
    }

    public int getSatinAlinacakMiktar() {
        return satinAlinacakMiktar;
    }

    public void setSatinAlinacakMiktar(int satinAlinacakMiktar) {
        this.satinAlinacakMiktar = satinAlinacakMiktar;
    }
    
    
    
}
