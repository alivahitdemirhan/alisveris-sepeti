import java.util.Scanner;

public class MenuIslemleri {

    private Scanner input = new Scanner(System.in);
    private Sepet sepet = new Sepet();

    public void baslat() {
        int secim;

        do {
            menuGoster();
            secim = input.nextInt();
            menuIsle(secim);
        } while (secim != 0);
    }

    private void menuGoster() {
        System.out.println("\n===== MENÜ =====");
        System.out.println("1- Kalem Ekle");
        System.out.println("2- Silgi Ekle");
        System.out.println("3- Defter Ekle");
        System.out.println("4- Test Kitabı Ekle");
        System.out.println("5- Sepeti Listele");
        System.out.println("6- Ürün Sil");
        System.out.println("7- Toplam Tutar");
        System.out.println("0- Çıkış");
        System.out.print("Seçim: ");
    }

    private void menuIsle(int secim) {

        switch (secim) {

            case 1:
                System.out.print("Adet: ");
                sepet.urunEkle(new Kalem(input.nextInt()));
                break;

            case 2:
                System.out.print("Adet: ");
                sepet.urunEkle(new Silgi(input.nextInt()));
                break;

            case 3:
                System.out.print("Adet: ");
                sepet.urunEkle(new Defter(input.nextInt()));
                break;

            case 4:
                System.out.print("Adet: ");
                sepet.urunEkle(new TestKitabi(input.nextInt()));
                break;

            case 5:
                sepet.sepetiListele();
                break;

            case 6:
                input.nextLine();
                System.out.print("Ürün adı: ");
                String isim = input.nextLine();
                System.out.print("Kaç adet silinsin: ");
                int adet = input.nextInt();
                sepet.urunSilAdet(isim, adet);
                break;

            case 7:
                System.out.println("Toplam Tutar: " + sepet.genelToplam() + " TL");
                break;

            case 0:
                System.out.println("Programdan çıkıldı.");
                break;

            default:
                System.out.println("Hatalı seçim!");
        }
    }
}
