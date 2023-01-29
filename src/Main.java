import IcecekKategori.AlkolluIcecekler;
import IcecekKategori.Icecekler;
import IcecekKategori.SicakIcecekler;
import IcecekKategori.SogukIcecekler;
import YemekKategori.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static int hesapUcreti;
    static boolean islem = true;
    private static Menu menu = new Menu();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (islem) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz..." + "\n" +
                    "1) MENÜYÜ GÖSTER -------------------------------------" + "\n" +
                    "2) SİPARİŞ VER ---------------------------------------" + "\n" +
                    "3) ÖDEME YAP -----------------------------------------" + "\n" +
                    "4) MASADAN KALK -------------------------------------- "
            );
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    menuyuGoster();
                    break;
                case 2:
                    siparisVer();
                    break;
                case 3:
                    hesapOde();
                    break;
                case 4:
                    System.out.println("Çıkış yapıyorsunuz ....");
                    islem = false;
                    System.exit(1);
            }
        }

    }

    // =====================================================================================================================
    public static void menuyuGoster() {
        for (int i = 0; i < menu.getIcecekListesi().size(); i++) {
            System.out.println(menu.getIcecekListesi().get(i));
        }
        for (int i = 0; i < menu.getYemekListesi().size(); i++) {
            System.out.println(menu.getYemekListesi().get(i));
        }
        System.out.println("===================================================================================");
    }

    // =====================================================================================================================
    public static void siparisVer() {
        boolean condition = true;
        hesapUcreti = 0;
        while (condition) {
            System.out.println("İçecek siparişi vermek isterseniz 1'e basınız...");
            System.out.println("Yemek siparişi vermek isterseniz 2'ye basınız...");
            System.out.println("Siparişten çıkmak için 3'e basınız ...");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    for (int i = 0; i < menu.getIcecekListesi().size(); i++) {
                        System.out.println((i + 1) + " " + menu.getIcecekListesi().get(i));
                    }
                    System.out.println("Hangi içeceği içmek istiyorsunuz ?");
                    int a = scanner.nextInt();
                    for (int i = 0; i < menu.getIcecekListesi().size(); i++) {
                        if ((a - 1) == i) {
                            System.out.println("Seçtiğiniz içecek : " + menu.getIcecekListesi().get(a - 1));
                            hesapUcreti = hesapUcreti + menu.getIcecekListesi().get(a - 1).getFiyat();
                        }
                    }
                    System.out.println("Güncel borç : " + hesapUcreti);
                    break;
                case 2:
                    for (int i = 0; i < menu.getYemekListesi().size(); i++) {
                        System.out.println((i + 1) + " " + menu.getYemekListesi().get(i));
                    }
                    System.out.println("Hangi yemeği yemek istiyorsunuz ?");
                    int b = scanner.nextInt();
                    for (int i = 0; i < menu.getYemekListesi().size(); i++) {
                        if ((b - 1) == i) {
                            System.out.println("Seçtiğiniz yemek : " + menu.getYemekListesi().get(b - 1));
                            hesapUcreti = hesapUcreti + menu.getYemekListesi().get(b - 1).getFiyat();
                        }
                    }
                    System.out.println(hesapUcreti);
                    break;
                case 3:
                    System.out.println("Sipariş vermediniz ana ekrana yönlendiriliyorsunuz ...");
                    condition = false;
                    System.out.println("Yapmak istediğiniz işlemi seçiniz..." + "\n" +
                            "1) MENÜYÜ GÖSTER -------------------------------------" + "\n" +
                            "2) SİPARİŞ VER ---------------------------------------" + "\n" +
                            "3) ÖDEME YAP -----------------------------------------" + "\n" +
                            "4) MASADAN KALK -------------------------------------- ");
            }
        }
        System.out.println("===================================================================================");
    }

    // =====================================================================================================================
    public static void hesapOde() {
        if (hesapUcreti > 0) {
            System.out.println(hesapUcreti + " tutarında hesap ödendi ...");
            hesapUcreti = 0;
        } else {
            System.out.println("Borcunuz bulunmamaktadır ...");
        }
    }

}
