package IcecekKategori;

public abstract class Icecekler {
    private int fiyat;
    private String isim;
    private boolean alkolluMu;
    private String aciklama;

    public Icecekler(int fiyat, String isim, boolean alkolluMu, String aciklama) {
        this.fiyat = fiyat;
        this.isim = isim;
        this.alkolluMu = alkolluMu;
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

    public boolean isAlkolluMu() {
        return alkolluMu;
    }

    public void setAlkolluMu(boolean alkolluMu) {
        this.alkolluMu = alkolluMu;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public String toString() {
        return "Icecekler{" +
                "fiyat=" + fiyat +
                ", isim='" + isim + '\'' +
                ", alkolluMu=" + alkolluMu +
                ", aciklama='" + aciklama + '\'' +
                '}';
    }
}
