/*EKRAN UZERINDEKI FIELDLARDAN ALINAN BILGILER ICIN OLUSTURULMUS BIR CLASSTIR.*/
public class hammaddeSatinAlma{
    
    private String hammaddeAdi;
    private int istenilenMiktar;

    public hammaddeSatinAlma(String hammaddeAdi, int istenilenMiktar) {
        this.hammaddeAdi = hammaddeAdi;
        this.istenilenMiktar = istenilenMiktar;
    }

    public String getHammaddeAdi() {
        return hammaddeAdi;
    }

    public void setHammaddeAdi(String hammaddeAdi) {
        this.hammaddeAdi = hammaddeAdi;
    }

    public int getIstenilenMiktar() {
        return istenilenMiktar;
    }

    public void setIstenilenMiktar(int istenilenMiktar) {
        this.istenilenMiktar = istenilenMiktar;
    }
    
    
}
