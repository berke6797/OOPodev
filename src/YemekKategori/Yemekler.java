package YemekKategori;

public abstract class Yemekler {
    private int fiyat;
    private  String isim;
    private String aciklama;

    public Yemekler(int fiyat, String isim, String aciklama) {
        this.fiyat = fiyat;
        this.isim = isim;
        this.aciklama = aciklama;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public String toString() {
        return "Yemek{" +
                "fiyat=" + fiyat +
                ", isim='" + isim + '\'' +
                ", aciklama='" + aciklama + '\'' +
                '}';
    }
}
