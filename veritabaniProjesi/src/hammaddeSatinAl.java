
/** ARRAYLIST OLUSTURUP EN UCUZU BULMAK ICIN OLUSTURULMUS BIR CLASSTIR  **/
public class hammaddeSatinAl {
  private int FID;
  private int hammaddeMiktari;
  private int satisFiyati;
  private float maliyet;
  
  
    public hammaddeSatinAl(int FID,int hammaddeMiktari , int satisFiyati, float maliyet) {
        this.FID = FID;
        this.hammaddeMiktari = hammaddeMiktari;
        this.satisFiyati = satisFiyati;
        this.maliyet = maliyet;
    }

    public int getFID() {
        return FID;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }
    
    public int getHammaddeMiktari() {
        return hammaddeMiktari;
    }

    public void setHammaddeMiktari(int hammaddeMiktari) {
        this.hammaddeMiktari = hammaddeMiktari;
    }

    public int getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(int satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public float getMaliyet() {
        return maliyet;
    }

    public void setMaliyet(float maliyet) {
        this.maliyet = maliyet;
    }
  
}
