
/** ARRAYLIST OLUSTURUP EN UCUZU BULMAK ICIN OLUSTURULMUS BIR CLASSTIR  **/
public class hammaddeSatinAl {
  private int FID;
  private int hammaddeMiktari;
  private float satisFiyati;
  private float maliyet;
  
  
    public hammaddeSatinAl(int FID,int hammaddeMiktari , float satisFiyati, float maliyet) {
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

    public float getSatisFiyati() {
        return satisFiyati;
    }

    public void setSatisFiyati(float satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    public float getMaliyet() {
        return maliyet;
    }

    public void setMaliyet(float maliyet) {
        this.maliyet = maliyet;
    }
  
}
