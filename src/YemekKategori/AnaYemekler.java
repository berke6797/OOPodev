package YemekKategori;

public class AnaYemekler extends Yemekler {
    private Ecesit ecesit;

    public AnaYemekler(int fiyat, String isim, String aciklama, Ecesit ecesit) {
        super(fiyat, isim, aciklama);
        this.ecesit = ecesit;
    }






}
