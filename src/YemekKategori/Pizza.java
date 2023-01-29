package YemekKategori;

public class Pizza extends Yemekler {
    private Epizza epizza;

    public Pizza(int fiyat, String isim, String aciklama, Epizza epizza) {
        super(fiyat, isim, aciklama);
        this.epizza = epizza;
    }

}
