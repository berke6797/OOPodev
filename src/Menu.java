import IcecekKategori.AlkolluIcecekler;
import IcecekKategori.Icecekler;
import IcecekKategori.SicakIcecekler;
import IcecekKategori.SogukIcecekler;
import YemekKategori.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menu {
private  List<Icecekler> icecekListesi= new ArrayList<>();
private  List<Yemekler> yemekListesi= new ArrayList<>();

    public Menu() {
        AnaYemekler anaYemek1 = new AnaYemekler(150, "Meksika Usülü Tavuk", "Acılı", Ecesit.BEYAZ_ET);
        AnaYemekler anaYemek2 = new AnaYemekler(130, "Köri Soslu Tavuk", "Acısız", Ecesit.BEYAZ_ET);
        AnaYemekler anaYemek3 = new AnaYemekler(140, "Tekirdağ Köftesi", "Acısız", Ecesit.KIRMIZI_ET);
        AnaYemekler anaYemek4 = new AnaYemekler(100, "İskender", "Bol Tereyağlı tek porsiton", Ecesit.KIRMIZI_ET);
        AnaYemekler anaYemek5 = new AnaYemekler(100, "Somon", "Fırında Somon ", Ecesit.BALIK);

        // ===============================================================================================================
        Atistirmalik atistirmalik1 = new Atistirmalik(60, "Patates Kızartması", "Parmak patates");
        Atistirmalik atistirmalik2 = new Atistirmalik(50, "Soğan Halkası", "7'li");
        Atistirmalik atistirmalik3 = new Atistirmalik(70, "Tavuk çıtırları", "10'lu tavuk çıtırları");

        // ===============================================================================================================
        Corba corba1 = new Corba(40, "Mercimek Çorbası", "İnce çekilmiş mercimek çorbası");
        Corba corba2 = new Corba(45, "İşkembe Çorbası", "Sarımsaklı");
        Corba corba3 = new Corba(35, "Tarhana Çorbası", "Acılı tarhana çorbası");


        // ===============================================================================================================
        Hamburger hamburger1 = new Hamburger(95, "Big King XXL", "Çift köfteli ve burger soslu");
        Hamburger hamburger2 = new Hamburger(75, "Tavuk Burger", "Özel soslu tavuk burger");
        Hamburger hamburger3 = new Hamburger(55, "Cheese Burger", "Özel cheese burger");

        // ===============================================================================================================
        Pizza pizza1 = new Pizza(120, "Social Pizza", "Dominos sosu,mozerella,pepperoni,hellim", Epizza.ORTA_KENARLI);
        Pizza pizza2 = new Pizza(120, "Veggi", "Dominos sosu,jalapones biberi,pepperoni", Epizza.KALIN_KENARLI);
        Pizza pizza3 = new Pizza(120, "BBQ Chicken", "Dominos sosu,mozerella,sucuk,soğan", Epizza.INCE_KENARLI);

        // ===============================================================================================================
        AlkolluIcecekler raki1 = new AlkolluIcecekler(100, "Yeni Raki", true, "Yeni Raki, Alkol Oranı: %45");
        AlkolluIcecekler raki2 = new AlkolluIcecekler(95, "Tekirdağ Raki", true, "Tekirdağ Rakı , Alkol Oranı: %45");
        AlkolluIcecekler raki3 = new AlkolluIcecekler(80, "Efe Raki", true, "Efe Raki, Alkol Oranı: %45");
        AlkolluIcecekler sarap = new AlkolluIcecekler(200, "Buzbağ Şarap", true, "BuzBağ Kırmızı Şarap 75 cl");
        AlkolluIcecekler bira1 = new AlkolluIcecekler(45, "Efes Pilsen Bira", true, "Efes Pisel Malt 33cl ");
        AlkolluIcecekler bira2 = new AlkolluIcecekler(60, "Efes Pilsen Bira", true, "Efes Pilsen Malt 50cl ");
        AlkolluIcecekler votka = new AlkolluIcecekler(55, "Absolut Votka", true, "Absolut votka 35 cl , Alkol Oranı : %40");

        // ===============================================================================================================
        SicakIcecekler cay = new SicakIcecekler(25, "Siyah Çay", false, "Küçük boy sıcak çay");
        SicakIcecekler cay2 = new SicakIcecekler(35, "Siyah Çay", false, "Büyük boy sıcak çay");
        SicakIcecekler americano = new SicakIcecekler(40, "Americano", false, "Orta boy americano");
        SicakIcecekler americano2 = new SicakIcecekler(50, "Americano ", false, "Büyük boy americano");
        SicakIcecekler latte = new SicakIcecekler(47, "Latte", false, "Orta boy latte");
        SicakIcecekler latte2 = new SicakIcecekler(57, "Latte", false, "Büyük boy latte");

        // ===============================================================================================================
        SogukIcecekler smoothie = new SogukIcecekler(50, "Smoothie", false, "Çilekli smoothie");
        SogukIcecekler limonata = new SogukIcecekler(45, "Limonata", false, "Naneli limonata");
        SogukIcecekler frappe = new SogukIcecekler(60, "Çilekli Frappe", false, "Büyük boy çilekli frappe");
        SogukIcecekler kola = new SogukIcecekler(55, "Kola", false, "Coca Cola Zero");
        // ===============================================================================================================
        icecekListesi.add(raki1);
        icecekListesi.add(raki2);
        icecekListesi.add(raki3);
        icecekListesi.add(sarap);
        icecekListesi.add(bira1);
        icecekListesi.add(bira2);
        icecekListesi.add(votka);
        icecekListesi.add(cay);
        icecekListesi.add(cay2);
        icecekListesi.add(americano);
        icecekListesi.add(americano2);
        icecekListesi.add(latte);
        icecekListesi.add(latte2);
        icecekListesi.add(smoothie);
        icecekListesi.add(limonata);
        icecekListesi.add(frappe);
        icecekListesi.add(kola);

        // ===============================================================================================================
        yemekListesi.add(anaYemek1);
        yemekListesi.add(anaYemek2);
        yemekListesi.add(anaYemek3);
        yemekListesi.add(anaYemek4);
        yemekListesi.add(anaYemek5);
        yemekListesi.add(atistirmalik1);
        yemekListesi.add(atistirmalik2);
        yemekListesi.add(atistirmalik3);
        yemekListesi.add(corba1);
        yemekListesi.add(corba2);
        yemekListesi.add(corba3);
        yemekListesi.add(hamburger1);
        yemekListesi.add(hamburger2);
        yemekListesi.add(hamburger3);
        yemekListesi.add(pizza1);
        yemekListesi.add(pizza2);
        yemekListesi.add(pizza3);

    }

    public List<Icecekler> getIcecekListesi() {
        return icecekListesi;
    }

    public void setIcecekListesi(List<Icecekler> icecekListesi) {
        this.icecekListesi = icecekListesi;
    }

    public List<Yemekler> getYemekListesi() {
        return yemekListesi;
    }

    public void setYemekListesi(List<Yemekler> yemekListesi) {
        this.yemekListesi = yemekListesi;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "icecekListesi=" + icecekListesi +
                ", yemekListesi=" + yemekListesi +
                '}';
    }
}
